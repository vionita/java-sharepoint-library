
package com.microsoft.webservices.sharepointportalserver.publishedlinksservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IsMember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPublished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerLink", propOrder = {
    "title",
    "url",
    "linkType",
    "isMember",
    "isPublished"
})
public class ServerLink {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Url", required = true)
    protected String url;
    @XmlElement(name = "LinkType")
    protected long linkType;
    @XmlElement(name = "IsMember")
    protected boolean isMember;
    @XmlElement(name = "IsPublished")
    protected boolean isPublished;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     */
    public long getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     */
    public void setLinkType(long value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the isMember property.
     * 
     */
    public boolean isIsMember() {
        return isMember;
    }

    /**
     * Sets the value of the isMember property.
     * 
     */
    public void setIsMember(boolean value) {
        this.isMember = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     */
    public boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     */
    public void setIsPublished(boolean value) {
        this.isPublished = value;
    }

}
