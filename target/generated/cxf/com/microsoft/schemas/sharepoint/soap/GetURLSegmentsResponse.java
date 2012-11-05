
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
 *         &lt;element name="GetURLSegmentsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="strWebID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strBucketID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getURLSegmentsResult",
    "strWebID",
    "strBucketID",
    "strListID",
    "strItemID"
})
@XmlRootElement(name = "GetURLSegmentsResponse")
public class GetURLSegmentsResponse {

    @XmlElement(name = "GetURLSegmentsResult")
    protected boolean getURLSegmentsResult;
    protected String strWebID;
    protected String strBucketID;
    protected String strListID;
    protected String strItemID;

    /**
     * Gets the value of the getURLSegmentsResult property.
     * 
     */
    public boolean isGetURLSegmentsResult() {
        return getURLSegmentsResult;
    }

    /**
     * Sets the value of the getURLSegmentsResult property.
     * 
     */
    public void setGetURLSegmentsResult(boolean value) {
        this.getURLSegmentsResult = value;
    }

    /**
     * Gets the value of the strWebID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrWebID() {
        return strWebID;
    }

    /**
     * Sets the value of the strWebID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrWebID(String value) {
        this.strWebID = value;
    }

    /**
     * Gets the value of the strBucketID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrBucketID() {
        return strBucketID;
    }

    /**
     * Sets the value of the strBucketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrBucketID(String value) {
        this.strBucketID = value;
    }

    /**
     * Gets the value of the strListID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrListID() {
        return strListID;
    }

    /**
     * Sets the value of the strListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrListID(String value) {
        this.strListID = value;
    }

    /**
     * Gets the value of the strItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrItemID() {
        return strItemID;
    }

    /**
     * Sets the value of the strItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrItemID(String value) {
        this.strItemID = value;
    }

}
