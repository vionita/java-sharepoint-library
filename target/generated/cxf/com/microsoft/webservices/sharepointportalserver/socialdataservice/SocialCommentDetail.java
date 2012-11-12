
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialCommentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialCommentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialDataDetail">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsHighPriority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialCommentDetail", propOrder = {
    "comment",
    "isHighPriority"
})
public class SocialCommentDetail
    extends SocialDataDetail
{

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "IsHighPriority")
    protected boolean isHighPriority;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the isHighPriority property.
     * 
     */
    public boolean isIsHighPriority() {
        return isHighPriority;
    }

    /**
     * Sets the value of the isHighPriority property.
     * 
     */
    public void setIsHighPriority(boolean value) {
        this.isHighPriority = value;
    }

}
