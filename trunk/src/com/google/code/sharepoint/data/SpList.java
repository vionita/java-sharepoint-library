/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.code.sharepoint.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * 
 * @author vkorecky
 */

// <List
// BaseType = "Integer" | "Text"
// Default = "TRUE" | "FALSE"
// DefaultItemOpen = "Integer"
// Description = "Text"
// Direction = "Text"
// DisableAttachments = "TRUE" | "FALSE"
// DraftVersionVisibility = "Integer"
// EnableContentTypes = "TRUE" | "FALSE" EnableMinorVersions = "TRUE" | "FALSE"
// EnableThumbnails = "TRUE" | "FALSE"
// EventSinkAssembly = "Text"
// EventSinkClass = "Text"
// EventSinkData = "Text"
// FolderCreation = "TRUE" | "FALSE"
// Id = "GUID"
// ModeratedList = "TRUE" | "FALSE"
// ModerationType = "TRUE" | "FALSE"
// Name = "Text"
// OrderedList = "TRUE" | "FALSE"
// PrivateList = "TRUE" | "FALSE"
// QuickLaunchUrl = "URL"
// RootWebOnly = "TRUE" | "FALSE"
// ThumbnailSize = "Integer"
// Title = "Text"
// Type = "Integer"
// Url = "URL"
// URLEncode = "TRUE" | "FALSE"
// VersioningEnabled = "TRUE" | "FALSE"
// WebImageHeight = "Integer"
// WebImageWidth = "Integer">
// </List>

public final class SpList extends DataObject {
	private String docTemplateUrl = null;
	private String defaultViewUrl = null;
	private String mobileDefaultViewUrl = null;
	private String featureId = null;
	private String id = null;
	private Integer majorVersionLimit = null;
	private Integer majorWithMinorVersionsLimit = null;
	private String workFlowId = null;
	private Boolean hasUniqueScopes = null;
	private Boolean enableMinorVersion = null;
	private Boolean requireCheckout = null;
	private String title = null;
	private String description = null;
	private String sendToLocation = null;
	private String scopeId = null;
	private String webFullUrl = null;
	private String webId = null;
	private String emailAlias = null;
	private String imageUrl = null;
	private String name = null;
	private Integer baseType = null;
	private Integer serverTemplate = null;
	private Date created = null;
	private Date modified = null;
	private Date lastDeleted = null;
	private Integer version = null;
	private String direction = null;
	private Integer thumbnailSize = null;
	private Integer webImageWidth = null;
	private Integer webImageHeight = null;
	private Integer flags = null;
	private Integer itemCount = null;
	private String anonymousPermMask = null; // TODO check type
	private String rootFolder = null;
	private Integer readSecurity = null;
	private Integer writeSecurity = null;
	private Integer author = null;
	private String eventSinkAssembly = null;
	private String eventSinkClass = null;
	private String eventSinkData = null;
	private String emailInsertsFolder = null;
	private Boolean allowDeletion = null;
	private Boolean allowMultiResponses = null;
	private Boolean enableAttachments = null;
	private Boolean enableModeration = null;
	private Boolean enableVersioning = null;
	private Boolean hidden = null;
	private Boolean multipleDataList = null;
	private Boolean ordered = null;
	private Boolean showUser = null;

	private SpFields fields = null;
	private SpRegionalSettings regionalSettings = null;
	private SpServerSettings serverSettings = null;

	public SpList() {
	}

	public SpList(String xmlString) throws XMLStreamException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			try {
				parse(xmlElement);
			} catch (ParseException ex) {
				Logger.getLogger(SpList.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	public SpList(OMElement xmlElement) {
		try {
			parse(xmlElement);
		} catch (ParseException ex) {
			Logger.getLogger(SpList.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}	

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DocTemplateUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDocTemplateUrl(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DefaultViewUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDefaultViewUrl(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"MobileDefaultViewUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMobileDefaultViewUrl(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("FeatureId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFeatureId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("ID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"MajorVersionLimit"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMajorVersionLimit(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"MajorWithMinorVersionsLimit"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMajorWithMinorVersionsLimit(Integer
					.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WorkFlowId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWorkFlowId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"HasUniqueScopes"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHasUniqueScopes(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnableMinorVersion"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnableMinorVersion(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RequireCheckout"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRequireCheckout(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Title"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setTitle(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Description"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDescription(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"SendToLocation"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSendToLocation(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("ScopeId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setScopeId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WebFullUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWebFullUrl(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("WebId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWebId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EmailAlias"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEmailAlias(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ImageUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setImageUrl(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Name"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("BaseType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setBaseType(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ServerTemplate"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setServerTemplate(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Created"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCreated((Date) dateFormatter.parse(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Modified"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setModified((Date) dateFormatter.parse(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"LastDeleted"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLastDeleted((Date) dateFormatter.parse(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Version"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setVersion(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Direction"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDirection(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ThumbnailSize"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setThumbnailSize(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WebImageWidth"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWebImageWidth(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WebImageHeight"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWebImageHeight(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Flags"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFlags(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ItemCount"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setItemCount(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AnonymousPermMask"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAnonymousPermMask(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RootFolder"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRootFolder(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ReadSecurity"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setReadSecurity(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WriteSecurity"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWriteSecurity(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Author"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAuthor(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EventSinkAssembly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEventSinkAssembly(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EventSinkClass"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEventSinkClass(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EventSinkData"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEventSinkData(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EmailInsertsFolder"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEmailInsertsFolder(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AllowDeletion"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAllowDeletion(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AllowMultiResponses"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAllowMultiResponses(Boolean
					.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnableAttachments"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnableAttachments(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnableModeration"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnableModeration(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnableVersioning"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnableVersioning(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Hidden"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHidden(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"MultipleDataList"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMultipleDataList(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Ordered"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setOrdered(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ShowUser"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowUser(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {			
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Fields"))
			{				
				this.setFields(new SpFields(childElement));
			}
			else if (childElement.getQName().getLocalPart().equals("RegionalSettings"))
			{
				this.setRegionalSettings(new SpRegionalSettings(childElement));
			}
			else if (childElement.getQName().getLocalPart().equals("ServerSettings"))
			{
				this.setServerSettings(new SpServerSettings(childElement));
			}					
		}		
	}	

	@Override
	public String getAsXmlString() {

		// TODO: getAsXmlString

		// <List DocTemplateUrl=
		// "" DefaultViewUrl="/TestWeb1/Lists/Announcements/AllItems.aspx"
		// ID="{8A98E2E5-B377-4D0E-931B-3AC25BD09926}" Title="Announcements"
		// Description="Use the Announcements list to post messages on the
		// home page of your site."
		// ImageUrl="/_layouts/images/itann.gif"
		// Name="{8A98E2E5-B377-4D0E-931B-3AC25BD09926}"
		// BaseType="0" ServerTemplate="104"
		// Created="20030613 18:47:12" Modified="20030613 18:47:12"
		// LastDeleted="20030613 18:47:12" Version="0" Direction="none"
		// ThumbnailSize="" WebImageWidth=""
		// WebImageHeight="" Flags="4096" ItemCount="1"
		// AnonymousPermMask="" RootFolder="" ReadSecurity="1"
		// WriteSecurity="1" Author="1"
		// EventSinkAssembly="" EventSinkClass=""
		// EventSinkData="" EmailInsertsFolder=""
		// AllowDeletion="True" AllowMultiResponses="False"
		// EnableAttachments="True" EnableModeration="False"
		// EnableVersioning="False" Hidden="False" MultipleDataList="False"
		// Ordered="False" ShowUser="True" />

		return null;
	}

	/**
	 * @return the docTemplateUrl
	 */
	public String getDocTemplateUrl() {
		return docTemplateUrl;
	}

	/**
	 * @param docTemplateUrl
	 *            the docTemplateUrl to set
	 */
	public void setDocTemplateUrl(String docTemplateUrl) {
		this.docTemplateUrl = docTemplateUrl;
	}

	/**
	 * @return the defaultViewUrl
	 */
	public String getDefaultViewUrl() {
		return defaultViewUrl;
	}

	/**
	 * @param defaultViewUrl
	 *            the defaultViewUrl to set
	 */
	public void setDefaultViewUrl(String defaultViewUrl) {
		this.defaultViewUrl = defaultViewUrl;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the baseType
	 */
	public Integer getBaseType() {
		return baseType;
	}

	/**
	 * @param baseType
	 *            the baseType to set
	 */
	public void setBaseType(Integer baseType) {
		this.baseType = baseType;
	}

	/**
	 * @return the serverTemplate
	 */
	public Integer getServerTemplate() {
		return serverTemplate;
	}

	/**
	 * @param serverTemplate
	 *            the serverTemplate to set
	 */
	public void setServerTemplate(Integer serverTemplate) {
		this.serverTemplate = serverTemplate;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the modified
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * @param modified
	 *            the modified to set
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * @return the lastDeleted
	 */
	public Date getLastDeleted() {
		return lastDeleted;
	}

	/**
	 * @param lastDeleted
	 *            the lastDeleted to set
	 */
	public void setLastDeleted(Date lastDeleted) {
		this.lastDeleted = lastDeleted;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the thumbnailSize
	 */
	public Integer getThumbnailSize() {
		return thumbnailSize;
	}

	/**
	 * @param thumbnailSize
	 *            the thumbnailSize to set
	 */
	public void setThumbnailSize(Integer thumbnailSize) {
		this.thumbnailSize = thumbnailSize;
	}

	/**
	 * @return the webImageWidth
	 */
	public Integer getWebImageWidth() {
		return webImageWidth;
	}

	/**
	 * @param webImageWidth
	 *            the webImageWidth to set
	 */
	public void setWebImageWidth(Integer webImageWidth) {
		this.webImageWidth = webImageWidth;
	}

	/**
	 * @return the webImageHeight
	 */
	public Integer getWebImageHeight() {
		return webImageHeight;
	}

	/**
	 * @param webImageHeight
	 *            the webImageHeight to set
	 */
	public void setWebImageHeight(Integer webImageHeight) {
		this.webImageHeight = webImageHeight;
	}

	/**
	 * @return the flags
	 */
	public Integer getFlags() {
		return flags;
	}

	/**
	 * @param flags
	 *            the flags to set
	 */
	public void setFlags(Integer flags) {
		this.flags = flags;
	}

	/**
	 * @return the itemCount
	 */
	public Integer getItemCount() {
		return itemCount;
	}

	/**
	 * @param itemCount
	 *            the itemCount to set
	 */
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * @return the anonymousPermMask
	 */
	public String getAnonymousPermMask() {
		return anonymousPermMask;
	}

	/**
	 * @param anonymousPermMask
	 *            the anonymousPermMask to set
	 */
	public void setAnonymousPermMask(String anonymousPermMask) {
		this.anonymousPermMask = anonymousPermMask;
	}

	/**
	 * @return the rootFolder
	 */
	public String getRootFolder() {
		return rootFolder;
	}

	/**
	 * @param rootFolder
	 *            the rootFolder to set
	 */
	public void setRootFolder(String rootFolder) {
		this.rootFolder = rootFolder;
	}

	/**
	 * @return the readSecurity
	 */
	public Integer getReadSecurity() {
		return readSecurity;
	}

	/**
	 * @param readSecurity
	 *            the readSecurity to set
	 */
	public void setReadSecurity(Integer readSecurity) {
		this.readSecurity = readSecurity;
	}

	/**
	 * @return the writeSecurity
	 */
	public Integer getWriteSecurity() {
		return writeSecurity;
	}

	/**
	 * @param writeSecurity
	 *            the writeSecurity to set
	 */
	public void setWriteSecurity(Integer writeSecurity) {
		this.writeSecurity = writeSecurity;
	}

	/**
	 * @return the author
	 */
	public Integer getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(Integer author) {
		this.author = author;
	}

	/**
	 * @return the eventSinkAssembly
	 */
	public String getEventSinkAssembly() {
		return eventSinkAssembly;
	}

	/**
	 * @param eventSinkAssembly
	 *            the eventSinkAssembly to set
	 */
	public void setEventSinkAssembly(String eventSinkAssembly) {
		this.eventSinkAssembly = eventSinkAssembly;
	}

	/**
	 * @return the eventSinkClass
	 */
	public String getEventSinkClass() {
		return eventSinkClass;
	}

	/**
	 * @param eventSinkClass
	 *            the eventSinkClass to set
	 */
	public void setEventSinkClass(String eventSinkClass) {
		this.eventSinkClass = eventSinkClass;
	}

	/**
	 * @return the eventSinkData
	 */
	public String getEventSinkData() {
		return eventSinkData;
	}

	/**
	 * @param eventSinkData
	 *            the eventSinkData to set
	 */
	public void setEventSinkData(String eventSinkData) {
		this.eventSinkData = eventSinkData;
	}

	/**
	 * @return the emailInsertsFolder
	 */
	public String getEmailInsertsFolder() {
		return emailInsertsFolder;
	}

	/**
	 * @param emailInsertsFolder
	 *            the emailInsertsFolder to set
	 */
	public void setEmailInsertsFolder(String emailInsertsFolder) {
		this.emailInsertsFolder = emailInsertsFolder;
	}

	/**
	 * @return the allowDeletion
	 */
	public Boolean getAllowDeletion() {
		return allowDeletion;
	}

	/**
	 * @param allowDeletion
	 *            the allowDeletion to set
	 */
	public void setAllowDeletion(Boolean allowDeletion) {
		this.allowDeletion = allowDeletion;
	}

	/**
	 * @return the allowMultiResponses
	 */
	public Boolean getAllowMultiResponses() {
		return allowMultiResponses;
	}

	/**
	 * @param allowMultiResponses
	 *            the allowMultiResponses to set
	 */
	public void setAllowMultiResponses(Boolean allowMultiResponses) {
		this.allowMultiResponses = allowMultiResponses;
	}

	/**
	 * @return the enableAttachments
	 */
	public Boolean getEnableAttachments() {
		return enableAttachments;
	}

	/**
	 * @param enableAttachments
	 *            the enableAttachments to set
	 */
	public void setEnableAttachments(Boolean enableAttachments) {
		this.enableAttachments = enableAttachments;
	}

	/**
	 * @return the enableModeration
	 */
	public Boolean getEnableModeration() {
		return enableModeration;
	}

	/**
	 * @param enableModeration
	 *            the enableModeration to set
	 */
	public void setEnableModeration(Boolean enableModeration) {
		this.enableModeration = enableModeration;
	}

	/**
	 * @return the enableVersioning
	 */
	public Boolean getEnableVersioning() {
		return enableVersioning;
	}

	/**
	 * @param enableVersioning
	 *            the enableVersioning to set
	 */
	public void setEnableVersioning(Boolean enableVersioning) {
		this.enableVersioning = enableVersioning;
	}

	/**
	 * @return the hidden
	 */
	public Boolean getHidden() {
		return hidden;
	}

	/**
	 * @param hidden
	 *            the hidden to set
	 */
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	/**
	 * @return the multipleDataList
	 */
	public Boolean getMultipleDataList() {
		return multipleDataList;
	}

	/**
	 * @param multipleDataList
	 *            the multipleDataList to set
	 */
	public void setMultipleDataList(Boolean multipleDataList) {
		this.multipleDataList = multipleDataList;
	}

	/**
	 * @return the ordered
	 */
	public Boolean getOrdered() {
		return ordered;
	}

	/**
	 * @param ordered
	 *            the ordered to set
	 */
	public void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}

	/**
	 * @return the showUser
	 */
	public Boolean getShowUser() {
		return showUser;
	}

	/**
	 * @param showUser
	 *            the showUser to set
	 */
	public void setShowUser(Boolean showUser) {
		this.showUser = showUser;
	}

	/**
	 * @return the fields
	 */
	public SpFields getFields() {
		return fields;
	}

	/**
	 * @param fields
	 *            the fields to set
	 */
	public void setFields(SpFields fields) {
		this.fields = fields;
	}

	/**
	 * @return the regionalSettings
	 */
	public SpRegionalSettings getRegionalSettings() {
		return regionalSettings;
	}

	/**
	 * @param regionalSettings
	 *            the regionalSettings to set
	 */
	public void setRegionalSettings(SpRegionalSettings regionalSettings) {
		this.regionalSettings = regionalSettings;
	}

	/**
	 * @return the serverSettings
	 */
	public SpServerSettings getServerSettings() {
		return serverSettings;
	}

	/**
	 * @param serverSettings
	 *            the serverSettings to set
	 */
	public void setServerSettings(SpServerSettings serverSettings) {
		this.serverSettings = serverSettings;
	}

	/**
	 * @return the mobileDefaultViewUrl
	 */
	public String getMobileDefaultViewUrl() {
		return mobileDefaultViewUrl;
	}

	/**
	 * @param mobileDefaultViewUrl
	 *            the mobileDefaultViewUrl to set
	 */
	public void setMobileDefaultViewUrl(String mobileDefaultViewUrl) {
		this.mobileDefaultViewUrl = mobileDefaultViewUrl;
	}

	/**
	 * @return the featureId
	 */
	public String getFeatureId() {
		return featureId;
	}

	/**
	 * @param featureId
	 *            the featureId to set
	 */
	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	/**
	 * @return the majorVersionLimit
	 */
	public Integer getMajorVersionLimit() {
		return majorVersionLimit;
	}

	/**
	 * @param majorVersionLimit
	 *            the majorVersionLimit to set
	 */
	public void setMajorVersionLimit(Integer majorVersionLimit) {
		this.majorVersionLimit = majorVersionLimit;
	}

	/**
	 * @return the majorWithMinorVersionsLimit
	 */
	public Integer getMajorWithMinorVersionsLimit() {
		return majorWithMinorVersionsLimit;
	}

	/**
	 * @param majorWithMinorVersionsLimit
	 *            the majorWithMinorVersionsLimit to set
	 */
	public void setMajorWithMinorVersionsLimit(
			Integer majorWithMinorVersionsLimit) {
		this.majorWithMinorVersionsLimit = majorWithMinorVersionsLimit;
	}

	/**
	 * @return the workFlowId
	 */
	public String getWorkFlowId() {
		return workFlowId;
	}

	/**
	 * @param workFlowId
	 *            the workFlowId to set
	 */
	public void setWorkFlowId(String workFlowId) {
		this.workFlowId = workFlowId;
	}

	/**
	 * @return the hasUniqueScopes
	 */
	public Boolean getHasUniqueScopes() {
		return hasUniqueScopes;
	}

	/**
	 * @param hasUniqueScopes
	 *            the hasUniqueScopes to set
	 */
	public void setHasUniqueScopes(Boolean hasUniqueScopes) {
		this.hasUniqueScopes = hasUniqueScopes;
	}

	/**
	 * @return the enableMinorVersion
	 */
	public Boolean getEnableMinorVersion() {
		return enableMinorVersion;
	}

	/**
	 * @param enableMinorVersion
	 *            the enableMinorVersion to set
	 */
	public void setEnableMinorVersion(Boolean enableMinorVersion) {
		this.enableMinorVersion = enableMinorVersion;
	}

	/**
	 * @return the requireCheckout
	 */
	public Boolean getRequireCheckout() {
		return requireCheckout;
	}

	/**
	 * @param requireCheckout
	 *            the requireCheckout to set
	 */
	public void setRequireCheckout(Boolean requireCheckout) {
		this.requireCheckout = requireCheckout;
	}

	/**
	 * @return the sendToLocation
	 */
	public String getSendToLocation() {
		return sendToLocation;
	}

	/**
	 * @param sendToLocation
	 *            the sendToLocation to set
	 */
	public void setSendToLocation(String sendToLocation) {
		this.sendToLocation = sendToLocation;
	}

	/**
	 * @return the scopeId
	 */
	public String getScopeId() {
		return scopeId;
	}

	/**
	 * @param scopeId
	 *            the scopeId to set
	 */
	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	/**
	 * @return the webFullUrl
	 */
	public String getWebFullUrl() {
		return webFullUrl;
	}

	/**
	 * @param webFullUrl
	 *            the webFullUrl to set
	 */
	public void setWebFullUrl(String webFullUrl) {
		this.webFullUrl = webFullUrl;
	}

	/**
	 * @return the webId
	 */
	public String getWebId() {
		return webId;
	}

	/**
	 * @param webId
	 *            the webId to set
	 */
	public void setWebId(String webId) {
		this.webId = webId;
	}

	/**
	 * @return the emailAlias
	 */
	public String getEmailAlias() {
		return emailAlias;
	}

	/**
	 * @param emailAlias
	 *            the emailAlias to set
	 */
	public void setEmailAlias(String emailAlias) {
		this.emailAlias = emailAlias;
	}
}
