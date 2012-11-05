
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
 *         &lt;element name="RenameDwsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "renameDwsResult"
})
@XmlRootElement(name = "RenameDwsResponse")
public class RenameDwsResponse {

    @XmlElement(name = "RenameDwsResult")
    protected String renameDwsResult;

    /**
     * Gets the value of the renameDwsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenameDwsResult() {
        return renameDwsResult;
    }

    /**
     * Sets the value of the renameDwsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenameDwsResult(String value) {
        this.renameDwsResult = value;
    }

}
