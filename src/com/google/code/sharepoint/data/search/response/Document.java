package com.google.code.sharepoint.data.search.response;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<Document type=Scope relevance=Rank xmlns=string >
//<Title>title</Title>
//<Action><LinkUrl fileExt=fileType size=fileSize>Url</LinkUrl></Action>
//   <Description>description</Description>
//<Date>date</Date>
//</Document>



//ATTRIBUTES:
//---------
// type
//Contains the scope for the result.
//
//relevance
//Contains the Rank for the result.
//
//xmlns
//urn:Microsoft.Search.Response.Document


//CHILD ELEMENTS:
//---------
//Title
//Action
//Description
//Date

public class Document extends DataObject {
	/** Contains the scope for the result. */
	private String type = null;
	/** Contains the Rank for the result. */
	private Integer relevance = null;
	/** urn:Microsoft.Search.Response.Document */
	private String xmlns = null;	
	/** Contains the value of the title managed property for an individual result returned in the response. */
	private String title = null;
	/** Contains the value of the description managed property for an individual result returned in the response. */
	private String description = null;
	/** Contains the value of the date managed property for an individual result returned in the response. */
	private String date = null;	
	/** Contains the URL and file type information for an individual result returned in the response. */
	private Action action = null;
	
	public Document() {
	}

	public Document(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public Document(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"type"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setType(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"relevance"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRelevance(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
			"xmlns"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setXmlns(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Title"))			
				this.setTitle(childElement.getText());
			if (childElement.getQName().getLocalPart().equals("Action"))			
				this.setAction(new Action(childElement));
			if (childElement.getQName().getLocalPart().equals("Description"))			
				this.setDescription(childElement.getText());
			if (childElement.getQName().getLocalPart().equals("Date"))			
				this.setDate(childElement.getText());
		}	
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Document ");
		
		if ((this.getType() != null) && (this.getType().length() > 0))
			stringWriter.append("type=\"" + this.getType() + "\"");		
		if (this.getRelevance() != null)
			stringWriter.append("type=\"" + String.valueOf(this.getRelevance()) + "\"");
		if ((this.getXmlns() != null) && (this.getXmlns().length() > 0))
			stringWriter.append("xmlns=\"" + this.getXmlns() + "\"");

		stringWriter.append(">");
		
		if ((this.getTitle() != null) && (this.getTitle().length() > 0))
		{
			stringWriter.append("<Title>");
			stringWriter.append(this.getTitle());
			stringWriter.append("</Title>");			
		}
		
		if (this.getAction() != null)
			stringWriter.append(this.getAction().GetAsXmlString());
			
		if ((this.getDescription() != null) && (this.getDescription().length() > 0))
		{
			stringWriter.append("<Description>");
			stringWriter.append(this.getDescription());
			stringWriter.append("</Description>");			
		}
		
		if ((this.getDate() != null) && (this.getDate().length() > 0))
		{
			stringWriter.append("<Date>");
			stringWriter.append(this.getDate());
			stringWriter.append("</Date>");			
		}
		
		stringWriter.append("</Document>");

		return stringWriter.toString();
	}

	/**
	 * Contains the scope for the result
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * Contains the scope for the result
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Contains the Rank for the result.
	 * @return
	 */
	public Integer getRelevance() {
		return relevance;
	}

	/**
	 * Contains the Rank for the result.
	 * @param relevance
	 */
	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	/**
	 * urn:Microsoft.Search.Response.Document
	 * @return
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * urn:Microsoft.Search.Response.Document
	 * @param xmlns
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * Contains the value of the title managed property for an individual result returned in the response.
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Contains the value of the title managed property for an individual result returned in the response.
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Contains the value of the description managed property for an individual result returned in the response.
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Contains the value of the description managed property for an individual result returned in the response.
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Contains the value of the date managed property for an individual result returned in the response.
	 * @return
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Contains the value of the date managed property for an individual result returned in the response.
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Contains the URL and file type information for an individual result returned in the response.
	 * @return
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * Contains the URL and file type information for an individual result returned in the response.
	 * @param action
	 */
	public void setAction(Action action) {
		this.action = action;
	}
}
