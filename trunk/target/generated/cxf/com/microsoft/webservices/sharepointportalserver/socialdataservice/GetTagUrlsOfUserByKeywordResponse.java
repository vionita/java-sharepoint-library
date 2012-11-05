
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
 *         &lt;element name="GetTagUrlsOfUserByKeywordResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfString" minOccurs="0"/>
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
    "getTagUrlsOfUserByKeywordResult"
})
@XmlRootElement(name = "GetTagUrlsOfUserByKeywordResponse")
public class GetTagUrlsOfUserByKeywordResponse {

    @XmlElement(name = "GetTagUrlsOfUserByKeywordResult")
    protected ArrayOfString getTagUrlsOfUserByKeywordResult;

    /**
     * Gets the value of the getTagUrlsOfUserByKeywordResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetTagUrlsOfUserByKeywordResult() {
        return getTagUrlsOfUserByKeywordResult;
    }

    /**
     * Sets the value of the getTagUrlsOfUserByKeywordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetTagUrlsOfUserByKeywordResult(ArrayOfString value) {
        this.getTagUrlsOfUserByKeywordResult = value;
    }

}
