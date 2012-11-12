
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
 *         &lt;element name="GetContentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastItemIdOnPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getContentResult",
    "lastItemIdOnPage"
})
@XmlRootElement(name = "GetContentResponse")
public class GetContentResponse {

    @XmlElement(name = "GetContentResult")
    protected String getContentResult;
    protected String lastItemIdOnPage;

    /**
     * Gets the value of the getContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetContentResult() {
        return getContentResult;
    }

    /**
     * Sets the value of the getContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetContentResult(String value) {
        this.getContentResult = value;
    }

    /**
     * Gets the value of the lastItemIdOnPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastItemIdOnPage() {
        return lastItemIdOnPage;
    }

    /**
     * Sets the value of the lastItemIdOnPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastItemIdOnPage(String value) {
        this.lastItemIdOnPage = value;
    }

}
