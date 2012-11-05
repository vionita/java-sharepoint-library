
package com.microsoft.schemas.sharepoint.soap.meetings;

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
 *         &lt;element name="icalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignoreAttendees" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "icalText",
    "ignoreAttendees"
})
@XmlRootElement(name = "UpdateMeetingFromICal")
public class UpdateMeetingFromICal {

    protected String icalText;
    protected boolean ignoreAttendees;

    /**
     * Gets the value of the icalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcalText() {
        return icalText;
    }

    /**
     * Sets the value of the icalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcalText(String value) {
        this.icalText = value;
    }

    /**
     * Gets the value of the ignoreAttendees property.
     * 
     */
    public boolean isIgnoreAttendees() {
        return ignoreAttendees;
    }

    /**
     * Sets the value of the ignoreAttendees property.
     * 
     */
    public void setIgnoreAttendees(boolean value) {
        this.ignoreAttendees = value;
    }

}
