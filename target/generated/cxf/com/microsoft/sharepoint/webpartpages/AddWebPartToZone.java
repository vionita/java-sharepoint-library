
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
 *         &lt;element name="pageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webPartXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storage" type="{http://microsoft.com/sharepoint/webpartpages}Storage"/>
 *         &lt;element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pageUrl",
    "webPartXml",
    "storage",
    "zoneId",
    "zoneIndex"
})
@XmlRootElement(name = "AddWebPartToZone")
public class AddWebPartToZone {

    protected String pageUrl;
    protected String webPartXml;
    @XmlElement(required = true)
    protected Storage storage;
    protected String zoneId;
    protected int zoneIndex;

    /**
     * Gets the value of the pageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * Sets the value of the pageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageUrl(String value) {
        this.pageUrl = value;
    }

    /**
     * Gets the value of the webPartXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPartXml() {
        return webPartXml;
    }

    /**
     * Sets the value of the webPartXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPartXml(String value) {
        this.webPartXml = value;
    }

    /**
     * Gets the value of the storage property.
     * 
     * @return
     *     possible object is
     *     {@link Storage }
     *     
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Sets the value of the storage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Storage }
     *     
     */
    public void setStorage(Storage value) {
        this.storage = value;
    }

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneId(String value) {
        this.zoneId = value;
    }

    /**
     * Gets the value of the zoneIndex property.
     * 
     */
    public int getZoneIndex() {
        return zoneIndex;
    }

    /**
     * Sets the value of the zoneIndex property.
     * 
     */
    public void setZoneIndex(int value) {
        this.zoneIndex = value;
    }

}
