
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
 *         &lt;element name="IsScriptSafeUrlResult" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfBoolean"/>
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
    "isScriptSafeUrlResult"
})
@XmlRootElement(name = "IsScriptSafeUrlResponse")
public class IsScriptSafeUrlResponse {

    @XmlElement(name = "IsScriptSafeUrlResult", required = true)
    protected ArrayOfBoolean isScriptSafeUrlResult;

    /**
     * Gets the value of the isScriptSafeUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBoolean }
     *     
     */
    public ArrayOfBoolean getIsScriptSafeUrlResult() {
        return isScriptSafeUrlResult;
    }

    /**
     * Sets the value of the isScriptSafeUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBoolean }
     *     
     */
    public void setIsScriptSafeUrlResult(ArrayOfBoolean value) {
        this.isScriptSafeUrlResult = value;
    }

}
