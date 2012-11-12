
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

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
 *         &lt;element name="CountCommentsOfUserOnUrlResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countCommentsOfUserOnUrlResult"
})
@XmlRootElement(name = "CountCommentsOfUserOnUrlResponse")
public class CountCommentsOfUserOnUrlResponse {

    @XmlElement(name = "CountCommentsOfUserOnUrlResult")
    protected int countCommentsOfUserOnUrlResult;

    /**
     * Gets the value of the countCommentsOfUserOnUrlResult property.
     * 
     */
    public int getCountCommentsOfUserOnUrlResult() {
        return countCommentsOfUserOnUrlResult;
    }

    /**
     * Sets the value of the countCommentsOfUserOnUrlResult property.
     * 
     */
    public void setCountCommentsOfUserOnUrlResult(int value) {
        this.countCommentsOfUserOnUrlResult = value;
    }

}
