
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
 *         &lt;element name="GetRatingOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialRatingDetail" minOccurs="0"/>
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
    "getRatingOnUrlResult"
})
@XmlRootElement(name = "GetRatingOnUrlResponse")
public class GetRatingOnUrlResponse {

    @XmlElement(name = "GetRatingOnUrlResult")
    protected SocialRatingDetail getRatingOnUrlResult;

    /**
     * Gets the value of the getRatingOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialRatingDetail }
     *     
     */
    public SocialRatingDetail getGetRatingOnUrlResult() {
        return getRatingOnUrlResult;
    }

    /**
     * Sets the value of the getRatingOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialRatingDetail }
     *     
     */
    public void setGetRatingOnUrlResult(SocialRatingDetail value) {
        this.getRatingOnUrlResult = value;
    }

}
