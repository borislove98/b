package service3;

import org.camunda.bpm.client.ExternalTaskClient;
import service.Book;
import service.User;
import service2.Order;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

@Path("/purchase")
public class BookPurchaseServlet {

    private User generateUser() {
        User user = new User();
        user.setUserLogin("Borislav");
        user.setUserPassword("Borislav");
        ArrayList<Book> cart = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            Book book = new Book();
            book.setBookReserved(true);
            book.setBookName("Book" + i);
            book.setBookPurchased(false);
            cart.add(book);
        }
        user.setUserCart(cart);
        return user;
    }

    private Order generateOrder() {
        Order order = new Order();
        order.setUser(generateUser());
        order.setOrderCost(3290);
        order.setOrderConfirm(true);
        return order;
    }

    @GET
    @Path("/confirm")
    @Produces({MediaType.APPLICATION_JSON})
    public Response returnPurchaseResult() throws IOException {

        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // long polling timeout
                .build();

        client.subscribe("payment_topic")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {


                    Order order = generateOrder();

                    if (order.isOrderConfirm()) {
                        for (Book book : order.getUser().getUserCart()) {
                            book.setBookPurchased(true);
                        }
                    }

                    try {
                        Desktop.getDesktop().browse(new URI("https://docs.camunda.org/get-started/quick-start/complete"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //

                    // Complete the task
                    externalTaskService.complete(externalTask);
                })
                .open();
        String message;
        message = "Your order was purchased \nBooks was reserved";
        return Response.ok(message).build();
    }
}
