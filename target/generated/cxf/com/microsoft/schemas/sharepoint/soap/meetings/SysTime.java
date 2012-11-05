
package com.microsoft.schemas.sharepoint.soap.meetings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SysTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SysTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="milliseconds" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysTime", propOrder = {
    "year",
    "month",
    "dayOfWeek",
    "day",
    "hour",
    "minute",
    "second",
    "milliseconds"
})
public class SysTime {

    @XmlSchemaType(name = "unsignedShort")
    protected int year;
    @XmlSchemaType(name = "unsignedShort")
    protected int month;
    @XmlSchemaType(name = "unsignedShort")
    protected int dayOfWeek;
    @XmlSchemaType(name = "unsignedShort")
    protected int day;
    @XmlSchemaType(name = "unsignedShort")
    protected int hour;
    @XmlSchemaType(name = "unsignedShort")
    protected int minute;
    @XmlSchemaType(name = "unsignedShort")
    protected int second;
    @XmlSchemaType(name = "unsignedShort")
    protected int milliseconds;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     */
    public int getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     */
    public void setDayOfWeek(int value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

    /**
     * Gets the value of the milliseconds property.
     * 
     */
    public int getMilliseconds() {
        return milliseconds;
    }

    /**
     * Sets the value of the milliseconds property.
     * 
     */
    public void setMilliseconds(int value) {
        this.milliseconds = value;
    }

}
