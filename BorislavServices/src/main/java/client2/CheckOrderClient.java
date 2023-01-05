package client2;


import org.camunda.bpm.client.ExternalTaskClient;

import javax.xml.ws.Response;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class CheckOrderClient {
    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public User generateUser() {
        User user = new User();
        user.setUserLogin("Borislav");
        user.setUserPassword("Borislav");
        for (int i = 0; i < 5; i ++) {
            Book book = new Book();
            book.setBookName("Book" + i);
            book.setBookReserved(false);
            book.setBookPurchased(false);
            user.getUserCart().add(book);
        }
        return user;
    }

    public Bill generateBill() {
        Bill bill = new Bill();
        bill.setBillCost(3290);
        bill.setQrCode((float) 0.0001);
        return bill;
    }

    public void processPolling(URL url) {

        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        client.subscribe("order_topic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    OrderCheck orderCheck = new OrderCheck(url);
                    CheckOrderService port = orderCheck.getOrderCheckPort();

                    Order order = new Order();

                    client.User user = externalTask.getVariable("User");
                    Bill bill = generateBill();

                    User user2 = new User();
                    user2.setUserPassword(user.getUserPassword());
                    user2.setUserLogin(user.getUserLogin());
                    for (client.Book b : user.getUserCart()) {
                        Book book = new Book();
                        book.setBookName(b.getBookName());
                        book.setBookReserved(true);
                        book.setBookPurchased(b.isBookPurchased());
                        user2.getUserCart().add(book);
                    }

                    Response<CheckOrderConfirmResponse> response = port.checkOrderConfirmAsync(user2, bill);
                    System.out.println("Polling started");
                    while(!response.isDone()) {
                        try {
                            System.out.println("Polling...");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        order = response.get().getReturn();
                        System.out.println("Bill cost " + order.getOrderCost() + "EURO was received");
                        System.out.println("-" + order.user.getUserLogin() + "- order payment was confirmed");

                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //
                    Map<String, Object> map = new HashMap<>();
                    map.put("Order", order);

                    // Complete the task
                    externalTaskService.complete(externalTask, map);
                })
                .open();

    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8082/CheckOrderService?wsdl");
        CheckOrderClient checkOrderClient = new CheckOrderClient();
        checkOrderClient.processPolling(url);
    }
}
