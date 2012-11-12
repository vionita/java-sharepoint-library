
package com.microsoft.schemas.sharepoint.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element name="principalKeys" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="principalType" type="{http://schemas.microsoft.com/sharepoint/soap/}SPPrincipalType"/>
 *         &lt;element name="addToUserInfoList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "principalKeys",
    "principalType",
    "addToUserInfoList"
})
@XmlRootElement(name = "ResolvePrincipals")
public class ResolvePrincipals {

    protected ArrayOfString principalKeys;
    @XmlList
    @XmlElement(required = true)
    protected List<String> principalType;
    protected boolean addToUserInfoList;

    /**
     * Gets the value of the principalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPrincipalKeys() {
        return principalKeys;
    }

    /**
     * Sets the value of the principalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPrincipalKeys(ArrayOfString value) {
        this.principalKeys = value;
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

    /**
     * Gets the value of the addToUserInfoList property.
     * 
     */
    public boolean isAddToUserInfoList() {
        return addToUserInfoList;
    }

    /**
     * Sets the value of the addToUserInfoList property.
     * 
     */
    public void setAddToUserInfoList(boolean value) {
        this.addToUserInfoList = value;
    }

}
