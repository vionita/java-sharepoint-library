
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
 *         &lt;element name="ImportWebResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "importWebResult"
})
@XmlRootElement(name = "ImportWebResponse")
public class ImportWebResponse {

    @XmlElement(name = "ImportWebResult")
    protected int importWebResult;

    /**
     * Gets the value of the importWebResult property.
     * 
     */
    public int getImportWebResult() {
        return importWebResult;
    }

    /**
     * Sets the value of the importWebResult property.
     * 
     */
    public void setImportWebResult(int value) {
        this.importWebResult = value;
    }

}
