
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetSiteUrlResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="siteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSiteUrlResult",
    "siteUrl",
    "siteId"
})
@XmlRootElement(name = "GetSiteUrlResponse")
public class GetSiteUrlResponse {

    @XmlElement(name = "GetSiteUrlResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getSiteUrlResult;
    protected String siteUrl;
    protected String siteId;

    /**
     * Gets the value of the getSiteUrlResult property.
     * 
     */
    public long getGetSiteUrlResult() {
        return getSiteUrlResult;
    }

    /**
     * Sets the value of the getSiteUrlResult property.
     * 
     */
    public void setGetSiteUrlResult(long value) {
        this.getSiteUrlResult = value;
    }

    /**
     * Gets the value of the siteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Sets the value of the siteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUrl(String value) {
        this.siteUrl = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

}
