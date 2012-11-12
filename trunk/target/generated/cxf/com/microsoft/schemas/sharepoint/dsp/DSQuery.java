
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://schemas.microsoft.com/sharepoint/dsp}DspQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="select" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultContent" type="{http://schemas.microsoft.com/sharepoint/dsp}ResultContentType" default="both" />
 *       &lt;attribute name="columnMapping" type="{http://schemas.microsoft.com/sharepoint/dsp}ColumnMappingType" default="element" />
 *       &lt;attribute name="resultNamespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultRoot" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultRow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comparisonLocale" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSQuery", propOrder = {
    "query"
})
public class DSQuery {

    @XmlElement(name = "Query")
    protected DspQuery query;
    @XmlAttribute(name = "select")
    protected String select;
    @XmlAttribute(name = "resultContent")
    protected ResultContentType resultContent;
    @XmlAttribute(name = "columnMapping")
    protected ColumnMappingType columnMapping;
    @XmlAttribute(name = "resultNamespace")
    protected String resultNamespace;
    @XmlAttribute(name = "resultPrefix")
    protected String resultPrefix;
    @XmlAttribute(name = "resultRoot")
    protected String resultRoot;
    @XmlAttribute(name = "resultRow")
    protected String resultRow;
    @XmlAttribute(name = "startPosition")
    protected String startPosition;
    @XmlAttribute(name = "comparisonLocale")
    protected String comparisonLocale;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link DspQuery }
     *     
     */
    public DspQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link DspQuery }
     *     
     */
    public void setQuery(DspQuery value) {
        this.query = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelect(String value) {
        this.select = value;
    }

    /**
     * Gets the value of the resultContent property.
     * 
     * @return
     *     possible object is
     *     {@link ResultContentType }
     *     
     */
    public ResultContentType getResultContent() {
        if (resultContent == null) {
            return ResultContentType.BOTH;
        } else {
            return resultContent;
        }
    }

    /**
     * Sets the value of the resultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultContentType }
     *     
     */
    public void setResultContent(ResultContentType value) {
        this.resultContent = value;
    }

    /**
     * Gets the value of the columnMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnMappingType }
     *     
     */
    public ColumnMappingType getColumnMapping() {
        if (columnMapping == null) {
            return ColumnMappingType.ELEMENT;
        } else {
            return columnMapping;
        }
    }

    /**
     * Sets the value of the columnMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnMappingType }
     *     
     */
    public void setColumnMapping(ColumnMappingType value) {
        this.columnMapping = value;
    }

    /**
     * Gets the value of the resultNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultNamespace() {
        return resultNamespace;
    }

    /**
     * Sets the value of the resultNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultNamespace(String value) {
        this.resultNamespace = value;
    }

    /**
     * Gets the value of the resultPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPrefix() {
        return resultPrefix;
    }

    /**
     * Sets the value of the resultPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPrefix(String value) {
        this.resultPrefix = value;
    }

    /**
     * Gets the value of the resultRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRoot() {
        return resultRoot;
    }

    /**
     * Sets the value of the resultRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRoot(String value) {
        this.resultRoot = value;
    }

    /**
     * Gets the value of the resultRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRow() {
        return resultRow;
    }

    /**
     * Sets the value of the resultRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRow(String value) {
        this.resultRow = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPosition(String value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the comparisonLocale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparisonLocale() {
        return comparisonLocale;
    }

    /**
     * Sets the value of the comparisonLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonLocale(String value) {
        this.comparisonLocale = value;
    }

}
