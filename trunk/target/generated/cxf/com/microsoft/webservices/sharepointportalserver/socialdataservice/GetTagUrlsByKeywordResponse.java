
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
 *         &lt;element name="GetTagUrlsByKeywordResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfString" minOccurs="0"/>
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
    "getTagUrlsByKeywordResult"
})
@XmlRootElement(name = "GetTagUrlsByKeywordResponse")
public class GetTagUrlsByKeywordResponse {

    @XmlElement(name = "GetTagUrlsByKeywordResult")
    protected ArrayOfString getTagUrlsByKeywordResult;

    /**
     * Gets the value of the getTagUrlsByKeywordResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetTagUrlsByKeywordResult() {
        return getTagUrlsByKeywordResult;
    }

    /**
     * Sets the value of the getTagUrlsByKeywordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetTagUrlsByKeywordResult(ArrayOfString value) {
        this.getTagUrlsByKeywordResult = value;
    }

}
