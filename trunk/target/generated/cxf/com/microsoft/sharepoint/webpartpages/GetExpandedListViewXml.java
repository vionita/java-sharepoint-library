
package com.microsoft.sharepoint.webpartpages;

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
 *         &lt;element name="webId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listViewXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partialView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "webId",
    "listViewXml",
    "listGuid",
    "listUrl",
    "listDisplayName",
    "hasConnection",
    "partialView"
})
@XmlRootElement(name = "GetExpandedListViewXml")
public class GetExpandedListViewXml {

    protected String webId;
    protected String listViewXml;
    protected String listGuid;
    protected String listUrl;
    protected String listDisplayName;
    protected Boolean hasConnection;
    protected Boolean partialView;

    /**
     * Gets the value of the webId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebId() {
        return webId;
    }

    /**
     * Sets the value of the webId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebId(String value) {
        this.webId = value;
    }

    /**
     * Gets the value of the listViewXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListViewXml() {
        return listViewXml;
    }

    /**
     * Sets the value of the listViewXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListViewXml(String value) {
        this.listViewXml = value;
    }

    /**
     * Gets the value of the listGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListGuid() {
        return listGuid;
    }

    /**
     * Sets the value of the listGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListGuid(String value) {
        this.listGuid = value;
    }

    /**
     * Gets the value of the listUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListUrl() {
        return listUrl;
    }

    /**
     * Sets the value of the listUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListUrl(String value) {
        this.listUrl = value;
    }

    /**
     * Gets the value of the listDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListDisplayName() {
        return listDisplayName;
    }

    /**
     * Sets the value of the listDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDisplayName(String value) {
        this.listDisplayName = value;
    }

    /**
     * Gets the value of the hasConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasConnection() {
        return hasConnection;
    }

    /**
     * Sets the value of the hasConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasConnection(Boolean value) {
        this.hasConnection = value;
    }

    /**
     * Gets the value of the partialView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialView() {
        return partialView;
    }

    /**
     * Sets the value of the partialView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialView(Boolean value) {
        this.partialView = value;
    }

}
