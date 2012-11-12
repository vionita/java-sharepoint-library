
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
 *         &lt;element name="attendeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrenceId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="utcDateTimeOrganizerCriticalChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="utcDateTimeAttendeeCriticalChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="response" type="{http://schemas.microsoft.com/sharepoint/soap/meetings/}AttendeeResponse"/>
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
    "attendeeEmail",
    "recurrenceId",
    "uid",
    "sequence",
    "utcDateTimeOrganizerCriticalChange",
    "utcDateTimeAttendeeCriticalChange",
    "response"
})
@XmlRootElement(name = "SetAttendeeResponse")
public class SetAttendeeResponse {

    protected String attendeeEmail;
    @XmlSchemaType(name = "unsignedInt")
    protected long recurrenceId;
    protected String uid;
    @XmlSchemaType(name = "unsignedInt")
    protected long sequence;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcDateTimeOrganizerCriticalChange;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcDateTimeAttendeeCriticalChange;
    @XmlElement(required = true)
    protected AttendeeResponse response;

    /**
     * Gets the value of the attendeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendeeEmail() {
        return attendeeEmail;
    }

    /**
     * Sets the value of the attendeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendeeEmail(String value) {
        this.attendeeEmail = value;
    }

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
     * Gets the value of the utcDateTimeOrganizerCriticalChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcDateTimeOrganizerCriticalChange() {
        return utcDateTimeOrganizerCriticalChange;
    }

    /**
     * Sets the value of the utcDateTimeOrganizerCriticalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcDateTimeOrganizerCriticalChange(XMLGregorianCalendar value) {
        this.utcDateTimeOrganizerCriticalChange = value;
    }

    /**
     * Gets the value of the utcDateTimeAttendeeCriticalChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcDateTimeAttendeeCriticalChange() {
        return utcDateTimeAttendeeCriticalChange;
    }

    /**
     * Sets the value of the utcDateTimeAttendeeCriticalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcDateTimeAttendeeCriticalChange(XMLGregorianCalendar value) {
        this.utcDateTimeAttendeeCriticalChange = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link AttendeeResponse }
     *     
     */
    public AttendeeResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendeeResponse }
     *     
     */
    public void setResponse(AttendeeResponse value) {
        this.response = value;
    }

}
