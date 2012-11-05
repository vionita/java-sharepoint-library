
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
 *         &lt;element name="CountRatingsOnUrlResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countRatingsOnUrlResult"
})
@XmlRootElement(name = "CountRatingsOnUrlResponse")
public class CountRatingsOnUrlResponse {

    @XmlElement(name = "CountRatingsOnUrlResult")
    protected int countRatingsOnUrlResult;

    /**
     * Gets the value of the countRatingsOnUrlResult property.
     * 
     */
    public int getCountRatingsOnUrlResult() {
        return countRatingsOnUrlResult;
    }

    /**
     * Sets the value of the countRatingsOnUrlResult property.
     * 
     */
    public void setCountRatingsOnUrlResult(int value) {
        this.countRatingsOnUrlResult = value;
    }

}
