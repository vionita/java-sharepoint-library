
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
 *         &lt;element name="SearchPrincipalsResult" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfPrincipalInfo" minOccurs="0"/>
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
    "searchPrincipalsResult"
})
@XmlRootElement(name = "SearchPrincipalsResponse")
public class SearchPrincipalsResponse {

    @XmlElement(name = "SearchPrincipalsResult")
    protected ArrayOfPrincipalInfo searchPrincipalsResult;

    /**
     * Gets the value of the searchPrincipalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public ArrayOfPrincipalInfo getSearchPrincipalsResult() {
        return searchPrincipalsResult;
    }

    /**
     * Sets the value of the searchPrincipalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public void setSearchPrincipalsResult(ArrayOfPrincipalInfo value) {
        this.searchPrincipalsResult = value;
    }

}
