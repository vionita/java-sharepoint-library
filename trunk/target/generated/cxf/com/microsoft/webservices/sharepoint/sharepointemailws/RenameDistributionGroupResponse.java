
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
 *         &lt;element name="RenameDistributionGroupResult" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestResponse" minOccurs="0"/>
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
    "renameDistributionGroupResult"
})
@XmlRootElement(name = "RenameDistributionGroupResponse")
public class RenameDistributionGroupResponse {

    @XmlElement(name = "RenameDistributionGroupResult")
    protected RequestResponse renameDistributionGroupResult;

    /**
     * Gets the value of the renameDistributionGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResponse }
     *     
     */
    public RequestResponse getRenameDistributionGroupResult() {
        return renameDistributionGroupResult;
    }

    /**
     * Sets the value of the renameDistributionGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResponse }
     *     
     */
    public void setRenameDistributionGroupResult(RequestResponse value) {
        this.renameDistributionGroupResult = value;
    }

}
