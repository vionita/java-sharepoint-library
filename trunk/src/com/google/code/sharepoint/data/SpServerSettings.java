package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Iterator;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<ServerSettings>
//	<ServerVersion>12.0.0.6219</ServerVersion>
//	<RecycleBinEnabled>True</RecycleBinEnabled>
//	<ServerRelativeUrl>/</ServerRelativeUrl>
//</ServerSettings>
public class SpServerSettings extends DataObject {
	private String serverVersion = null;
	private Boolean recycleBinEnabled = null;
	private String serverRelativeUrl = null;
	
	
	public SpServerSettings() {
	}

	public SpServerSettings(String xmlString) throws XMLStreamException, ParseException {		// 
		 OMElement xmlElement = null;
		 xmlElement = Support.StringToOmElement(xmlString);
		
		 if (xmlElement != null)		 
			 Parse(xmlElement);
	}

	public SpServerSettings(OMElement xmlElement) throws ParseException { 
		Parse(xmlElement);
	}
	
	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {			
			OMElement childElement = (OMElement) children.next();
			if ((childElement.getText() != null) && (childElement.getText().length() > 0))
			{
				if (childElement.getQName().getLocalPart().equals("ServerVersion"))
				{
					this.setServerVersion(childElement.getText());
				}
				else if (childElement.getQName().getLocalPart().equals("RecycleBinEnabled"))
				{
					Boolean value = Boolean.valueOf(childElement.getText());
					this.setRecycleBinEnabled(value);
				}
				else if (childElement.getQName().getLocalPart().equals("ServerRelativeUrl"))
				{
					this.setServerRelativeUrl(childElement.getText());
				}
			}
		}
	}
	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<ServerSettings>");
		
		if (this.getServerVersion() != null)
		{
		stringWriter.append("<ServerVersion>");
		stringWriter.append(this.getServerVersion());
		stringWriter.append("</ServerVersio>");
		}
		
		if (this.getRecycleBinEnabled() != null)
		{		
		stringWriter.append("<RecycleBinEnabled>");
		stringWriter.append(String.valueOf(this.getRecycleBinEnabled()));
		stringWriter.append("</RecycleBinEnabled>");
		}
		
		if (this.getServerRelativeUrl() != null)
		{
		stringWriter.append("<ServerRelativeUrl>");
		stringWriter.append(this.getServerRelativeUrl());
		stringWriter.append("</ServerRelativeUrl>");
		}
		
		stringWriter.append("</ServerSettings>");
		
		return stringWriter.toString();
	}		
	
	/**
	 * @return the serverVersion
	 */
	public String getServerVersion() {
		return serverVersion;
	}
	/**
	 * @param serverVersion the serverVersion to set
	 */
	public void setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
	}
	/**
	 * @return the recycleBinEnabled
	 */
	public Boolean getRecycleBinEnabled() {
		return recycleBinEnabled;
	}
	/**
	 * @param recycleBinEnabled the recycleBinEnabled to set
	 */
	public void setRecycleBinEnabled(Boolean recycleBinEnabled) {
		this.recycleBinEnabled = recycleBinEnabled;
	}
	/**
	 * @return the serverRelativeUrl
	 */
	public String getServerRelativeUrl() {
		return serverRelativeUrl;
	}
	/**
	 * @param serverRelativeUrl the serverRelativeUrl to set
	 */
	public void setServerRelativeUrl(String serverRelativeUrl) {
		this.serverRelativeUrl = serverRelativeUrl;
	}	
}
