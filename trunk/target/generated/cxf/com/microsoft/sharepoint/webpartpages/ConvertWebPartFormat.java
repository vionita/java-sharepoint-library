
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
 *         &lt;element name="inputFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatConversionOption" type="{http://microsoft.com/sharepoint/webpartpages}FormatConversionOption"/>
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
    "inputFormat",
    "formatConversionOption"
})
@XmlRootElement(name = "ConvertWebPartFormat")
public class ConvertWebPartFormat {

    protected String inputFormat;
    @XmlElement(required = true)
    protected FormatConversionOption formatConversionOption;

    /**
     * Gets the value of the inputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFormat() {
        return inputFormat;
    }

    /**
     * Sets the value of the inputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFormat(String value) {
        this.inputFormat = value;
    }

    /**
     * Gets the value of the formatConversionOption property.
     * 
     * @return
     *     possible object is
     *     {@link FormatConversionOption }
     *     
     */
    public FormatConversionOption getFormatConversionOption() {
        return formatConversionOption;
    }

    /**
     * Sets the value of the formatConversionOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatConversionOption }
     *     
     */
    public void setFormatConversionOption(FormatConversionOption value) {
        this.formatConversionOption = value;
    }

}
