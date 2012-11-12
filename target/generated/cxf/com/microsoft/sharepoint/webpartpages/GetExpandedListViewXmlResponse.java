
package com.microsoft.sharepoint.webpartpages;

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
 *         &lt;element name="GetExpandedListViewXmlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getExpandedListViewXmlResult"
})
@XmlRootElement(name = "GetExpandedListViewXmlResponse")
public class GetExpandedListViewXmlResponse {

    @XmlElement(name = "GetExpandedListViewXmlResult")
    protected String getExpandedListViewXmlResult;

    /**
     * Gets the value of the getExpandedListViewXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExpandedListViewXmlResult() {
        return getExpandedListViewXmlResult;
    }

    /**
     * Sets the value of the getExpandedListViewXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExpandedListViewXmlResult(String value) {
        this.getExpandedListViewXmlResult = value;
    }

}
