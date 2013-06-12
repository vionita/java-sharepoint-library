package org.korecky.sharepoint.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import org.korecky.sharepoint.SpObject;
import org.korecky.sharepoint.Support;

//<TrimDuplicates onproperty=string keepcount=integer includeid=boolean>
//{True|False}
//</TrimDuplicates>

//ATTRIBUTES:
//---------
// onproperty
//Optional attribute indicating the name of a non-default managed property to use as the basis for duplicate removal.
//
// keepcount
//Optional attribute specifying how many items to keep for each set of duplicates. The default value is 1.
//
// includeid
//Specifies the value associated with a collapse group, typically used when a user clicks the Duplicates(n) link of an item with duplicates.

public class TrimDuplicates extends SpObject {
	/**
	 * Optional attribute indicating the name of a non-default managed property
	 * to use as the basis for duplicate removal.
	 */
	private String onproperty = null;
	/**
	 * Optional attribute specifying how many items to keep for each set of
	 * duplicates. The default value is 1.
	 */
	private Integer keepcount = null;
	/**
	 * Specifies the value associated with a collapse group, typically used when
	 * a user clicks the Duplicates(n) link of an item with duplicates.
	 */
	private Boolean includeid = null;
	/** trim duplicates */
	private Boolean trimDuplicates = null;

	public TrimDuplicates() {
	}

	public TrimDuplicates(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	public TrimDuplicates(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"onproperty"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setOnproperty(String.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("keepcount"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setKeepcount(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("includeid"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIncludeid(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		this.setTrimDuplicates(Boolean.valueOf(xmlElement.getText()));
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<TrimDuplicates ");

		if ((this.getOnproperty() != null) && (this.getOnproperty().length() > 0))
			stringWriter.append("onproperty=\"" + this.getOnproperty() + "\"");

		if (this.getKeepcount() != null)
			stringWriter.append("keepcount=\"" + String.valueOf(this.getKeepcount())
					+ "\"");
		
		if (this.getIncludeid() != null)
			stringWriter.append("includeid=\"" + String.valueOf(this.getIncludeid())
					+ "\"");

		stringWriter.append(">");
		stringWriter.append(String.valueOf(this.getTrimDuplicates()));
		stringWriter.append("</TrimDuplicates>");

		return stringWriter.toString();
	}

	/**
	 * Optional attribute indicating the name of a non-default managed property
	 * to use as the basis for duplicate removal.
	 * 
	 * @return
	 */
	public String getOnproperty() {
		return onproperty;
	}

	/**
	 * Optional attribute indicating the name of a non-default managed property
	 * to use as the basis for duplicate removal.
	 * 
	 * @param onproperty
	 */
	public void setOnproperty(String onproperty) {
		this.onproperty = onproperty;
	}

	/**
	 * Optional attribute specifying how many items to keep for each set of
	 * duplicates. The default value is 1.
	 * 
	 * @return
	 */
	public Integer getKeepcount() {
		return keepcount;
	}

	/**
	 * Optional attribute specifying how many items to keep for each set of
	 * duplicates. The default value is 1.
	 * 
	 * @param keepcount
	 */
	public void setKeepcount(Integer keepcount) {
		this.keepcount = keepcount;
	}

	/**
	 * Specifies the value associated with a collapse group, typically used when
	 * a user clicks the Duplicates(n) link of an item with duplicates.
	 * 
	 * @return
	 */
	public Boolean getIncludeid() {
		return includeid;
	}

	/**
	 * Specifies the value associated with a collapse group, typically used when
	 * a user clicks the Duplicates(n) link of an item with duplicates.
	 * 
	 * @param includeid
	 */
	public void setIncludeid(Boolean includeid) {
		this.includeid = includeid;
	}

	/**
	 * trim duplicates
	 * 
	 * @return
	 */
	public Boolean getTrimDuplicates() {
		return trimDuplicates;
	}

	/**
	 * trim duplicates
	 * 
	 * @param trimDuplicates
	 */
	public void setTrimDuplicates(Boolean trimDuplicates) {
		this.trimDuplicates = trimDuplicates;
	}

}
