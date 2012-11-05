
package com.microsoft.schemas.sharepoint.soap.meetings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneInf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneInf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardDate" type="{http://schemas.microsoft.com/sharepoint/soap/meetings/}SysTime"/>
 *         &lt;element name="standardBias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="daylightDate" type="{http://schemas.microsoft.com/sharepoint/soap/meetings/}SysTime"/>
 *         &lt;element name="daylightBias" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneInf", propOrder = {
    "bias",
    "standardDate",
    "standardBias",
    "daylightDate",
    "daylightBias"
})
public class TimeZoneInf {

    protected int bias;
    @XmlElement(required = true)
    protected SysTime standardDate;
    protected int standardBias;
    @XmlElement(required = true)
    protected SysTime daylightDate;
    protected int daylightBias;

    /**
     * Gets the value of the bias property.
     * 
     */
    public int getBias() {
        return bias;
    }

    /**
     * Sets the value of the bias property.
     * 
     */
    public void setBias(int value) {
        this.bias = value;
    }

    /**
     * Gets the value of the standardDate property.
     * 
     * @return
     *     possible object is
     *     {@link SysTime }
     *     
     */
    public SysTime getStandardDate() {
        return standardDate;
    }

    /**
     * Sets the value of the standardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysTime }
     *     
     */
    public void setStandardDate(SysTime value) {
        this.standardDate = value;
    }

    /**
     * Gets the value of the standardBias property.
     * 
     */
    public int getStandardBias() {
        return standardBias;
    }

    /**
     * Sets the value of the standardBias property.
     * 
     */
    public void setStandardBias(int value) {
        this.standardBias = value;
    }

    /**
     * Gets the value of the daylightDate property.
     * 
     * @return
     *     possible object is
     *     {@link SysTime }
     *     
     */
    public SysTime getDaylightDate() {
        return daylightDate;
    }

    /**
     * Sets the value of the daylightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SysTime }
     *     
     */
    public void setDaylightDate(SysTime value) {
        this.daylightDate = value;
    }

    /**
     * Gets the value of the daylightBias property.
     * 
     */
    public int getDaylightBias() {
        return daylightBias;
    }

    /**
     * Sets the value of the daylightBias property.
     * 
     */
    public void setDaylightBias(int value) {
        this.daylightBias = value;
    }

}
