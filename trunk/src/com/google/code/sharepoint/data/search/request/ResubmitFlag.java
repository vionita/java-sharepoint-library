package com.google.code.sharepoint.data.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<ResubmitFlag value={NoResubmit|
//EnableSpellcheckOnResubmit|
//EnableSpellcheckSuggestOnResubmit|
//EnableStemmingOnResubmit|
//AddSynonymsAutomatically}>
//</ResubmitFlag>

//<ResubmitFlags>
//<ResubmitFlag value="EnableSpellcheckOnResubmit"/>
//<ResubmitFlag value="EnableStemmingOnResubmit"/>
//</ResubmitFlags>



//ATTRIBUTES:
//---------
// value	
//The action to take if no hits are found (see value Attribute below).



public class ResubmitFlag extends DataObject {	
	enum ResubmitFlagValueEnum
	{
		/**
		 * Do not resubmit the query, but return with ZERO results.
		 * If this attribute value is set, any other ResubmitFlag elements are ignored.
		 */
		NoResubmit,
		/**
		 * Resubmit the query with automatic spelling checking enabled. This corresponds to evaluating the query with EnableSpellCheck set to 4 when re-evaluating the query.
		 */
		EnableSpellcheckOnResubmit,
		/**
		 * Resubmit the query with spelling checking enabled in suggest mode. This corresponds to evaluating the query with EnableSpellCheck set to 2 when re-evaluating the query.
		 * Note: This option will still return a query result with zero hits.
		 */
		EnableSpellcheckSuggestOnResubmit,
		/**
		 * Resubmit the query with stemming enabled. This corresponds to evaluating the query with EnableStemming set to true when re-evaluating the query.	
		 */
		EnableStemmingOnResubmit		
	}	
	// value
	private ResubmitFlagValueEnum value = null;

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains one value indicating an action to take if no hits are found. Specify more than one ResubmitFlag element to indicate that multiple modifications are being performed before automatically resubmitting the query.
 	 * The effect of an automatic resubmit is that the query is modified and automatically re-evaluated before results are returned to the client.
	 */
	public ResubmitFlag() {
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains one value indicating an action to take if no hits are found. Specify more than one ResubmitFlag element to indicate that multiple modifications are being performed before automatically resubmitting the query.
 	 * The effect of an automatic resubmit is that the query is modified and automatically re-evaluated before results are returned to the client.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public ResubmitFlag(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains one value indicating an action to take if no hits are found. Specify more than one ResubmitFlag element to indicate that multiple modifications are being performed before automatically resubmitting the query.
 	 * The effect of an automatic resubmit is that the query is modified and automatically re-evaluated before results are returned to the client.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public ResubmitFlag(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"value"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setValue(ResubmitFlagValueEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;		
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		if (this.getValue() != null)
		{
			stringWriter.append("<Property ");
			stringWriter.append("value=\"" + String.valueOf(this.getValue()) + "\"");		
			stringWriter.append(">");
			stringWriter.append("</Property>");
		}

		return stringWriter.toString();
	}

	/**
	 * Value
	 * @return
	 */
	public ResubmitFlagValueEnum getValue() {
		return value;
	}

	/**
	 * Value
	 * @param value
	 */
	public void setValue(ResubmitFlagValueEnum value) {
		this.value = value;
	}

}
