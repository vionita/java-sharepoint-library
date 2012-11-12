
package com.microsoft.sharepoint.webpartpages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="workflowMarkupText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rulesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configBlob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "workflowMarkupText",
    "rulesText",
    "configBlob",
    "flag"
})
@XmlRootElement(name = "ValidateWorkflowMarkupAndCreateSupportObjects")
public class ValidateWorkflowMarkupAndCreateSupportObjects {

    protected String workflowMarkupText;
    protected String rulesText;
    protected String configBlob;
    protected String flag;

    /**
     * Gets the value of the workflowMarkupText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowMarkupText() {
        return workflowMarkupText;
    }

    /**
     * Sets the value of the workflowMarkupText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowMarkupText(String value) {
        this.workflowMarkupText = value;
    }

    /**
     * Gets the value of the rulesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesText() {
        return rulesText;
    }

    /**
     * Sets the value of the rulesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesText(String value) {
        this.rulesText = value;
    }

    /**
     * Gets the value of the configBlob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigBlob() {
        return configBlob;
    }

    /**
     * Sets the value of the configBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigBlob(String value) {
        this.configBlob = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

}
