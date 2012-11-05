
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetSiteTemplatesResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="TemplateList" type="{http://schemas.microsoft.com/sharepoint/soap/}ArrayOfTemplate" minOccurs="0"/>
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
    "getSiteTemplatesResult",
    "templateList"
})
@XmlRootElement(name = "GetSiteTemplatesResponse")
public class GetSiteTemplatesResponse {

    @XmlElement(name = "GetSiteTemplatesResult")
    @XmlSchemaType(name = "unsignedInt")
    protected long getSiteTemplatesResult;
    @XmlElement(name = "TemplateList")
    protected ArrayOfTemplate templateList;

    /**
     * Gets the value of the getSiteTemplatesResult property.
     * 
     */
    public long getGetSiteTemplatesResult() {
        return getSiteTemplatesResult;
    }

    /**
     * Sets the value of the getSiteTemplatesResult property.
     * 
     */
    public void setGetSiteTemplatesResult(long value) {
        this.getSiteTemplatesResult = value;
    }

    /**
     * Gets the value of the templateList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplate }
     *     
     */
    public ArrayOfTemplate getTemplateList() {
        return templateList;
    }

    /**
     * Sets the value of the templateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplate }
     *     
     */
    public void setTemplateList(ArrayOfTemplate value) {
        this.templateList = value;
    }

}
