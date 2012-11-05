
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSocialUrlDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocialUrlDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialUrlDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialUrlDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocialUrlDetail", propOrder = {
    "socialUrlDetail"
})
public class ArrayOfSocialUrlDetail {

    @XmlElement(name = "SocialUrlDetail", nillable = true)
    protected List<SocialUrlDetail> socialUrlDetail;

    /**
     * Gets the value of the socialUrlDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialUrlDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialUrlDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialUrlDetail }
     * 
     * 
     */
    public List<SocialUrlDetail> getSocialUrlDetail() {
        if (socialUrlDetail == null) {
            socialUrlDetail = new ArrayList<SocialUrlDetail>();
        }
        return this.socialUrlDetail;
    }

}
