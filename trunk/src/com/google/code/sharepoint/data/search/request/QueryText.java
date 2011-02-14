package com.google.code.sharepoint.data.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<QueryText language=xml:lang type={STRING|MSSQLFT}>
//	searchQuery
//</QueryText>


//ATTRIBUTES:
//---------
// type
// Identifies the query type (see type Attribute below)
//
// language
// Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site.

// type Attribute
//---------
// STRING
// Indicates type of query is keyword query.
//
// MSSQLFT
// Indicates type of query is Microsoft SQL Full Text Syntax query.

public class QueryText extends DataObject {
	enum TypeEnum
	{
		/** Indicates type of query is keyword query.*/
		STRING,
		/** Indicates type of query is Microsoft SQL Full Text Syntax query.*/
		MSSQLFT
	}	
	
	// Identifies the query type (see type Attribute below)
	private TypeEnum type = TypeEnum.STRING;
	// Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site.
	private String language = null;
	// Search query
	private String searchQuery = null;

	public QueryText() {
	}

	public QueryText(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	public QueryText(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"type"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setType(TypeEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"language"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLanguage(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		this.setSearchQuery(xmlElement.getText());
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<QueryText ");
		
		if ((this.getLanguage() != null) && (this.getLanguage().length() > 0))
			stringWriter.append("language=\"" + this.getLanguage() + "\"");
		
		if (this.getType() != null)
			stringWriter.append("type=\"" + String.valueOf(this.getType()) + "\"");

		stringWriter.append(">");
		stringWriter.append(this.getSearchQuery());
		stringWriter.append("</QueryText>");

		return stringWriter.toString();
	}

	/**
	 * Identifies the query type (see type Attribute below)
	 * @return
	 */
	public TypeEnum getType() {
		return type;
	}

	/**
	 * Identifies the query type (see type Attribute below)
	 * @param type
	 */
	public void setType(TypeEnum type) {
		this.type = type;
	}

	/**
	 * Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site.
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site.
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Search query
	 * @return
	 */
	public String getSearchQuery() {
		return searchQuery;
	}

	/**
	 * Search query
	 * @param searchQuery
	 */
	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
}
