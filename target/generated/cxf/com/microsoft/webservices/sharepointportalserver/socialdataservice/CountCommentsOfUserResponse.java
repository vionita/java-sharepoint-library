
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
 *         &lt;element name="CountCommentsOfUserResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countCommentsOfUserResult"
})
@XmlRootElement(name = "CountCommentsOfUserResponse")
public class CountCommentsOfUserResponse {

    @XmlElement(name = "CountCommentsOfUserResult")
    protected int countCommentsOfUserResult;

    /**
     * Gets the value of the countCommentsOfUserResult property.
     * 
     */
    public int getCountCommentsOfUserResult() {
        return countCommentsOfUserResult;
    }

    /**
     * Sets the value of the countCommentsOfUserResult property.
     * 
     */
    public void setCountCommentsOfUserResult(int value) {
        this.countCommentsOfUserResult = value;
    }

}
