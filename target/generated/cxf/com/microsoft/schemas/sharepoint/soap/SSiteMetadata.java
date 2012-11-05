
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _sSiteMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_sSiteMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastModifiedForceRecrawl" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SmallSite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PortalUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserProfileGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidSecurityInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_sSiteMetadata", propOrder = {
    "lastModified",
    "lastModifiedForceRecrawl",
    "smallSite",
    "portalUrl",
    "userProfileGUID",
    "validSecurityInfo"
})
public class SSiteMetadata {

    @XmlElement(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "LastModifiedForceRecrawl", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedForceRecrawl;
    @XmlElement(name = "SmallSite")
    protected boolean smallSite;
    @XmlElement(name = "PortalUrl")
    protected String portalUrl;
    @XmlElement(name = "UserProfileGUID")
    protected String userProfileGUID;
    @XmlElement(name = "ValidSecurityInfo")
    protected boolean validSecurityInfo;

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
     * Gets the value of the smallSite property.
     * 
     */
    public boolean isSmallSite() {
        return smallSite;
    }

    /**
     * Sets the value of the smallSite property.
     * 
     */
    public void setSmallSite(boolean value) {
        this.smallSite = value;
    }

    /**
     * Gets the value of the portalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    /**
     * Sets the value of the portalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalUrl(String value) {
        this.portalUrl = value;
    }

    /**
     * Gets the value of the userProfileGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserProfileGUID() {
        return userProfileGUID;
    }

    /**
     * Sets the value of the userProfileGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserProfileGUID(String value) {
        this.userProfileGUID = value;
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

}
