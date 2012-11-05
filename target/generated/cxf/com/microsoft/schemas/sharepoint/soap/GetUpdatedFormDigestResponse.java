
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
 *         &lt;element name="GetUpdatedFormDigestResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getUpdatedFormDigestResult"
})
@XmlRootElement(name = "GetUpdatedFormDigestResponse")
public class GetUpdatedFormDigestResponse {

    @XmlElement(name = "GetUpdatedFormDigestResult")
    protected String getUpdatedFormDigestResult;

    /**
     * Gets the value of the getUpdatedFormDigestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUpdatedFormDigestResult() {
        return getUpdatedFormDigestResult;
    }

    /**
     * Sets the value of the getUpdatedFormDigestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUpdatedFormDigestResult(String value) {
        this.getUpdatedFormDigestResult = value;
    }

}
