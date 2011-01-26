package com.google.code.sharepoint.data.search.response;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.SpField;
import com.google.code.sharepoint.data.Support;

//<Range>
//<StartAt>…</StartAt>
//<Count>…</Count>
//<TotalAvailable>…</TotalAvailable>
//<Results></Results>
//</Range>







//ATTRIBUTES:
//---------

// Child Elements
//---------
//StartAt
//Count
//TotalAvailable
//Results

public class Range extends DataObject {		
	/** Specifies which result is the initial result in the response. */
	private Integer startAt = null;
	/** Contains number of results included in the response. */
	private Integer count = null;
	/** Contains the total number of relevant results returned in the response. */
	private Integer totalAvailable = null;
	/** The Results element contains the individual search results returned in the response. */
	private List<Document> results = null;

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 */
	public Range() {
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public Range(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param xmlElement
	 * @throws ParseException
	 */
	public Range(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("StartAt"))
				this.setStartAt(Integer.parseInt(childElement.getText()));
			if (childElement.getQName().getLocalPart().equals("Count"))
				this.setCount(Integer.parseInt(childElement.getText()));
			if (childElement.getQName().getLocalPart().equals("TotalAvailable"))
				this.setTotalAvailable(Integer.parseInt(childElement.getText()));
			if (childElement.getQName().getLocalPart().equals("Results"))
			{
				List<Document> documents = new ArrayList<Document>();
				Iterator resultsIterator = childElement.getChildElements();
				while (resultsIterator.hasNext()) {
					OMElement resultElement = (OMElement) resultsIterator.next();					
					if (resultElement.getQName().getLocalPart().equals("Document"))
						documents.add(new Document(resultElement));
				}	
				this.setResults(documents);
			}
		}		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Range>");
		if (this.getStartAt() != null)
		{
			stringWriter.append("<StartAt>");
			stringWriter.append(String.valueOf(this.getStartAt()));
			stringWriter.append("</StartAt>");
		}
		if (this.getCount() != null)
		{
			stringWriter.append("<Count>");
			stringWriter.append(String.valueOf(this.getCount()));
			stringWriter.append("</Count>");
		}
		if (this.getTotalAvailable() != null)
		{
			stringWriter.append("<TotalAvailable>");
			stringWriter.append(String.valueOf(this.getTotalAvailable()));
			stringWriter.append("</TotalAvailable>");
		}
		if (this.getResults() != null)
		{
			stringWriter.append("<Results>");
			for (Document document : this.getResults())
				stringWriter.append(document.GetAsXmlString());
			stringWriter.append("</Results>");
		}
		stringWriter.append("</Range>");
		return stringWriter.toString();		
	}

	/**
	 * Specifies which result is the initial result in the response.
	 * @return
	 */
	public Integer getStartAt() {
		return startAt;
	}

	/**
	 * Specifies which result is the initial result in the response.
	 * @param startAt
	 */
	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

	/**
	 * Contains number of results included in the response.
	 * @return
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Contains number of results included in the response.
	 * @param count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Contains the total number of relevant results returned in the response.
	 * @return
	 */
	public Integer getTotalAvailable() {
		return totalAvailable;
	}

	/**
	 * Contains the total number of relevant results returned in the response.
	 * @param totalAvailable
	 */
	public void setTotalAvailable(Integer totalAvailable) {
		this.totalAvailable = totalAvailable;
	}

	/**
	 * The Results element contains the individual search results returned in the response.
	 * @return
	 */
	public List<Document> getResults() {
		return results;
	}

	/**
	 * The Results element contains the individual search results returned in the response.
	 * @param results
	 */
	public void setResults(List<Document> results) {
		this.results = results;
	}
	
	
}
