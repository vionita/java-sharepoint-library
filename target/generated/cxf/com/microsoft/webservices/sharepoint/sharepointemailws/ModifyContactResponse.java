
package com.microsoft.webservices.sharepoint.sharepointemailws;

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
 *         &lt;element name="ModifyContactResult" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestStatus"/>
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
    "modifyContactResult"
})
@XmlRootElement(name = "ModifyContactResponse")
public class ModifyContactResponse {

    @XmlElement(name = "ModifyContactResult", required = true)
    protected RequestStatus modifyContactResult;

    /**
     * Gets the value of the modifyContactResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus }
     *     
     */
    public RequestStatus getModifyContactResult() {
        return modifyContactResult;
    }

    /**
     * Sets the value of the modifyContactResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus }
     *     
     */
    public void setModifyContactResult(RequestStatus value) {
        this.modifyContactResult = value;
    }

}
