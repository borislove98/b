
package client2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookPurchased" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bookReserved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "bookName",
    "bookPurchased",
    "bookReserved"
})
public class Book {

    protected String bookName;
    protected boolean bookPurchased;
    protected boolean bookReserved;

    /**
     * Gets the value of the bookName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the bookPurchased property.
     * 
     */
    public boolean isBookPurchased() {
        return bookPurchased;
    }

    /**
     * Sets the value of the bookPurchased property.
     * 
     */
    public void setBookPurchased(boolean value) {
        this.bookPurchased = value;
    }

    /**
     * Gets the value of the bookReserved property.
     * 
     */
    public boolean isBookReserved() {
        return bookReserved;
    }

    /**
     * Sets the value of the bookReserved property.
     * 
     */
    public void setBookReserved(boolean value) {
        this.bookReserved = value;
    }

}
