package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;


//<z:row ows_Title="aaaa" ....  /> 

public class SpListItem extends DataObject {
	Hashtable fieldValues = null;
	
	public SpListItem() {
	}

	public SpListItem(String xmlString) throws XMLStreamException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			try {
				Parse(xmlElement);
			} catch (ParseException ex) {
				Logger.getLogger(SpList.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	public SpListItem(OMElement xmlElement) {
		try {
			Parse(xmlElement);
		} catch (ParseException ex) {
			Logger.getLogger(SpList.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}	
	
	@Override
	public void Parse(OMElement xmlElement) throws ParseException {			
		Iterator children = xmlElement.getAllAttributes();
		fieldValues = new Hashtable();

		while (children.hasNext()) {
			OMAttribute attribute = (OMAttribute) children.next();
			if (attribute != null)
				fieldValues.put(attribute.getLocalName(), attribute.getAttributeValue());
		}
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		
		if (this.getFieldValues().size() > 0) {		
			stringWriter.append("<row ");
			 Enumeration keys = this.getFieldValues().keys();
			 while(keys.hasMoreElements() ){
				 Object key = keys.nextElement();
				 Object value = this.getFieldValues().get(key);				 	
				 stringWriter.append(String.valueOf(key) + "=\""+ String.valueOf(value) + "\" ");
			}				
			stringWriter.append("/>");						
		}

		return stringWriter.toString();
	}

	/**
	 * @return the fieldValues
	 */
	public Hashtable getFieldValues() {
		return fieldValues;
	}

	/**
	 * @param fieldValues the fieldValues to set
	 */
	public void setFieldValues(Hashtable fieldValues) {
		this.fieldValues = fieldValues;
	}
}
