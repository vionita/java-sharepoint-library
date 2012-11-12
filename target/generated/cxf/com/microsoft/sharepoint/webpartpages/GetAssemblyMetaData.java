
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
 *         &lt;element name="assemblyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "assemblyName",
    "baseTypes"
})
@XmlRootElement(name = "GetAssemblyMetaData")
public class GetAssemblyMetaData {

    protected String assemblyName;
    protected String baseTypes;

    /**
     * Gets the value of the assemblyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyName() {
        return assemblyName;
    }

    /**
     * Sets the value of the assemblyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyName(String value) {
        this.assemblyName = value;
    }

    /**
     * Gets the value of the baseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTypes() {
        return baseTypes;
    }

    /**
     * Sets the value of the baseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTypes(String value) {
        this.baseTypes = value;
    }

}
