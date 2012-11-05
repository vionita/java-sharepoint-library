
package com.microsoft.schemas.sharepoint.dsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderField" type="{http://schemas.microsoft.com/sharepoint/dsp}OrderField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderField", propOrder = {
    "orderField"
})
public class ArrayOfOrderField {

    @XmlElement(name = "OrderField")
    protected List<OrderField> orderField;

    /**
     * Gets the value of the orderField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderField }
     * 
     * 
     */
    public List<OrderField> getOrderField() {
        if (orderField == null) {
            orderField = new ArrayList<OrderField>();
        }
        return this.orderField;
    }

}
