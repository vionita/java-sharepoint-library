
package com.microsoft.schemas.sharepoint.soap.ois;

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
 *         &lt;element name="strListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strParentFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strListName",
    "strParentFolder"
})
@XmlRootElement(name = "CreateNewFolder")
public class CreateNewFolder {

    protected String strListName;
    protected String strParentFolder;

    /**
     * Gets the value of the strListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrListName() {
        return strListName;
    }

    /**
     * Sets the value of the strListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrListName(String value) {
        this.strListName = value;
    }

    /**
     * Gets the value of the strParentFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrParentFolder() {
        return strParentFolder;
    }

    /**
     * Sets the value of the strParentFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrParentFolder(String value) {
        this.strParentFolder = value;
    }

}
