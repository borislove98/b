package client;


import org.camunda.bpm.client.ExternalTaskClient;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookReserveClient {

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

    private User generate() {
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

    public void process(URL url) {

        BookReserve bookReserve = new BookReserve(url);
        BookReserveService bookReserveServicePort = bookReserve.getBookReservePort();
        User user = generate();

        System.out.println("Reserving books from -" + user.getUserLogin() + "- cart...");

        bookReserveServicePort.reserveBooks(user);

        System.out.println("All -" + user.getUserLogin() + "- books was reserved.");

        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        client.subscribe("reserve_topic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //
                    Map<String, Object> map = new HashMap<>();
                    map.put("User", user);

                    // Complete the task
                    externalTaskService.complete(externalTask, map);
                })
                .open();

    }


    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8081/BookReserveService?wsdl");
        BookReserveClient client = new BookReserveClient();
        client.process(url);
    }
}
