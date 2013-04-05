package org.korecky.sharepoint.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import org.korecky.sharepoint.SpObject;
import org.korecky.sharepoint.Support;

//<FindSimilar>
//<SimilarTo>
//similarityReference
//</similarTo>
//<SimilarType>
//FindSimilar|RefineSimilar|ExcludeSimilar
//</SimilarType>
//<SortSimilar>
//True|False
//</SortSimilar>
//</FindSimilar>

//ATTRIBUTES:
//---------


public class FindSimilar extends SpObject {	
	
	enum SimilarTypeEnum{	    
		/**
		 * The similarity vectors are added to the query by using an OR operator.
		 */
	      FindSimilar,  
	   /**
	    * The query will match if the original query conditions and the similarity vector conditions are met.
	    */
	      RefineSimilar,  
	    /**
	     * The query will match if the original query conditions are met, but not the similarity conditions.
	     */
	      ExcludeSimilar  
	}
	// SimilarTo
	private String similarTo = null;
	// SimilarTypeEnum
	private SimilarTypeEnum similarType = null;
	// SortSimilar
	private Boolean sortSimilar = null;
	
	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about how to search for similar items.
	 * The find similar features enable you to search for documents that are similar to already retrieved query results. The similarity evaluation is based on a statistical measure. 
	 */
	public FindSimilar() {
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about how to search for similar items.
	 * The find similar features enable you to search for documents that are similar to already retrieved query results. The similarity evaluation is based on a statistical measure.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public FindSimilar(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains information about how to search for similar items.
	 * The find similar features enable you to search for documents that are similar to already retrieved query results. The similarity evaluation is based on a statistical measure.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public FindSimilar(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();			
			if (childElement.getQName().getLocalPart().equals("SimilarTo")) {
				this.setSimilarTo(String.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("SimilarType")) {
				this.setSimilarType(SimilarTypeEnum.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("SortSimilar")) {
				this.setSortSimilar(Boolean.valueOf(childElement.getText()));
			}
		}
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();		
		stringWriter.append("<FindSimilar>");
		if ((this.getSimilarTo() != null) && (this.getSimilarTo().length() > 0))
		{
			stringWriter.append("<SimilarTo>");
			stringWriter.append(this.getSimilarTo());
			stringWriter.append("</SimilarTo>");
		}
		if (this.getSimilarType() != null)
		{
			stringWriter.append("<SimilarType>");
			stringWriter.append(String.valueOf(this.getSimilarType()));
			stringWriter.append("</SimilarType>");
		}
		if (this.getSortSimilar() != null)
		{
			stringWriter.append("<SortSimilar>");
			stringWriter.append(String.valueOf(this.getSortSimilar()));
			stringWriter.append("</SortSimilar>");
		}
		stringWriter.append("</FindSimilar>");
		

		return stringWriter.toString();
	}

	/**
	 * Similar to
	 * @return
	 */
	public String getSimilarTo() {
		return similarTo;
	}

	/**
	 * Similar to
	 * @param similarTo
	 */
	public void setSimilarTo(String similarTo) {
		this.similarTo = similarTo;
	}

	/**
	 * Similar type
	 * @return
	 */
	public SimilarTypeEnum getSimilarType() {
		return similarType;
	}

	/**
	 * Similar type
	 * @param similarType
	 */
	public void setSimilarType(SimilarTypeEnum similarType) {
		this.similarType = similarType;
	}

	/**
	 * Sort similar
	 * @return
	 */
	public Boolean getSortSimilar() {
		return sortSimilar;
	}

	/**
	 * Sort similar
	 * @param sortSimilar
	 */
	public void setSortSimilar(Boolean sortSimilar) {
		this.sortSimilar = sortSimilar;
	}

	
}
