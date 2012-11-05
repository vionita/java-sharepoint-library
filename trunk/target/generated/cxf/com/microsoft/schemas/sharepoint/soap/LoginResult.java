
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CookieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://schemas.microsoft.com/sharepoint/soap/}LoginErrorCode"/>
 *         &lt;element name="TimeoutSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder = {
    "cookieName",
    "errorCode",
    "timeoutSeconds"
})
public class LoginResult {

    @XmlElement(name = "CookieName")
    protected String cookieName;
    @XmlElement(name = "ErrorCode", required = true)
    protected LoginErrorCode errorCode;
    @XmlElement(name = "TimeoutSeconds")
    protected int timeoutSeconds;

    /**
     * Gets the value of the cookieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * Sets the value of the cookieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookieName(String value) {
        this.cookieName = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link LoginErrorCode }
     *     
     */
    public LoginErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginErrorCode }
     *     
     */
    public void setErrorCode(LoginErrorCode value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the timeoutSeconds property.
     * 
     */
    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Sets the value of the timeoutSeconds property.
     * 
     */
    public void setTimeoutSeconds(int value) {
        this.timeoutSeconds = value;
    }

}
