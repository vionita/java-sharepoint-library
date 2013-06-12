package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * @author "Vladislav Korecký"
 *
 */
public interface ISpObject {

    public void parse(OMElement xmlElement) throws ParseException, XMLStreamException, MalformedURLException;

    public String getAsXmlString();
}
