
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeletedSocialTagDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDeletedSocialTagDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeletedSocialTagDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}DeletedSocialTagDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeletedSocialTagDetail", propOrder = {
    "deletedSocialTagDetail"
})
public class ArrayOfDeletedSocialTagDetail {

    @XmlElement(name = "DeletedSocialTagDetail", nillable = true)
    protected List<DeletedSocialTagDetail> deletedSocialTagDetail;

    /**
     * Gets the value of the deletedSocialTagDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedSocialTagDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedSocialTagDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletedSocialTagDetail }
     * 
     * 
     */
    public List<DeletedSocialTagDetail> getDeletedSocialTagDetail() {
        if (deletedSocialTagDetail == null) {
            deletedSocialTagDetail = new ArrayList<DeletedSocialTagDetail>();
        }
        return this.deletedSocialTagDetail;
    }

}
