
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
 *         &lt;element name="GetUpdatedFormDigestInformationResult" type="{http://schemas.microsoft.com/sharepoint/soap/}FormDigestInformation"/>
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
    "getUpdatedFormDigestInformationResult"
})
@XmlRootElement(name = "GetUpdatedFormDigestInformationResponse")
public class GetUpdatedFormDigestInformationResponse {

    @XmlElement(name = "GetUpdatedFormDigestInformationResult", required = true)
    protected FormDigestInformation getUpdatedFormDigestInformationResult;

    /**
     * Gets the value of the getUpdatedFormDigestInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link FormDigestInformation }
     *     
     */
    public FormDigestInformation getGetUpdatedFormDigestInformationResult() {
        return getUpdatedFormDigestInformationResult;
    }

    /**
     * Sets the value of the getUpdatedFormDigestInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDigestInformation }
     *     
     */
    public void setGetUpdatedFormDigestInformationResult(FormDigestInformation value) {
        this.getUpdatedFormDigestInformationResult = value;
    }

}
