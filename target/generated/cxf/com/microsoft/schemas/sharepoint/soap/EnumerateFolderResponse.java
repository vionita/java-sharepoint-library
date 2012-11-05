
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="EnumerateFolderResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="vUrls" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOf_sFPUrl" minOccurs="0"/>
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
    "enumerateFolderResult",
    "vUrls"
})
@XmlRootElement(name = "EnumerateFolderResponse")
public class EnumerateFolderResponse {

    @XmlElement(name = "EnumerateFolderResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long enumerateFolderResult;
    protected ArrayOfSFPUrl vUrls;

    /**
     * Gets the value of the enumerateFolderResult property.
     * 
     */
    public long getEnumerateFolderResult() {
        return enumerateFolderResult;
    }

    /**
     * Sets the value of the enumerateFolderResult property.
     * 
     */
    public void setEnumerateFolderResult(long value) {
        this.enumerateFolderResult = value;
    }

    /**
     * Gets the value of the vUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSFPUrl }
     *     
     */
    public ArrayOfSFPUrl getVUrls() {
        return vUrls;
    }

    /**
     * Sets the value of the vUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSFPUrl }
     *     
     */
    public void setVUrls(ArrayOfSFPUrl value) {
        this.vUrls = value;
    }

}
