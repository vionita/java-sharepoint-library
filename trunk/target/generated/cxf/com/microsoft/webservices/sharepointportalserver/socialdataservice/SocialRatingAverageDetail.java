
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SocialRatingAverageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialRatingAverageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Average" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CurrentUserRating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialRatingAverageDetail", propOrder = {
    "url",
    "average",
    "lastModifiedTime",
    "count",
    "currentUserRating"
})
public class SocialRatingAverageDetail {

    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "Average")
    protected float average;
    @XmlElement(name = "LastModifiedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTime;
    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "CurrentUserRating")
    protected int currentUserRating;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the average property.
     * 
     */
    public float getAverage() {
        return average;
    }

    /**
     * Sets the value of the average property.
     * 
     */
    public void setAverage(float value) {
        this.average = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTime(XMLGregorianCalendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the currentUserRating property.
     * 
     */
    public int getCurrentUserRating() {
        return currentUserRating;
    }

    /**
     * Sets the value of the currentUserRating property.
     * 
     */
    public void setCurrentUserRating(int value) {
        this.currentUserRating = value;
    }

}
