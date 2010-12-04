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

//<Context>
//<QueryText type={STRING|MSSQLFT|FQL} language=xml:lang>searchQuery</QueryText>
//</Context>





//ATTRIBUTES:
//---------

// Child Elements
//---------
//QueryText

public class Context extends DataObject {		
	private QueryText queryText = null;

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 */
	public Context() {
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public Context(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @param xmlElement
	 * @throws ParseException
	 */
	public Context(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("QueryText")) {
				this.setQueryText(new QueryText(childElement));
				break;
			}
		}		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Context>");
		if (this.getQueryText() != null)
			stringWriter.append(this.getQueryText().GetAsXmlString());
		stringWriter.append("</Context>");
		return stringWriter.toString();
	}

	/**
	 * QueryText
	 * @return
	 */
	public QueryText getQueryText() {
		return queryText;
	}

	/**
	 * QueryText
	 * @param queryText
	 */
	public void setQueryText(QueryText queryText) {
		this.queryText = queryText;
	}

	
}
