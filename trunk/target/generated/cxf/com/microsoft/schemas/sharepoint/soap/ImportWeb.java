
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
 *         &lt;element name="dataFiles" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="logPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeUserSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overWrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "dataFiles",
    "logPath",
    "includeUserSecurity",
    "overWrite"
})
@XmlRootElement(name = "ImportWeb")
public class ImportWeb {

    protected String jobName;
    protected String webUrl;
    protected ArrayOfString dataFiles;
    protected String logPath;
    protected boolean includeUserSecurity;
    protected boolean overWrite;

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
     * Gets the value of the dataFiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDataFiles() {
        return dataFiles;
    }

    /**
     * Sets the value of the dataFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDataFiles(ArrayOfString value) {
        this.dataFiles = value;
    }

    /**
     * Gets the value of the logPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogPath() {
        return logPath;
    }

    /**
     * Sets the value of the logPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogPath(String value) {
        this.logPath = value;
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

}
