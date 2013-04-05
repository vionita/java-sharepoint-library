package org.korecky.sharepoint.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import org.korecky.sharepoint.SpObject;
import org.korecky.sharepoint.Support;


//<Refiners>
//<Refiner>
//refinerSpecification
//</Refiner>
//</Refiners>


//ATTRIBUTES:
//---------

//Child Elements
//---------
//Refiner

public class Refiners extends SpObject {
	private List<String> refinerCollection = new ArrayList<String>();	
	
	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of refiners to return in a query result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 */
	public Refiners() {
    }    

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of refiners to return in a query result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public Refiners(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of refiners to return in a query result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlElement
	 * @throws ParseException
	 */
	public Refiners(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}	

	@Override
	public void parse(OMElement xmlElement) throws ParseException {		
		List<String> refiners = new ArrayList<String>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Refiner")) {
				String newRefiner = childElement.getText();
				refiners.add(newRefiner);
			}
		}
		this.setRefinerCollection(refiners);		
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Refiners>");
		for (String refiner : this.getRefinerCollection())
		{
			stringWriter.append("<Refiner>");
			stringWriter.append(refiner);
			stringWriter.append("</Refiner>");
		}
		stringWriter.append("</Refiners>");
		return stringWriter.toString();
	}

	/**
	 * Refiner collection
	 * @return
	 */
	public List<String> getRefinerCollection() {
		return refinerCollection;
	}

	/**
	 * Refiner collection
	 * @param refinerCollection
	 */
	public void setRefinerCollection(List<String> refinerCollection) {
		this.refinerCollection = refinerCollection;
	}

	
	
}
