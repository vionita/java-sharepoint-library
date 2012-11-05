
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

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
 *         &lt;element name="GetSocialDataForIncrementalReplicationResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialReplicationData" minOccurs="0"/>
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
    "getSocialDataForIncrementalReplicationResult"
})
@XmlRootElement(name = "GetSocialDataForIncrementalReplicationResponse")
public class GetSocialDataForIncrementalReplicationResponse {

    @XmlElement(name = "GetSocialDataForIncrementalReplicationResult")
    protected SocialReplicationData getSocialDataForIncrementalReplicationResult;

    /**
     * Gets the value of the getSocialDataForIncrementalReplicationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialReplicationData }
     *     
     */
    public SocialReplicationData getGetSocialDataForIncrementalReplicationResult() {
        return getSocialDataForIncrementalReplicationResult;
    }

    /**
     * Sets the value of the getSocialDataForIncrementalReplicationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialReplicationData }
     *     
     */
    public void setGetSocialDataForIncrementalReplicationResult(SocialReplicationData value) {
        this.getSocialDataForIncrementalReplicationResult = value;
    }

}
