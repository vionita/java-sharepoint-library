
package com.microsoft.schemas.sharepoint.soap;

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
 *         &lt;element name="GetActivatedFeaturesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getActivatedFeaturesResult"
})
@XmlRootElement(name = "GetActivatedFeaturesResponse")
public class GetActivatedFeaturesResponse {

    @XmlElement(name = "GetActivatedFeaturesResult")
    protected String getActivatedFeaturesResult;

    /**
     * Gets the value of the getActivatedFeaturesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetActivatedFeaturesResult() {
        return getActivatedFeaturesResult;
    }

    /**
     * Sets the value of the getActivatedFeaturesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetActivatedFeaturesResult(String value) {
        this.getActivatedFeaturesResult = value;
    }

}
