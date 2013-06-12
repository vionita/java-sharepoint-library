package org.korecky.sharepoint;

import org.korecky.sharepoint.SpObject;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<RegionalSettings>
//	<Language>1029</Language>
//	<Locale>1029</Locale>
//	<AdvanceHijri>0</AdvanceHijri>
//	<CalendarType>1</CalendarType>
//	<Time24>True</Time24>
//	<TimeZone>-60</TimeZone>
//	<SortOrder>1029</SortOrder>
//	<Presence>True</Presence>
//</RegionalSettings>

public class SPRegionalSettings extends SpObject{
	private Integer language = null;
	private Integer locale = null;
	private Integer advanceHijri = null;
	private Integer calendarType = null;
	private Boolean time24 = null;
	private Integer timeZone = null;
	private Integer sortOrder = null;
	private Boolean presence = null;
		
	
	public SPRegionalSettings() {
	}

	public SPRegionalSettings(String xmlString) throws XMLStreamException, ParseException { 
		 OMElement xmlElement = null;
		 xmlElement = Support.stringToOmElement(xmlString);
		
		 if (xmlElement != null) {		
		 parse(xmlElement);
		 }
	}

	public SPRegionalSettings(OMElement xmlElement) throws ParseException {
		 parse(xmlElement);
	}
	
	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {			
			OMElement childElement = (OMElement) children.next();
			if ((childElement.getText() != null) && (childElement.getText().length() > 0))
			{
				if (childElement.getQName().getLocalPart().equals("Language"))
				{
					this.setLanguage(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("Locale"))
				{
					this.setLocale(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("AdvanceHijri"))
				{
					this.setAdvanceHijri(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("CalendarType"))
				{
					this.setCalendarType(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("Time24"))
				{
					this.setTime24(Boolean.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("TimeZone"))
				{
					this.setTimeZone(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("SortOrder"))
				{
					this.setSortOrder(Integer.valueOf(childElement.getText()));
				}
				else if (childElement.getQName().getLocalPart().equals("Presence"))
				{
					this.setPresence(Boolean.valueOf(childElement.getText()));
				}
			}
		}
	}
	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<RegionalSettings>");
		
		if (this.getLanguage() != null)
		{
		stringWriter.append("<Language>");
		stringWriter.append(String.valueOf(this.getLanguage()));
		stringWriter.append("</Language>");
		}
		
		if (this.getLocale() != null)
		{
		stringWriter.append("<Locale>");
		stringWriter.append(String.valueOf(this.getLocale()));
		stringWriter.append("</Locale>");
		}
		
		if (this.getAdvanceHijri() != null)
		{
		stringWriter.append("<AdvanceHijri>");
		stringWriter.append(String.valueOf(this.getAdvanceHijri()));
		stringWriter.append("</AdvanceHijri>");
		}
		
		if (this.getCalendarType() != null)
		{
		stringWriter.append("<CalendarType>");
		stringWriter.append(String.valueOf(this.getCalendarType()));
		stringWriter.append("</CalendarType>");
		}
		
		if (this.getTime24() != null)
		{
		stringWriter.append("<Time24>");
		stringWriter.append(String.valueOf(this.getTime24()));
		stringWriter.append("</Time24>");
		}
		
		if (this.getTimeZone() != null)
		{
		stringWriter.append("<TimeZone>");
		stringWriter.append(String.valueOf(this.getTimeZone()));
		stringWriter.append("</TimeZone>");
		}
		
		if (this.getSortOrder() != null)
		{
		stringWriter.append("<SortOrder>");
		stringWriter.append(String.valueOf(this.getSortOrder()));
		stringWriter.append("</SortOrder>");
		}
		
		if (this.getPresence() != null)
		{
		stringWriter.append("<Presence>");
		stringWriter.append(String.valueOf(this.getPresence()));
		stringWriter.append("</Presence>");
		}
		stringWriter.append("</RegionalSettings>");
		
		return stringWriter.toString();
	}
	
	/**
	 * @return the language
	 */
	public Integer getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(Integer language) {
		this.language = language;
	}
	/**
	 * @return the locale
	 */
	public Integer getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Integer locale) {
		this.locale = locale;
	}
	/**
	 * @return the advanceHijri
	 */
	public Integer getAdvanceHijri() {
		return advanceHijri;
	}
	/**
	 * @param advanceHijri the advanceHijri to set
	 */
	public void setAdvanceHijri(Integer advanceHijri) {
		this.advanceHijri = advanceHijri;
	}
	/**
	 * @return the calendarType
	 */
	public Integer getCalendarType() {
		return calendarType;
	}
	/**
	 * @param calendarType the calendarType to set
	 */
	public void setCalendarType(Integer calendarType) {
		this.calendarType = calendarType;
	}
	/**
	 * @return the time24
	 */
	public Boolean getTime24() {
		return time24;
	}
	/**
	 * @param time24 the time24 to set
	 */
	public void setTime24(Boolean time24) {
		this.time24 = time24;
	}
	/**
	 * @return the timeZone
	 */
	public Integer getTimeZone() {
		return timeZone;
	}
	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(Integer timeZone) {
		this.timeZone = timeZone;
	}
	/**
	 * @return the sortOrder
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}
	/**
	 * @param sortOrder the sortOrder to set
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 * @return the presence
	 */
	public Boolean getPresence() {
		return presence;
	}
	/**
	 * @param presence the presence to set
	 */
	public void setPresence(Boolean presence) {
		this.presence = presence;
	}
}
