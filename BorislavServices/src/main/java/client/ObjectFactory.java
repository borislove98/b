
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReserveBooksResponse_QNAME = new QName("http://service/", "ReserveBooksResponse");
    private final static QName _ReserveBooks_QNAME = new QName("http://service/", "ReserveBooks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveBooksResponse }
     * 
     */
    public ReserveBooksResponse createReserveBooksResponse() {
        return new ReserveBooksResponse();
    }

    /**
     * Create an instance of {@link ReserveBooks }
     * 
     */
    public ReserveBooks createReserveBooks() {
        return new ReserveBooks();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ReserveBooksResponse")
    public JAXBElement<ReserveBooksResponse> createReserveBooksResponse(ReserveBooksResponse value) {
        return new JAXBElement<ReserveBooksResponse>(_ReserveBooksResponse_QNAME, ReserveBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ReserveBooks")
    public JAXBElement<ReserveBooks> createReserveBooks(ReserveBooks value) {
        return new JAXBElement<ReserveBooks>(_ReserveBooks_QNAME, ReserveBooks.class, null, value);
    }

}
