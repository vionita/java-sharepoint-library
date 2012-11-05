
package com.microsoft.schemas.sharepoint.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInfoID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsResolved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MoreMatches" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfPrincipalInfo" minOccurs="0"/>
 *         &lt;element name="PrincipalType" type="{http://schemas.microsoft.com/sharepoint/soap/}SPPrincipalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalInfo", propOrder = {
    "accountName",
    "userInfoID",
    "displayName",
    "email",
    "department",
    "title",
    "isResolved",
    "moreMatches",
    "principalType"
})
public class PrincipalInfo {

    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "UserInfoID")
    protected int userInfoID;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "IsResolved")
    protected boolean isResolved;
    @XmlElement(name = "MoreMatches")
    protected ArrayOfPrincipalInfo moreMatches;
    @XmlList
    @XmlElement(name = "PrincipalType", required = true)
    protected List<String> principalType;

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the userInfoID property.
     * 
     */
    public int getUserInfoID() {
        return userInfoID;
    }

    /**
     * Sets the value of the userInfoID property.
     * 
     */
    public void setUserInfoID(int value) {
        this.userInfoID = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
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
     * Gets the value of the isResolved property.
     * 
     */
    public boolean isIsResolved() {
        return isResolved;
    }

    /**
     * Sets the value of the isResolved property.
     * 
     */
    public void setIsResolved(boolean value) {
        this.isResolved = value;
    }

    /**
     * Gets the value of the moreMatches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public ArrayOfPrincipalInfo getMoreMatches() {
        return moreMatches;
    }

    /**
     * Sets the value of the moreMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public void setMoreMatches(ArrayOfPrincipalInfo value) {
        this.moreMatches = value;
    }

    /**
     * Gets the value of the principalType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrincipalType() {
        if (principalType == null) {
            principalType = new ArrayList<String>();
        }
        return this.principalType;
    }

}
