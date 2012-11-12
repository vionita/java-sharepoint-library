
package com.microsoft.schemas.sharepoint.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_sList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_sList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_sList" type="{http://schemas.microsoft.com/sharepoint/soap/}_sList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_sList", propOrder = {
    "sList"
})
public class ArrayOfSList {

    @XmlElement(name = "_sList")
    protected List<SList> sList;

    /**
     * Gets the value of the sList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SList }
     * 
     * 
     */
    public List<SList> getSList() {
        if (sList == null) {
            sList = new ArrayList<SList>();
        }
        return this.sList;
    }

}
