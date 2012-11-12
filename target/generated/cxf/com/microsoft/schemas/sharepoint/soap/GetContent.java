
package com.microsoft.schemas.sharepoint.soap;

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
 *         &lt;element name="objectType" type="{http://schemas.microsoft.com/sharepoint/soap/}ObjectType"/>
 *         &lt;element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retrieveChildItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="securityOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastItemIdOnPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "objectType",
    "objectId",
    "folderUrl",
    "itemId",
    "retrieveChildItems",
    "securityOnly",
    "lastItemIdOnPage"
})
@XmlRootElement(name = "GetContent")
public class GetContent {

    @XmlElement(required = true)
    protected ObjectType objectType;
    protected String objectId;
    protected String folderUrl;
    protected String itemId;
    protected boolean retrieveChildItems;
    protected boolean securityOnly;
    protected String lastItemIdOnPage;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setObjectType(ObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the folderUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderUrl() {
        return folderUrl;
    }

    /**
     * Sets the value of the folderUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderUrl(String value) {
        this.folderUrl = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the retrieveChildItems property.
     * 
     */
    public boolean isRetrieveChildItems() {
        return retrieveChildItems;
    }

    /**
     * Sets the value of the retrieveChildItems property.
     * 
     */
    public void setRetrieveChildItems(boolean value) {
        this.retrieveChildItems = value;
    }

    /**
     * Gets the value of the securityOnly property.
     * 
     */
    public boolean isSecurityOnly() {
        return securityOnly;
    }

    /**
     * Sets the value of the securityOnly property.
     * 
     */
    public void setSecurityOnly(boolean value) {
        this.securityOnly = value;
    }

    /**
     * Gets the value of the lastItemIdOnPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastItemIdOnPage() {
        return lastItemIdOnPage;
    }

    /**
     * Sets the value of the lastItemIdOnPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastItemIdOnPage(String value) {
        this.lastItemIdOnPage = value;
    }

}
