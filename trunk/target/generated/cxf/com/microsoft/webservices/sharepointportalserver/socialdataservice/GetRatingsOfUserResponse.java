
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
 *         &lt;element name="GetRatingsOfUserResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialRatingDetail" minOccurs="0"/>
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
    "getRatingsOfUserResult"
})
@XmlRootElement(name = "GetRatingsOfUserResponse")
public class GetRatingsOfUserResponse {

    @XmlElement(name = "GetRatingsOfUserResult")
    protected ArrayOfSocialRatingDetail getRatingsOfUserResult;

    /**
     * Gets the value of the getRatingsOfUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public ArrayOfSocialRatingDetail getGetRatingsOfUserResult() {
        return getRatingsOfUserResult;
    }

    /**
     * Sets the value of the getRatingsOfUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public void setGetRatingsOfUserResult(ArrayOfSocialRatingDetail value) {
        this.getRatingsOfUserResult = value;
    }

}
