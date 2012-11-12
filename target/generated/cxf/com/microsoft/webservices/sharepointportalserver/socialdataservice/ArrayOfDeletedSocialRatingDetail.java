
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeletedSocialRatingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeletedSocialRatingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeletedSocialRatingDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}DeletedSocialRatingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeletedSocialRatingDetail", propOrder = {
    "deletedSocialRatingDetail"
})
public class ArrayOfDeletedSocialRatingDetail {

    @XmlElement(name = "DeletedSocialRatingDetail", nillable = true)
    protected List<DeletedSocialRatingDetail> deletedSocialRatingDetail;

    /**
     * Gets the value of the deletedSocialRatingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedSocialRatingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedSocialRatingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletedSocialRatingDetail }
     * 
     * 
     */
    public List<DeletedSocialRatingDetail> getDeletedSocialRatingDetail() {
        if (deletedSocialRatingDetail == null) {
            deletedSocialRatingDetail = new ArrayList<DeletedSocialRatingDetail>();
        }
        return this.deletedSocialRatingDetail;
    }

}
