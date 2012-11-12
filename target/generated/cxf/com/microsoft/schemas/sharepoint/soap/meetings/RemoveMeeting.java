
package com.microsoft.schemas.sharepoint.soap.meetings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="recurrenceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="utcDateStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cancelMeeting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "recurrenceId",
    "uid",
    "sequence",
    "utcDateStamp",
    "cancelMeeting"
})
@XmlRootElement(name = "RemoveMeeting")
public class RemoveMeeting {

    @XmlSchemaType(name = "unsignedInt")
    protected long recurrenceId;
    protected String uid;
    @XmlSchemaType(name = "unsignedInt")
    protected long sequence;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcDateStamp;
    protected boolean cancelMeeting;

    /**
     * Gets the value of the recurrenceId property.
     * 
     */
    public long getRecurrenceId() {
        return recurrenceId;
    }

    /**
     * Sets the value of the recurrenceId property.
     * 
     */
    public void setRecurrenceId(long value) {
        this.recurrenceId = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(long value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the utcDateStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcDateStamp() {
        return utcDateStamp;
    }

    /**
     * Sets the value of the utcDateStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcDateStamp(XMLGregorianCalendar value) {
        this.utcDateStamp = value;
    }

    /**
     * Gets the value of the cancelMeeting property.
     * 
     */
    public boolean isCancelMeeting() {
        return cancelMeeting;
    }

    /**
     * Sets the value of the cancelMeeting property.
     * 
     */
    public void setCancelMeeting(boolean value) {
        this.cancelMeeting = value;
    }

}
