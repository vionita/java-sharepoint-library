package com.google.code.sharepoint.data.search.response;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;
import com.google.code.sharepoint.data.search.request.Range;

//<Response>
//</Response>




//ATTRIBUTES:
//---------

// Child Elements
//---------
//QueryID
//Copyright
//OriginatorContext
//RequeryContext
//Range
//Status
//DebugErrorMessage 

public class Response extends DataObject {		
	/** A GUID that uniquely identifies a search query request to the Query Web service */
	private String queryID = null;	
	/** Contains information about the range of the query, including the size and the number of results requested from the Query Web service */
	private Range range = null;
	/** Contains the copyright information for Search in Windows SharePoint Services. */
	private String copyright = null;
	/** Contains the value specified in the Microsoft.Search.QueryOriginatorContext (http://msdn.microsoft.com/en-us/library/ms477196%28v=office.12%29.aspx) element by the client, if this element was included in the search query request from the client. */
	private String originatorContext = null;	
	/** Contains context information for the client that the client should include on subsequent requests. */
	private String requeryContext = null;
	/** Contains a code indicating whether the request was successful or if an error occurred. */
	private String status = null;
	/** Contains the error message if an error occurred with the query request. */
	private String debugErrorMessage = null;
	
	
	
	public Response() {
	}

	public Response(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public Response(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("QueryId")) {
				this.setQueryID(childElement.getText());
			}
			if (childElement.getQName().getLocalPart().equals("Range")) {
				this.setRange(new Range(childElement));
			}		
			if (childElement.getQName().getLocalPart().equals("Copyright")) {
				this.setCopyright(String.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("OriginatorContext")) {
				this.setOriginatorContext(String.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("RequeryContext")) {
				this.setRequeryContext(String.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("Status")) {
				this.setStatus(String.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("DebugErrorMessage")) {
				this.setDebugErrorMessage(String.valueOf(childElement.getText()));
			}
		}
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Response>");
		
		// QueryId
		if ((this.getQueryID() != null) && (this.getQueryID().length() > 0))
		{
			stringWriter.append("<QueryId>");
			stringWriter.append(this.getQueryID());
			stringWriter.append("</QueryId>");
		}				
		// Range
		if (this.getRange() != null)
			stringWriter.append(this.getRange().GetAsXmlString());
		// Copyright
		if ((this.getCopyright() != null) && (this.getCopyright().length() > 0))
		{
			stringWriter.append("<Copyright>");
			stringWriter.append(this.getCopyright());
			stringWriter.append("</Copyright>");
		}	
		// OriginatorContext
		if ((this.getOriginatorContext() != null) && (this.getOriginatorContext().length() > 0))
		{
			stringWriter.append("<OriginatorContext>");
			stringWriter.append(this.getOriginatorContext());
			stringWriter.append("</OriginatorContext>");
		}	
		// RequeryContext
		if ((this.getRequeryContext() != null) && (this.getRequeryContext().length() > 0))
		{
			stringWriter.append("<RequeryContext>");
			stringWriter.append(this.getRequeryContext());
			stringWriter.append("</RequeryContext>");
		}	
		// Status
		if ((this.getStatus() != null) && (this.getStatus().length() > 0))
		{
			stringWriter.append("<Status>");
			stringWriter.append(this.getStatus());
			stringWriter.append("</Status>");
		}	
		// DebugErrorMessage
		if ((this.getDebugErrorMessage() != null) && (this.getDebugErrorMessage().length() > 0))
		{
			stringWriter.append("<DebugErrorMessage>");
			stringWriter.append(this.getDebugErrorMessage());
			stringWriter.append("</DebugErrorMessage>");
		}
		
		stringWriter.append("</Response>");
		return stringWriter.toString();
	}

	/**
	 * A GUID that uniquely identifies a search query request to the Query Web service
	 * @return
	 */
	public String getQueryID() {
		return queryID;
	}

	/**
	 * A GUID that uniquely identifies a search query request to the Query Web service
	 * @param queryID
	 */
	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @return
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param range
	 */
	public void setRange(Range range) {
		this.range = range;
	}

	/**
	 * Contains the copyright information for Search in Windows SharePoint Services.
	 * @return
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * Contains the copyright information for Search in Windows SharePoint Services.
	 * @param copyright
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	/**
	 * ontains the value specified in the Microsoft.Search.QueryOriginatorContext (http://msdn.microsoft.com/en-us/library/ms477196%28v=office.12%29.aspx) element by the client, if this element was included in the search query request from the client.
	 * @return
	 */
	public String getOriginatorContext() {
		return originatorContext;
	}

	/**
	 * ontains the value specified in the Microsoft.Search.QueryOriginatorContext (http://msdn.microsoft.com/en-us/library/ms477196%28v=office.12%29.aspx) element by the client, if this element was included in the search query request from the client.
	 * @param originatorContext
	 */
	public void setOriginatorContext(String originatorContext) {
		this.originatorContext = originatorContext;
	}

	/**
	 * Contains context information for the client that the client should include on subsequent requests.
	 * @return
	 */
	public String getRequeryContext() {
		return requeryContext;
	}

	/**
	 * Contains context information for the client that the client should include on subsequent requests.
	 * @param requeryContext
	 */
	public void setRequeryContext(String requeryContext) {
		this.requeryContext = requeryContext;
	}

	/**
	 * Contains a code indicating whether the request was successful or if an error occurred.
	 * @return
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Contains a code indicating whether the request was successful or if an error occurred.
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Contains the error message if an error occurred with the query request.
	 * @return
	 */
	public String getDebugErrorMessage() {
		return debugErrorMessage;
	}

	/**
	 * Contains the error message if an error occurred with the query request.
	 * @param debugErrorMessage
	 */
	public void setDebugErrorMessage(String debugErrorMessage) {
		this.debugErrorMessage = debugErrorMessage;
	}
}

