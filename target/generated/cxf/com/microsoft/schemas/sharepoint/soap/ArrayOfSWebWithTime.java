
package com.microsoft.schemas.sharepoint.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_sWebWithTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_sWebWithTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_sWebWithTime" type="{http://schemas.microsoft.com/sharepoint/soap/}_sWebWithTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_sWebWithTime", propOrder = {
    "sWebWithTime"
})
public class ArrayOfSWebWithTime {

    @XmlElement(name = "_sWebWithTime")
    protected List<SWebWithTime> sWebWithTime;

    /**
     * Gets the value of the sWebWithTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sWebWithTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWebWithTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWebWithTime }
     * 
     * 
     */
    public List<SWebWithTime> getSWebWithTime() {
        if (sWebWithTime == null) {
            sWebWithTime = new ArrayList<SWebWithTime>();
        }
        return this.sWebWithTime;
    }

}
