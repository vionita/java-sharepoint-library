
package com.microsoft.webservices.sharepoint.sharepointemailws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Justification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInfo", propOrder = {
    "requestorEmail",
    "justification",
    "requestId"
})
public class RequestInfo {

    @XmlElement(name = "RequestorEmail")
    protected String requestorEmail;
    @XmlElement(name = "Justification")
    protected String justification;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;

    /**
     * Gets the value of the requestorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorEmail() {
        return requestorEmail;
    }

    /**
     * Sets the value of the requestorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorEmail(String value) {
        this.requestorEmail = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustification(String value) {
        this.justification = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
