
package com.microsoft.webservices.sharepointportalserver.publishedlinksservice;

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
 *         &lt;element name="GetLinksResult" type="{http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService}ArrayOfServerLink" minOccurs="0"/>
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
    "getLinksResult"
})
@XmlRootElement(name = "GetLinksResponse")
public class GetLinksResponse {

    @XmlElement(name = "GetLinksResult")
    protected ArrayOfServerLink getLinksResult;

    /**
     * Gets the value of the getLinksResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServerLink }
     *     
     */
    public ArrayOfServerLink getGetLinksResult() {
        return getLinksResult;
    }

    /**
     * Sets the value of the getLinksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServerLink }
     *     
     */
    public void setGetLinksResult(ArrayOfServerLink value) {
        this.getLinksResult = value;
    }

}
