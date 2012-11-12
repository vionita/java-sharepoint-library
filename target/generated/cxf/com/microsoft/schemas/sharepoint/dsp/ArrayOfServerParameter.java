
package com.microsoft.schemas.sharepoint.dsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServerParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServerParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerParameter" type="{http://schemas.microsoft.com/sharepoint/dsp}ServerParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServerParameter", propOrder = {
    "serverParameter"
})
public class ArrayOfServerParameter {

    @XmlElement(name = "ServerParameter")
    protected List<ServerParameter> serverParameter;

    /**
     * Gets the value of the serverParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerParameter }
     * 
     * 
     */
    public List<ServerParameter> getServerParameter() {
        if (serverParameter == null) {
            serverParameter = new ArrayList<ServerParameter>();
        }
        return this.serverParameter;
    }

}
