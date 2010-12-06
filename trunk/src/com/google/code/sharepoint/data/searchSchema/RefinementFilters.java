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


//<RefinementFilters>
//<RefinementFilter>
//filterValue
//</RefinementFilter>
//</RefinementFilters>



//ATTRIBUTES:
//---------

//Child Elements
//---------
//RefinementFilter

public class RefinementFilters extends DataObject {
	private List<String> refinementFilterCollection = new ArrayList<String>();	
	
	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of query refinement filters used when issuing a refinement query.
	 * For more information about query refinement, see Query Refinement. http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 */
	public RefinementFilters() {
    }    

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of query refinement filters used when issuing a refinement query.
	 * For more information about query refinement, see Query Refinement. http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public RefinementFilters(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains the set of query refinement filters used when issuing a refinement query.
	 * For more information about query refinement, see Query Refinement. http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlElement
	 * @throws ParseException
	 */
	public RefinementFilters(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<String> refinementFilters = new ArrayList<String>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("RefinementFilter")) {
				String newRefiner = childElement.getText();
				refinementFilters.add(newRefiner);
			}
		}
		this.setRefinementFilterCollection(refinementFilters);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<RefinementFilters>");
		for (String refinementFilter : this.getRefinementFilterCollection())
		{
			stringWriter.append("<RefinementFilter>");
			stringWriter.append(refinementFilter);
			stringWriter.append("</RefinementFilter>");
		}
		stringWriter.append("</RefinementFilters>");
		return stringWriter.toString();
	}

	/**
	 * Refinement Filter Collection 
	 * @return
	 */
	public List<String> getRefinementFilterCollection() {
		return refinementFilterCollection;
	}

	/**
	 * Refinement Filter Collection 
	 * @param refinementFilterCollection
	 */
	public void setRefinementFilterCollection(
			List<String> refinementFilterCollection) {
		this.refinementFilterCollection = refinementFilterCollection;
	}

	
	
}
