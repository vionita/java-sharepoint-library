
package com.microsoft.schemas.sharepoint.dsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Fields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{http://schemas.microsoft.com/sharepoint/dsp}Field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllFields" type="{http://schemas.microsoft.com/sharepoint/dsp}AllFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fields", propOrder = {
    "field",
    "allFields"
})
public class Fields {

    @XmlElement(name = "Field")
    protected List<Field> field;
    @XmlElement(name = "AllFields")
    protected AllFields allFields;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
    }

    /**
     * Gets the value of the allFields property.
     * 
     * @return
     *     possible object is
     *     {@link AllFields }
     *     
     */
    public AllFields getAllFields() {
        return allFields;
    }

    /**
     * Sets the value of the allFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllFields }
     *     
     */
    public void setAllFields(AllFields value) {
        this.allFields = value;
    }

}
