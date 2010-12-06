package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.SpField;
import com.google.code.sharepoint.data.Support;

//<IncludeRefinementResults>
//<Refiners />
//<MaxShallowRefinementHits />
//</IncludeRefinementResults>


//ATTRIBUTES:
//---------

// Child Elements
//---------
//Refiners
//MaxShallowRefinementHits

public class IncludeRefinementResults extends DataObject {		
	private Refiners refiners = null;
	private Integer maxShallowRefinementHits = null;

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about the type of query refinement data to return in the result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 */
	public IncludeRefinementResults() {
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about the type of query refinement data to return in the result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public IncludeRefinementResults(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about the type of query refinement data to return in the result.
	 * For more information about query refinement, see Query Refinement: http://msdn.microsoft.com/en-us/library/ff394639.aspx
	 * @param xmlElement
	 * @throws ParseException
	 */
	public IncludeRefinementResults(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Refiners")) {
				this.setRefiners(new Refiners(childElement));
				break;
			}
			if (childElement.getQName().getLocalPart().equals("MaxShallowRefinementHits")) {
				this.setMaxShallowRefinementHits(Integer.valueOf(childElement.getText()));
				break;
			}
		}		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<IncludeRefinementResults>");
		if (this.getRefiners() != null)
			stringWriter.append(this.getRefiners().GetAsXmlString());
		if (this.getMaxShallowRefinementHits() != null)
		{
			stringWriter.append("<MaxShallowRefinementHits>");
			stringWriter.append(String.valueOf(this.getMaxShallowRefinementHits()));
			stringWriter.append("<MaxShallowRefinementHits>");
		}			
		stringWriter.append("</IncludeRefinementResults>");
		return stringWriter.toString();
	}

	public Refiners getRefiners() {
		return refiners;
	}

	public void setRefiners(Refiners refiners) {
		this.refiners = refiners;
	}

	public Integer getMaxShallowRefinementHits() {
		return maxShallowRefinementHits;
	}

	public void setMaxShallowRefinementHits(Integer maxShallowRefinementHits) {
		this.maxShallowRefinementHits = maxShallowRefinementHits;
	}

		
}
