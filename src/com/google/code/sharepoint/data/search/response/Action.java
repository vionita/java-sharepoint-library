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
import com.google.code.sharepoint.data.Support;

//<Action>
//<LinkUrl fileExt=FileType size=Size>Url</LinkUrl>
//</Action>


//ATTRIBUTES:
//---------

//CHILD ELEMENTS:
//---------
//LinkUrl

public class Action extends DataObject {
	/** Contains the value of the Url managed property for an individual result returned in the response. */
	private LinkUrl linkUrl = null;
	
	/**
	 * Contains the URL and file type information for an individual result returned in the response.
	 */
	public Action() {
	}

	/**
	 * Contains the URL and file type information for an individual result returned in the response.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public Action(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * Contains the URL and file type information for an individual result returned in the response.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public Action(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("LinkUrl"))
			{
				this.setLinkUrl(new LinkUrl(childElement));
			}
		}	
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		if (getLinkUrl() != null)
		{
			stringWriter.append("<Action>");
			stringWriter.append(this.getLinkUrl().GetAsXmlString());
			stringWriter.append("</Action>");
		}
		return stringWriter.toString();
	}

	/**
	 * Contains the value of the Url managed property for an individual result returned in the response.
	 * @return
	 */
	public LinkUrl getLinkUrl() {
		return linkUrl;
	}

	/**
	 * Contains the value of the Url managed property for an individual result returned in the response.
	 * @param linkUrl
	 */
	public void setLinkUrl(LinkUrl linkUrl) {
		this.linkUrl = linkUrl;
	}

	
}
