
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
 *         &lt;element name="GetTagTermsResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTermDetail" minOccurs="0"/>
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
    "getTagTermsResult"
})
@XmlRootElement(name = "GetTagTermsResponse")
public class GetTagTermsResponse {

    @XmlElement(name = "GetTagTermsResult")
    protected ArrayOfSocialTermDetail getTagTermsResult;

    /**
     * Gets the value of the getTagTermsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public ArrayOfSocialTermDetail getGetTagTermsResult() {
        return getTagTermsResult;
    }

    /**
     * Sets the value of the getTagTermsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTermDetail }
     *     
     */
    public void setGetTagTermsResult(ArrayOfSocialTermDetail value) {
        this.getTagTermsResult = value;
    }

}
