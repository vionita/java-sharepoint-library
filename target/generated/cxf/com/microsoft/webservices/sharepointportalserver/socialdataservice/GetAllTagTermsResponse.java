
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
 *         &lt;element name="GetAllTagTermsResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTermDetail" minOccurs="0"/>
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
    "getAllTagTermsResult"
})
@XmlRootElement(name = "GetAllTagTermsResponse")
public class GetAllTagTermsResponse {

    @XmlElement(name = "GetAllTagTermsResult")
    protected ArrayOfSocialTermDetail getAllTagTermsResult;

    /**
     * Gets the value of the getAllTagTermsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public ArrayOfSocialTermDetail getGetAllTagTermsResult() {
        return getAllTagTermsResult;
    }

    /**
     * Sets the value of the getAllTagTermsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public void setGetAllTagTermsResult(ArrayOfSocialTermDetail value) {
        this.getAllTagTermsResult = value;
    }

}
