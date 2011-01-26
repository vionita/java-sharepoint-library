/*
<s:element name="Batch">
  <s:complexType>
    <s:sequence>
      <s:element name="Method" maxOccurs="unbounded">
        <s:complexType mixed="true">
          <s:sequence>
            <s:element name="Field" maxOccurs="unbounded">
              <s:complexType>
                <s:simpleContent>
                  <s:extension base="s:string">
                    <s:attribute name="Name" type="s:string"/>
                  </s:extension>
                </s:simpleContent>
              </s:complexType>
            </s:element>
          </s:sequence>
          <s:attribute name="ID" type="s:unsignedInt" use="required" />
          <s:attribute name="Cmd" type="tns:MethodCmdEnum"
             use="required" />
        </s:complexType>
      </s:element>
    </s:sequence>
    <s:attribute name="ListVersion" type="s:unsignedInt" />
    <s:attribute name="OnError" type="tns:OnErrorEnum" />
    <s:attribute name="Version" type="s:string" />
    <s:attribute name="ViewName" type="s:string" />
    <s:attribute name="PreCalc"
                 type="core:TRUE_Case_Sensitive_Else_Anything"  />
    <s:attribute name="DateInUtc"
                 type="core:TRUE_Case_Sensitive_Else_Anything"  />
    <s:attribute name="Properties"
                 type="core:TRUE_Case_Sensitive_Else_Anything" />
    <s:attribute name="LockSchema"
                 type="core:TRUE_Case_Sensitive_Else_Anything" />
    <s:attribute name="RootFolder" type="s:string"  />
  </s:complexType>
</s:element>
 */

package com.google.code.sharepoint.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 * 
 * @author vkorecky
 */

// <Batch
// OnError = "Return" | "Continue"
// ListVersion = ""
// Version = ""
// ViewName = "">
// <Method>
// ...
// </Method>
// ...
// </Batch>

// <?xml version="1.0" encoding="UTF-8"?>
// <ows:Batch Version="6.0.2.5608" OnError="Return">
// <Method ID="0,ExportList">
// <SetList Scope="Request">Documents</SetList>
// <SetVar Name="Cmd">ExportList</SetVar>
// </Method>
// </ows:Batch>

public class SpBatch extends DataObject {
	/**
     *
     */
	public enum OnErrorEnum {
		/** Return */
		Return,
		/** Continue */
		Continue
	}

	/**
	 * Specifies the version number of the list. MUST only change protocol
	 * server behavior when used in conjunction with LockSchema="TRUE". The
	 * ListVersion to use is retrieved from a previous
	 * GetListItemChangesSinceToken call with no change token parameter included
	 * or a GetListItemChangesWithKnowledge call with no knowledge parameter
	 * included or where the schema on the protocol server changed or from a
	 * call to GetList or GetListAndView.
	 */
	private Integer listVersion = null;
	/**
	 * Specifies whether encountering an error SHOULD result in the entire
	 * operation being aborted, or whether subsequent methods in the batch
	 * SHOULD be executed. The default is to continue executing subsequent
	 * items.
	 */
	private OnErrorEnum onError = null;
	/**
	 * Specifies the version number of the service that is running on the
	 * protocol server. A version number consists of four integers in the format
	 * N.N.N.NNNN, which represent the major, minor, phase, and incremental
	 * versions of the product. This MUST be ignored by the protocol server.
	 */
	private String version = null;
	/** Specifies the GUID for the view to update. */
	private String viewName = null;
	/**
	 * Can be sent by the protocol client. MUST be ignored by the protocol
	 * server.
	 */
	private Boolean preCalc = null;
	/**
	 * Specifies whether dates passed up and returned are in UTC format. This
	 * defaults to FALSE.
	 */
	private Boolean dateInUtc = null;
	/**
	 * Specifies whether the properties in the list item property collection are
	 * to be returned as separate fields.
	 */
	private Boolean properties = null;
	/**
	 * If TRUE, and ListVersion is specified with a number, the protocol server
	 * MUST return a SOAP fault with error code 0x80070666 if the schema version
	 * passed in by the protocol client does not match the list schema version
	 * on the protocol server. This defaults to FALSE.
	 */
	private Boolean lockSchema = null;
	/**
	 * Specifies the URL of the folder where list items or list folders SHOULD
	 * be inserted, updated, or deleted. This can be a fully qualified URL or a
	 * site-relative URL. In the following examples, the list is called
	 * TestListItem which contains a folder TestNewFolder. Fully qualified URL
	 * example: http://siteservice/Lists/TestListItem/TestNewFolder,
	 * Site-relative URL: /Lists/TestListItem/TestNewFolder
	 */
	private String rootFolder = null;
	/** Methods */
	private List<SpMethod> methods = new ArrayList<SpMethod>();

	/**
	 * Creates SpBatch
	 */
	public SpBatch() {
	}

	public SpBatch(String xmlString) throws XMLStreamException, ParseException {
		OMElement xmlElement = null;
		xmlElement = Support.StringToOmElement(xmlString);

		if (xmlElement != null)
			Parse(xmlElement);
	}

	public SpBatch(OMElement xmlElement) throws ParseException {
		Parse(xmlElement);
	}

	/**
	 * Methods
	 * 
	 * @return
	 */
	public List<SpMethod> getMethods() {
		return methods;
	}

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyymmdd hh:MM:ss");
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ListVersion"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setListVersion(Integer.parseInt(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("OnError"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setOnError(OnErrorEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Version"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setVersion(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ViewName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setViewName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("PreCalc"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPreCalc(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("DateInUtc"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDateInUtc(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Properties"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setProperties(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"LockSchema"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLockSchema(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RootFolder"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRootFolder(tempAttributeValue);
		tempAttributeValue = null;

		Iterator children = xmlElement.getChildElements();
		while (children.hasNext()) {
			OMElement childElement = (OMElement) children.next();
			if (childElement.getQName().getLocalPart().equals("Method")) {
				SpMethod method = new SpMethod(childElement);
				this.getMethods().add(method);
			}
		}
	}

	/**
	 * Gets this object as xml string
	 * 
	 * @return
	 */
	@Override
	public String GetAsXmlString() {
		String xmlString = "<Batch ";

		if (getListVersion() != null)
			xmlString += "ListVersion='"
					+ String.valueOf(this.getListVersion()) + "' ";
		if (getOnError() != null)
			xmlString += "OnErrorEnum='" + this.getOnError().toString() + "' ";
		if (getVersion() != null)
			xmlString += "Version='" + getVersion() + "' ";
		if (getViewName() != null)
			xmlString += "ViewName='" + getViewName() + "' ";
		if (isPreCalc() != null)
			xmlString += "PreCalc='" + String.valueOf(isPreCalc()) + "' ";
		if (isDateInUtc() != null)
			xmlString += "DateInUtc='" + String.valueOf(isDateInUtc()) + "' ";
		if (isProperties() != null)
			xmlString += "Properties='" + String.valueOf(isProperties()) + "' ";
		if (getRootFolder() != null)
			xmlString += "RootFolder='" + String.valueOf(getRootFolder())
					+ "' ";
		xmlString += ">";

		for (SpMethod method : this.getMethods()) {
			xmlString += method.GetAsXmlString();
		}
		xmlString += "</Batch>";

		return xmlString;
	}

	/**
	 * Specifies whether dates passed up and returned are in UTC format. This
	 * defaults to FALSE.
	 * 
	 * @param DateInUtc
	 */
	public void setDateInUtc(Boolean DateInUtc) {
		this.dateInUtc = DateInUtc;
	}

	/**
	 * Specifies whether dates passed up and returned are in UTC format. This
	 * defaults to FALSE.
	 * 
	 * @return
	 */
	public Boolean isDateInUtc() {
		return dateInUtc;
	}

	/**
	 * Specifies the version number of the lst. MUST only change protocol server
	 * behavior when used in conjunction with LockSchema="TRUE". The ListVersion
	 * to use is retrieved from a previous GetListItemChangesSinceToken call
	 * with no change token parameter included or a
	 * GetListItemChangesWithKnowledge call with no knowledge parameter included
	 * or where the schema on the protocol server changed or from a call to
	 * GetList or GetListAndView.
	 * 
	 * @param listVersion
	 */
	public void setListVersion(Integer listVersion) {
		this.listVersion = listVersion;
	}

	/**
	 * Specifies the version number of the list. MUST only change protocol
	 * server behavior when used in conjunction with LockSchema="TRUE". The
	 * ListVersion to use is retrieved from a previous
	 * GetListItemChangesSinceToken call with no change token parameter included
	 * or a GetListItemChangesWithKnowledge call with no knowledge parameter
	 * included or where the schema on the protocol server changed or from a
	 * call to GetList or GetListAndView.
	 * 
	 * @return
	 */
	public Integer getListVersion() {
		return listVersion;
	}

	/**
	 * If TRUE, and ListVersion is specified with a number, the protocol server
	 * MUST return a SOAP fault with error code 0x80070666 if the schema version
	 * passed in by the protocol client does not match the list schema version
	 * on the protocol server. This defaults to FALSE.
	 * 
	 * @param LockSchema
	 */
	public void setLockSchema(Boolean LockSchema) {
		this.lockSchema = LockSchema;
	}

	/**
	 * If TRUE, and ListVersion is specified with a number, the protocol server
	 * MUST return a SOAP fault with error code 0x80070666 if the schema version
	 * passed in by the protocol client does not match the list schema version
	 * on the protocol server. This defaults to FALSE.
	 * 
	 * @return
	 */
	public Boolean isLockSchema() {
		return lockSchema;
	}

	/**
	 * Specifies whether encountering an error SHOULD result in the entire
	 * operation being aborted, or whether subsequent methods in the batch
	 * SHOULD be executed. The default is to continue executing subsequent
	 * items.
	 * 
	 * @param onError
	 */
	public void setOnError(OnErrorEnum onError) {
		this.onError = onError;
	}

	/**
	 * Specifies whether encountering an error SHOULD result in the entire
	 * operation being aborted, or whether subsequent methods in the batch
	 * SHOULD be executed. The default is to continue executing subsequent
	 * items.
	 * 
	 * @return
	 */
	public OnErrorEnum getOnError() {
		return onError;
	}

	/**
	 * Can be sent by the protocol client. MUST be ignored by the protocol
	 * server.
	 * 
	 * @param preCalc
	 */
	public void setPreCalc(Boolean preCalc) {
		this.preCalc = preCalc;
	}

	/**
	 * Can be sent by the protocol client. MUST be ignored by the protocol
	 * server.
	 * 
	 * @return
	 */
	public Boolean isPreCalc() {
		return preCalc;
	}

	/**
	 * Specifies whether the properties in the list item property collection are
	 * to be returned as separate fields.
	 * 
	 * @param Properties
	 */
	public void setProperties(Boolean Properties) {
		this.properties = Properties;
	}

	/**
	 * Specifies whether the properties in the list item property collection are
	 * to be returned as separate fields.
	 * 
	 * @return
	 */
	public Boolean isProperties() {
		return properties;
	}

	/**
	 * Specifies the URL of the folder where list items or list folders SHOULD
	 * be inserted, updated, or deleted. This can be a fully qualified URL or a
	 * site-relative URL.
	 * 
	 * In the following examples, the list is called TestListItem which contains
	 * a folder TestNewFolder.
	 * 
	 * Fully qualified URL example:
	 * 
	 * http://siteservice/Lists/TestListItem/TestNewFolder Site-relative URL:
	 * 
	 * /Lists/TestListItem/TestNewFolder
	 * 
	 * @param RootFolder
	 */
	public void setRootFolder(String RootFolder) {
		this.rootFolder = RootFolder;
	}

	/**
	 * Specifies the URL of the folder where list items or list folders SHOULD
	 * be inserted, updated, or deleted. This can be a fully qualified URL or a
	 * site-relative URL.
	 * 
	 * In the following examples, the list is called TestListItem which contains
	 * a folder TestNewFolder.
	 * 
	 * Fully qualified URL example:
	 * 
	 * http://siteservice/Lists/TestListItem/TestNewFolder Site-relative URL:
	 * 
	 * /Lists/TestListItem/TestNewFolder
	 * 
	 * @return
	 */
	public String getRootFolder() {
		return rootFolder;
	}

	/**
	 * Specifies the version number of the service that is running on the
	 * protocol server. A version number consists of four integers in the format
	 * N.N.N.NNNN, which represent the major, minor, phase, and incremental
	 * versions of the product. This MUST be ignored by the protocol server.
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Specifies the version number of the service that is running on the
	 * protocol server. A version number consists of four integers in the format
	 * N.N.N.NNNN, which represent the major, minor, phase, and incremental
	 * versions of the product. This MUST be ignored by the protocol server.
	 * 
	 * @return
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Specifies the GUID for the view to update.
	 * 
	 * @param viewName
	 */
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	/**
	 * Specifies the GUID for the view to update.
	 * 
	 * @return
	 */
	public String getViewName() {
		return viewName;
	}

	/**
	 * Methods
	 * 
	 * @param methods
	 */
	public void setMethods(Vector<SpMethod> methods) {
		this.methods = methods;
	}

	/**
	 * @return the preCalc
	 */
	public Boolean getPreCalc() {
		return preCalc;
	}

	/**
	 * @return the dateInUtc
	 */
	public Boolean getDateInUtc() {
		return dateInUtc;
	}

	/**
	 * @return the properties
	 */
	public Boolean getProperties() {
		return properties;
	}

	/**
	 * @return the lockSchema
	 */
	public Boolean getLockSchema() {
		return lockSchema;
	}

	/**
	 * @param methods
	 *            the methods to set
	 */
	public void setMethods(List<SpMethod> methods) {
		this.methods = methods;
	}
}
