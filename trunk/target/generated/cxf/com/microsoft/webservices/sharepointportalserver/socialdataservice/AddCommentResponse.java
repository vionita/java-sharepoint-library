
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
 *         &lt;element name="AddCommentResult" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialCommentDetail" minOccurs="0"/>
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
    "addCommentResult"
})
@XmlRootElement(name = "AddCommentResponse")
public class AddCommentResponse {

    @XmlElement(name = "AddCommentResult")
    protected SocialCommentDetail addCommentResult;

    /**
     * Gets the value of the addCommentResult property.
     * 
     * @return
     *     possible object is
     *     {@link SocialCommentDetail }
     *     
     */
    public SocialCommentDetail getAddCommentResult() {
        return addCommentResult;
    }

    /**
     * Sets the value of the addCommentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialCommentDetail }
     *     
     */
    public void setAddCommentResult(SocialCommentDetail value) {
        this.addCommentResult = value;
    }

}
