package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<QueryPacket xmlns='urn:Microsoft.Search.Query'>
// <Query>
//   <Context>
//     <QueryText language='en-US' type='STRING'>SharePoint</QueryText>
//   </Context>
// </Query>
//</QueryPacket>


//ATTRIBUTES:
//---------
// revision
// Unsigned integer indicating the revision of the schema used in the request.
//
// build
// Optional String attribute. The build number for the client making the request.

// xmlns
// Optional String attribute. Specifies the URL to the XML schema that is used to validate the configuration file. The value for SharePoint Server search is "urn:Microsoft.Search.Query".

// Child Elements
//---------
// QUERY

public class QueryPacket extends DataObject {
		
	// Identifies the query type (see type Attribute below)
	private TypeEnum type = TypeEnum.STRING;
	// Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site.
	private String language = "xml:lang";
	// Search query
	private String searchQuery = null;

	public QueryPacket() {
	}

	public QueryPacket(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public QueryPacket(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
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
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<QueryText");
		
		if ((this.getLanguage() != null) && (this.getLanguage().length() > 0))
			stringWriter.append("language=" + this.getLanguage());
		
		if (this.getType() != null)
			stringWriter.append("type=" + String.valueOf(this.getType()));

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
	 * Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site. Default is "xml:lang"
	 * @return
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Identifies the language of the keyword search. Value type is xml:lang. If specified, this is interpreted by Enterprise Search as the query locale. If not specified, the default value is the language of the site. Default is "xml:lang"
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
