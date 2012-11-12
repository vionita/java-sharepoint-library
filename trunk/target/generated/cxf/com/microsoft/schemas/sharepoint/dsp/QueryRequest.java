
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dsQuery" type="{http://schemas.microsoft.com/sharepoint/dsp}DSQuery" minOccurs="0"/>
 *         &lt;element name="ptQuery" type="{http://schemas.microsoft.com/sharepoint/dsp}PTQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRequest", propOrder = {
    "dsQuery",
    "ptQuery"
})
public class QueryRequest {

    protected DSQuery dsQuery;
    protected PTQuery ptQuery;

    /**
     * Gets the value of the dsQuery property.
     * 
     * @return
     *     possible object is
     *     {@link DSQuery }
     *     
     */
    public DSQuery getDsQuery() {
        return dsQuery;
    }

    /**
     * Sets the value of the dsQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSQuery }
     *     
     */
    public void setDsQuery(DSQuery value) {
        this.dsQuery = value;
    }

    /**
     * Gets the value of the ptQuery property.
     * 
     * @return
     *     possible object is
     *     {@link PTQuery }
     *     
     */
    public PTQuery getPtQuery() {
        return ptQuery;
    }

    /**
     * Sets the value of the ptQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTQuery }
     *     
     */
    public void setPtQuery(PTQuery value) {
        this.ptQuery = value;
    }

}
