
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _sListMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_sListMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultViewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModifiedForceRecrawl" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidSecurityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InheritedSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowAnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnonymousViewListItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReadSecurity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Permissions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_sListMetadata", propOrder = {
    "title",
    "description",
    "baseType",
    "baseTemplate",
    "defaultViewUrl",
    "lastModified",
    "lastModifiedForceRecrawl",
    "author",
    "validSecurityInfo",
    "inheritedSecurity",
    "allowAnonymousAccess",
    "anonymousViewListItems",
    "readSecurity",
    "permissions"
})
public class SListMetadata {

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
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "LastModifiedForceRecrawl", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedForceRecrawl;
    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "ValidSecurityInfo")
    protected boolean validSecurityInfo;
    @XmlElement(name = "InheritedSecurity")
    protected boolean inheritedSecurity;
    @XmlElement(name = "AllowAnonymousAccess")
    protected boolean allowAnonymousAccess;
    @XmlElement(name = "AnonymousViewListItems")
    protected boolean anonymousViewListItems;
    @XmlElement(name = "ReadSecurity")
    protected int readSecurity;
    @XmlElement(name = "Permissions")
    protected String permissions;

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the lastModifiedForceRecrawl property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedForceRecrawl() {
        return lastModifiedForceRecrawl;
    }

    /**
     * Sets the value of the lastModifiedForceRecrawl property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedForceRecrawl(XMLGregorianCalendar value) {
        this.lastModifiedForceRecrawl = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the validSecurityInfo property.
     * 
     */
    public boolean isValidSecurityInfo() {
        return validSecurityInfo;
    }

    /**
     * Sets the value of the validSecurityInfo property.
     * 
     */
    public void setValidSecurityInfo(boolean value) {
        this.validSecurityInfo = value;
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

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissions(String value) {
        this.permissions = value;
    }

}
