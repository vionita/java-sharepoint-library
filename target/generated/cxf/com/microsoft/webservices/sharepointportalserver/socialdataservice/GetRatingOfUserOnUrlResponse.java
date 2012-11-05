
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
 *         &lt;element name="GetRatingOfUserOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialRatingDetail" minOccurs="0"/>
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
    "getRatingOfUserOnUrlResult"
})
@XmlRootElement(name = "GetRatingOfUserOnUrlResponse")
public class GetRatingOfUserOnUrlResponse {

    @XmlElement(name = "GetRatingOfUserOnUrlResult")
    protected SocialRatingDetail getRatingOfUserOnUrlResult;

    /**
     * Gets the value of the getRatingOfUserOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialRatingDetail }
     *     
     */
    public SocialRatingDetail getGetRatingOfUserOnUrlResult() {
        return getRatingOfUserOnUrlResult;
    }

    /**
     * Sets the value of the getRatingOfUserOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialRatingDetail }
     *     
     */
    public void setGetRatingOfUserOnUrlResult(SocialRatingDetail value) {
        this.getRatingOfUserOnUrlResult = value;
    }

}
