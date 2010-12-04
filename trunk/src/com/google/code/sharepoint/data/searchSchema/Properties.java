package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;


//<Properties>
//<Property name=managedPropertyName></Property>
//</Properties>



//ATTRIBUTES:
//---------

//Child Elements
//---------
//Property

public class Properties extends DataObject {
	private List<Property> properyCollection = new ArrayList<Property>();	
	
	public Properties() {
    }    

	public Properties(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public Properties(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<Property> properties = new ArrayList<Property>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Property")) {
				Property newProperty = new Property(childElement);
				properties.add(newProperty);
			}
		}
		this.setProperyCollection(properties);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Properties>");
		for (Property property : this.getProperyCollection())
		{
			stringWriter.append(property.GetAsXmlString());
		}
		stringWriter.append("</Properties>");
		return stringWriter.toString();
	}

	/**
	 * Property Collection
	 * @return
	 */
	public List<Property> getProperyCollection() {
		return properyCollection;
	}

	/**
	 *  Property Collection
	 * @param properyCollection
	 */
	public void setProperyCollection(List<Property> properyCollection) {
		this.properyCollection = properyCollection;
	}	
	
}
