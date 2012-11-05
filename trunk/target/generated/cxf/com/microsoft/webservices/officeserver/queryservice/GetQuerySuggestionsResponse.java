
package com.microsoft.webservices.officeserver.queryservice;

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
 *         &lt;element name="GetQuerySuggestionsResult" type="{http://microsoft.com/webservices/OfficeServer/QueryService}ArrayOfString" minOccurs="0"/>
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
    "getQuerySuggestionsResult"
})
@XmlRootElement(name = "GetQuerySuggestionsResponse")
public class GetQuerySuggestionsResponse {

    @XmlElement(name = "GetQuerySuggestionsResult")
    protected ArrayOfString getQuerySuggestionsResult;

    /**
     * Gets the value of the getQuerySuggestionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetQuerySuggestionsResult() {
        return getQuerySuggestionsResult;
    }

    /**
     * Sets the value of the getQuerySuggestionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetQuerySuggestionsResult(ArrayOfString value) {
        this.getQuerySuggestionsResult = value;
    }

}
