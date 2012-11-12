
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
 *         &lt;element name="WebUrlFromPageUrlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "webUrlFromPageUrlResult"
})
@XmlRootElement(name = "WebUrlFromPageUrlResponse")
public class WebUrlFromPageUrlResponse {

    @XmlElement(name = "WebUrlFromPageUrlResult")
    protected String webUrlFromPageUrlResult;

    /**
     * Gets the value of the webUrlFromPageUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrlFromPageUrlResult() {
        return webUrlFromPageUrlResult;
    }

    /**
     * Sets the value of the webUrlFromPageUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrlFromPageUrlResult(String value) {
        this.webUrlFromPageUrlResult = value;
    }

}
