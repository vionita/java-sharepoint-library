package org.korecky.sharepoint;

import org.korecky.sharepoint.SPField;
import org.korecky.sharepoint.SpObject;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

public class SPFields extends SpObject {
	private List<SPField> fieldCollection = new ArrayList<SPField>();

	/**
	 * @return the feildCollection
	 */
	public List<SPField> getFieldCollection() {
		return fieldCollection;
	}
	
	public SPFields() {
    }    

	public SPFields(final String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	public SPFields(final OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}	

	@Override
	public void parse(final OMElement xmlElement) throws ParseException {
		final List<SPField> fields = new ArrayList<SPField>();
		
		final Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			final OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Field")) {
				final SPField newField = new SPField(childElement);
				fields.add(newField);
			}
		}
		this.setFieldCollection(fields);		
	}

	@Override
	public String getAsXmlString() {
		final StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Fields>");
		for (final SPField field : this.getFieldCollection()) {
			stringWriter.append(field.getAsXmlString());
		}
		stringWriter.append("</Fields>");
		return stringWriter.toString();
	}	
	

	/**
	 * @param feildCollection the feildCollection to set
	 */
	public void setFieldCollection(final List<SPField> fieldCollection) {
		this.fieldCollection = fieldCollection;
	}	
}
