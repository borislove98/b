
package client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billCost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="qrCode" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bill", propOrder = {
    "billCost",
    "qrCode"
})
public class Bill {

    protected float billCost;
    protected float qrCode;

    /**
     * Gets the value of the billCost property.
     * 
     */
    public float getBillCost() {
        return billCost;
    }

    /**
     * Sets the value of the billCost property.
     * 
     */
    public void setBillCost(float value) {
        this.billCost = value;
    }

    /**
     * Gets the value of the qrCode property.
     * 
     */
    public float getQrCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     */
    public void setQrCode(float value) {
        this.qrCode = value;
    }

}
