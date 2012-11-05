
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
 *         &lt;element name="ReplicateIncrementalSocialDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "replicateIncrementalSocialDataResult"
})
@XmlRootElement(name = "ReplicateIncrementalSocialDataResponse")
public class ReplicateIncrementalSocialDataResponse {

    @XmlElement(name = "ReplicateIncrementalSocialDataResult")
    protected boolean replicateIncrementalSocialDataResult;

    /**
     * Gets the value of the replicateIncrementalSocialDataResult property.
     * 
     */
    public boolean isReplicateIncrementalSocialDataResult() {
        return replicateIncrementalSocialDataResult;
    }

    /**
     * Sets the value of the replicateIncrementalSocialDataResult property.
     * 
     */
    public void setReplicateIncrementalSocialDataResult(boolean value) {
        this.replicateIncrementalSocialDataResult = value;
    }

}
