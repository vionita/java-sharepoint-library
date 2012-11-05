
package com.microsoft.webservices.sharepointportalserver.socialdataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrowserSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FeedbackAnswerId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FeedbackAnswerNumericEquivalent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FeedbackAnswerText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackControlCulture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackIdentifier" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FeedbackQuestionId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="FeedbackQuestionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsUserSatisfactionAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QueryId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="RatedAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatedAssetTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SampleRate" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="RatedAssetWebId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="SiteId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserVerbatim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackData", propOrder = {
    "browserSessionId",
    "customData",
    "feedbackAnswerId",
    "feedbackAnswerNumericEquivalent",
    "feedbackAnswerText",
    "feedbackControlCulture",
    "feedbackIdentifier",
    "feedbackQuestionId",
    "feedbackQuestionText",
    "isUserSatisfactionAnswer",
    "queryId",
    "ratedAssetId",
    "ratedAssetTitle",
    "sampleRate",
    "ratedAssetWebId",
    "siteId",
    "userId",
    "userDepartment",
    "userTitle",
    "userVerbatim"
})
public class FeedbackData {

    @XmlElement(name = "BrowserSessionId")
    protected String browserSessionId;
    @XmlElement(name = "CustomData")
    protected Object customData;
    @XmlElement(name = "FeedbackAnswerId", required = true)
    protected String feedbackAnswerId;
    @XmlElement(name = "FeedbackAnswerNumericEquivalent")
    protected int feedbackAnswerNumericEquivalent;
    @XmlElement(name = "FeedbackAnswerText")
    protected String feedbackAnswerText;
    @XmlElement(name = "FeedbackControlCulture")
    protected String feedbackControlCulture;
    @XmlElement(name = "FeedbackIdentifier", required = true)
    protected String feedbackIdentifier;
    @XmlElement(name = "FeedbackQuestionId", required = true)
    protected String feedbackQuestionId;
    @XmlElement(name = "FeedbackQuestionText")
    protected String feedbackQuestionText;
    @XmlElement(name = "IsUserSatisfactionAnswer")
    protected boolean isUserSatisfactionAnswer;
    @XmlElement(name = "QueryId", required = true)
    protected String queryId;
    @XmlElement(name = "RatedAssetId")
    protected String ratedAssetId;
    @XmlElement(name = "RatedAssetTitle")
    protected String ratedAssetTitle;
    @XmlElement(name = "SampleRate")
    @XmlSchemaType(name = "unsignedByte")
    protected short sampleRate;
    @XmlElement(name = "RatedAssetWebId", required = true)
    protected String ratedAssetWebId;
    @XmlElement(name = "SiteId", required = true)
    protected String siteId;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "UserDepartment")
    protected String userDepartment;
    @XmlElement(name = "UserTitle")
    protected String userTitle;
    @XmlElement(name = "UserVerbatim")
    protected String userVerbatim;

    /**
     * Gets the value of the browserSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserSessionId() {
        return browserSessionId;
    }

    /**
     * Sets the value of the browserSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserSessionId(String value) {
        this.browserSessionId = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomData(Object value) {
        this.customData = value;
    }

    /**
     * Gets the value of the feedbackAnswerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackAnswerId() {
        return feedbackAnswerId;
    }

    /**
     * Sets the value of the feedbackAnswerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackAnswerId(String value) {
        this.feedbackAnswerId = value;
    }

    /**
     * Gets the value of the feedbackAnswerNumericEquivalent property.
     * 
     */
    public int getFeedbackAnswerNumericEquivalent() {
        return feedbackAnswerNumericEquivalent;
    }

    /**
     * Sets the value of the feedbackAnswerNumericEquivalent property.
     * 
     */
    public void setFeedbackAnswerNumericEquivalent(int value) {
        this.feedbackAnswerNumericEquivalent = value;
    }

    /**
     * Gets the value of the feedbackAnswerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackAnswerText() {
        return feedbackAnswerText;
    }

    /**
     * Sets the value of the feedbackAnswerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackAnswerText(String value) {
        this.feedbackAnswerText = value;
    }

    /**
     * Gets the value of the feedbackControlCulture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackControlCulture() {
        return feedbackControlCulture;
    }

    /**
     * Sets the value of the feedbackControlCulture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackControlCulture(String value) {
        this.feedbackControlCulture = value;
    }

    /**
     * Gets the value of the feedbackIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackIdentifier() {
        return feedbackIdentifier;
    }

    /**
     * Sets the value of the feedbackIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackIdentifier(String value) {
        this.feedbackIdentifier = value;
    }

    /**
     * Gets the value of the feedbackQuestionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackQuestionId() {
        return feedbackQuestionId;
    }

    /**
     * Sets the value of the feedbackQuestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackQuestionId(String value) {
        this.feedbackQuestionId = value;
    }

    /**
     * Gets the value of the feedbackQuestionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackQuestionText() {
        return feedbackQuestionText;
    }

    /**
     * Sets the value of the feedbackQuestionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackQuestionText(String value) {
        this.feedbackQuestionText = value;
    }

    /**
     * Gets the value of the isUserSatisfactionAnswer property.
     * 
     */
    public boolean isIsUserSatisfactionAnswer() {
        return isUserSatisfactionAnswer;
    }

    /**
     * Sets the value of the isUserSatisfactionAnswer property.
     * 
     */
    public void setIsUserSatisfactionAnswer(boolean value) {
        this.isUserSatisfactionAnswer = value;
    }

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the ratedAssetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatedAssetId() {
        return ratedAssetId;
    }

    /**
     * Sets the value of the ratedAssetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatedAssetId(String value) {
        this.ratedAssetId = value;
    }

    /**
     * Gets the value of the ratedAssetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatedAssetTitle() {
        return ratedAssetTitle;
    }

    /**
     * Sets the value of the ratedAssetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatedAssetTitle(String value) {
        this.ratedAssetTitle = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     */
    public short getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     */
    public void setSampleRate(short value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the ratedAssetWebId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatedAssetWebId() {
        return ratedAssetWebId;
    }

    /**
     * Sets the value of the ratedAssetWebId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatedAssetWebId(String value) {
        this.ratedAssetWebId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDepartment() {
        return userDepartment;
    }

    /**
     * Sets the value of the userDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDepartment(String value) {
        this.userDepartment = value;
    }

    /**
     * Gets the value of the userTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTitle() {
        return userTitle;
    }

    /**
     * Sets the value of the userTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTitle(String value) {
        this.userTitle = value;
    }

    /**
     * Gets the value of the userVerbatim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserVerbatim() {
        return userVerbatim;
    }

    /**
     * Sets the value of the userVerbatim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserVerbatim(String value) {
        this.userVerbatim = value;
    }

}
