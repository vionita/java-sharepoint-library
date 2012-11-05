
package com.microsoft.schemas.sharepoint.soap.ois;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="strFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemFileNames" type="{http://schemas.microsoft.com/sharepoint/soap/ois/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fFetchOriginalIfNotAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "strFolder",
    "itemFileNames",
    "type",
    "fFetchOriginalIfNotAvailable"
})
@XmlRootElement(name = "Download")
public class Download {

    protected String strListName;
    protected String strFolder;
    protected ArrayOfString itemFileNames;
    @XmlSchemaType(name = "unsignedInt")
    protected long type;
    protected boolean fFetchOriginalIfNotAvailable;

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
     * Gets the value of the strFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFolder() {
        return strFolder;
    }

    /**
     * Sets the value of the strFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFolder(String value) {
        this.strFolder = value;
    }

    /**
     * Gets the value of the itemFileNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getItemFileNames() {
        return itemFileNames;
    }

    /**
     * Sets the value of the itemFileNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setItemFileNames(ArrayOfString value) {
        this.itemFileNames = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(long value) {
        this.type = value;
    }

    /**
     * Gets the value of the fFetchOriginalIfNotAvailable property.
     * 
     */
    public boolean isFFetchOriginalIfNotAvailable() {
        return fFetchOriginalIfNotAvailable;
    }

    /**
     * Sets the value of the fFetchOriginalIfNotAvailable property.
     * 
     */
    public void setFFetchOriginalIfNotAvailable(boolean value) {
        this.fFetchOriginalIfNotAvailable = value;
    }

}
