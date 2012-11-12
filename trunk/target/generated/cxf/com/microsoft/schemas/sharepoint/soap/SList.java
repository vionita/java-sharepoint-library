
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _sList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_sList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultViewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InheritedSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowAnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnonymousViewListItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReadSecurity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_sList", propOrder = {
    "internalName",
    "title",
    "description",
    "baseType",
    "baseTemplate",
    "defaultViewUrl",
    "lastModified",
    "permId",
    "inheritedSecurity",
    "allowAnonymousAccess",
    "anonymousViewListItems",
    "readSecurity"
})
public class SList {

    @XmlElement(name = "InternalName")
    protected String internalName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "BaseType")
    protected String baseType;
    @XmlElement(name = "BaseTemplate")
    protected String baseTemplate;
    @XmlElement(name = "DefaultViewUrl")
    protected String defaultViewUrl;
    @XmlElement(name = "LastModified")
    protected String lastModified;
    @XmlElement(name = "PermId")
    protected String permId;
    @XmlElement(name = "InheritedSecurity")
    protected boolean inheritedSecurity;
    @XmlElement(name = "AllowAnonymousAccess")
    protected boolean allowAnonymousAccess;
    @XmlElement(name = "AnonymousViewListItems")
    protected boolean anonymousViewListItems;
    @XmlElement(name = "ReadSecurity")
    protected int readSecurity;

    /**
     * Gets the value of the internalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Sets the value of the internalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalName(String value) {
        this.internalName = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the baseTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTemplate() {
        return baseTemplate;
    }

    /**
     * Sets the value of the baseTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTemplate(String value) {
        this.baseTemplate = value;
    }

    /**
     * Gets the value of the defaultViewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultViewUrl() {
        return defaultViewUrl;
    }

    /**
     * Sets the value of the defaultViewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultViewUrl(String value) {
        this.defaultViewUrl = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the permId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermId() {
        return permId;
    }

    /**
     * Sets the value of the permId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermId(String value) {
        this.permId = value;
    }

    /**
     * Gets the value of the inheritedSecurity property.
     * 
     */
    public boolean isInheritedSecurity() {
        return inheritedSecurity;
    }

    /**
     * Sets the value of the inheritedSecurity property.
     * 
     */
    public void setInheritedSecurity(boolean value) {
        this.inheritedSecurity = value;
    }

    /**
     * Gets the value of the allowAnonymousAccess property.
     * 
     */
    public boolean isAllowAnonymousAccess() {
        return allowAnonymousAccess;
    }

    /**
     * Sets the value of the allowAnonymousAccess property.
     * 
     */
    public void setAllowAnonymousAccess(boolean value) {
        this.allowAnonymousAccess = value;
    }

    /**
     * Gets the value of the anonymousViewListItems property.
     * 
     */
    public boolean isAnonymousViewListItems() {
        return anonymousViewListItems;
    }

    /**
     * Sets the value of the anonymousViewListItems property.
     * 
     */
    public void setAnonymousViewListItems(boolean value) {
        this.anonymousViewListItems = value;
    }

    /**
     * Gets the value of the readSecurity property.
     * 
     */
    public int getReadSecurity() {
        return readSecurity;
    }

    /**
     * Sets the value of the readSecurity property.
     * 
     */
    public void setReadSecurity(int value) {
        this.readSecurity = value;
    }

}
