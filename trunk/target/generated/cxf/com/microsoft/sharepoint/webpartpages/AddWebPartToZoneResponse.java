
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
 *         &lt;element name="AddWebPartToZoneResult" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "addWebPartToZoneResult"
})
@XmlRootElement(name = "AddWebPartToZoneResponse")
public class AddWebPartToZoneResponse {

    @XmlElement(name = "AddWebPartToZoneResult", required = true)
    protected String addWebPartToZoneResult;

    /**
     * Gets the value of the addWebPartToZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddWebPartToZoneResult() {
        return addWebPartToZoneResult;
    }

    /**
     * Sets the value of the addWebPartToZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddWebPartToZoneResult(String value) {
        this.addWebPartToZoneResult = value;
    }

}
