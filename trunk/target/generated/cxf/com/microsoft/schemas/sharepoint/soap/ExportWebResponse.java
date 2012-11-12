
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ExportWebResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "exportWebResult"
})
@XmlRootElement(name = "ExportWebResponse")
public class ExportWebResponse {

    @XmlElement(name = "ExportWebResult")
    protected int exportWebResult;

    /**
     * Gets the value of the exportWebResult property.
     * 
     */
    public int getExportWebResult() {
        return exportWebResult;
    }

    /**
     * Sets the value of the exportWebResult property.
     * 
     */
    public void setExportWebResult(int value) {
        this.exportWebResult = value;
    }

}
