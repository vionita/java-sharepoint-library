package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;


//<z:row ows_Title="aaaa" ....  /> 

public class SpListItem extends DataObject {
	Hashtable fieldValues = null;
		
	// SP ListItem properties
	private int id = -1;
	private String title = null;
	private String url = null;
	private Date created = null;
	private Date modified = null;
	private String author = null;
	private String editor = null;	
	
	// SP formater
	private SimpleDateFormat sharepointFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	
	
	public SpListItem() {
	}

	public SpListItem(String xmlString) throws XMLStreamException {
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {
			try {
				parse(xmlElement);
			} catch (ParseException ex) {
				Logger.getLogger(SpList.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	public SpListItem(OMElement xmlElement) {
		try {
			parse(xmlElement);
		} catch (ParseException ex) {
			Logger.getLogger(SpList.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}	
	
	@Override
	public void parse(OMElement xmlElement) throws ParseException {			
		Iterator children = xmlElement.getAllAttributes();
		fieldValues = new Hashtable();

		while (children.hasNext()) {
			OMAttribute attribute = (OMAttribute) children.next();
			if (attribute != null)
				fieldValues.put(attribute.getLocalName(), attribute.getAttributeValue());
		}
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		
		if (this.getFieldValues().size() > 0) {		
			stringWriter.append("<row ");
			 Enumeration keys = this.getFieldValues().keys();
			 while(keys.hasMoreElements() ){
				 Object key = keys.nextElement();
				 Object value = this.getFieldValues().get(key);				 	
				 stringWriter.append(String.valueOf(key) + "=\""+ String.valueOf(value) + "\" ");
			}				
			stringWriter.append("/>");						
		}

		return stringWriter.toString();
	}

	/**
	 * @return the fieldValues
	 */
	public Hashtable getFieldValues() {
		return fieldValues;
	}

	/**
	 * @param fieldValues the fieldValues to set
	 */
	public void setFieldValues(Hashtable fieldValues) {
		this.fieldValues = fieldValues;
	}

	/**
	 * @return the id
	 */
	public int getId() {	
		if (id < 0)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_ID"))
				{
					id = Integer.valueOf(value);
					break;
				}
			}
		}
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		if (title == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_Title"))
				{
					title = value;
					break;
				}
			}					
		}
		return title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		if (url == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_ServerUrl"))
				{
					url = value;
					break;
				}
			}					
		}
		return url;
	}

	/**
	 * @return the created
	 * @throws Exception 
	 */
	public Date getCreated() throws Exception {
		if (created == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_Created"))
				{
					try {
						created = sharepointFormatter.parse(value);						
					} catch (ParseException exc) {
						throw new Exception(
								"Cannot parse \"Created\" field received from Sharepoint to Date object. exc.n: caf5f5c0-a0b0-11e0-8264-0800200c9a66",
								exc);
					}					 
					break;
				}
			}					
		}		
		return created;
	}

	/**
	 * @return the modified
	 * @throws Exception 
	 */
	public Date getModified() throws Exception {
		if (modified == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_Modified"))
				{
					try {
						modified = sharepointFormatter.parse(value);						
					} catch (ParseException exc) {
						throw new Exception(
								"Cannot parse \"Modified\" field received from Sharepoint to Date object. exc.n: 98ee7ed0-a0b0-11e0-8264-0800200c9a66",
								exc);
					}					 
					break;
				}
			}					
		}		
		return modified;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		if (author == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_Author"))
				{
					author = value;
					break;
				}
			}					
		}
		return author;
	}

	/**
	 * @return the editor
	 */
	public String getEditor() {
		if (editor == null)
		{
			Enumeration keys = getFieldValues().keys();				
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = (String) getFieldValues().get(
						key);					
				if (key.equals("ows_Editor"))
				{
					editor = value;
					break;
				}
			}					
		}
		return editor;
	}	
}
