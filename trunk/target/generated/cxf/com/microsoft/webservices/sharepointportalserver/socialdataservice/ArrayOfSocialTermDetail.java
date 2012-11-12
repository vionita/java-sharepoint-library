
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSocialTermDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocialTermDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialTermDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialTermDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocialTermDetail", propOrder = {
    "socialTermDetail"
})
public class ArrayOfSocialTermDetail {

    @XmlElement(name = "SocialTermDetail", nillable = true)
    protected List<SocialTermDetail> socialTermDetail;

    /**
     * Gets the value of the socialTermDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialTermDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialTermDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialTermDetail }
     * 
     * 
     */
    public List<SocialTermDetail> getSocialTermDetail() {
        if (socialTermDetail == null) {
            socialTermDetail = new ArrayList<SocialTermDetail>();
        }
        return this.socialTermDetail;
    }

}
