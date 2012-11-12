
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
 *         &lt;element name="CreateDistributionGroupResult" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestResponse" minOccurs="0"/>
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
    "createDistributionGroupResult"
})
@XmlRootElement(name = "CreateDistributionGroupResponse")
public class CreateDistributionGroupResponse {

    @XmlElement(name = "CreateDistributionGroupResult")
    protected RequestResponse createDistributionGroupResult;

    /**
     * Gets the value of the createDistributionGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResponse }
     *     
     */
    public RequestResponse getCreateDistributionGroupResult() {
        return createDistributionGroupResult;
    }

    /**
     * Sets the value of the createDistributionGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResponse }
     *     
     */
    public void setCreateDistributionGroupResult(RequestResponse value) {
        this.createDistributionGroupResult = value;
    }

}
