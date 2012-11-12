
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
 *         &lt;element name="GetCommentsOfUserOnUrlResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialCommentDetail" minOccurs="0"/>
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
    "getCommentsOfUserOnUrlResult"
})
@XmlRootElement(name = "GetCommentsOfUserOnUrlResponse")
public class GetCommentsOfUserOnUrlResponse {

    @XmlElement(name = "GetCommentsOfUserOnUrlResult")
    protected ArrayOfSocialCommentDetail getCommentsOfUserOnUrlResult;

    /**
     * Gets the value of the getCommentsOfUserOnUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public ArrayOfSocialCommentDetail getGetCommentsOfUserOnUrlResult() {
        return getCommentsOfUserOnUrlResult;
    }

    /**
     * Sets the value of the getCommentsOfUserOnUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public void setGetCommentsOfUserOnUrlResult(ArrayOfSocialCommentDetail value) {
        this.getCommentsOfUserOnUrlResult = value;
    }

}
