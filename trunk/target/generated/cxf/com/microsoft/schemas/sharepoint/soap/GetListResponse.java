
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
 *         &lt;element name="GetListResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sListMetadata" type="{http://schemas.microsoft.com/sharepoint/soap/}_sListMetadata"/>
 *         &lt;element name="vProperties" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOf_sProperty" minOccurs="0"/>
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
    "getListResult",
    "sListMetadata",
    "vProperties"
})
@XmlRootElement(name = "GetListResponse")
public class GetListResponse {

    @XmlElement(name = "GetListResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getListResult;
    @XmlElement(required = true)
    protected SListMetadata sListMetadata;
    protected ArrayOfSProperty vProperties;

    /**
     * Gets the value of the getListResult property.
     * 
     */
    public long getGetListResult() {
        return getListResult;
    }

    /**
     * Sets the value of the getListResult property.
     * 
     */
    public void setGetListResult(long value) {
        this.getListResult = value;
    }

    /**
     * Gets the value of the sListMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SListMetadata }
     *     
     */
    public SListMetadata getSListMetadata() {
        return sListMetadata;
    }

    /**
     * Sets the value of the sListMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SListMetadata }
     *     
     */
    public void setSListMetadata(SListMetadata value) {
        this.sListMetadata = value;
    }

    /**
     * Gets the value of the vProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSProperty }
     *     
     */
    public ArrayOfSProperty getVProperties() {
        return vProperties;
    }

    /**
     * Sets the value of the vProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSProperty }
     *     
     */
    public void setVProperties(ArrayOfSProperty value) {
        this.vProperties = value;
    }

}
