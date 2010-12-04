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

public class SpProperties extends DataObject {
	private List<SpProperty> properyCollection = new ArrayList<SpProperty>();	
	
	public SpProperties() {
    }    

	public SpProperties(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SpProperties(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<SpProperty> properties = new ArrayList<SpProperty>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Property")) {
				SpProperty newProperty = new SpProperty(childElement);
				properties.add(newProperty);
			}
		}
		this.setProperyCollection(properties);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Properties>");
		for (SpProperty property : this.getProperyCollection())
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
	public List<SpProperty> getProperyCollection() {
		return properyCollection;
	}

	/**
	 *  Property Collection
	 * @param properyCollection
	 */
	public void setProperyCollection(List<SpProperty> properyCollection) {
		this.properyCollection = properyCollection;
	}	
	
}
