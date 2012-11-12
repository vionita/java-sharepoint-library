
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
 *         &lt;element name="ModeResult" type="{http://schemas.microsoft.com/sharepoint/soap/}AuthenticationMode"/>
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
    "modeResult"
})
@XmlRootElement(name = "ModeResponse")
public class ModeResponse {

    @XmlElement(name = "ModeResult", required = true)
    protected AuthenticationMode modeResult;

    /**
     * Gets the value of the modeResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMode }
     *     
     */
    public AuthenticationMode getModeResult() {
        return modeResult;
    }

    /**
     * Sets the value of the modeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMode }
     *     
     */
    public void setModeResult(AuthenticationMode value) {
        this.modeResult = value;
    }

}
