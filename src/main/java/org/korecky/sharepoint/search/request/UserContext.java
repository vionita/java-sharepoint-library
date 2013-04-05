package org.korecky.sharepoint.search.request;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import org.korecky.sharepoint.SpObject;
import org.korecky.sharepoint.Support;

//<UserContext includeuserprofile={true|false}>
//   <UserContextData />
//</UserContext>


//ATTRIBUTES:
//---------
// includeuserprofiles	
//Specifies the type of user context data to be applied.
//true   Context values from the SharePoint 2010 user profile service will be included as part of the user context. If UserContextData is also used, the user profile data and the custom context data are both used.
//false   Context values from the SharePoint 2010 user profile are not included as part of the user context. Use UserContextData to submit custom user contexts.
//Default: true


public class UserContext extends SpObject {	
	// includeuserprofile
	private Boolean includeUserProfile = null;
	// UserContextData collection
	private List<UserContextData> userContextDataCollection = null;

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 */
	public UserContext() {
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @param xmlString
	 * @throws XMLStreamException
	 * @throws ParseException
	 */
	public UserContext(String xmlString) throws XMLStreamException,
			ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			parse(xmlElement);
		}
	}

	/**
	 * <b>Applies to: Microsoft FAST Search Server 2010 for SharePoint</b>
	 * Contains user context data associated with search settings (best bets, visual best bets, and keyword boosting).
	 * The keyword management search settings can be restricted to context. A context defines when a search setting should apply, typically targeting a specific group of users.
	 * @param xmlElement
	 * @throws ParseException
	 */
	public UserContext(OMElement xmlElement) throws ParseException {
		parse(xmlElement);
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"includeuserprofile"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIncludeUserProfile(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		List<UserContextData> userContextDataTempCol = new ArrayList<UserContextData>();
		
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("UserContextData")) {
				UserContextData userContextData = new UserContextData(childElement);
				userContextDataTempCol.add(userContextData);
			}
		}
		this.setUserContextDataCollection(userContextDataTempCol);
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();		
		stringWriter.append("<UserContext ");
		stringWriter.append("includeuserprofile=\"" + this.getIncludeUserProfile() + "\"");		
		stringWriter.append(">");
		for (UserContextData userContextData : this.getUserContextDataCollection())
		{
			stringWriter.append(userContextData.getAsXmlString());
		}
		stringWriter.append("</UserContext>");
	

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
	 * UserCOntextData Collection
	 * @return
	 */
	public List<UserContextData> getUserContextDataCollection() {
		return userContextDataCollection;
	}

	/**
	 * UserCOntextData Collection
	 * @param userContextDataCollection
	 */
	public void setUserContextDataCollection(
			List<UserContextData> userContextDataCollection) {
		this.userContextDataCollection = userContextDataCollection;
	}

	
}
