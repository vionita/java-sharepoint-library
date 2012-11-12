
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
 *         &lt;element name="GetRatingsOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialRatingDetail" minOccurs="0"/>
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
    "getRatingsOnUrlResult"
})
@XmlRootElement(name = "GetRatingsOnUrlResponse")
public class GetRatingsOnUrlResponse {

    @XmlElement(name = "GetRatingsOnUrlResult")
    protected ArrayOfSocialRatingDetail getRatingsOnUrlResult;

    /**
     * Gets the value of the getRatingsOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public ArrayOfSocialRatingDetail getGetRatingsOnUrlResult() {
        return getRatingsOnUrlResult;
    }

    /**
     * Sets the value of the getRatingsOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public void setGetRatingsOnUrlResult(ArrayOfSocialRatingDetail value) {
        this.getRatingsOnUrlResult = value;
    }

}
