
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
 *         &lt;element name="GetTagUrlsOfUserResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfString" minOccurs="0"/>
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
    "getTagUrlsOfUserResult"
})
@XmlRootElement(name = "GetTagUrlsOfUserResponse")
public class GetTagUrlsOfUserResponse {

    @XmlElement(name = "GetTagUrlsOfUserResult")
    protected ArrayOfString getTagUrlsOfUserResult;

    /**
     * Gets the value of the getTagUrlsOfUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetTagUrlsOfUserResult() {
        return getTagUrlsOfUserResult;
    }

    /**
     * Sets the value of the getTagUrlsOfUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetTagUrlsOfUserResult(ArrayOfString value) {
        this.getTagUrlsOfUserResult = value;
    }

}
