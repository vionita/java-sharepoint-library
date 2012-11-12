
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSocialTagDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocialTagDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialTagDetail" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}SocialTagDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocialTagDetail", propOrder = {
    "socialTagDetail"
})
public class ArrayOfSocialTagDetail {

    @XmlElement(name = "SocialTagDetail", nillable = true)
    protected List<SocialTagDetail> socialTagDetail;

    /**
     * Gets the value of the socialTagDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialTagDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialTagDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialTagDetail }
     * 
     * 
     */
    public List<SocialTagDetail> getSocialTagDetail() {
        if (socialTagDetail == null) {
            socialTagDetail = new ArrayList<SocialTagDetail>();
        }
        return this.socialTagDetail;
    }

}
