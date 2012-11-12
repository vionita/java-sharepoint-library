
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSocialRatingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocialRatingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialRatingDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialRatingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocialRatingDetail", propOrder = {
    "socialRatingDetail"
})
public class ArrayOfSocialRatingDetail {

    @XmlElement(name = "SocialRatingDetail", nillable = true)
    protected List<SocialRatingDetail> socialRatingDetail;

    /**
     * Gets the value of the socialRatingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialRatingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialRatingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialRatingDetail }
     * 
     * 
     */
    public List<SocialRatingDetail> getSocialRatingDetail() {
        if (socialRatingDetail == null) {
            socialRatingDetail = new ArrayList<SocialRatingDetail>();
        }
        return this.socialRatingDetail;
    }

}
