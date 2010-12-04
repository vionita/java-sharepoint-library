package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

// EXAMPLE
//<SortByProperty name="author" direction="Ascending"></SortByProperty>

// SCHEMA
//<SortByProperty
//name=managedProperty 
//direction={Ascending|Descending}>
//</SortByProperty>

//ATTRIBUTES:
//---------
// name
//The name of the managed property to sort on.
//The following special conditions apply to FAST Search Server 2010 for SharePoint only:
//    - The name attribute may contain the name of a rank profile instead of a managed property. In this case the result set is sorted by Rank, but using the non-default rank profile specified by name. For more information, see Sort by Rank.
//    - The name attribute may contain a sort formula specification. In this case the result set is sorted based on the specified formula. For more information about the syntax, see Sort by Formula. 
//    
// direction
//Specifies the direction (ascending or descending) to sort the results.
//	- Ascending Sorting is based on ascending value
//    - Descending Sorting is based on descending value
//Note:
//This attribute is not used when specifying a rank profile name in the name attribute (rank sorting is always descending). This applies to FAST Search Server 2010 for SharePoint only.
//The default value is Descending.

public class SortByProperty extends DataObject {
	enum DirectionEnum {
		Ascending, Descending
	}

	// name
	private String name = null;
	// value
	private DirectionEnum direction = null;

	public SortByProperty() {
	}

	public SortByProperty(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SortByProperty(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("name"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setName(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("direction"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDirection(DirectionEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<SortByProperty ");
		stringWriter.append("name=\"" + this.getName() + "\"");
		stringWriter.append("direction=\"" + String.valueOf(this.getName())
				+ "\"");
		stringWriter.append(">");
		stringWriter.append("</SortByProperty>");

		return stringWriter.toString();
	}

	/**
	 * Name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Direction
	 * 
	 * @return
	 */
	public DirectionEnum getDirection() {
		return direction;
	}

	/**
	 * Direction
	 * 
	 * @param direction
	 */
	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}
}
