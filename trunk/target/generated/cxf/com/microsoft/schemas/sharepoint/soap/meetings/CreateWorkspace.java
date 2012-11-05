
package com.microsoft.schemas.sharepoint.soap.meetings;

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
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="timeZoneInformation" type="{http://schemas.microsoft.com/sharepoint/soap/meetings/}TimeZoneInf"/>
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
    "title",
    "templateName",
    "lcid",
    "timeZoneInformation"
})
@XmlRootElement(name = "CreateWorkspace")
public class CreateWorkspace {

    protected String title;
    protected String templateName;
    @XmlSchemaType(name = "unsignedInt")
    protected long lcid;
    @XmlElement(required = true)
    protected TimeZoneInf timeZoneInformation;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the lcid property.
     * 
     */
    public long getLcid() {
        return lcid;
    }

    /**
     * Sets the value of the lcid property.
     * 
     */
    public void setLcid(long value) {
        this.lcid = value;
    }

    /**
     * Gets the value of the timeZoneInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZoneInf }
     *     
     */
    public TimeZoneInf getTimeZoneInformation() {
        return timeZoneInformation;
    }

    /**
     * Sets the value of the timeZoneInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZoneInf }
     *     
     */
    public void setTimeZoneInformation(TimeZoneInf value) {
        this.timeZoneInformation = value;
    }

}
