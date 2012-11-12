
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialTagDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialTagDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialDataDetail">
 *       &lt;sequence>
 *         &lt;element name="Term" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}TermDetail" minOccurs="0"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialTagDetail", propOrder = {
    "term",
    "isPrivate"
})
public class SocialTagDetail
    extends SocialDataDetail
{

    @XmlElement(name = "Term")
    protected TermDetail term;
    @XmlElement(name = "IsPrivate")
    protected boolean isPrivate;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermDetail }
     *     
     */
    public TermDetail getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermDetail }
     *     
     */
    public void setTerm(TermDetail value) {
        this.term = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     */
    public boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     */
    public void setIsPrivate(boolean value) {
        this.isPrivate = value;
    }

}
