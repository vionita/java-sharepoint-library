
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
 *         &lt;element name="CountTagsOfUserResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countTagsOfUserResult"
})
@XmlRootElement(name = "CountTagsOfUserResponse")
public class CountTagsOfUserResponse {

    @XmlElement(name = "CountTagsOfUserResult")
    protected int countTagsOfUserResult;

    /**
     * Gets the value of the countTagsOfUserResult property.
     * 
     */
    public int getCountTagsOfUserResult() {
        return countTagsOfUserResult;
    }

    /**
     * Sets the value of the countTagsOfUserResult property.
     * 
     */
    public void setCountTagsOfUserResult(int value) {
        this.countTagsOfUserResult = value;
    }

}
