package com.google.code.sharepoint.data;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * 
 * @author Ishan Fernando
 *
 */
public class SpGroups extends DataObject {
	
	private List<SpGroup> groupCollection = new ArrayList<SpGroup>();

	public SpGroups() {
	}
	
	public SpGroups(final String xmlString) { 
		OMElement xmlElement = null;
		try {
			xmlElement = Support.stringToOmElement(xmlString);
			if (xmlElement != null) {
				parse(xmlElement);
			}
		} catch (final XMLStreamException ex) {
			Logger.getLogger(SpList.class.getName()).log(Level.SEVERE, null, ex);
		} catch (final ParseException ex) {
			Logger.getLogger(SpList.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public SpGroups(final OMElement xmlElement) {
		try {
			parse(xmlElement);
		} catch (final ParseException ex) {
			Logger.getLogger(SpList.class.getName()).log(Level.SEVERE, null, ex);
		} catch (final XMLStreamException ex) {
			Logger.getLogger(SpList.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void parse(final OMElement xmlElement) throws ParseException, XMLStreamException {
		// GetGroupCollectionFromUser --> Groups --> Group
		final List<SpGroup> groups = new ArrayList<SpGroup>();
		
		final Iterator iterator = xmlElement.getChildElements();
		if (iterator.hasNext()) {
			final OMElement childElement = (OMElement) iterator.next(); // Groups
			final Iterator groupsIterator = childElement.getChildElements();
			
			while(groupsIterator.hasNext()){
				final OMElement groupElement = (OMElement) groupsIterator.next(); // Group
				if ("Group".equals(groupElement.getQName().getLocalPart())) {
					final SpGroup newGroup = new SpGroup(groupElement);
					groups.add(newGroup);
				}
			}
		}
		
		setGroupCollection(groups);
	}

	@Override
	public String getAsXmlString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setGroupCollection(final List<SpGroup> groupCollection) {
		this.groupCollection = groupCollection;
	}
	
	public List<SpGroup> getGroupCollection() {
		return groupCollection;
	}

}
