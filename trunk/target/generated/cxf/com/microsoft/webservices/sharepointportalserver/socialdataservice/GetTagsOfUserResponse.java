
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
 *         &lt;element name="GetTagsOfUserResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTagDetail" minOccurs="0"/>
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
    "getTagsOfUserResult"
})
@XmlRootElement(name = "GetTagsOfUserResponse")
public class GetTagsOfUserResponse {

    @XmlElement(name = "GetTagsOfUserResult")
    protected ArrayOfSocialTagDetail getTagsOfUserResult;

    /**
     * Gets the value of the getTagsOfUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public ArrayOfSocialTagDetail getGetTagsOfUserResult() {
        return getTagsOfUserResult;
    }

    /**
     * Sets the value of the getTagsOfUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public void setGetTagsOfUserResult(ArrayOfSocialTagDetail value) {
        this.getTagsOfUserResult = value;
    }

}
