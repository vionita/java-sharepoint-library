
package com.microsoft.schemas.sharepoint.soap;

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
 *         &lt;element name="solutionFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullReuseExportMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeWebContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "solutionFileName",
    "title",
    "description",
    "fullReuseExportMode",
    "includeWebContent"
})
@XmlRootElement(name = "ExportSolution")
public class ExportSolution {

    protected String solutionFileName;
    protected String title;
    protected String description;
    protected boolean fullReuseExportMode;
    protected boolean includeWebContent;

    /**
     * Gets the value of the solutionFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionFileName() {
        return solutionFileName;
    }

    /**
     * Sets the value of the solutionFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionFileName(String value) {
        this.solutionFileName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fullReuseExportMode property.
     * 
     */
    public boolean isFullReuseExportMode() {
        return fullReuseExportMode;
    }

    /**
     * Sets the value of the fullReuseExportMode property.
     * 
     */
    public void setFullReuseExportMode(boolean value) {
        this.fullReuseExportMode = value;
    }

    /**
     * Gets the value of the includeWebContent property.
     * 
     */
    public boolean isIncludeWebContent() {
        return includeWebContent;
    }

    /**
     * Sets the value of the includeWebContent property.
     * 
     */
    public void setIncludeWebContent(boolean value) {
        this.includeWebContent = value;
    }

}
