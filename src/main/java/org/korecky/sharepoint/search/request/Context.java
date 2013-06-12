package org.korecky.sharepoint.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import org.korecky.sharepoint.SpObject;
import org.korecky.sharepoint.SPField;
import org.korecky.sharepoint.Support;

//<Context>
//<QueryText type={STRING|MSSQLFT|FQL} language=xml:lang>searchQuery</QueryText>
//</Context>





//ATTRIBUTES:
//---------

// Child Elements
//---------
//QueryText

public class Context extends SpObject {		
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
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @param xmlElement
	 * @throws ParseException
	 */
	public Context(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
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
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Context>");
		if (this.getQueryText() != null)
			stringWriter.append(this.getQueryText().getAsXmlString());
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
