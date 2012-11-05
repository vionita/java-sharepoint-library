
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Template">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsUnique" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsHidden" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsCustom" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsSubWebOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IsRootWebOnly" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DisplayCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FilterCategories" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HasProvisionClass" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Template")
public class Template {

    @XmlAttribute(name = "ID", required = true)
    protected int id;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "IsUnique", required = true)
    protected boolean isUnique;
    @XmlAttribute(name = "IsHidden", required = true)
    protected boolean isHidden;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "ImageUrl")
    protected String imageUrl;
    @XmlAttribute(name = "IsCustom", required = true)
    protected boolean isCustom;
    @XmlAttribute(name = "IsSubWebOnly", required = true)
    protected boolean isSubWebOnly;
    @XmlAttribute(name = "IsRootWebOnly", required = true)
    protected boolean isRootWebOnly;
    @XmlAttribute(name = "DisplayCategory")
    protected String displayCategory;
    @XmlAttribute(name = "FilterCategories")
    protected String filterCategories;
    @XmlAttribute(name = "HasProvisionClass", required = true)
    protected boolean hasProvisionClass;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isUnique property.
     * 
     */
    public boolean isIsUnique() {
        return isUnique;
    }

    /**
     * Sets the value of the isUnique property.
     * 
     */
    public void setIsUnique(boolean value) {
        this.isUnique = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
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
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the isCustom property.
     * 
     */
    public boolean isIsCustom() {
        return isCustom;
    }

    /**
     * Sets the value of the isCustom property.
     * 
     */
    public void setIsCustom(boolean value) {
        this.isCustom = value;
    }

    /**
     * Gets the value of the isSubWebOnly property.
     * 
     */
    public boolean isIsSubWebOnly() {
        return isSubWebOnly;
    }

    /**
     * Sets the value of the isSubWebOnly property.
     * 
     */
    public void setIsSubWebOnly(boolean value) {
        this.isSubWebOnly = value;
    }

    /**
     * Gets the value of the isRootWebOnly property.
     * 
     */
    public boolean isIsRootWebOnly() {
        return isRootWebOnly;
    }

    /**
     * Sets the value of the isRootWebOnly property.
     * 
     */
    public void setIsRootWebOnly(boolean value) {
        this.isRootWebOnly = value;
    }

    /**
     * Gets the value of the displayCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCategory() {
        return displayCategory;
    }

    /**
     * Sets the value of the displayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCategory(String value) {
        this.displayCategory = value;
    }

    /**
     * Gets the value of the filterCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterCategories() {
        return filterCategories;
    }

    /**
     * Sets the value of the filterCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterCategories(String value) {
        this.filterCategories = value;
    }

    /**
     * Gets the value of the hasProvisionClass property.
     * 
     */
    public boolean isHasProvisionClass() {
        return hasProvisionClass;
    }

    /**
     * Sets the value of the hasProvisionClass property.
     * 
     */
    public void setHasProvisionClass(boolean value) {
        this.hasProvisionClass = value;
    }

}
