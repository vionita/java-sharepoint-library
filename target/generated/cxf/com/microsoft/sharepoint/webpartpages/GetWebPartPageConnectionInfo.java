
package com.microsoft.sharepoint.webpartpages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sourcePageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourcePageContents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sourcePageUrl",
    "sourcePageContents",
    "providerPartID",
    "lcid"
})
@XmlRootElement(name = "GetWebPartPageConnectionInfo")
public class GetWebPartPageConnectionInfo {

    protected String sourcePageUrl;
    protected String sourcePageContents;
    protected String providerPartID;
    protected String lcid;

    /**
     * Gets the value of the sourcePageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePageUrl() {
        return sourcePageUrl;
    }

    /**
     * Sets the value of the sourcePageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePageUrl(String value) {
        this.sourcePageUrl = value;
    }

    /**
     * Gets the value of the sourcePageContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePageContents() {
        return sourcePageContents;
    }

    /**
     * Sets the value of the sourcePageContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePageContents(String value) {
        this.sourcePageContents = value;
    }

    /**
     * Gets the value of the providerPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderPartID() {
        return providerPartID;
    }

    /**
     * Sets the value of the providerPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderPartID(String value) {
        this.providerPartID = value;
    }

    /**
     * Gets the value of the lcid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcid(String value) {
        this.lcid = value;
    }

}
