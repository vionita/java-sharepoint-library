package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

public class SpFields extends DataObject {
	private List<SpField> fieldCollection = new ArrayList<SpField>();

	/**
	 * @return the feildCollection
	 */
	public List<SpField> getFieldCollection() {
		return fieldCollection;
	}
	
	public SpFields() {
    }    

	public SpFields(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SpFields(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyymmdd hh:MM:ss");
		String tempAttributeValue = null;

		List<SpField> fields = new ArrayList<SpField>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Field")) {
				SpField newField = new SpField(childElement);
				fields.add(newField);
			}
		}
		this.setFieldCollection(fields);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Fields>");
		for (SpField field : this.getFieldCollection())
		{
			stringWriter.append(field.GetAsXmlString());
		}
		stringWriter.append("</Fields>");
		return stringWriter.toString();
	}	
	

	/**
	 * @param feildCollection the feildCollection to set
	 */
	public void setFieldCollection(List<SpField> fieldCollection) {
		this.fieldCollection = fieldCollection;
	}	
}
