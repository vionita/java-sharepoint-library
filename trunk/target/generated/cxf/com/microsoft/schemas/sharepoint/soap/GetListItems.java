
package com.microsoft.schemas.sharepoint.soap;

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
 *         &lt;element name="strQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strViewFields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uRowLimit" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "strQuery",
    "strViewFields",
    "uRowLimit"
})
@XmlRootElement(name = "GetListItems")
public class GetListItems {

    protected String strListName;
    protected String strQuery;
    protected String strViewFields;
    @XmlSchemaType(name = "unsignedInt")
    protected long uRowLimit;

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
     * Gets the value of the strQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrQuery() {
        return strQuery;
    }

    /**
     * Sets the value of the strQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrQuery(String value) {
        this.strQuery = value;
    }

    /**
     * Gets the value of the strViewFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrViewFields() {
        return strViewFields;
    }

    /**
     * Sets the value of the strViewFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrViewFields(String value) {
        this.strViewFields = value;
    }

    /**
     * Gets the value of the uRowLimit property.
     * 
     */
    public long getURowLimit() {
        return uRowLimit;
    }

    /**
     * Sets the value of the uRowLimit property.
     * 
     */
    public void setURowLimit(long value) {
        this.uRowLimit = value;
    }

}
