/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.code.sharepoint.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * 
 * @author vkorecky
 */

// <Web Title="Implementace" Url="https://devport2.gordic.cz/implementace" />

public final class SpWeb extends DataObject {
	private String title = null;
	private String url = null;	

	public SpWeb() {
	}

	public SpWeb(String xmlString) throws XMLStreamException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			try {
				parse(xmlElement);
			} catch (ParseException ex) {
				Logger.getLogger(SpWeb.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	public SpWeb(OMElement xmlElement) {
		try {
			parse(xmlElement);
		} catch (ParseException ex) {
			Logger.getLogger(SpWeb.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}	

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
		String tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Title"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setTitle(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Url"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUrl(tempAttributeValue);
		tempAttributeValue = null;
	}	

	@Override
	public String getAsXmlString() {

		// TODO: getAsXmlString

		return null;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets url of the web
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets url of the web
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}	
}
