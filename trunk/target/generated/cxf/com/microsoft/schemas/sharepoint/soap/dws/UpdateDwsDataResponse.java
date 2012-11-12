
package com.microsoft.schemas.sharepoint.soap.dws;

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
 *         &lt;element name="UpdateDwsDataResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updateDwsDataResult"
})
@XmlRootElement(name = "UpdateDwsDataResponse")
public class UpdateDwsDataResponse {

    @XmlElement(name = "UpdateDwsDataResult")
    protected String updateDwsDataResult;

    /**
     * Gets the value of the updateDwsDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDwsDataResult() {
        return updateDwsDataResult;
    }

    /**
     * Sets the value of the updateDwsDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDwsDataResult(String value) {
        this.updateDwsDataResult = value;
    }

}
