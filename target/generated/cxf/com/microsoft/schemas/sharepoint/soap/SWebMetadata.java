
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _sWebMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_sWebMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModifiedForceRecrawl" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NoIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidSecurityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InheritedSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowAnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AnonymousViewListItems" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Permissions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryIdPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBucketWeb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UsedInAutocat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CategoryBucketID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_sWebMetadata", propOrder = {
    "webID",
    "title",
    "description",
    "author",
    "language",
    "lastModified",
    "lastModifiedForceRecrawl",
    "noIndex",
    "validSecurityInfo",
    "inheritedSecurity",
    "allowAnonymousAccess",
    "anonymousViewListItems",
    "permissions",
    "externalSecurity",
    "categoryId",
    "categoryName",
    "categoryIdPath",
    "isBucketWeb",
    "usedInAutocat",
    "categoryBucketID"
})
public class SWebMetadata {

    @XmlElement(name = "WebID")
    protected String webID;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "Language")
    @XmlSchemaType(name = "unsignedInt")
    protected long language;
    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "LastModifiedForceRecrawl", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedForceRecrawl;
    @XmlElement(name = "NoIndex")
    protected String noIndex;
    @XmlElement(name = "ValidSecurityInfo")
    protected boolean validSecurityInfo;
    @XmlElement(name = "InheritedSecurity")
    protected boolean inheritedSecurity;
    @XmlElement(name = "AllowAnonymousAccess")
    protected boolean allowAnonymousAccess;
    @XmlElement(name = "AnonymousViewListItems")
    protected boolean anonymousViewListItems;
    @XmlElement(name = "Permissions")
    protected String permissions;
    @XmlElement(name = "ExternalSecurity")
    protected boolean externalSecurity;
    @XmlElement(name = "CategoryId")
    protected String categoryId;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "CategoryIdPath")
    protected String categoryIdPath;
    @XmlElement(name = "IsBucketWeb")
    protected boolean isBucketWeb;
    @XmlElement(name = "UsedInAutocat")
    protected boolean usedInAutocat;
    @XmlElement(name = "CategoryBucketID")
    protected String categoryBucketID;

    /**
     * Gets the value of the webID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebID() {
        return webID;
    }

    /**
     * Sets the value of the webID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebID(String value) {
        this.webID = value;
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
     * Gets the value of the language property.
     * 
     */
    public long getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     */
    public void setLanguage(long value) {
        this.language = value;
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
     * Gets the value of the noIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIndex() {
        return noIndex;
    }

    /**
     * Sets the value of the noIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIndex(String value) {
        this.noIndex = value;
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

    /**
     * Gets the value of the externalSecurity property.
     * 
     */
    public boolean isExternalSecurity() {
        return externalSecurity;
    }

    /**
     * Sets the value of the externalSecurity property.
     * 
     */
    public void setExternalSecurity(boolean value) {
        this.externalSecurity = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the categoryIdPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryIdPath() {
        return categoryIdPath;
    }

    /**
     * Sets the value of the categoryIdPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryIdPath(String value) {
        this.categoryIdPath = value;
    }

    /**
     * Gets the value of the isBucketWeb property.
     * 
     */
    public boolean isIsBucketWeb() {
        return isBucketWeb;
    }

    /**
     * Sets the value of the isBucketWeb property.
     * 
     */
    public void setIsBucketWeb(boolean value) {
        this.isBucketWeb = value;
    }

    /**
     * Gets the value of the usedInAutocat property.
     * 
     */
    public boolean isUsedInAutocat() {
        return usedInAutocat;
    }

    /**
     * Sets the value of the usedInAutocat property.
     * 
     */
    public void setUsedInAutocat(boolean value) {
        this.usedInAutocat = value;
    }

    /**
     * Gets the value of the categoryBucketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryBucketID() {
        return categoryBucketID;
    }

    /**
     * Sets the value of the categoryBucketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryBucketID(String value) {
        this.categoryBucketID = value;
    }

}
