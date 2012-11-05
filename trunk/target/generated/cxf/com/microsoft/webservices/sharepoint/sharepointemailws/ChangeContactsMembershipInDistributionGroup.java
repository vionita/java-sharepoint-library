
package com.microsoft.webservices.sharepoint.sharepointemailws;

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
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddListForContacts" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DeleteListForContacts" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DeleteAllCurrentMembers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "alias",
    "addListForContacts",
    "deleteListForContacts",
    "deleteAllCurrentMembers"
})
@XmlRootElement(name = "ChangeContactsMembershipInDistributionGroup")
public class ChangeContactsMembershipInDistributionGroup {

    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "AddListForContacts")
    protected ArrayOfString addListForContacts;
    @XmlElement(name = "DeleteListForContacts")
    protected ArrayOfString deleteListForContacts;
    @XmlElement(name = "DeleteAllCurrentMembers")
    protected boolean deleteAllCurrentMembers;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the addListForContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAddListForContacts() {
        return addListForContacts;
    }

    /**
     * Sets the value of the addListForContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAddListForContacts(ArrayOfString value) {
        this.addListForContacts = value;
    }

    /**
     * Gets the value of the deleteListForContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDeleteListForContacts() {
        return deleteListForContacts;
    }

    /**
     * Sets the value of the deleteListForContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDeleteListForContacts(ArrayOfString value) {
        this.deleteListForContacts = value;
    }

    /**
     * Gets the value of the deleteAllCurrentMembers property.
     * 
     */
    public boolean isDeleteAllCurrentMembers() {
        return deleteAllCurrentMembers;
    }

    /**
     * Sets the value of the deleteAllCurrentMembers property.
     * 
     */
    public void setDeleteAllCurrentMembers(boolean value) {
        this.deleteAllCurrentMembers = value;
    }

}
