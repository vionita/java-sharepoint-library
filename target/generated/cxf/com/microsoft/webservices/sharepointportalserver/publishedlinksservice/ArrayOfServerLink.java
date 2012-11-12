
package com.microsoft.webservices.sharepointportalserver.publishedlinksservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServerLink" type="{http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService}ServerLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServerLink", propOrder = {
    "serverLink"
})
public class ArrayOfServerLink {

    @XmlElement(name = "ServerLink", nillable = true)
    protected List<ServerLink> serverLink;

    /**
     * Gets the value of the serverLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerLink }
     * 
     * 
     */
    public List<ServerLink> getServerLink() {
        if (serverLink == null) {
            serverLink = new ArrayList<ServerLink>();
        }
        return this.serverLink;
    }

}
