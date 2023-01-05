
package client2;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CheckOrderService", targetNamespace = "http://service2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CheckOrderService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<client2.CheckOrderConfirmResponse>
     */
    @WebMethod(operationName = "checkOrderConfirm")
    @RequestWrapper(localName = "checkOrderConfirm", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirm")
    @ResponseWrapper(localName = "checkOrderConfirmResponse", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirmResponse")
    public Response<CheckOrderConfirmResponse> checkOrderConfirmAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Bill arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "checkOrderConfirm")
    @RequestWrapper(localName = "checkOrderConfirm", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirm")
    @ResponseWrapper(localName = "checkOrderConfirmResponse", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirmResponse")
    public Future<?> checkOrderConfirmAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Bill arg1,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<CheckOrderConfirmResponse> asyncHandler);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns client2.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkOrderConfirm", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirm")
    @ResponseWrapper(localName = "checkOrderConfirmResponse", targetNamespace = "http://service2/", className = "client2.CheckOrderConfirmResponse")
    @Action(input = "http://service2/CheckOrderService/checkOrderConfirmRequest", output = "http://service2/CheckOrderService/checkOrderConfirmResponse")
    public Order checkOrderConfirm(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Bill arg1);

}
