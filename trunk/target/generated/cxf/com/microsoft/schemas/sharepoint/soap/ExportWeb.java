
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
 *         &lt;element name="jobName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSubwebs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeUserSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overWrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cabSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "jobName",
    "webUrl",
    "dataPath",
    "includeSubwebs",
    "includeUserSecurity",
    "overWrite",
    "cabSize"
})
@XmlRootElement(name = "ExportWeb")
public class ExportWeb {

    protected String jobName;
    protected String webUrl;
    protected String dataPath;
    protected boolean includeSubwebs;
    protected boolean includeUserSecurity;
    protected boolean overWrite;
    protected int cabSize;

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

    /**
     * Gets the value of the dataPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPath() {
        return dataPath;
    }

    /**
     * Sets the value of the dataPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPath(String value) {
        this.dataPath = value;
    }

    /**
     * Gets the value of the includeSubwebs property.
     * 
     */
    public boolean isIncludeSubwebs() {
        return includeSubwebs;
    }

    /**
     * Sets the value of the includeSubwebs property.
     * 
     */
    public void setIncludeSubwebs(boolean value) {
        this.includeSubwebs = value;
    }

    /**
     * Gets the value of the includeUserSecurity property.
     * 
     */
    public boolean isIncludeUserSecurity() {
        return includeUserSecurity;
    }

    /**
     * Sets the value of the includeUserSecurity property.
     * 
     */
    public void setIncludeUserSecurity(boolean value) {
        this.includeUserSecurity = value;
    }

    /**
     * Gets the value of the overWrite property.
     * 
     */
    public boolean isOverWrite() {
        return overWrite;
    }

    /**
     * Sets the value of the overWrite property.
     * 
     */
    public void setOverWrite(boolean value) {
        this.overWrite = value;
    }

    /**
     * Gets the value of the cabSize property.
     * 
     */
    public int getCabSize() {
        return cabSize;
    }

    /**
     * Sets the value of the cabSize property.
     * 
     */
    public void setCabSize(int value) {
        this.cabSize = value;
    }

}
