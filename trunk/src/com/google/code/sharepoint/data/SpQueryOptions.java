package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<QueryOptions>
//	<IncludeMandatoryColumns>FALSE
//	   </IncludeMandatoryColumns>
//	<DateInUtc>TRUE</DateInUtc>
//</QueryOptions>

//ELEMENTS:
//---------
//DateInUtc
//TRUE to return dates in Coordinated Universal Time (UTC) format. FALSE to return dates in ISO format. This element is optional, and its default value is TRUE.
//
//Folder
//Specifies a URL used to filter document library items for items in the specified folder. This element is optional, and its default value is an empty string.
//
//Paging
//A string that contains data needed to support paging, including a ListItemCollectionPositionNext attribute. If left empty, the list items returned start from the beginning of the list. Client applications should supply the value of a server-supplied bookmark. The server returns the next page of data based on the bookmark supplied. This element is optional, and its default value is an empty string.
//
//IncludeMandatoryColumns
//TRUE to specify that mandatory system columns be returned in addition to the fields specified by the viewFields parameter (for example, owsHiddenVersion, dependent fields, and required fields). This element is optional, and its default value is TRUE.
//
//MeetingInstanceID
//An integer value where a positive number represents a specific meeting instance. Negative numbers have the following meanings: -3 = UnSpecified, -2 = AllWithSeries, -1 = AllButSeries, 0 = Series. This element is optional, and its default value is -1. Negative values correspond to values of the Microsoft.SharePoint.Meetings.SPMeeting.SpecialInstance enumeration.
//
//ViewAttributes
//A string representing all attributes returned as part of the View element when retrieving a view through the GetView method. This element is optional, and its default value is empty. If a viewName parameter is supplied, the view attributes from the persisted view are used. When this argument is supplied, it overrides any view attributes that can be retrieved from the persisted view specified by the viewName parameter. This element is optional and its default value is an empty string. To return all documents in a library, the ViewAttributes element is used as follows: <ViewAttributes Scope="Recursive" />.

public class SpQueryOptions extends DataObject {
	// TRUE to return dates in Coordinated Universal Time (UTC) format. FALSE to
	// return dates in ISO format. This element is optional, and its default
	// value is TRUE.
	private Boolean dateInUtc = null;
	// Specifies a URL used to filter document library items for items in the
	// specified folder. This element is optional, and its default value is an
	// empty string.
	private String folder = null;
	// A string that contains data needed to support paging, including a
	// ListItemCollectionPositionNext attribute. If left empty, the list items
	// returned start from the beginning of the list. Client applications should
	// supply the value of a server-supplied bookmark. The server returns the
	// next page of data based on the bookmark supplied. This element is
	// optional, and its default value is an empty string.
	private String paging = null;
	// TRUE to specify that mandatory system columns be returned in addition to
	// the fields specified by the viewFields parameter (for example,
	// owsHiddenVersion, dependent fields, and required fields). This element is
	// optional, and its default value is TRUE.
	private Boolean includeMandatoryColumns = null;
	// An integer value where a positive number represents a specific meeting
	// instance. Negative numbers have the following meanings: -3 = UnSpecified,
	// -2 = AllWithSeries, -1 = AllButSeries, 0 = Series. This element is
	// optional, and its default value is -1. Negative values correspond to
	// values of the Microsoft.SharePoint.Meetings.SPMeeting.SpecialInstance
	// enumeration.
	private Integer meetingInstanceID = null;
	// A string representing all attributes returned as part of the View element
	// when retrieving a view through the GetView method. This element is
	// optional, and its default value is empty. If a viewName parameter is
	// supplied, the view attributes from the persisted view are used. When this
	// argument is supplied, it overrides any view attributes that can be
	// retrieved from the persisted view specified by the viewName parameter.
	// This element is optional and its default value is an empty string. To
	// return all documents in a library, the ViewAttributes element is used as
	// follows: <ViewAttributes Scope="Recursive" />.
	private String viewAttributes = null;

	public SpQueryOptions() {
	}

	public SpQueryOptions(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	public SpQueryOptions(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if ((childElement.getText() != null)
					&& (childElement.getText().length() > 0)) {
				if (childElement.getQName().getLocalPart().equals("DateInUtc")) {
					this.setDateInUtc(Boolean.valueOf(childElement.getText()));
				} else if (childElement.getQName().getLocalPart()
						.equals("Folder")) {
					this.setFolder(childElement.getText());
				} else if (childElement.getQName().getLocalPart()
						.equals("Paging")) {
					this.setPaging(childElement.getText());
				}
				if (childElement.getQName().getLocalPart()
						.equals("IncludeMandatoryColumns")) {
					this.setIncludeMandatoryColumns(Boolean
							.valueOf(childElement.getText()));
				} else if (childElement.getQName().getLocalPart()
						.equals("MeetingInstanceID")) {
					this.setMeetingInstanceID(Integer.valueOf(childElement
							.getText()));
				} else if (childElement.getQName().getLocalPart()
						.equals("ViewAttributes")) {
					this.setViewAttributes(childElement.getText());
				}
			}
		}

	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<QueryOptions>");

		if (this.getDateInUtc() != null) {
			stringWriter.append("<DateInUtc>");
			stringWriter.append(String.valueOf(this.getDateInUtc()));
			stringWriter.append("</DateInUtc>");
		}

		if (this.getFolder() != null) {
			stringWriter.append("<Folder>");
			stringWriter.append(String.valueOf(this.getFolder()));
			stringWriter.append("</Folder>");
		}

		if (this.getPaging() != null) {
			stringWriter.append("<Paging>");
			stringWriter.append(String.valueOf(this.getPaging()));
			stringWriter.append("</Paging>");
		}

		if (this.getIncludeMandatoryColumns() != null) {
			stringWriter.append("<IncludeMandatoryColumns>");
			stringWriter.append(String.valueOf(this
					.getIncludeMandatoryColumns()));
			stringWriter.append("</IncludeMandatoryColumns>");
		}

		if (this.getMeetingInstanceID() != null) {
			stringWriter.append("<MeetingInstanceID>");
			stringWriter.append(String.valueOf(this.getMeetingInstanceID()));
			stringWriter.append("</MeetingInstanceID>");
		}

		if (this.getViewAttributes() != null) {
			stringWriter.append("<ViewAttributes>");
			stringWriter.append(String.valueOf(this.getViewAttributes()));
			stringWriter.append("</ViewAttributes>");
		}

		stringWriter.append("</QueryOptions>");

		return stringWriter.toString();
	}

	/**
	 * @return the dateInUtc
	 */
	public Boolean getDateInUtc() {
		return dateInUtc;
	}

	/**
	 * @param dateInUtc
	 *            the dateInUtc to set
	 */
	public void setDateInUtc(Boolean dateInUtc) {
		this.dateInUtc = dateInUtc;
	}

	/**
	 * @return the folder
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * @param folder
	 *            the folder to set
	 */
	public void setFolder(String folder) {
		this.folder = folder;
	}

	/**
	 * @return the paging
	 */
	public String getPaging() {
		return paging;
	}

	/**
	 * @param paging
	 *            the paging to set
	 */
	public void setPaging(String paging) {
		this.paging = paging;
	}

	/**
	 * @return the includeMandatoryColumns
	 */
	public Boolean getIncludeMandatoryColumns() {
		return includeMandatoryColumns;
	}

	/**
	 * @param includeMandatoryColumns
	 *            the includeMandatoryColumns to set
	 */
	public void setIncludeMandatoryColumns(Boolean includeMandatoryColumns) {
		this.includeMandatoryColumns = includeMandatoryColumns;
	}

	/**
	 * @return the meetingInstanceID
	 */
	public Integer getMeetingInstanceID() {
		return meetingInstanceID;
	}

	/**
	 * @param meetingInstanceID
	 *            the meetingInstanceID to set
	 */
	public void setMeetingInstanceID(Integer meetingInstanceID) {
		this.meetingInstanceID = meetingInstanceID;
	}

	/**
	 * @return the viewAttributes
	 */
	public String getViewAttributes() {
		return viewAttributes;
	}

	/**
	 * @param viewAttributes
	 *            the viewAttributes to set
	 */
	public void setViewAttributes(String viewAttributes) {
		this.viewAttributes = viewAttributes;
	}

}
