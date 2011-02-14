package com.google.code.sharepoint.data.search.request;

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
	/**
	 * Unsigned integer indicating the revision of the schema used in the request.
	 */
	private Integer revision = null;
	/**
	 * Optional String attribute. The build number for the client making the request.
	 */
	private String build = null;
	/**
	 * Optional String attribute. Specifies the URL to the XML schema that is used to validate the configuration file. The value for SharePoint Server search is "urn:Microsoft.Search.Query".
	 */
	private String xmlns = null;	
	/**
	 *  query
	 */
	private Query query = null;

	/**
	 * Contains all the elements for the search query request.
	 */
	public QueryPacket() {
	}

	/**
	 * Contains all the elements for the search query request.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public QueryPacket(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * Contains all the elements for the search query request.
	 * @param xmlElement
	 * @throws ParseException
	 * @throws XMLStreamException 
	 */
	public QueryPacket(OMElement xmlElement) throws ParseException, XMLStreamException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException, XMLStreamException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"revision"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRevision(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"build"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setBuild(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
			"xmlns"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setXmlns(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Query")) {
				this.setQuery(new Query(childElement));
			}
		}
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<QueryPacket");		
		
		if (this.getRevision() != null)
			stringWriter.append("revision=" + String.valueOf(this.getRevision()));
		
		if ((this.getBuild() != null) && (this.getBuild().length() > 0))
			stringWriter.append("build=" + this.getBuild());
		
		if ((this.getXmlns() != null) && (this.getXmlns().length() > 0))
			stringWriter.append("xmlns=" + this.getXmlns());	

		stringWriter.append(">");
		
		// Query
		if (this.getQuery() != null)
			stringWriter.append(this.getQuery().getAsXmlString());
			
		stringWriter.append("</QueryPacket>");

		return stringWriter.toString();
	}

	/**
	 * Unsigned integer indicating the revision of the schema used in the request. 
	 * @return
	 */
	public Integer getRevision() {
		return revision;
	}

	/**
	 * Unsigned integer indicating the revision of the schema used in the request.
	 * @param revision
	 */
	public void setRevision(Integer revision) {
		this.revision = revision;
	}

	/**
	 * Optional String attribute. The build number for the client making the request.
	 * @return
	 */
	public String getBuild() {
		return build;
	}

	/**
	 * Optional String attribute. The build number for the client making the request.
	 * @param build
	 */
	public void setBuild(String build) {
		this.build = build;
	}

	/**
	 * Optional String attribute. Specifies the URL to the XML schema that is used to validate the configuration file. The value for SharePoint Server search is "urn:Microsoft.Search.Query".
	 * @return
	 */
	public String getXmlns() {
		return xmlns;
	}

	/**
	 * Optional String attribute. Specifies the URL to the XML schema that is used to validate the configuration file. The value for SharePoint Server search is "urn:Microsoft.Search.Query".
	 * @param xmlns
	 */
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	/**
	 * Query
	 * @return
	 */
	public Query getQuery() {
		return query;
	}

	/**
	 * Query
	 * @param query
	 */
	public void setQuery(Query query) {
		this.query = query;
	}

	
}
