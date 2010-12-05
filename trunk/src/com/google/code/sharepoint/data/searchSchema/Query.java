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

public class Query extends DataObject {		
	/** A GUID that uniquely identifies a search query request to the Query Web service */
	private String queryID = null;
	/** Specifies the parent element for the search query issued to the Query Web service */
	private Context context = null;
	/** Contains information about the range of the query, including the size and the number of results requested from the Query Web service */
	private Range range = null;
	/** Contains the managed properties to include in the search results that are returned by the Query Web service */
	private Properties properties = null;
	/** Contains information for sorting the search results returned by the Query Web service */
	private SortByProperties sortByProperties = null;
	/** Specifies whether there is a default AND between terms in the search query request to the Query Web service */
	private Boolean implicitAndBehavior = null;	
	/** Specifies the unique identifier of the ranking model to use when processing the request to the Query Web service */
	private String relevanceModel = null;
	/** Specifies whether inflectional forms of the search terms are used when processing the request to the Query Web service */
	private Boolean enableStemming = null;	
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID).
	 */
	private TrimDuplicates trimDuplicates = null;
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether special term results are included in the response returned by the Query Web service
  	 */
	private Boolean includeSpecialTermResults = null;
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether pre query suggestions are included in the response from the Query Web service
  	 */
	private Boolean preQuerySuggestions = null;
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether parts of the query suggestion that are returned by the Query Web service are highlighted
  	 */
	private Boolean highlightQuerySuggestions = null;
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether the first letter in the query suggestion that is returned by the Query Web service appears in uppercase letters
  	 */
	private Boolean capitalizeFirstLetters = null;
	/** <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the results provider for the Query Web service
  	 */
	private String resultProvider = null;
	/** <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the criteria for automatically resubmitting a query that yielded no results
  	 */
	private ResubmitFlags resubmitFlags = null;
	/** <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies how to apply spell correction of the query text when processing the request to the Query Web service
  	 */
	private Boolean enableSpellcheck = null;
	/** <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
  	 */
	private UserContext userContext = null;

	public Query() {
	}

	public Query(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	public Query(OMElement xmlElement) throws ParseException {
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
				this.setContext(new Context(childElement));
			}		
			if (childElement.getQName().getLocalPart().equals("Range")) {
				this.setRange(new Range(childElement));
			}				
			if (childElement.getQName().getLocalPart().equals("Properties")) {
				this.setProperties(new Properties(childElement));
			}
			if (childElement.getQName().getLocalPart().equals("SortByProperties")) {
				this.setSortByProperties(new SortByProperties(childElement));
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
			if (childElement.getQName().getLocalPart().equals("TrimDuplicates")) {
				this.setTrimDuplicates(new TrimDuplicates(childElement));
			}
			if (childElement.getQName().getLocalPart().equals("IncludeSpecialTermResults")) {
				this.setIncludeSpecialTermResults(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("PreQuerySuggestions")) {
				this.setPreQuerySuggestions(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("HighlightQuerySuggestions")) {
				this.setHighlightQuerySuggestions(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("CapitalizeFirstLetters")) {
				this.setCapitalizeFirstLetters(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("ResultProvider")) {
				this.setResultProvider(childElement.getText());
			}
			if (childElement.getQName().getLocalPart().equals("ResubmitFlags")) {
				this.setResubmitFlags(new ResubmitFlags(childElement));
			}
			if (childElement.getQName().getLocalPart().equals("EnableSpellcheck")) {
				this.setEnableSpellcheck(Boolean.valueOf(childElement.getText()));
			}
			if (childElement.getQName().getLocalPart().equals("UserContext")) {
				this.setUserContext(new UserContext(childElement));
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
		// IncludeSpecialTermResults
		if (this.getIncludeSpecialTermResults() != null)
		{
			stringWriter.append("<IncludeSpecialTermResults>");
			stringWriter.append(String.valueOf(this.getIncludeSpecialTermResults()));
			stringWriter.append("</IncludeSpecialTermResults>");
		}
		// PreQuerySuggestions
		if (this.getPreQuerySuggestions() != null)
		{
			stringWriter.append("<PreQuerySuggestions>");
			stringWriter.append(String.valueOf(this.getPreQuerySuggestions()));
			stringWriter.append("</PreQuerySuggestions>");
		}
		// HighlightQuerySuggestions
		if (this.getHighlightQuerySuggestions() != null)
		{
			stringWriter.append("<HighlightQuerySuggestions>");
			stringWriter.append(String.valueOf(this.getHighlightQuerySuggestions()));
			stringWriter.append("</HighlightQuerySuggestions>");
		}		
		// CapitalizeFirstLetters
		if (this.getCapitalizeFirstLetters() != null)
		{
			stringWriter.append("<CapitalizeFirstLetters>");
			stringWriter.append(String.valueOf(this.getCapitalizeFirstLetters()));
			stringWriter.append("</CapitalizeFirstLetters>");
		}
		// ResultProvider
		if (this.getResultProvider() != null)
		{
			stringWriter.append("<CapitalizeFirstLetters>");
			stringWriter.append(String.valueOf(this.getResultProvider()));
			stringWriter.append("</CapitalizeFirstLetters>");
		}
		// ResubmitFlags
		if (this.getResubmitFlags() != null)
			stringWriter.append(this.getResubmitFlags().GetAsXmlString());
		// EnableSpellcheck
		if (this.getEnableSpellcheck() != null)
		{
			stringWriter.append("<EnableSpellcheck>");
			stringWriter.append(String.valueOf(this.getEnableSpellcheck()));
			stringWriter.append("</EnableSpellcheck>");
		}		
		// UserContext
		if (this.getUserContext() != null)
			stringWriter.append(this.getUserContext().GetAsXmlString());

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
	public Context getContext() {
		return context;
	}

	/**
	 * Specifies the parent element for the search query issued to the Query Web service
	 * @param context
	 */
	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @return
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * Contains information about the range of the query, including the size and the number of results requested from the Query Web service
	 * @param range
	 */
	public void setRange(Range range) {
		this.range = range;
	}

	/**
	 * Contains the managed properties to include in the search results that are returned by the Query Web service
	 * @return
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * Contains the managed properties to include in the search results that are returned by the Query Web service
	 * @param properties
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * Contains information for sorting the search results returned by the Query Web service
	 * @return
	 */
	public SortByProperties getSortByProperties() {
		return sortByProperties;
	}

	/**
	 * Contains information for sorting the search results returned by the Query Web service
	 * @param sortByProperties
	 */
	public void setSortByProperties(SortByProperties sortByProperties) {
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
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID).
	 * @return
	 */
	public TrimDuplicates getTrimDuplicates() {
		return trimDuplicates;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Specifies whether duplicates are removed before the search results are returned by the Query Web service.
	 * For FAST Search Server 2010 for SharePoint, this element can also be used to collapse hits in the result set by using a group identifier (ID). 
	 * @param rimDuplicates
	 */
	public void setTrimDuplicates(TrimDuplicates trimDuplicates) {
		this.trimDuplicates = trimDuplicates;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether special term results are included in the response returned by the Query Web service
	 * @return
	 */
	public Boolean getIncludeSpecialTermResults() {
		return includeSpecialTermResults;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether special term results are included in the response returned by the Query Web service
	 * @param includeSpecialTermResults
	 */
	public void setIncludeSpecialTermResults(Boolean includeSpecialTermResults) {
		this.includeSpecialTermResults = includeSpecialTermResults;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether pre query suggestions are included in the response from the Query Web service
	 * @return
	 */
	public Boolean getPreQuerySuggestions() {
		return preQuerySuggestions;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether pre query suggestions are included in the response from the Query Web service
	 * @param preQuerySuggestions
	 */
	public void setPreQuerySuggestions(Boolean preQuerySuggestions) {
		this.preQuerySuggestions = preQuerySuggestions;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether parts of the query suggestion that are returned by the Query Web service are highlighted
	 * @return
	 */
	public Boolean getHighlightQuerySuggestions() {
		return highlightQuerySuggestions;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether parts of the query suggestion that are returned by the Query Web service are highlighted
	 * @param highlightQuerySuggestions
	 */
	public void setHighlightQuerySuggestions(Boolean highlightQuerySuggestions) {
		this.highlightQuerySuggestions = highlightQuerySuggestions;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether the first letter in the query suggestion that is returned by the Query Web service appears in uppercase letters
	 * @return
	 */
	public Boolean getCapitalizeFirstLetters() {
		return capitalizeFirstLetters;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies whether the first letter in the query suggestion that is returned by the Query Web service appears in uppercase letters
	 * @param capitalizeFirstLetters
	 */
	public void setCapitalizeFirstLetters(Boolean capitalizeFirstLetters) {
		this.capitalizeFirstLetters = capitalizeFirstLetters;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the results provider for the Query Web service
	 * @return
	 */
	public String getResultProvider() {
		return resultProvider;
	}

	/**
	 * <b>Applies to: Microsoft SharePoint Server 2010 search and Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the results provider for the Query Web service
	 * @param resultProvider
	 */
	public void setResultProvider(String resultProvider) {
		this.resultProvider = resultProvider;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the criteria for automatically resubmitting a query that yielded no results
	 * @return
	 */
	public ResubmitFlags getResubmitFlags() {
		return resubmitFlags;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies the criteria for automatically resubmitting a query that yielded no results
	 * @param resubmitFlags
	 */
	public void setResubmitFlags(ResubmitFlags resubmitFlags) {
		this.resubmitFlags = resubmitFlags;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies how to apply spell correction of the query text when processing the request to the Query Web service
	 * @return
	 */
	public Boolean getEnableSpellcheck() {
		return enableSpellcheck;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Specifies how to apply spell correction of the query text when processing the request to the Query Web service
	 * @param enableSpellcheck
	 */
	public void setEnableSpellcheck(Boolean enableSpellcheck) {
		this.enableSpellcheck = enableSpellcheck;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @return
	 */
	public UserContext getUserContext() {
		return userContext;
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
  	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @param userContext
	 */
	public void setUserContext(UserContext userContext) {
		this.userContext = userContext;
	}	
}
