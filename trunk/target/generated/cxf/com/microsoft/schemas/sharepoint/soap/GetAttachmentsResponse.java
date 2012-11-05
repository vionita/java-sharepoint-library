
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
 *         &lt;element name="GetAttachmentsResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="vAttachments" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfString" minOccurs="0"/>
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
    "getAttachmentsResult",
    "vAttachments"
})
@XmlRootElement(name = "GetAttachmentsResponse")
public class GetAttachmentsResponse {

    @XmlElement(name = "GetAttachmentsResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getAttachmentsResult;
    protected ArrayOfString vAttachments;

    /**
     * Gets the value of the getAttachmentsResult property.
     * 
     */
    public long getGetAttachmentsResult() {
        return getAttachmentsResult;
    }

    /**
     * Sets the value of the getAttachmentsResult property.
     * 
     */
    public void setGetAttachmentsResult(long value) {
        this.getAttachmentsResult = value;
    }

    /**
     * Gets the value of the vAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getVAttachments() {
        return vAttachments;
    }

    /**
     * Sets the value of the vAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setVAttachments(ArrayOfString value) {
        this.vAttachments = value;
    }

}
