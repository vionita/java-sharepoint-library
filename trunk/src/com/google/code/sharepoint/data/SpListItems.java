/**
 * 
 */
package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

//<listitems xmlns:s="uuid:BDC6E3F0-6DA3-11d1-A2A3-00AA00C14882" xmlns:dt="uuid:C2F41010-65B3-11d1-A29F-00AA00C14882" xmlns:rs="urn:schemas-microsoft-com:rowset" xmlns:z="#RowsetSchema"> 
//	<rs:data ItemCount="142"> 
//		<z:row ows_Title="aaaa" ....  /> 
//	</rs:data> 
//</listitems>

/**
 * @author "Vladislav Korecký"
 * 
 */
public class SpListItems extends DataObject {
	private List<SpListItem> listItemCollection = new ArrayList<SpListItem>();

	public SpListItems() {
	}

	public SpListItems(String xmlString) throws XMLStreamException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null) {
			try {
				Parse(xmlElement);
			} catch (ParseException ex) {
				Logger.getLogger(SpList.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		}
	}

	public SpListItems(OMElement xmlElement) throws XMLStreamException {
		try {
			Parse(xmlElement);
		} catch (ParseException ex) {
			Logger.getLogger(SpList.class.getName())
					.log(Level.SEVERE, null, ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.code.sharepoint.data.DataObjectInterface#Parse(org.apache.axiom
	 * .om.OMElement)
	 */
	@Override
	public void Parse(OMElement xmlElement) throws ParseException,
			XMLStreamException {
		Iterator children = xmlElement.getChildElements();
		listItemCollection = new ArrayList<SpListItem>();

		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if ((childElement.getText() != null)
					&& (childElement.getText().length() > 0)) {
				if (childElement.getQName().getLocalPart().equals("data")) {
					// ListItems
					Iterator rowChildren = childElement.getChildElements();
					while (rowChildren.hasNext()) {
						OMElement rowChildElement = (OMElement) rowChildren
								.next();
						if ((rowChildElement != null) && (rowChildElement.getQName().getLocalPart().equals("row"))) {
								SpListItem newListItem = new SpListItem(rowChildElement);
								listItemCollection.add(newListItem);
						}
					}
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.code.sharepoint.data.DataObjectInterface#GetAsXmlString()
	 */
	@Override
	public String GetAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		
		if (this.getListItemCollection().size() > 0) {		
			stringWriter.append("<listitems>");

			stringWriter.append("<data");
			stringWriter.append("ItemCount=\"" + String.valueOf(this.getListItemCollection().size() + "\">"));
			for (SpListItem listItem : this.getListItemCollection())
				stringWriter.append(listItem.GetAsXmlString());
			stringWriter.append("</data>");			
			stringWriter.append("</listitems>");
		}

		return stringWriter.toString();
	}

	/**
	 * @return the listItemCollection
	 */
	public List<SpListItem> getListItemCollection() {
		return listItemCollection;
	}

	/**
	 * @param listItemCollection
	 *            the listItemCollection to set
	 */
	public void setListItemCollection(List<SpListItem> listItemCollection) {
		this.listItemCollection = listItemCollection;
	}

}
