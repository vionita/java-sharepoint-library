package com.google.code.sharepoint.data.searchSchema;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.DataObject;
import com.google.code.sharepoint.data.Support;

//<UserContextData includeuserprofile={true|false}>
//   userContextString
//</UserContextData>


//ATTRIBUTES:
//---------
//includeuserprofiles	
//Specifies the type of user context data to be applied.
//true   Context values from the SharePoint 2010 user profile service will be included as part of the user context. If UserContextData is also used, the user profile data and the custom context data are both used.
//false   Context values from the SharePoint 2010 user profile are not included as part of the user context. Use UserContextData to submit custom user contexts.
//Default: true


public class UserContextData extends DataObject {	
	// includeuserprofile
	private Boolean includeUserProfile = null;
	// value
	private String value = null;

	/**
	 * Applies to: Microsoft FAST Search Server 2010 for SharePoint
	 * Contains one user context specification associated with search settings (Best Bets, Visual Best Bets and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 */
	public UserContextData() {
	}

	/**
	 * Applies to: Microsoft FAST Search Server 2010 for SharePoint
	 * Contains one user context specification associated with search settings (Best Bets, Visual Best Bets and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public UserContextData(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			Parse(xmlElement);
		}
	}

	/**
	 * Applies to: Microsoft FAST Search Server 2010 for SharePoint
	 * Contains one user context specification associated with search settings (Best Bets, Visual Best Bets and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public UserContextData(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"includeuserprofile"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIncludeUserProfile(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		this.setValue(xmlElement.getText());
	}

	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		if ((this.getValue() != null) && (this.getValue().length() > 0))
		{
			stringWriter.append("<UserContextData ");
			if (this.getIncludeUserProfile() != null)
				stringWriter.append("includeuserprofile=\"" + this.getIncludeUserProfile() + "\"");			
			stringWriter.append(">");
			stringWriter.append(this.getValue());
			stringWriter.append("</UserContextData>");
		}

		return stringWriter.toString();
	}

	/**
	 * Specifies the type of user context data to be applied.
	 * true   Context values from the SharePoint 2010 user profile service will be included as part of the user context. If UserContextData is also used, the user profile data and the custom context data are both used.
	 * false   Context values from the SharePoint 2010 user profile are not included as part of the user context. Use UserContextData to submit custom user contexts.
	 * Default: true
	 * @return
	 */
	public Boolean getIncludeUserProfile() {
		return includeUserProfile;
	}

	/**
	 * Specifies the type of user context data to be applied.
	 * true   Context values from the SharePoint 2010 user profile service will be included as part of the user context. If UserContextData is also used, the user profile data and the custom context data are both used.
	 * false   Context values from the SharePoint 2010 user profile are not included as part of the user context. Use UserContextData to submit custom user contexts.
	 * Default: true
	 * @param includeUserProfile
	 */
	public void setIncludeUserProfile(Boolean includeUserProfile) {
		this.includeUserProfile = includeUserProfile;
	}

	/**
	 * Value
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Value
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
