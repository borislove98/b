package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "BookReserve", portName = "BookReservePort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class BookReserveService {
    @WebMethod(operationName = "ReserveBooks")
    public User reserveBooksInCart(User user) {
        System.out.println("_______________________________");
        for (Book book : user.getUserCart())
        {
            book.setBookReserved(true);
            System.out.println("Book -" + book.getBookName() + "- was reserved");
        }
        System.out.println("for user -" + user.getUserLogin());
        System.out.println("_______________________________");
        return user;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/BookReserveService", new BookReserveService());
    }
}