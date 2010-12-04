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


//<ResubmitFlags
//<ResubmitFlag value={NoResubmit|
//        EnableSpellcheckOnResubmit|
//        EnableSpellcheckSuggestOnResubmit|
//        EnableStemmingOnResubmit|
//        AddSynonymsAutomatically}>
//</ResubmitFlag>
//</ResubmitFlags> 




//ATTRIBUTES:
//---------

//Child Elements
//---------
//Property

public class ResubmitFlags extends DataObject {
	private List<ResubmitFlag> resubmitFlagCollection = new ArrayList<ResubmitFlag>();	
	
	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies the criteria for automatically resubmitting a query that yielded no results.
	 */
	public ResubmitFlags() {
    }    

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies the criteria for automatically resubmitting a query that yielded no results.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public ResubmitFlags(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies the criteria for automatically resubmitting a query that yielded no results.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public ResubmitFlags(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}	

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {		
		List<ResubmitFlag> resubmitFlags = new ArrayList<ResubmitFlag>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("ResubmitFlag")) {
				ResubmitFlag newResubmitFlag = new ResubmitFlag(childElement);
				resubmitFlags.add(newResubmitFlag);
			}
		}
		this.setResubmitFlags(resubmitFlags);		
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<ResubmitFlags>");
		for (ResubmitFlag resubmitFlag : this.getResubmitFlags())
		{
			stringWriter.append(resubmitFlag.GetAsXmlString());
		}
		stringWriter.append("</ResubmitFlags>");
		return stringWriter.toString();
	}	

	/**
	 * ResubmitFlag Collection
	 * @return
	 */
	public List<ResubmitFlag> getResubmitFlags() {
		return resubmitFlagCollection;
	}

	/**
	 * ResubmitFlag Collection
	 * @param resubmitFlagCollection
	 */
	public void setResubmitFlags(List<ResubmitFlag> resubmitFlagCollection) {
		this.resubmitFlagCollection = resubmitFlagCollection;
	}	
	
	
}
