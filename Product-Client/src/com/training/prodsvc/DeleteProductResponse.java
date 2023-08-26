
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
 *         &lt;element name="deleteProductReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "deleteProductReturn"
})
@XmlRootElement(name = "deleteProductResponse")
public class DeleteProductResponse {

    @XmlElement(required = true)
    protected String deleteProductReturn;

    /**
     * Gets the value of the deleteProductReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteProductReturn() {
        return deleteProductReturn;
    }

    /**
     * Sets the value of the deleteProductReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteProductReturn(String value) {
        this.deleteProductReturn = value;
    }

}
