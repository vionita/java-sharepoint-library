
package com.microsoft.sharepoint.webpartpages;

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
 *         &lt;element name="AddWebPartResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "addWebPartResult"
})
@XmlRootElement(name = "AddWebPartResponse")
public class AddWebPartResponse {

    @XmlElement(name = "AddWebPartResult", required = true)
    protected String addWebPartResult;

    /**
     * Gets the value of the addWebPartResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddWebPartResult() {
        return addWebPartResult;
    }

    /**
     * Sets the value of the addWebPartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddWebPartResult(String value) {
        this.addWebPartResult = value;
    }

}
