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


//<SortByProperties>
//<SortByProperty name="author" direction="Ascending"></SortByProperty>
//<SortByProperty name="topic" direction="Ascending"></SortByProperty>
//</SortByProperties>


//ATTRIBUTES:
//---------

//Child Elements
//---------
//SortByProperty

public class SpSortByProperties extends DataObject {
	private List<SpSortByProperty> properyCollection = new ArrayList<SpSortByProperty>();	
	
	public SpSortByProperties() {
    }    

	public SpSortByProperties(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SpSortByProperties(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<SpSortByProperty> properties = new ArrayList<SpSortByProperty>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("SortByProperty")) {
				SpSortByProperty newProperty = new SpSortByProperty(childElement);
				properties.add(newProperty);
			}
		}
		this.setProperyCollection(properties);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<SpSortByProperty>");
		for (SpSortByProperty property : this.getProperyCollection())
		{
			stringWriter.append(property.GetAsXmlString());
		}
		stringWriter.append("</SpSortByProperty>");
		return stringWriter.toString();
	}

	/**
	 * Property Collection
	 * @return
	 */
	public List<SpSortByProperty> getProperyCollection() {
		return properyCollection;
	}

	/**
	 *  Property Collection
	 * @param properyCollection
	 */
	public void setProperyCollection(List<SpSortByProperty> properyCollection) {
		this.properyCollection = properyCollection;
	}	
	
}
