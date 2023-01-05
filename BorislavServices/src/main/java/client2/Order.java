
package client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderCost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="user" type="{http://service2/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order", propOrder = {
    "orderConfirm",
    "orderCost",
    "user"
})
public class Order {

    protected boolean orderConfirm;
    protected float orderCost;
    protected User user;

    /**
     * Gets the value of the orderConfirm property.
     * 
     */
    public boolean isOrderConfirm() {
        return orderConfirm;
    }

    /**
     * Sets the value of the orderConfirm property.
     * 
     */
    public void setOrderConfirm(boolean value) {
        this.orderConfirm = value;
    }

    /**
     * Gets the value of the orderCost property.
     * 
     */
    public float getOrderCost() {
        return orderCost;
    }

    /**
     * Sets the value of the orderCost property.
     * 
     */
    public void setOrderCost(float value) {
        this.orderCost = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
