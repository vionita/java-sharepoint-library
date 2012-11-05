
package com.microsoft.webservices.officeserver.queryservice;

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
 *         &lt;element name="GetPortalSearchInfoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getPortalSearchInfoResult"
})
@XmlRootElement(name = "GetPortalSearchInfoResponse")
public class GetPortalSearchInfoResponse {

    @XmlElement(name = "GetPortalSearchInfoResult")
    protected String getPortalSearchInfoResult;

    /**
     * Gets the value of the getPortalSearchInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPortalSearchInfoResult() {
        return getPortalSearchInfoResult;
    }

    /**
     * Sets the value of the getPortalSearchInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPortalSearchInfoResult(String value) {
        this.getPortalSearchInfoResult = value;
    }

}
