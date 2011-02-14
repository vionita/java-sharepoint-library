package com.google.code.sharepoint.data.search.response;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;
import com.google.code.sharepoint.data.search.request.Query;

//<ResponsePacket>
//	<Response>
//	</Response>
//</ResponsePacket>



//ATTRIBUTES:
//---------

// Child Elements
//---------
// Response

public class ResponsePacket extends DataObject {		
	/** Contains all the child elements for the response from the Query Web service. */
	private Response response = null;

	/**
	 * Contains all the child elements for the response from the Query Web service.
	 */
	public ResponsePacket() {
	}

	/**
	 * Contains all the child elements for the response from the Query Web service.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public ResponsePacket(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * Contains all the child elements for the response from the Query Web service.
	 * @param xmlElement
	 * @throws ParseException
	 * @throws XMLStreamException 
	 */
	public ResponsePacket(OMElement xmlElement) throws ParseException, XMLStreamException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException, XMLStreamException {		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Response")) {
				this.setResponse(new Response(childElement));
			}
		}
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<ResponsePacket>");
		// Response
		if (this.getResponse() != null)
			stringWriter.append(this.getResponse().getAsXmlString());
			
		stringWriter.append("</ResponsePacket>");

		return stringWriter.toString();
	}

	/**
	 * Contains all the child elements for the response from the Query Web service.
	 * @return
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * Contains all the child elements for the response from the Query Web service.
	 * @param response
	 */
	public void setResponse(Response response) {
		this.response = response;
	}
}
