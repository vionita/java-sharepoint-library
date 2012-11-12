
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
 *         &lt;element name="CountCommentsOnUrlResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countCommentsOnUrlResult"
})
@XmlRootElement(name = "CountCommentsOnUrlResponse")
public class CountCommentsOnUrlResponse {

    @XmlElement(name = "CountCommentsOnUrlResult")
    protected int countCommentsOnUrlResult;

    /**
     * Gets the value of the countCommentsOnUrlResult property.
     * 
     */
    public int getCountCommentsOnUrlResult() {
        return countCommentsOnUrlResult;
    }

    /**
     * Sets the value of the countCommentsOnUrlResult property.
     * 
     */
    public void setCountCommentsOnUrlResult(int value) {
        this.countCommentsOnUrlResult = value;
    }

}
