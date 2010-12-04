package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<Query>
//<QueryId />
//<Context>
//    <QueryText />
//</Context>
//<Range>
//    <StartAt />
//    <Count />
//</Range>
//<Properties>
//    <Property />
//</Properties>
//<SortByProperties>
//    <SortByProperty />
//</SortByProperties>
//<ImplicitAndBehavior />
//<RelevanceModel />
//<EnableStemming />
//<TrimDuplicates />
//<IncludeSpecialTermResults />
//<PreQuerySuggestions />
//<HighlightQuerySuggestions />
//<CapitalizeFirstLetters />
//<ResultProvider />
//<ResubmitFlags>
//    <ResubmitFlag />
//</ResubmitFlags>
//<EnableSpellcheck />
//<UserContext>
//    <UserContextData />
//</UserContext>
//<FindSimilar>
//    <SimilarTo />
//    <SimilarType />
//    <SortSimilar />
//</FindSimilar>
//<IncludeRefinementResults>
//    <Refiners>
//       <Refiner />
//    </Refiners>
//    <MaxShallowRefinementHits />
//</IncludeRefinementResults>
//<RefinementFilters>
//    <RefinementFilter />
//</RefinementFilters>
//<IgnoreAllNoiseQuery />
//<IncludeRelevantResults />
//<IncludeHighConfidenceResults />
//</Query>



//ATTRIBUTES:
//---------

// Child Elements
//---------
//QueryId
//Context
//Range
//Properties
//SortByProperties
//ImplicitAndBehavior
//RelevanceModel
//EnableStemming
//TrimDuplicates
//IncludeSpecialTermResults
//PreQuerySuggestions
//HighlightQuerySuggestions
//CapitalizeFirstLetters
//ResultProvider
//ResubmitFlags
//EnableSpellcheck
//UserContext
//FindSimilar
//IncludeRefinementResults
//RefinementFilters
//IgnoreAllNoiseQuery
//IncludeRelevantResults
//IncludeHighConfidenceResults 

public class SpQuery extends DataObject {		
	/** A GUID that uniquely identifies a search query request to the Query Web service */
	private String queryID = null;
	/** Specifies the parent element for the search query issued to the Query Web service */
	private SpContext context = null;
	/** Contains information about the range of the query, including the size and the number of results requested from the Query Web service */
	private SpRange range = null;
	/** Contains the managed properties to include in the search results that are returned by the Query Web service */
	private SpProperties properties = null;
	/** Contains information for sorting the search results returned by the Query Web service */
	private SpSortByProperties sortByProperties = null;
	/** Specifies whether there is a default AND between terms in the search query request to the Query Web service */
	private Boolean implicitAndBehavior = null;	
	/** Specifies the unique identifier of the ranking model to use when processing the request to the Query Web service */
	private String relevanceModel = null;
	/** Specifies whether inflectional forms of the search terms are used when processing the request to the Query Web service */
	private Boolean enableStemming = null;	
	/**
	 * Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID).
	 */
	private SpTrimDuplicates trimDuplicates = null;
	

	public SpQuery() {
	}

	public SpQuery(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public SpQuery(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("QueryId")) {
				this.setQueryID(childElement.getText());
			}
			if (childElement.getQName().getLocalPart().equals("Context")) {
				this.setContext(new SpContext(childElement));
			}		
			if (childElement.getQName().getLocalPart().equals("Range")) {
				this.setRange(new SpRange(childElement));
			}				
			if (childElement.getQName().getLocalPart().equals("Properties")) {
				this.setProperties(new SpProperties(childElement));
			}
			if (childElement.getQName().getLocalPart().equals("SortByProperties")) {
				this.setSortByProperties(new SpSortByProperties(childElement));
			}
			if (childElement.getQName().getLocalPart().equals("ImplicitAndBehavior")) {
				this.setImplicitAndBehavior(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("RelevanceModel")) {
				this.setRelevanceModel(childElement.getText());
			}
			if (childElement.getQName().getLocalPart().equals("EnableStemming")) {
				this.setEnableStemming(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("Properties")) {
				this.setTrimDuplicates(new SpTrimDuplicates(childElement));
			}
		}
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Query>");
		
		// QueryId
		if ((this.getQueryID() != null) && (this.getQueryID().length() > 0))
		{
			stringWriter.append("<QueryId>");
			stringWriter.append(this.getQueryID());
			stringWriter.append("</QueryId>");
		}		
		// Context
		if (this.getContext() != null)
			stringWriter.append(this.getContext().GetAsXmlString());		
		// Range
		if (this.getRange() != null)
			stringWriter.append(this.getRange().GetAsXmlString());
		// Properties
		if (this.getProperties() != null)
			stringWriter.append(this.getProperties().GetAsXmlString());
		// SortByProperties
		if (this.getSortByProperties() != null)
			stringWriter.append(this.getSortByProperties().GetAsXmlString());
		// ImplicitAndBehavior
		if (this.getImplicitAndBehavior() != null)
		{
			stringWriter.append("<ImplicitAndBehavior>");
			stringWriter.append(String.valueOf(this.getImplicitAndBehavior()));
			stringWriter.append("</ImplicitAndBehavior>");
		}
		// RelevanceModel
		if ((this.getRelevanceModel() != null) && (this.getRelevanceModel().length() > 0))
		{
			stringWriter.append("<RelevanceModel>");
			stringWriter.append(this.getRelevanceModel());
			stringWriter.append("</RelevanceModel>");
		}	
		// EnableStemming
		if (this.getEnableStemming() != null)
		{
			stringWriter.append("<EnableStemming>");
			stringWriter.append(String.valueOf(this.getEnableStemming()));
			stringWriter.append("</EnableStemming>");
		}
		// TrimDuplicates
		if (this.getTrimDuplicates() != null)
			stringWriter.append(this.getTrimDuplicates().GetAsXmlString());
		
		stringWriter.append("</Query>");

		return stringWriter.toString();
	}

	/**
	 * A GUID that uniquely identifies a search query request to the Query Web service
	 * @return
	 */
	public String getQueryID() {
		return queryID;
	}

	/**
	 * A GUID that uniquely identifies a search query request to the Query Web service
	 * @param queryID
	 */
	public void setQueryID(String queryID) {
		this.queryID = queryID;
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @return
	 */
	public SpContext getContext() {
		return context;
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @param context
	 */
	public void setContext(SpContext context) {
		this.context = context;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @return
	 */
	public SpRange getRange() {
		return range;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param range
	 */
	public void setRange(SpRange range) {
		this.range = range;
	}

	/**
	 * Contains the managed properties to include in the search results that are returned by the Query Web service
	 * @return
	 */
	public SpProperties getProperties() {
		return properties;
	}

	/**
	 * Contains the managed properties to include in the search results that are returned by the Query Web service
	 * @param properties
	 */
	public void setProperties(SpProperties properties) {
		this.properties = properties;
	}

	/**
	 * Contains information for sorting the search results returned by the Query Web service
	 * @return
	 */
	public SpSortByProperties getSortByProperties() {
		return sortByProperties;
	}

	/**
	 * Contains information for sorting the search results returned by the Query Web service
	 * @param sortByProperties
	 */
	public void setSortByProperties(SpSortByProperties sortByProperties) {
		this.sortByProperties = sortByProperties;
	}

	/**
	 * Specifies whether there is a default AND between terms in the search query request to the Query Web service
	 * @return
	 */
	public Boolean getImplicitAndBehavior() {
		return implicitAndBehavior;
	}

	/**
	 * Specifies whether there is a default AND between terms in the search query request to the Query Web service
	 * @param implicitAndBehavior
	 */
	public void setImplicitAndBehavior(Boolean implicitAndBehavior) {
		this.implicitAndBehavior = implicitAndBehavior;
	}

	/**
	 * Specifies the unique identifier of the ranking model to use when processing the request to the Query Web service
	 * @return
	 */
	public String getRelevanceModel() {
		return relevanceModel;
	}

	/**
	 * Specifies the unique identifier of the ranking model to use when processing the request to the Query Web service
	 * @param relevanceModel
	 */
	public void setRelevanceModel(String relevanceModel) {
		this.relevanceModel = relevanceModel;
	}

	/**
	 * Specifies whether inflectional forms of the search terms are used when processing the request to the Query Web service
	 * @return
	 */
	public Boolean getEnableStemming() {
		return enableStemming;
	}

	/**
	 * Specifies whether inflectional forms of the search terms are used when processing the request to the Query Web service
	 * @param enableStemming
	 */
	public void setEnableStemming(Boolean enableStemming) {
		this.enableStemming = enableStemming;
	}	

	/**
	 * Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID).
	 * @return
	 */
	public SpTrimDuplicates getTrimDuplicates() {
		return trimDuplicates;
	}

	/**
	 * Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID). 
	 * @param rimDuplicates
	 */
	public void setTrimDuplicates(SpTrimDuplicates trimDuplicates) {
		this.trimDuplicates = trimDuplicates;
	}
	
	
}
