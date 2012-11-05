
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
 *         &lt;element name="GetAllTagUrlsResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialUrlDetail" minOccurs="0"/>
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
    "getAllTagUrlsResult"
})
@XmlRootElement(name = "GetAllTagUrlsResponse")
public class GetAllTagUrlsResponse {

    @XmlElement(name = "GetAllTagUrlsResult")
    protected ArrayOfSocialUrlDetail getAllTagUrlsResult;

    /**
     * Gets the value of the getAllTagUrlsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialUrlDetail }
     *     
     */
    public ArrayOfSocialUrlDetail getGetAllTagUrlsResult() {
        return getAllTagUrlsResult;
    }

    /**
     * Sets the value of the getAllTagUrlsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialUrlDetail }
     *     
     */
    public void setGetAllTagUrlsResult(ArrayOfSocialUrlDetail value) {
        this.getAllTagUrlsResult = value;
    }

}
