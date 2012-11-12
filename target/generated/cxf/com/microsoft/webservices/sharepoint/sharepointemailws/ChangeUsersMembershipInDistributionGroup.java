
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
 *         &lt;element name="AddNt4NameList" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DeleteNt4NameList" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}ArrayOfString" minOccurs="0"/>
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
    "addNt4NameList",
    "deleteNt4NameList",
    "deleteAllCurrentMembers"
})
@XmlRootElement(name = "ChangeUsersMembershipInDistributionGroup")
public class ChangeUsersMembershipInDistributionGroup {

    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "AddNt4NameList")
    protected ArrayOfString addNt4NameList;
    @XmlElement(name = "DeleteNt4NameList")
    protected ArrayOfString deleteNt4NameList;
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
     * Gets the value of the addNt4NameList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAddNt4NameList() {
        return addNt4NameList;
    }

    /**
     * Sets the value of the addNt4NameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAddNt4NameList(ArrayOfString value) {
        this.addNt4NameList = value;
    }

    /**
     * Gets the value of the deleteNt4NameList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDeleteNt4NameList() {
        return deleteNt4NameList;
    }

    /**
     * Sets the value of the deleteNt4NameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDeleteNt4NameList(ArrayOfString value) {
        this.deleteNt4NameList = value;
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
