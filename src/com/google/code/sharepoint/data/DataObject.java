package com.google.code.sharepoint.data;

import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.Support;

public abstract class DataObject implements DataObjectInterface {
	
	public void parse(String xmlString) throws ParseException, XMLStreamException {
		parse(Support.stringToOmElement(xmlString));
		
	}
	
	public OMElement getAsOMElement() throws XMLStreamException {		
		return Support.stringToOmElement(getAsXmlString());
	}

}
