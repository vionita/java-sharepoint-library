
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
 *         &lt;element name="OldAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}ContactFlags"/>
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
    "oldAlias",
    "newAlias",
    "firstName",
    "lastName",
    "forwardingEmail",
    "flags"
})
@XmlRootElement(name = "ModifyContact")
public class ModifyContact {

    @XmlElement(name = "OldAlias")
    protected String oldAlias;
    @XmlElement(name = "NewAlias")
    protected String newAlias;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ForwardingEmail")
    protected String forwardingEmail;
    @XmlElement(name = "Flags", required = true)
    protected ContactFlags flags;

    /**
     * Gets the value of the oldAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAlias() {
        return oldAlias;
    }

    /**
     * Sets the value of the oldAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAlias(String value) {
        this.oldAlias = value;
    }

    /**
     * Gets the value of the newAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAlias() {
        return newAlias;
    }

    /**
     * Sets the value of the newAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAlias(String value) {
        this.newAlias = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the forwardingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardingEmail() {
        return forwardingEmail;
    }

    /**
     * Sets the value of the forwardingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardingEmail(String value) {
        this.forwardingEmail = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFlags }
     *     
     */
    public ContactFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFlags }
     *     
     */
    public void setFlags(ContactFlags value) {
        this.flags = value;
    }

}
