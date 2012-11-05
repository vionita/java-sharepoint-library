
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
 *         &lt;element name="GetChangesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastChangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentChangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moreChanges" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "getChangesResult",
    "lastChangeId",
    "currentChangeId",
    "moreChanges"
})
@XmlRootElement(name = "GetChangesResponse")
public class GetChangesResponse {

    @XmlElement(name = "GetChangesResult")
    protected String getChangesResult;
    @XmlElement(name = "LastChangeId")
    protected String lastChangeId;
    @XmlElement(name = "CurrentChangeId")
    protected String currentChangeId;
    protected boolean moreChanges;

    /**
     * Gets the value of the getChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetChangesResult() {
        return getChangesResult;
    }

    /**
     * Sets the value of the getChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetChangesResult(String value) {
        this.getChangesResult = value;
    }

    /**
     * Gets the value of the lastChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeId() {
        return lastChangeId;
    }

    /**
     * Sets the value of the lastChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeId(String value) {
        this.lastChangeId = value;
    }

    /**
     * Gets the value of the currentChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentChangeId() {
        return currentChangeId;
    }

    /**
     * Sets the value of the currentChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentChangeId(String value) {
        this.currentChangeId = value;
    }

    /**
     * Gets the value of the moreChanges property.
     * 
     */
    public boolean isMoreChanges() {
        return moreChanges;
    }

    /**
     * Sets the value of the moreChanges property.
     * 
     */
    public void setMoreChanges(boolean value) {
        this.moreChanges = value;
    }

}
