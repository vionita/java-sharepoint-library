
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
 *         &lt;element name="Info" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestInfo" minOccurs="0"/>
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
    "info"
})
@XmlRootElement(name = "RenameDistributionGroup")
public class RenameDistributionGroup {

    @XmlElement(name = "OldAlias")
    protected String oldAlias;
    @XmlElement(name = "NewAlias")
    protected String newAlias;
    @XmlElement(name = "Info")
    protected RequestInfo info;

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
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInfo }
     *     
     */
    public RequestInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInfo }
     *     
     */
    public void setInfo(RequestInfo value) {
        this.info = value;
    }

}
