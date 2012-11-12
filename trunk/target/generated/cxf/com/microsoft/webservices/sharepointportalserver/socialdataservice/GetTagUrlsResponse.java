
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
 *         &lt;element name="GetTagUrlsResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfString" minOccurs="0"/>
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
    "getTagUrlsResult"
})
@XmlRootElement(name = "GetTagUrlsResponse")
public class GetTagUrlsResponse {

    @XmlElement(name = "GetTagUrlsResult")
    protected ArrayOfString getTagUrlsResult;

    /**
     * Gets the value of the getTagUrlsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetTagUrlsResult() {
        return getTagUrlsResult;
    }

    /**
     * Sets the value of the getTagUrlsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetTagUrlsResult(ArrayOfString value) {
        this.getTagUrlsResult = value;
    }

}
