
package com.microsoft.schemas.sharepoint.soap.ois;

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
 *         &lt;element name="strUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strUrl"
})
@XmlRootElement(name = "CheckSubwebAndList")
public class CheckSubwebAndList {

    protected String strUrl;

    /**
     * Gets the value of the strUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUrl() {
        return strUrl;
    }

    /**
     * Sets the value of the strUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUrl(String value) {
        this.strUrl = value;
    }

}
