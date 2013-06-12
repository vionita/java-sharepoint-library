package org.korecky.sharepoint;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author vkorecky
 */
public class JaxbFactory<T> {

    /**
     * Converts xml to jaxb object
     * @param xml
     * @param objectClass
     * @return
     * @throws SAXException
     * @throws JAXBException 
     */
    public T xmlToObject(String xml, Class<T> objectClass) throws SAXException, JAXBException {        
        JAXBContext jc = JAXBContext.newInstance(objectClass);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new StringReader(xml));
    }

    /**
     * Converts xml to jaxb object
     * @param xml
     * @param objectClass
     * @return
     * @throws SAXException
     * @throws JAXBException 
     */
    public T documentToObject(Document document, Class<T> objectClass) throws SAXException, JAXBException {        
        JAXBContext jc = JAXBContext.newInstance(objectClass);        
        Unmarshaller unmarshaller = jc.createUnmarshaller();        
        return (T) unmarshaller.unmarshal(document);
    }
    
    /**
     * Converts jaxb object to XML
     * @param object
     * @param objectClass
     * @return
     * @throws JAXBException 
     */
    public String objectToXml(T object, Class<T> objectClass) throws JAXBException {        
        JAXBContext jc = JAXBContext.newInstance(objectClass);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter writer = new StringWriter();
        marshaller.marshal(object, writer);
        return writer.toString();
    }
}
