
package com.microsoft.schemas.sharepoint.soap.meetings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="requestFlags" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="lcid" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "requestFlags",
    "lcid"
})
@XmlRootElement(name = "GetMeetingsInformation")
public class GetMeetingsInformation {

    @XmlSchemaType(name = "unsignedInt")
    protected long requestFlags;
    @XmlSchemaType(name = "unsignedInt")
    protected long lcid;

    /**
     * Gets the value of the requestFlags property.
     * 
     */
    public long getRequestFlags() {
        return requestFlags;
    }

    /**
     * Sets the value of the requestFlags property.
     * 
     */
    public void setRequestFlags(long value) {
        this.requestFlags = value;
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

}
