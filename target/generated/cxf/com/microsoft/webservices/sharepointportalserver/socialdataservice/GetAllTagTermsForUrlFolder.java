
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="urlFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumItemsToReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "urlFolder",
    "maximumItemsToReturn"
})
@XmlRootElement(name = "GetAllTagTermsForUrlFolder")
public class GetAllTagTermsForUrlFolder {

    protected String urlFolder;
    protected int maximumItemsToReturn;

    /**
     * Gets the value of the urlFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlFolder() {
        return urlFolder;
    }

    /**
     * Sets the value of the urlFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlFolder(String value) {
        this.urlFolder = value;
    }

    /**
     * Gets the value of the maximumItemsToReturn property.
     * 
     */
    public int getMaximumItemsToReturn() {
        return maximumItemsToReturn;
    }

    /**
     * Sets the value of the maximumItemsToReturn property.
     * 
     */
    public void setMaximumItemsToReturn(int value) {
        this.maximumItemsToReturn = value;
    }

}
