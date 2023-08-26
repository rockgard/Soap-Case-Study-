
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
 *         &lt;element name="updateProductReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "updateProductReturn"
})
@XmlRootElement(name = "updateProductResponse")
public class UpdateProductResponse {

    @XmlElement(required = true)
    protected String updateProductReturn;

    /**
     * Gets the value of the updateProductReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateProductReturn() {
        return updateProductReturn;
    }

    /**
     * Sets the value of the updateProductReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateProductReturn(String value) {
        this.updateProductReturn = value;
    }

}
