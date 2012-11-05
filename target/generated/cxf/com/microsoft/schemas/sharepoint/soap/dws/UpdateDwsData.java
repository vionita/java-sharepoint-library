
package com.microsoft.schemas.sharepoint.soap.dws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="updates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updates",
    "meetingInstance"
})
@XmlRootElement(name = "UpdateDwsData")
public class UpdateDwsData {

    protected String updates;
    protected String meetingInstance;

    /**
     * Gets the value of the updates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdates() {
        return updates;
    }

    /**
     * Sets the value of the updates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdates(String value) {
        this.updates = value;
    }

    /**
     * Gets the value of the meetingInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingInstance() {
        return meetingInstance;
    }

    /**
     * Sets the value of the meetingInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingInstance(String value) {
        this.meetingInstance = value;
    }

}
