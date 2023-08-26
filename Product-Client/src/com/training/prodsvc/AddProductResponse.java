
package com.training.prodsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addProductReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addProductReturn"
})
@XmlRootElement(name = "addProductResponse")
public class AddProductResponse {

    @XmlElement(required = true)
    protected String addProductReturn;

    /**
     * Gets the value of the addProductReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddProductReturn() {
        return addProductReturn;
    }

    /**
     * Sets the value of the addProductReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddProductReturn(String value) {
        this.addProductReturn = value;
    }

}
