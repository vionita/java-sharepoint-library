package com.google.code.sharepoint.data.search.request;

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

public class SortByProperties extends DataObject {
	private List<SortByProperty> properyCollection = new ArrayList<SortByProperty>();	
	
	public SortByProperties() {
    }    

	public SortByProperties(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SortByProperties(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<SortByProperty> properties = new ArrayList<SortByProperty>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("SortByProperty")) {
				SortByProperty newProperty = new SortByProperty(childElement);
				properties.add(newProperty);
			}
		}
		this.setProperyCollection(properties);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<SortByProperty>");
		for (SortByProperty property : this.getProperyCollection())
		{
			stringWriter.append(property.GetAsXmlString());
		}
		stringWriter.append("</SortByProperty>");
		return stringWriter.toString();
	}

	/**
	 * Property Collection
	 * @return
	 */
	public List<SortByProperty> getProperyCollection() {
		return properyCollection;
	}

	/**
	 *  Property Collection
	 * @param properyCollection
	 */
	public void setProperyCollection(List<SortByProperty> properyCollection) {
		this.properyCollection = properyCollection;
	}	
	
}
