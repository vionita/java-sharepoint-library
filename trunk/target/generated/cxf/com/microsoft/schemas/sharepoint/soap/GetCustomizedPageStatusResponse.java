
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
 *         &lt;element name="GetCustomizedPageStatusResult" type="{http://schemas.microsoft.com/sharepoint/soap/}CustomizedPageStatus"/>
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
    "getCustomizedPageStatusResult"
})
@XmlRootElement(name = "GetCustomizedPageStatusResponse")
public class GetCustomizedPageStatusResponse {

    @XmlElement(name = "GetCustomizedPageStatusResult", required = true)
    protected CustomizedPageStatus getCustomizedPageStatusResult;

    /**
     * Gets the value of the getCustomizedPageStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedPageStatus }
     *     
     */
    public CustomizedPageStatus getGetCustomizedPageStatusResult() {
        return getCustomizedPageStatusResult;
    }

    /**
     * Sets the value of the getCustomizedPageStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedPageStatus }
     *     
     */
    public void setGetCustomizedPageStatusResult(CustomizedPageStatus value) {
        this.getCustomizedPageStatusResult = value;
    }

}
