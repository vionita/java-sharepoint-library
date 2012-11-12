
package com.microsoft.schemas.sharepoint.dsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DspQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DspQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerParameterInfo" type="{http://schemas.microsoft.com/sharepoint/dsp}ServerParameterInfo" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://schemas.microsoft.com/sharepoint/dsp}Fields" minOccurs="0"/>
 *         &lt;element name="ServerParameters" type="{http://schemas.microsoft.com/sharepoint/dsp}ArrayOfServerParameter" minOccurs="0"/>
 *         &lt;element name="Where" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderBy" type="{http://schemas.microsoft.com/sharepoint/dsp}ArrayOfOrderField" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RowLimit" type="{http://www.w3.org/2001/XMLSchema}long" default="-1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DspQuery", propOrder = {
    "serverParameterInfo",
    "fields",
    "serverParameters",
    "where",
    "orderBy"
})
public class DspQuery {

    @XmlElement(name = "ServerParameterInfo")
    protected ServerParameterInfo serverParameterInfo;
    @XmlElement(name = "Fields")
    protected Fields fields;
    @XmlElement(name = "ServerParameters")
    protected ArrayOfServerParameter serverParameters;
    @XmlElement(name = "Where")
    protected DspQuery.Where where;
    @XmlElement(name = "OrderBy")
    protected ArrayOfOrderField orderBy;
    @XmlAttribute(name = "RowLimit")
    protected Long rowLimit;

    /**
     * Gets the value of the serverParameterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerParameterInfo }
     *     
     */
    public ServerParameterInfo getServerParameterInfo() {
        return serverParameterInfo;
    }

    /**
     * Sets the value of the serverParameterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerParameterInfo }
     *     
     */
    public void setServerParameterInfo(ServerParameterInfo value) {
        this.serverParameterInfo = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Fields }
     *     
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fields }
     *     
     */
    public void setFields(Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the serverParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServerParameter }
     *     
     */
    public ArrayOfServerParameter getServerParameters() {
        return serverParameters;
    }

    /**
     * Sets the value of the serverParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServerParameter }
     *     
     */
    public void setServerParameters(ArrayOfServerParameter value) {
        this.serverParameters = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link DspQuery.Where }
     *     
     */
    public DspQuery.Where getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link DspQuery.Where }
     *     
     */
    public void setWhere(DspQuery.Where value) {
        this.where = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderField }
     *     
     */
    public ArrayOfOrderField getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderField }
     *     
     */
    public void setOrderBy(ArrayOfOrderField value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the rowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getRowLimit() {
        if (rowLimit == null) {
            return -1L;
        } else {
            return rowLimit;
        }
    }

    /**
     * Sets the value of the rowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowLimit(Long value) {
        this.rowLimit = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class Where {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
