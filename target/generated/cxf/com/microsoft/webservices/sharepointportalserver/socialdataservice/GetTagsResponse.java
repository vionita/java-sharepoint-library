
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
 *         &lt;element name="GetTagsResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTagDetail" minOccurs="0"/>
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
    "getTagsResult"
})
@XmlRootElement(name = "GetTagsResponse")
public class GetTagsResponse {

    @XmlElement(name = "GetTagsResult")
    protected ArrayOfSocialTagDetail getTagsResult;

    /**
     * Gets the value of the getTagsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public ArrayOfSocialTagDetail getGetTagsResult() {
        return getTagsResult;
    }

    /**
     * Sets the value of the getTagsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public void setGetTagsResult(ArrayOfSocialTagDetail value) {
        this.getTagsResult = value;
    }

}
