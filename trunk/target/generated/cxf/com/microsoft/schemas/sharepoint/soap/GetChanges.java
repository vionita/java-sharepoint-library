
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
 *         &lt;element name="objectType" type="{http://schemas.microsoft.com/sharepoint/soap/}ObjectType"/>
 *         &lt;element name="contentDatabaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastChangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentChangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "objectType",
    "contentDatabaseId",
    "lastChangeId",
    "currentChangeId",
    "timeout"
})
@XmlRootElement(name = "GetChanges")
public class GetChanges {

    @XmlElement(required = true)
    protected ObjectType objectType;
    protected String contentDatabaseId;
    @XmlElement(name = "LastChangeId")
    protected String lastChangeId;
    @XmlElement(name = "CurrentChangeId")
    protected String currentChangeId;
    @XmlElement(name = "Timeout")
    protected int timeout;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectType }
     *     
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectType }
     *     
     */
    public void setObjectType(ObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the contentDatabaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDatabaseId() {
        return contentDatabaseId;
    }

    /**
     * Sets the value of the contentDatabaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDatabaseId(String value) {
        this.contentDatabaseId = value;
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
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

}
