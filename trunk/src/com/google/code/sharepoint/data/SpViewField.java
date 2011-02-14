package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<ViewFields>
//	<FieldRef Name="ID" />
//	<FieldRef Name="Title" />
//</ViewFields>


public class SpViewField extends DataObject {
	List<SpFieldRef> fieldRefCollection = new ArrayList<SpFieldRef>();
	
	public SpViewField() {
	}

	public SpViewField(String xmlString) throws XMLStreamException, ParseException {
		 OMElement xmlElement = null;
		 xmlElement = Support.stringToOmElement(xmlString);
		
		 if (xmlElement != null) {
			 parse(xmlElement);
		 }
	}

	public SpViewField(OMElement xmlElement) throws ParseException {
		 parse(xmlElement);
	}
	

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		List<SpFieldRef> fieldRefs = new ArrayList<SpFieldRef>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("FieldRef")) {
				SpFieldRef newFieldRef = new SpFieldRef(childElement);
				fieldRefs.add(newFieldRef);
			}
		}
		this.setFieldRefCollection(fieldRefs);	
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<ViewFields>");
		for (SpFieldRef fieldRef : this.getFieldRefCollection())
		{
			stringWriter.append(fieldRef.getAsXmlString());
		}
		stringWriter.append("</ViewFields>");
		return stringWriter.toString();
	}

	/**
	 * @return the fieldRefCollection
	 */
	public List<SpFieldRef> getFieldRefCollection() {
		return fieldRefCollection;
	}

	/**
	 * @param fieldRefCollection the fieldRefCollection to set
	 */
	public void setFieldRefCollection(List<SpFieldRef> fieldRefCollection) {
		this.fieldRefCollection = fieldRefCollection;
	}
	
	
}
