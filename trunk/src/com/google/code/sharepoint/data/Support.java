package com.google.code.sharepoint.data;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringWriter;
import java.text.ParseException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.xml.sax.SAXException;

public class Support {
	public static Object OmElementToObject(OMElement omElement,
			Class<?> objectClass) throws XMLStreamException,
			FactoryConfigurationError, JAXBException {
		// <List xmlns="http://schemas.microsoft.com/sharepoint/soap/"
		// DocTemplateUrl=""
		// DefaultViewUrl="/Lists/Atestace G0G3  stav k 311207/AllItems.aspx"
		// MobileDefaultViewUrl="" ID="{FFCC30CF-0B4E-4016-A253-163E6D3A63C4}"
		// Title="Atestace G0&amp;G3 - stav k 31.12.07"
		// Description="Přehled jednotlivých atestů G0 a G3"
		// ImageUrl="/_layouts/images/itgen.gif"
		// Name="{FFCC30CF-0B4E-4016-A253-163E6D3A63C4}" BaseType="0"
		// FeatureId="00bfea71-de22-43b2-a848-c05709900100" ServerTemplate="100"
		// Created="20081119 08:07:51" Modified="20081204 02:12:06"
		// LastDeleted="20081119 08:07:51" Version="662" Direction="none"
		// ThumbnailSize="" WebImageWidth="" WebImageHeight="" Flags="545263616"
		// ItemCount="145" AnonymousPermMask="0" RootFolder="" ReadSecurity="1"
		// WriteSecurity="1" Author="1073741823" EventSinkAssembly=""
		// EventSinkClass="" EventSinkData="" EmailInsertsFolder=""
		// EmailAlias="" WebFullUrl="/"
		// WebId="1bc98de4-b2d9-47ab-9eec-ff9a1dfeeb0f" SendToLocation=""
		// ScopeId="bfa8bebd-7837-418d-bad2-d2b9367a47c7" MajorVersionLimit="0"
		// MajorWithMinorVersionsLimit="0" WorkFlowId="" HasUniqueScopes="False"
		// AllowDeletion="True" AllowMultiResponses="False"
		// EnableAttachments="True" EnableModeration="False"
		// EnableVersioning="False" Hidden="False" MultipleDataList="False"
		// Ordered="False" ShowUser="True" EnableMinorVersion="False"
		// RequireCheckout="False"></List>

		String xmlString = OmElementToString(omElement);
		return readXml(xmlString, objectClass);
	}

	public static OMElement ObjectToOmElement(Object object)
			throws JAXBException, XMLStreamException {
		String xmlString = ObjectToXml(object);
		return StringToOmElement(xmlString);
	}

	/**
	 * Marshall object to XML string
	 * 
	 * @param objectItem
	 * @return
	 * @throws JAXBException
	 */
	public static String ObjectToXml(Object objectItem) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(objectItem.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.marshal(objectItem, sw); // save to StringWriter, you can
											// then call sw.toString() to get
											// java.lang.String
		return sw.toString();
	}

	/**
	 * Unmarshall XML string to object without XSD validation
	 * 
	 * @param xmlString
	 * @param ojectType
	 * @return
	 * @throws JAXBException
	 */
	private static Object XmlToObject(String xmlString, Class<?> objectClass)
			throws JAXBException {
		ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(
				xmlString.getBytes());
		JAXBContext context = JAXBContext.newInstance(objectClass);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		// note: setting schema to null will turn validator off
		unmarshaller.setSchema(null);
		Object xmlObject = objectClass.cast(unmarshaller
				.unmarshal(xmlContentBytes));
		return xmlObject;
	}

	public static Object readXml(String xmlString, Class<?> objectClass) {
		XMLDecoder decoder = new XMLDecoder(new ByteArrayInputStream(
				xmlString.getBytes()));
		Object xmlObject = decoder.readObject();
		decoder.close();
		return xmlObject;
	}

	public static String writeXml(Object object) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		XMLEncoder xmlEncoder = new XMLEncoder(outputStream);
		xmlEncoder.writeObject(object);
		xmlEncoder.close();

		return outputStream.toString();
	}

	/**
	 * Unmarshall XML string to object included XSD validation
	 * 
	 * @param xmlString
	 * @param ojectType
	 * @param pathToXsdFile
	 * @return
	 * @throws JAXBException
	 * @throws SAXException
	 */
	private static Object XmlToObject(String xmlString, Class<?> objectClass,
			String pathToXsdFile) throws JAXBException, SAXException {
		ByteArrayInputStream xmlContentBytes = new ByteArrayInputStream(
				xmlString.getBytes());
		JAXBContext context = JAXBContext.newInstance(objectClass);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Schema schema = SchemaFactory.newInstance(
				XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
				new File(pathToXsdFile));
		unmarshaller.setSchema(schema); // register item.xsd shcema for
										// validation
		Object xmlObject = objectClass.cast(unmarshaller
				.unmarshal(xmlContentBytes));
		return xmlObject;
	}

	/**
	 * Converts OMElement to xml string
	 * 
	 * @param omElement
	 * @return
	 * @throws XMLStreamException
	 * @throws FactoryConfigurationError
	 */
	public static String OmElementToString(OMElement omElement)
			throws XMLStreamException, FactoryConfigurationError {
		StringWriter stringWriter = null;
		String xmlString = null;

		stringWriter = new StringWriter();
		omElement.serialize(XMLOutputFactory.newInstance()
				.createXMLStreamWriter(stringWriter));
		stringWriter.flush();
		xmlString = stringWriter.toString();

		return xmlString;
	}

	/**
	 * Converts xml string to OMElement
	 * 
	 * @param xmlString
	 * @return
	 * @throws XMLStreamException
	 */
	public static OMElement StringToOmElement(String xmlString)
			throws XMLStreamException {
		OMElement omElement = AXIOMUtil.stringToOM(xmlString);
		return omElement;
	}
}
