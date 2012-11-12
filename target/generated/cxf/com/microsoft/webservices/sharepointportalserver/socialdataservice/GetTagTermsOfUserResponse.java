
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
 *         &lt;element name="GetTagTermsOfUserResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTermDetail" minOccurs="0"/>
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
    "getTagTermsOfUserResult"
})
@XmlRootElement(name = "GetTagTermsOfUserResponse")
public class GetTagTermsOfUserResponse {

    @XmlElement(name = "GetTagTermsOfUserResult")
    protected ArrayOfSocialTermDetail getTagTermsOfUserResult;

    /**
     * Gets the value of the getTagTermsOfUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public ArrayOfSocialTermDetail getGetTagTermsOfUserResult() {
        return getTagTermsOfUserResult;
    }

    /**
     * Sets the value of the getTagTermsOfUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public void setGetTagTermsOfUserResult(ArrayOfSocialTermDetail value) {
        this.getTagTermsOfUserResult = value;
    }

}
