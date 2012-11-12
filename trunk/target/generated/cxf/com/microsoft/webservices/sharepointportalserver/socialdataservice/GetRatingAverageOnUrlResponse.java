
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
 *         &lt;element name="GetRatingAverageOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialRatingAverageDetail" minOccurs="0"/>
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
    "getRatingAverageOnUrlResult"
})
@XmlRootElement(name = "GetRatingAverageOnUrlResponse")
public class GetRatingAverageOnUrlResponse {

    @XmlElement(name = "GetRatingAverageOnUrlResult")
    protected SocialRatingAverageDetail getRatingAverageOnUrlResult;

    /**
     * Gets the value of the getRatingAverageOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialRatingAverageDetail }
     *     
     */
    public SocialRatingAverageDetail getGetRatingAverageOnUrlResult() {
        return getRatingAverageOnUrlResult;
    }

    /**
     * Sets the value of the getRatingAverageOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialRatingAverageDetail }
     *     
     */
    public void setGetRatingAverageOnUrlResult(SocialRatingAverageDetail value) {
        this.getRatingAverageOnUrlResult = value;
    }

}
