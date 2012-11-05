
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
 *         &lt;element name="ResolvePrincipalsResult" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfPrincipalInfo" minOccurs="0"/>
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
    "resolvePrincipalsResult"
})
@XmlRootElement(name = "ResolvePrincipalsResponse")
public class ResolvePrincipalsResponse {

    @XmlElement(name = "ResolvePrincipalsResult")
    protected ArrayOfPrincipalInfo resolvePrincipalsResult;

    /**
     * Gets the value of the resolvePrincipalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public ArrayOfPrincipalInfo getResolvePrincipalsResult() {
        return resolvePrincipalsResult;
    }

    /**
     * Sets the value of the resolvePrincipalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrincipalInfo }
     *     
     */
    public void setResolvePrincipalsResult(ArrayOfPrincipalInfo value) {
        this.resolvePrincipalsResult = value;
    }

}
