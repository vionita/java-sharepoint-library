
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
 *         &lt;element name="CreateFolderResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "createFolderResult"
})
@XmlRootElement(name = "CreateFolderResponse")
public class CreateFolderResponse {

    @XmlElement(name = "CreateFolderResult")
    protected String createFolderResult;

    /**
     * Gets the value of the createFolderResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateFolderResult() {
        return createFolderResult;
    }

    /**
     * Sets the value of the createFolderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateFolderResult(String value) {
        this.createFolderResult = value;
    }

}
