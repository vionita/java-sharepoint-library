package com.google.code.sharepoint.data;

import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.Support;

public abstract class DataObject implements DataObjectInterface {
	
	public void Parse(String xmlString) throws ParseException, XMLStreamException {
		Parse(Support.StringToOmElement(xmlString));
		
	}
	
	public OMElement GetAsOMElement() throws XMLStreamException {		
		return Support.StringToOmElement(GetAsXmlString());
	}

}
