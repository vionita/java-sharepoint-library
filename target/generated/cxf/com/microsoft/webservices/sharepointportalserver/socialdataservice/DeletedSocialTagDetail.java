
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletedSocialTagDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeletedSocialTagDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}DeletedSocialDataDetail">
 *       &lt;sequence>
 *         &lt;element name="TermID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletedSocialTagDetail", propOrder = {
    "termID"
})
public class DeletedSocialTagDetail
    extends DeletedSocialDataDetail
{

    @XmlElement(name = "TermID", required = true)
    protected String termID;

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermID(String value) {
        this.termID = value;
    }

}
