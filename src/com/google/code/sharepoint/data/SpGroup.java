package com.google.code.sharepoint.data;

import java.text.ParseException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<Group 	ID="5" 
//			Name="Content Management site Owners"
//			Description="Use this group to grant people full control permissions to the SharePoint site: Content Management site"
//			OwnerID="5" 
//			OwnerIsUser="False" 
///>

/**
 * 
 * @author Ishan Fernando
 *
 */
public class SpGroup extends DataObject {
	
	private Integer id;
	private String name;
	private String description;
	private Integer ownerId;
	private Boolean ownerIsUser;

	public SpGroup() {
	}
	
	public SpGroup(final String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	public SpGroup(final OMElement xmlElement) throws XMLStreamException, ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(final OMElement xmlElement) throws ParseException, XMLStreamException {
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)){
			setId(Integer.valueOf(tempAttributeValue));
		}
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Name"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)){
			setName(tempAttributeValue);
		}
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Description"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)){
			setDescription(tempAttributeValue);
		}
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("OwnerID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)){
			setOwnerId(Integer.parseInt(tempAttributeValue));
		}
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("OwnerIsUser"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)){
			setOwnerIsUser(Boolean.valueOf(tempAttributeValue));
		}
		tempAttributeValue = null;
	}

	@Override
	public String getAsXmlString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(final Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Boolean getOwnerIsUser() {
		return ownerIsUser;
	}

	public void setOwnerIsUser(final Boolean ownerIsUser) {
		this.ownerIsUser = ownerIsUser;
	}

}
