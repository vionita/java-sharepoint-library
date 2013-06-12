package org.korecky.sharepoint;

import org.korecky.sharepoint.SPFieldRef;
import org.korecky.sharepoint.SpObject;
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


public class SPViewField extends SpObject {
	List<SPFieldRef> fieldRefCollection = new ArrayList<SPFieldRef>();
	
	public SPViewField() {
	}

	public SPViewField(String xmlString) throws XMLStreamException, ParseException {
		 OMElement xmlElement = null;
		 xmlElement = Support.stringToOmElement(xmlString);
		
		 if (xmlElement != null) {
			 parse(xmlElement);
		 }
	}

	public SPViewField(OMElement xmlElement) throws ParseException {
		 parse(xmlElement);
	}
	

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		List<SPFieldRef> fieldRefs = new ArrayList<SPFieldRef>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("FieldRef")) {
				SPFieldRef newFieldRef = new SPFieldRef(childElement);
				fieldRefs.add(newFieldRef);
			}
		}
		this.setFieldRefCollection(fieldRefs);	
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<ViewFields>");
		for (SPFieldRef fieldRef : this.getFieldRefCollection())
		{
			stringWriter.append(fieldRef.getAsXmlString());
		}
		stringWriter.append("</ViewFields>");
		return stringWriter.toString();
	}

	/**
	 * @return the fieldRefCollection
	 */
	public List<SPFieldRef> getFieldRefCollection() {
		return fieldRefCollection;
	}

	/**
	 * @param fieldRefCollection the fieldRefCollection to set
	 */
	public void setFieldRefCollection(List<SPFieldRef> fieldRefCollection) {
		this.fieldRefCollection = fieldRefCollection;
	}
	
	
}
