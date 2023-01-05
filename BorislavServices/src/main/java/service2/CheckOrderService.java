package service2;

import service.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "OrderCheck", portName = "OrderCheckPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CheckOrderService {
    @WebMethod
    public Order checkOrderConfirm(User user, Bill bill) {

        try {
            Thread.sleep(1000 * 5);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Making order for user -" + user.getUserLogin());

        Order order = new Order();
        order.setOrderCost(bill.getBillCost());
        order.setUser(user);
        order.setOrderConfirm(true);

        System.out.println("Order was made");
        System.out.println("Payment was confirmed");

        return order;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/CheckOrderService", new CheckOrderService());
    }
}
