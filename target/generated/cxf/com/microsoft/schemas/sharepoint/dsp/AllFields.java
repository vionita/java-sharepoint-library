
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IncludeHiddenFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFields")
public class AllFields {

    @XmlAttribute(name = "IncludeHiddenFields")
    protected Boolean includeHiddenFields;

    /**
     * Gets the value of the includeHiddenFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeHiddenFields() {
        if (includeHiddenFields == null) {
            return false;
        } else {
            return includeHiddenFields;
        }
    }

    /**
     * Sets the value of the includeHiddenFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHiddenFields(Boolean value) {
        this.includeHiddenFields = value;
    }

}
