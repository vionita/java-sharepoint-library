
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialReplicationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialReplicationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialTagDetail" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialCommentDetail" minOccurs="0"/>
 *         &lt;element name="Ratings" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfSocialRatingDetail" minOccurs="0"/>
 *         &lt;element name="DeletedTags" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfDeletedSocialTagDetail" minOccurs="0"/>
 *         &lt;element name="DeletedComments" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfDeletedSocialCommentDetail" minOccurs="0"/>
 *         &lt;element name="DeletedRatings" type="{http://microsoft.com/webservices/SharePointPortalServer/SocialDataService}ArrayOfDeletedSocialRatingDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialReplicationData", propOrder = {
    "tags",
    "comments",
    "ratings",
    "deletedTags",
    "deletedComments",
    "deletedRatings"
})
public class SocialReplicationData {

    @XmlElement(name = "Tags")
    protected ArrayOfSocialTagDetail tags;
    @XmlElement(name = "Comments")
    protected ArrayOfSocialCommentDetail comments;
    @XmlElement(name = "Ratings")
    protected ArrayOfSocialRatingDetail ratings;
    @XmlElement(name = "DeletedTags")
    protected ArrayOfDeletedSocialTagDetail deletedTags;
    @XmlElement(name = "DeletedComments")
    protected ArrayOfDeletedSocialCommentDetail deletedComments;
    @XmlElement(name = "DeletedRatings")
    protected ArrayOfDeletedSocialRatingDetail deletedRatings;

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public ArrayOfSocialTagDetail getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialTagDetail }
     *     
     */
    public void setTags(ArrayOfSocialTagDetail value) {
        this.tags = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public ArrayOfSocialCommentDetail getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialCommentDetail }
     *     
     */
    public void setComments(ArrayOfSocialCommentDetail value) {
        this.comments = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public ArrayOfSocialRatingDetail getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSocialRatingDetail }
     *     
     */
    public void setRatings(ArrayOfSocialRatingDetail value) {
        this.ratings = value;
    }

    /**
     * Gets the value of the deletedTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeletedSocialTagDetail }
     *     
     */
    public ArrayOfDeletedSocialTagDetail getDeletedTags() {
        return deletedTags;
    }

    /**
     * Sets the value of the deletedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeletedSocialTagDetail }
     *     
     */
    public void setDeletedTags(ArrayOfDeletedSocialTagDetail value) {
        this.deletedTags = value;
    }

    /**
     * Gets the value of the deletedComments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeletedSocialCommentDetail }
     *     
     */
    public ArrayOfDeletedSocialCommentDetail getDeletedComments() {
        return deletedComments;
    }

    /**
     * Sets the value of the deletedComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeletedSocialCommentDetail }
     *     
     */
    public void setDeletedComments(ArrayOfDeletedSocialCommentDetail value) {
        this.deletedComments = value;
    }

    /**
     * Gets the value of the deletedRatings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeletedSocialRatingDetail }
     *     
     */
    public ArrayOfDeletedSocialRatingDetail getDeletedRatings() {
        return deletedRatings;
    }

    /**
     * Sets the value of the deletedRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeletedSocialRatingDetail }
     *     
     */
    public void setDeletedRatings(ArrayOfDeletedSocialRatingDetail value) {
        this.deletedRatings = value;
    }

}
