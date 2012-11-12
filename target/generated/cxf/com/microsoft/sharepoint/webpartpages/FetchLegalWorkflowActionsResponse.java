
package com.microsoft.sharepoint.webpartpages;

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
 *         &lt;element name="FetchLegalWorkflowActionsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fetchLegalWorkflowActionsResult"
})
@XmlRootElement(name = "FetchLegalWorkflowActionsResponse")
public class FetchLegalWorkflowActionsResponse {

    @XmlElement(name = "FetchLegalWorkflowActionsResult")
    protected String fetchLegalWorkflowActionsResult;

    /**
     * Gets the value of the fetchLegalWorkflowActionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchLegalWorkflowActionsResult() {
        return fetchLegalWorkflowActionsResult;
    }

    /**
     * Sets the value of the fetchLegalWorkflowActionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchLegalWorkflowActionsResult(String value) {
        this.fetchLegalWorkflowActionsResult = value;
    }

}
