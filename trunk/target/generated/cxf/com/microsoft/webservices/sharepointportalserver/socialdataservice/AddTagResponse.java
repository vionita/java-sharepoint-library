
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

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
 *         &lt;element name="AddTagResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialTagDetail" minOccurs="0"/>
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
    "addTagResult"
})
@XmlRootElement(name = "AddTagResponse")
public class AddTagResponse {

    @XmlElement(name = "AddTagResult")
    protected SocialTagDetail addTagResult;

    /**
     * Gets the value of the addTagResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialTagDetail }
     *     
     */
    public SocialTagDetail getAddTagResult() {
        return addTagResult;
    }

    /**
     * Sets the value of the addTagResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialTagDetail }
     *     
     */
    public void setAddTagResult(SocialTagDetail value) {
        this.addTagResult = value;
    }

}
