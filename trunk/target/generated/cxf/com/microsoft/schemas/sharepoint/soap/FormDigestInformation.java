
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormDigestInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDigestInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeoutSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebFullUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LibraryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportedSchemaVersions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDigestInformation", propOrder = {
    "digestValue",
    "timeoutSeconds",
    "webFullUrl",
    "libraryVersion",
    "supportedSchemaVersions"
})
public class FormDigestInformation {

    @XmlElement(name = "DigestValue")
    protected String digestValue;
    @XmlElement(name = "TimeoutSeconds")
    protected int timeoutSeconds;
    @XmlElement(name = "WebFullUrl")
    protected String webFullUrl;
    @XmlElement(name = "LibraryVersion")
    protected String libraryVersion;
    @XmlElement(name = "SupportedSchemaVersions")
    protected String supportedSchemaVersions;

    /**
     * Gets the value of the digestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestValue() {
        return digestValue;
    }

    /**
     * Sets the value of the digestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestValue(String value) {
        this.digestValue = value;
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

    /**
     * Gets the value of the webFullUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebFullUrl() {
        return webFullUrl;
    }

    /**
     * Sets the value of the webFullUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebFullUrl(String value) {
        this.webFullUrl = value;
    }

    /**
     * Gets the value of the libraryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryVersion() {
        return libraryVersion;
    }

    /**
     * Sets the value of the libraryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryVersion(String value) {
        this.libraryVersion = value;
    }

    /**
     * Gets the value of the supportedSchemaVersions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedSchemaVersions() {
        return supportedSchemaVersions;
    }

    /**
     * Sets the value of the supportedSchemaVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedSchemaVersions(String value) {
        this.supportedSchemaVersions = value;
    }

}
