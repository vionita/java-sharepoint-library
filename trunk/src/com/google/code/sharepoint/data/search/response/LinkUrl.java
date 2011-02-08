package com.google.code.sharepoint.data.search.response;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<LinkUrl fileExt=FileType size=Size>Url</LinkUrl>




//ATTRIBUTES:
//---------
// fileExt
//Contains the value of the FileType managed property for the result.
//
//size
//Contains the value of the Size managed property for the result.


//CHILD ELEMENTS:
//---------

public class LinkUrl extends DataObject {
	/** Contains the value of the FileType managed property for the result. */
	private String fileExt = null;
	/** Contains the value of the Size managed property for the result. */
	private Integer size = null;
	/** Link url */
	private String url = null;
	
	/**
	 * Contains the value of the Url managed property for an individual result returned in the response.
	 */
	public LinkUrl() {
	}

	/**
	 * Contains the value of the Url managed property for an individual result returned in the response.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public LinkUrl(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * Contains the value of the Url managed property for an individual result returned in the response.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public LinkUrl(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"fileExt"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFileExt(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"size"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSize(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		this.setUrl(xmlElement.getText());
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<LinkUrl ");
		
		if ((this.getFileExt() != null) && (this.getFileExt().length() > 0))
			stringWriter.append("fileExt=\"" + this.getFileExt() + "\"");
		
		if (this.getSize() != null)
			stringWriter.append("size=\"" + String.valueOf(this.getSize()) + "\"");

		stringWriter.append(">");
		stringWriter.append(this.getUrl());
		stringWriter.append("</LinkUrl>");

		return stringWriter.toString();
	}

	/**
	 * Contains the value of the FileType managed property for the result.
	 * @return
	 */
	public String getFileExt() {
		return fileExt;
	}

	/**
	 * Contains the value of the FileType managed property for the result.
	 * @param fileExt
	 */
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

	/**
	 * Contains the value of the Size managed property for the result.
	 * @return
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * Contains the value of the Size managed property for the result.
	 * @param size
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * Link url
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Link url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
