
package client2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client2 package. 
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

    private final static QName _CheckOrderConfirmResponse_QNAME = new QName("http://service2/", "checkOrderConfirmResponse");
    private final static QName _CheckOrderConfirm_QNAME = new QName("http://service2/", "checkOrderConfirm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckOrderConfirmResponse }
     * 
     */
    public CheckOrderConfirmResponse createCheckOrderConfirmResponse() {
        return new CheckOrderConfirmResponse();
    }

    /**
     * Create an instance of {@link CheckOrderConfirm }
     * 
     */
    public CheckOrderConfirm createCheckOrderConfirm() {
        return new CheckOrderConfirm();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Bill }
     * 
     */
    public Bill createBill() {
        return new Bill();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderConfirmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service2/", name = "checkOrderConfirmResponse")
    public JAXBElement<CheckOrderConfirmResponse> createCheckOrderConfirmResponse(CheckOrderConfirmResponse value) {
        return new JAXBElement<CheckOrderConfirmResponse>(_CheckOrderConfirmResponse_QNAME, CheckOrderConfirmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOrderConfirm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service2/", name = "checkOrderConfirm")
    public JAXBElement<CheckOrderConfirm> createCheckOrderConfirm(CheckOrderConfirm value) {
        return new JAXBElement<CheckOrderConfirm>(_CheckOrderConfirm_QNAME, CheckOrderConfirm.class, null, value);
    }

}
