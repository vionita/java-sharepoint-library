
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
 *         &lt;element name="DeleteDistributionGroupResult" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestResponse" minOccurs="0"/>
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
    "deleteDistributionGroupResult"
})
@XmlRootElement(name = "DeleteDistributionGroupResponse")
public class DeleteDistributionGroupResponse {

    @XmlElement(name = "DeleteDistributionGroupResult")
    protected RequestResponse deleteDistributionGroupResult;

    /**
     * Gets the value of the deleteDistributionGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResponse }
     *     
     */
    public RequestResponse getDeleteDistributionGroupResult() {
        return deleteDistributionGroupResult;
    }

    /**
     * Sets the value of the deleteDistributionGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResponse }
     *     
     */
    public void setDeleteDistributionGroupResult(RequestResponse value) {
        this.deleteDistributionGroupResult = value;
    }

}
