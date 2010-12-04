package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.SpField;
import com.google.code.sharepoint.data.Support;

//<Range>
//<StartAt></StartAt>
//<Count></Count>
//</Range>






//ATTRIBUTES:
//---------

// Child Elements
//---------
//StartAt
//Count

public class SpRange extends DataObject {		
	private Integer startAt = null;
	private Integer count = null;

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 */
	public SpRange() {
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public SpRange(String xmlString) throws XMLStreamException,
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
	public SpRange(OMElement xmlElement) throws ParseException {
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
		stringWriter.append("</Range>");
		return stringWriter.toString();		
	}

	/**
	 * Specifies what result to return as the initial result in the response from the Query Web service.
	 * @return
	 */
	public Integer getStartAt() {
		return startAt;
	}

	/**
	 * Specifies what result to return as the initial result in the response from the Query Web service.
	 * @param startAt
	 */
	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

	/**
	 * Specifies the maximum number of results to return in the response from the Query Web service. For more information about the Query Web service
	 * @return
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Specifies the maximum number of results to return in the response from the Query Web service. For more information about the Query Web service
	 * @param count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

		
}
