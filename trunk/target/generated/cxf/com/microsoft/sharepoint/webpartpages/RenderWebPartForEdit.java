
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
 *         &lt;element name="webPartXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "webPartXml"
})
@XmlRootElement(name = "RenderWebPartForEdit")
public class RenderWebPartForEdit {

    protected String webPartXml;

    /**
     * Gets the value of the webPartXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPartXml() {
        return webPartXml;
    }

    /**
     * Sets the value of the webPartXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPartXml(String value) {
        this.webPartXml = value;
    }

}
