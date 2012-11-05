
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
 *         &lt;element name="GetSiteAndWebResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="strSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getSiteAndWebResult",
    "strSite",
    "strWeb"
})
@XmlRootElement(name = "GetSiteAndWebResponse")
public class GetSiteAndWebResponse {

    @XmlElement(name = "GetSiteAndWebResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getSiteAndWebResult;
    protected String strSite;
    protected String strWeb;

    /**
     * Gets the value of the getSiteAndWebResult property.
     * 
     */
    public long getGetSiteAndWebResult() {
        return getSiteAndWebResult;
    }

    /**
     * Sets the value of the getSiteAndWebResult property.
     * 
     */
    public void setGetSiteAndWebResult(long value) {
        this.getSiteAndWebResult = value;
    }

    /**
     * Gets the value of the strSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSite() {
        return strSite;
    }

    /**
     * Sets the value of the strSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSite(String value) {
        this.strSite = value;
    }

    /**
     * Gets the value of the strWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWeb() {
        return strWeb;
    }

    /**
     * Sets the value of the strWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWeb(String value) {
        this.strWeb = value;
    }

}
