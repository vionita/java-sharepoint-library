
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
 *         &lt;element name="GetListCollectionResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="vLists" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOf_sList" minOccurs="0"/>
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
    "getListCollectionResult",
    "vLists"
})
@XmlRootElement(name = "GetListCollectionResponse")
public class GetListCollectionResponse {

    @XmlElement(name = "GetListCollectionResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getListCollectionResult;
    protected ArrayOfSList vLists;

    /**
     * Gets the value of the getListCollectionResult property.
     * 
     */
    public long getGetListCollectionResult() {
        return getListCollectionResult;
    }

    /**
     * Sets the value of the getListCollectionResult property.
     * 
     */
    public void setGetListCollectionResult(long value) {
        this.getListCollectionResult = value;
    }

    /**
     * Gets the value of the vLists property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSList }
     *     
     */
    public ArrayOfSList getVLists() {
        return vLists;
    }

    /**
     * Sets the value of the vLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSList }
     *     
     */
    public void setVLists(ArrayOfSList value) {
        this.vLists = value;
    }

}
