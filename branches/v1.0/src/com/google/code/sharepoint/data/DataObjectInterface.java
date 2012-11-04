/**
 * 
 */
package com.google.code.sharepoint.data;

import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * @author "Vladislav Korecký"
 *
 */
public interface DataObjectInterface {				
	public void parse(OMElement xmlElement) throws ParseException, XMLStreamException;	
	public String getAsXmlString();
}
