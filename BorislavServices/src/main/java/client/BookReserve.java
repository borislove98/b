
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookReserve", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8081/BookReserveService?wsdl")
public class BookReserve
    extends Service
{

    private final static URL BOOKRESERVE_WSDL_LOCATION;
    private final static WebServiceException BOOKRESERVE_EXCEPTION;
    private final static QName BOOKRESERVE_QNAME = new QName("http://service/", "BookReserve");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/BookReserveService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKRESERVE_WSDL_LOCATION = url;
        BOOKRESERVE_EXCEPTION = e;
    }

    public BookReserve() {
        super(__getWsdlLocation(), BOOKRESERVE_QNAME);
    }

    public BookReserve(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKRESERVE_QNAME, features);
    }

    public BookReserve(URL wsdlLocation) {
        super(wsdlLocation, BOOKRESERVE_QNAME);
    }

    public BookReserve(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKRESERVE_QNAME, features);
    }

    public BookReserve(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookReserve(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookReserveService
     */
    @WebEndpoint(name = "BookReservePort")
    public BookReserveService getBookReservePort() {
        return super.getPort(new QName("http://service/", "BookReservePort"), BookReserveService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookReserveService
     */
    @WebEndpoint(name = "BookReservePort")
    public BookReserveService getBookReservePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "BookReservePort"), BookReserveService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKRESERVE_EXCEPTION!= null) {
            throw BOOKRESERVE_EXCEPTION;
        }
        return BOOKRESERVE_WSDL_LOCATION;
    }

}
