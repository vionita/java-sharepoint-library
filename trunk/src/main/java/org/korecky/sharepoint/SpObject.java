package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

public class SpObject implements ISpObject {

    private void parse(String xmlString) throws ParseException, XMLStreamException, MalformedURLException {
        parse(Support.stringToOmElement(xmlString));
    }

    private OMElement getAsOMElement() throws XMLStreamException {
        return Support.stringToOmElement(getAsXmlString());
    }

    @Override
    public void parse(OMElement xmlElement) throws ParseException, XMLStreamException, MalformedURLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAsXmlString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
