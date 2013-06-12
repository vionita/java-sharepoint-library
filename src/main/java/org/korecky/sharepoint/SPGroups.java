package org.korecky.sharepoint;

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
public class SPGroups extends SpObject {

    private List<SPGroup> groupCollection = new ArrayList<SPGroup>();

    public SPGroups() {
    }

    public SPGroups(final String xmlString) {
        OMElement xmlElement = null;
        try {
            xmlElement = Support.stringToOmElement(xmlString);
            if (xmlElement != null) {
                parse(xmlElement);
            }
        } catch (final XMLStreamException ex) {
            Logger.getLogger(SPGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (final ParseException ex) {
            Logger.getLogger(SPGroups.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public SPGroups(final OMElement xmlElement) {
        try {
            parse(xmlElement);
        } catch (final ParseException ex) {
            Logger.getLogger(SPGroups.class.getName()).log(Level.SEVERE, null, ex);
        } catch (final XMLStreamException ex) {
            Logger.getLogger(SPGroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void parse(final OMElement xmlElement) throws ParseException, XMLStreamException {
        // GetGroupCollectionFromUser --> Groups --> Group
        final List<SPGroup> groups = new ArrayList<SPGroup>();

        final Iterator iterator = xmlElement.getChildElements();
        if (iterator.hasNext()) {
            final OMElement childElement = (OMElement) iterator.next(); // Groups
            final Iterator groupsIterator = childElement.getChildElements();

            while (groupsIterator.hasNext()) {
                final OMElement groupElement = (OMElement) groupsIterator.next(); // Group
                if ("Group".equals(groupElement.getQName().getLocalPart())) {
                    final SPGroup newGroup = new SPGroup(groupElement);
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

    public void setGroupCollection(final List<SPGroup> groupCollection) {
        this.groupCollection = groupCollection;
    }

    public List<SPGroup> getGroupCollection() {
        return groupCollection;
    }
}
