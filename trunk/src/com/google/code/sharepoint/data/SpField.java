/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.sharepoint.data;

import java.io.StringWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

import com.google.code.sharepoint.data.General.*;

/**
 * 
 * @author vkorecky
 */

// <Field
// Aggregation = "sum" | "count" | "average" | "min" | "max" | "merge" |
// "plaintext" | "first" | "last"
// AllowDeletion = "TRUE" | "FALSE"
// AllowHyperlink = "TRUE" | "FALSE"
// AllowMultiVote = "TRUE" | "FALSE"
// AppendOnly = "TRUE" | "FALSE"
// AuthoringInfo = "Text"
// BaseType = "Integer" | "Text"
// CalType = "Integer"
// CanToggleHidden = "TRUE" | "FALSE"
// ClassInfo = "Text"
// ColName = "Text" ColName2 = "Text"
// Commas = "TRUE" | "FALSE" Customization = "Text"
// Decimals = "Integer"
// Description = "Text"
// Dir = "Text" Direction = "Text"
// DisplaceOnUpgrade = "TRUE" | "FALSE"
// DisplayImage = "Text"
// DisplayName = "Text"
// DisplayNameSrcField = "Text" DisplaySize = "Integer"
// Div = "Number"
// EnableLookup = "TRUE" | "FALSE" EnforceUniqueValues = "TRUE" | "FALSE"
// ExceptionImage = "Text"
// FieldRef = "Text"
// FillInChoice = "TRUE" | "FALSE"
// Filterable = "TRUE" | "FALSE"
// FilterableNoRecurrence = "TRUE" | "FALSE"
// ForcedDisplay = "Text" ForcePromoteDemote = "TRUE" | "FALSE"
// Format = "Text"
// FromBaseType = "TRUE" | "FALSE"
// Group = "Text"
// HeaderImage = "Text"
// Height = "Integer"
// Hidden = "TRUE" | "FALSE"
// HTMLEncode = "TRUE" | "FALSE"
// ID = "Text" Id = "Text"
// IMEMode = "inactive"
// Indexed = "TRUE" | "FALSE"
// IsolateStyles = "TRUE" | "FALSE" IsRelationship = "TRUE" | "FALSE"
// JoinColName = "Text"
// JoinRowOrdinal = "Integer"
// JoinType = "INNER" | "LEFT OUTER" | "RIGHT OUTER"
// LCID = "Integer" LinkToItem = "TRUE" | "FALSE" LinkToItemAllowed = "Text"
// List = "Text" ListItemMenu = "TRUE" | "FALSE" ListItemMenuAllowed = "Text
// Max = "Number"
// MaxLength = "Integer"
// Min = "Number"
// Mult = "TRUE" | "FALSE"
// Name = "Text"
// NegativeFormat = "MinusSign" | "Parens"
// Node = "Text"
// NoEditFormBreak = "TRUE" | "FALSE"
// NumLines = "Integer"
// Percentage = "TRUE" | "FALSE"
// PIAttribute = "Text"
// PITarget = "Text"
// PrependId = "TRUE" | "FALSE"
// Presence = "TRUE" | "FALSE"
// PrimaryKey = "TRUE" | "FALSE"
// PrimaryPIAttribute = "Text"
// PrimaryPITarget = "Text"
// ReadOnly = "TRUE" | "FALSE"
// ReadOnlyEnforced = "TRUE" | "FALSE" RelationshipDeleteBehavior = "Text"
// RenderXMLUsingPattern = "TRUE" | "FALSE"
// Required = "TRUE" | "FALSE"
// RestrictedMode = "TRUE" | "FALSE"
// ResultType = "Text"
// RichText = "TRUE" | "FALSE"
// RichTextMode = "Text"
// RowOrdinal = "Integer"
// Sealed = "TRUE" | "FALSE"
// SeparateLine = "TRUE" | "FALSE"
// SetAs = "Text"
// ShowAddressBookButton = "TRUE" | "FALSE" ShowAlways = "TRUE" | "FALSE"
// ShowField = "Text" | "Choice" | "Counter"
// ShowInDisplayForm = "TRUE" | "FALSE"
// ShowInEditForm = "TRUE" | "FALSE"
// ShowInFileDlg = "TRUE" | "FALSE"
// ShowInListSettings = "TRUE" | "FALSE"
// ShowInNewForm = "TRUE" | "FALSE"
// ShowInVersionHistory = "TRUE" | "FALSE"
// ShowInViewForms = "TRUE" | "FALSE"
// Sortable = "TRUE" | "FALSE"
// SourceID = "Text"
// StaticName = "Text"
// StorageTZ = "UTC" | "Abstract"
// StripWS = "TRUE" | "FALSE"
// SuppressNameDisplay = "TRUE" | "FALSE"
// TextOnly = "TRUE" | "FALSE"
// Title = "Text"
// Type = "Data_Type"
// UniqueId = "Text"
// UnlimitedLengthInDocumentLibrary = "TRUE" | "FALSE"
// URLEncode = "TRUE" | "FALSE"
// URLEncodeAsUrl = "TRUE" | "FALSE"
// UserSelectionMode = "Text"
// UserSelectionScope = "Integer" Version = "Text"
// Viewable = "TRUE" | "FALSE" WebId = "Text"
// Width = "Integer"
// WikiLinking = "TRUE" | "FALSE"
// XName = "Text">
// </Field>

public class SpField extends DataObject {
	private String name = null;
	private String type = null;
	private String value = null;
	private AggregationEnum aggregation = null;
	private Boolean allowDeletion = null;
	private Boolean allowHyperlink = null;
	private Boolean allowMultiVote = null;
	private Boolean appendOnly = null;
	private String authoringInfo = null;
	/**
	 * Optional Text. The BaseType attribute can be set to Integer, which stores
	 * values as integers, or to Text (default), which stores values as text.
	 * Note that it is not possible to create integer base-type choice fields.
	 */
	private SpBaseTypeEnum baseType = null;
	private Integer calType = null;
	private Boolean canToggleHidden = null;
	private String classInfo = null;
	private String colName = null;
	private String colName2 = null;
	private Boolean commas = null;
	private String customization = null;
	private Integer decimals = null;
	private String description = null;
	private String dir = null;
	private String direction = null;
	private Boolean displaceOnUpgrade = null;
	private String displayImage = null;
	private String displayName = null;
	private String displayNameSrcField = null;
	private Integer displaySize = null;
	private Integer div = null;
	private Boolean enableLookup = null;
	private Boolean enforceUniqueValues = null;
	private String exceptionImage = null;
	private String fieldRef = null;
	private Boolean fillInChoice = null;
	private Boolean filterable = null;
	private Boolean filterableNoRecurrence = null;
	private String forcedDisplay = null;
	private Boolean forcePromoteDemote = null;
	private String format = null;
	private Boolean fromBaseType = null;
	private String group = null;
	private String headerImage = null;
	private Integer height = null;
	private Boolean hidden = null;
	private Boolean htmlEncode = null;
	private String ID = null;
	private String id = null;
	private String iMEMode = null;
	private Boolean indexed = null;
	private Boolean isolateStyles = null;
	private Boolean isRelationship = null;
	private String joinColName = null;
	private Integer joinRowOrdinal = null;
	// "INNER" | "LEFT OUTER" | "RIGHT OUTER"
	private String joinType = null;
	private Integer LCID = null;
	private Boolean linkToItem = null;
	private String linkToItemAllowed = null;
	private String list = null;
	private Boolean listItemMenu = null;
	private Integer max = null;
	private Integer maxLength = null;
	private Integer min = null;
	private Boolean mult = null;
	private NegativeFormatEnum NegativeFormat = null;
	private String node = null;
	private Boolean noEditFormBreak = null;
	private Integer numLines = null;
	private Boolean percentage = null;
	private String piAttribute = null;
	private String piTarget = null;
	private Boolean prependId = null;
	private Boolean presence = null;
	private Boolean primaryKey = null;
	private String primaryPIAttribute = null;
	private String primaryPITarget = null;
	private Boolean readOnly = null;
	private Boolean readOnlyEnforced = null;
	private String relationshipDeleteBehavior = null;
	private Boolean renderXMLUsingPattern = null;
	private Boolean required = null;
	private Boolean restrictedMode = null;
	private String resultType = null;
	private Boolean richText = null;
	private String richTextMode = null;
	private Integer rowOrdinal = null;
	private Boolean sealed = null;
	private Boolean separateLine = null;
	private String setAs = null;
	private Boolean showAddressBookButton = null;
	private Boolean showAlways = null;
	private String listItemMenuAllowed = null;
	private ShowFieldEnum showField = null;
	private Boolean showInDisplayForm = null;
	private Boolean showInEditForm = null;
	private Boolean showInFileDlg = null;
	private Boolean showInListSettings = null;
	private Boolean showInNewForm = null;
	private Boolean showInVersionHistory = null;
	private Boolean showInViewForms = null;
	private Boolean sortable = null;
	private String sourceID = null;
	private String staticName = null;
	private StorageTZEnum storageTZ = null;
	private Boolean stripWS = null;
	private Boolean suppressNameDisplay = null;
	private Boolean textOnly = null;
	private String title = null;
	private String uniqueId = null;
	private Boolean unlimitedLengthInDocumentLibrary = null;
	private Boolean urlEncode = null;
	private Boolean urlEncodeAsUrl = null;
	private String userSelectionMode = null;
	private Integer userSelectionScope = null;
	private String version = null;
	private Boolean viewable = null;
	private String webId = null;
	private Integer width = null;
	private Boolean wikiLinking = null;
	private String xName = null;

	public SpField() {
	}

	public SpField(String xmlString) throws XMLStreamException {
		// TODO:
		// OMElement xmlElement = null;
		// xmlElement = AXIOMUtil.stringToOM(xmlString);
		//
		// if (xmlElement != null) {
		// try {
		// Parse(xmlElement);
		// } catch (ParseException ex) {
		// Logger.getLogger(SpList.class.getName()).log(Level.SEVERE,
		// null, ex);
		// }
		// }
	}

	public SpField(OMElement xmlElement) {
		// TODO:
		// try {
		// Parse(xmlElement);
		// } catch (ParseException ex) {
		// Logger.getLogger(SpList.class.getName())
		// .log(Level.SEVERE, null, ex);
		// }
	}

	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Aggregation"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAggregation(AggregationEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AllowDeletion"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAllowDeletion(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AllowHyperlink"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAllowHyperlink(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AllowMultiVote"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAllowMultiVote(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AppendOnly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAppendOnly(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AuthoringInfo"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAuthoringInfo(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("BaseType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setBaseType(SpBaseTypeEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"AppendOnly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAppendOnly(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("CalType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCalType(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"CanToggleHidden"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCanToggleHidden(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ClassInfo"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setClassInfo(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("ColName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setColName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ColName2"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setColName2(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Commas"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCommas(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Customization"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCustomization(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Decimals"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDecimals(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Description"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDescription(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Dir"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDir(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Direction"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDirection(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DisplaceOnUpgrade"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplaceOnUpgrade(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DisplayImage"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplayImage(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DisplayName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplayName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DisplayNameSrcField"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplayNameSrcField(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"DisplaySize"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplaySize(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Div"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDiv(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnableLookup"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnableLookup(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"EnforceUniqueValues"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setEnforceUniqueValues(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ExceptionImage"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setExceptionImage(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("FieldRef"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFieldRef(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"FillInChoice"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFillInChoice(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Filterable"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFilterable(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"FilterableNoRecurrence"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFilterableNoRecurrence(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ForcePromoteDemote"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setForcePromoteDemote(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ForcedDisplay"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setForcedDisplay(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Format"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFormat(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"FromBaseType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFromBaseType(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"HeaderImage"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHeaderImage(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Height"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHeight(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Hidden"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHidden(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"HTMLEncode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHtmlEncode(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("ID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setID(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Id"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("IMEMode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setiMEMode(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Indexed"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIndexed(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"IsolateStyles"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIsolateStyles(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"IsRelationship"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setIsRelationship(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"JoinColName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setJoinColName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"JoinRowOrdinal"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setJoinRowOrdinal(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("JoinType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setJoinType(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("LCID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLCID(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"LinkToItem"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLinkToItem(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"LinkToItemAllowed"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLinkToItemAllowed(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("List"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setList(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ListItemMenu"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setListItemMenu(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ListItemMenuAllowed"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setListItemMenuAllowed(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Max"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMax(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("MaxLength"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMaxLength(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Min"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMin(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Mult"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setMult(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Name"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"NegativeFormat"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNegativeFormat(NegativeFormatEnum
					.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Node"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNode(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"NoEditFormBreak"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNoEditFormBreak(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("NumLines"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNumLines(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"Percentage"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPercentage(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"PIAttribute"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPiAttribute(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("PITarget"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPiTarget(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"PrimaryPIAttribute"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPrimaryPIAttribute(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"PrimaryPITarget"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPrimaryPITarget(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("PrependId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPrependId(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ReadOnly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setReadOnly(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ReadOnlyEnforced"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setReadOnlyEnforced(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RelationshipDeleteBehavior"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRelationshipDeleteBehavior(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RenderXMLUsingPattern"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRenderXMLUsingPattern(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Required"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRequired(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RestrictedMode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRestrictedMode(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ResultType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setResultType(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("RichText"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRichText(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RichTextMode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRichTextMode(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"RowOrdinal"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRowOrdinal(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Sealed"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSealed(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"SeparateLine"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSeparateLine(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("SetAs"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSetAs(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowAddressBookButton"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowAddressBookButton(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowAlways"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowAlways(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("ShowField"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowField(ShowFieldEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInDisplayForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInDisplayForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInEditForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInEditForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInFileDlg"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInFileDlg(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInListSettings"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInListSettings(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInNewForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInNewForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInVersionHistory"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInVersionHistory(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ShowInViewForms"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInViewForms(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Sortable"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSortable(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("SourceID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSourceID(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"StaticName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setStaticName(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("StorageTZ"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setStorageTZ(StorageTZEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("StripWS"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setStripWS(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"SuppressNameDisplay"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSuppressNameDisplay(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("TextOnly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setTextOnly(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Title"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setTitle(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Type"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setType(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("UniqueId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUniqueId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"UnlimitedLengthInDocumentLibrary"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUnlimitedLengthInDocumentLibrary(Boolean
					.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("URLEncode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUrlEncode(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"URLEncodeAsUrl"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUrlEncodeAsUrl(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"UserSelectionMode"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUserSelectionMode(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"UserSelectionScope"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setUserSelectionScope(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Version"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setVersion(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement
				.getAttributeValue(new QName("Viewable"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setViewable(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("WebId"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWebId(tempAttributeValue);
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Width"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWidth(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"WikiLinking"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setWikiLinking(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("XName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setxName(tempAttributeValue);
		tempAttributeValue = null;
	}

	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<Field ");
		if (getAggregation() != null)
		stringWriter.append("Aggregation=\"" + String.valueOf(getAggregation()) + "\" ");
		if (getAllowDeletion() != null)
		stringWriter.append("AllowDeletion=\"" + String.valueOf(getAllowDeletion()) + "\" ");
		if (getAllowHyperlink() != null)
		stringWriter.append("AllowHyperlink=\"" + String.valueOf(getAllowHyperlink()) + "\" ");
		if (getAllowMultiVote() != null)
		stringWriter.append("AllowMultiVote=\"" + String.valueOf(getAllowMultiVote()) + "\" ");
		if (getAppendOnly() != null)
		stringWriter.append("AppendOnly=\"" + String.valueOf(getAppendOnly()) + "\" ");
		if (getAuthoringInfo() != null)
		stringWriter.append("AuthoringInfo=\"" + String.valueOf(getAuthoringInfo()) + "\" ");
		if (getBaseType() != null)
		stringWriter.append("BaseType=\"" + String.valueOf(getBaseType()) + "\" ");
		if (getCalType() != null)
		stringWriter.append("CalType=\"" + String.valueOf(getCalType()) + "\" ");
		if (getCanToggleHidden() != null)
		stringWriter.append("CanToggleHidden=\"" + String.valueOf(getCanToggleHidden()) + "\" ");
		if (getClassInfo() != null)
		stringWriter.append("ClassInfo=\"" + String.valueOf(getClassInfo()) + "\" ");
		if (getColName() != null)
		stringWriter.append("ColName=\"" + String.valueOf(getColName()) + "\" ");
		if (getColName2() != null)
		stringWriter.append("ColName2=\"" + String.valueOf(getColName2()) + "\" ");
		if (getCommas() != null)
		stringWriter.append("Commas=\"" + String.valueOf(getCommas()) + "\" ");
		if (getCustomization() != null)
		stringWriter.append("Customization=\"" + String.valueOf(getCustomization()) + "\" ");
		if (getDecimals() != null)
		stringWriter.append("Decimals=\"" + String.valueOf(getDecimals()) + "\" ");
		if (getDescription() != null)
		stringWriter.append("Description=\"" + String.valueOf(getDescription()) + "\" ");
		if (getDir() != null)
		stringWriter.append("Dir=\"" + String.valueOf(getDir()) + "\" ");
		if (getDirection() != null)
		stringWriter.append("Direction=\"" + String.valueOf(getDirection()) + "\" ");
		if (getDisplaceOnUpgrade() != null)
		stringWriter.append("DisplaceOnUpgrade=\"" + String.valueOf(getDisplaceOnUpgrade()) + "\" ");
		if (getDisplayImage() != null)
		stringWriter.append("DisplayImage=\"" + String.valueOf(getDisplayImage()) + "\" ");
		if (getDisplayName() != null)
		stringWriter.append("DisplayName=\"" + String.valueOf(getDisplayName()) + "\" ");
		if (getDisplayNameSrcField() != null)
		stringWriter.append("DisplayNameSrcField=\"" + String.valueOf(getDisplayNameSrcField()) + "\" ");
		if (getDisplaySize() != null)
		stringWriter.append("DisplaySize=\"" + String.valueOf(getDisplaySize()) + "\" ");
		if (getDiv() != null)
		stringWriter.append("Div=\"" + String.valueOf(getDiv()) + "\" ");
		if (getEnableLookup() != null)
		stringWriter.append("EnableLookup\"" + String.valueOf(getEnableLookup()) + "\" ");
		if (getEnforceUniqueValues() != null)
		stringWriter.append("EnforceUniqueValues=\"" + String.valueOf(getEnforceUniqueValues()) + "\" ");
		if (getExceptionImage() != null)
		stringWriter.append("ExceptionImage=\"" + String.valueOf(getExceptionImage()) + "\" ");
		if (getFieldRef() != null)
		stringWriter.append("FieldRef=\"" + String.valueOf(getFieldRef()) + "\" ");
		if (getFillInChoice() != null)
		stringWriter.append("FillInChoice=\"" + String.valueOf(getFillInChoice()) + "\" ");
		if (getFilterable() != null)
		stringWriter.append("Filterable=\"" + String.valueOf(getFilterable()) + "\" ");
		if (getFilterableNoRecurrence() != null)
		stringWriter.append("FilterableNoRecurrence=\"" + String.valueOf(getFilterableNoRecurrence()) + "\" ");
		if (getForcedDisplay() != null)
		stringWriter.append("ForcedDisplay=\"" + String.valueOf(getForcedDisplay()) + "\" ");
		if (getForcePromoteDemote() != null)
		stringWriter.append("ForcePromoteDemote=\"" + String.valueOf(getForcePromoteDemote()) + "\" ");
		if (getFormat() != null)
		stringWriter.append("Format=\"" + String.valueOf(getFormat()) + "\" ");
		if (getFromBaseType() != null)
		stringWriter.append("FromBaseType=\"" + String.valueOf(getFromBaseType()) + "\" ");
		if (getGroup() != null)
		stringWriter.append("Group=\"" + String.valueOf(getGroup()) + "\" ");
		if (getHeaderImage() != null)
		stringWriter.append("HeaderImage=\"" + String.valueOf(getHeaderImage()) + "\" ");
		if (getHeight() != null)
		stringWriter.append("Height=\"" + String.valueOf(getHeight()) + "\" ");
		if (getHidden() != null)
		stringWriter.append("Hidden=\"" + String.valueOf(getHidden()) + "\" ");
		if (getHtmlEncode() != null)
		stringWriter.append("HTMLEncode=\"" + String.valueOf(getHtmlEncode()) + "\" ");
		if (getID() != null)
		stringWriter.append("ID=\"" + String.valueOf(getID()) + "\" ");
		if (getId() != null)
		stringWriter.append("Id=\"" + String.valueOf(getId()) + "\" ");
		if (getiMEMode() != null)
		stringWriter.append("IMEMode=\"" + String.valueOf(getiMEMode()) + "\" ");
		if (getIndexed() != null)
		stringWriter.append("Indexed=\"" + String.valueOf(getIndexed()) + "\" ");
		if (getIsolateStyles() != null)
		stringWriter.append("IsolateStyles=\"" + String.valueOf(getIsolateStyles()) + "\" ");
		if (getIsRelationship() != null)
		stringWriter.append("IsRelationship=\"" + String.valueOf(getIsRelationship()) + "\" ");
		if (getJoinColName() != null)
		stringWriter.append("JoinColName=\"" + String.valueOf(getJoinColName()) + "\" ");
		if (getJoinRowOrdinal() != null)
		stringWriter.append("JoinRowOrdinal=\"" + String.valueOf(getJoinRowOrdinal()) + "\" ");
		if (getJoinType() != null)
		stringWriter.append("JoinType=\"" + String.valueOf(getJoinType()) + "\" ");
		if (getLCID() != null)
		stringWriter.append("LCID=\"" + String.valueOf(getLCID()) + "\" ");
		if (getLinkToItem() != null)
		stringWriter.append("LinkToItem=\"" + String.valueOf(getLinkToItem()) + "\" ");
		if (getLinkToItemAllowed() != null)
		stringWriter.append("LinkToItemAllowed=\"" + String.valueOf(getLinkToItemAllowed()) + "\" ");
		if (getList() != null)
		stringWriter.append("List=\"" + String.valueOf(getList()) + "\" ");
		if (getListItemMenu() != null)
		stringWriter.append("ListItemMenu=\"" + String.valueOf(getListItemMenu()) + "\" ");
		if (getListItemMenuAllowed() != null)
		stringWriter.append("ListItemMenuAllowed=\"" + String.valueOf(getListItemMenuAllowed()) + "\" ");
		if (getMax() != null)
		stringWriter.append("Max=\"" + String.valueOf(getMax()) + "\" ");
		if (getMaxLength() != null)
		stringWriter.append("MaxLength=\"" + String.valueOf(getMaxLength()) + "\" ");
		if (getMin() != null)
		stringWriter.append("Min=\"" + String.valueOf(getMin()) + "\" ");
		if (getMult() != null)
		stringWriter.append("Mult=\"" + String.valueOf(getMult()) + "\" ");
		if (getName() != null)
		stringWriter.append("Name=\"" + String.valueOf(getName()) + "\" ");
		if (getNegativeFormat() != null)
		stringWriter.append("NegativeFormat=\"" + String.valueOf(getNegativeFormat()) + "\" ");
		if (getNode() != null)
		stringWriter.append("Node=\"" + String.valueOf(getNode()) + "\" ");
		if (getNoEditFormBreak() != null)
		stringWriter.append("NoEditFormBreak=\"" + String.valueOf(getNoEditFormBreak()) + "\" ");
		if (getNumLines() != null)
		stringWriter.append("NumLines=\"" + String.valueOf(getNumLines()) + "\" ");
		if (getPercentage() != null)
		stringWriter.append("Percentage=\"" + String.valueOf(getPercentage()) + "\" ");
		if (getPiAttribute() != null)
		stringWriter.append("PIAttribute=\"" + String.valueOf(getPiAttribute()) + "\" ");
		if (getPiTarget() != null)
		stringWriter.append("PITarget=\"" + String.valueOf(getPiTarget()) + "\" ");
		if (getPrependId() != null)
		stringWriter.append("PrependId=\"" + String.valueOf(getPrependId()) + "\" ");
		if (getPresence() != null)
		stringWriter.append("Presence=\"" + String.valueOf(getPresence()) + "\" ");
		if (getPrimaryKey() != null)
		stringWriter.append("PrimaryKey=\"" + String.valueOf(getPrimaryKey()) + "\" ");
		if (getPrimaryPIAttribute() != null)
		stringWriter.append("PrimaryPIAttribute=\"" + String.valueOf(getPrimaryPIAttribute()) + "\" ");
		if (getPrimaryPITarget() != null)
		stringWriter.append("PrimaryPITarget=\"" + String.valueOf(getPrimaryPITarget()) + "\" ");
		if (getReadOnly() != null)
		stringWriter.append("ReadOnly=\"" + String.valueOf(getReadOnly()) + "\" ");
		if (getReadOnlyEnforced() != null)
		stringWriter.append("ReadOnlyEnforced=\"" + String.valueOf(getReadOnlyEnforced()) + "\" ");
		if (getRelationshipDeleteBehavior() != null)
		stringWriter.append("RelationshipDeleteBehavior=\"" + String.valueOf(getRelationshipDeleteBehavior()) + "\" ");
		if (getRenderXMLUsingPattern() != null)
		stringWriter.append("RenderXMLUsingPattern=\"" + String.valueOf(getRenderXMLUsingPattern()) + "\" ");
		if (getRequired() != null)
		stringWriter.append("Required=\"" + String.valueOf(getRequired()) + "\" ");
		if (getRestrictedMode() != null)
		stringWriter.append("RestrictedMode=\"" + String.valueOf(getRestrictedMode()) + "\" ");
		if (getResultType() != null)
		stringWriter.append("ResultType=\"" + String.valueOf(getResultType()) + "\" ");
		if (getRichText() != null)
		stringWriter.append("RichText=\"" + String.valueOf(getRichText()) + "\" ");
		if (getRichTextMode() != null)
		stringWriter.append("RichTextMode=\"" + String.valueOf(getRichTextMode()) + "\" ");
		if (getRowOrdinal() != null)
		stringWriter.append("RowOrdinal=\"" + String.valueOf(getRowOrdinal()) + "\" ");
		if (getSealed() != null)
		stringWriter.append("Sealed=\"" + String.valueOf(getSealed()) + "\" ");
		if (getSeparateLine() != null)
		stringWriter.append("SeparateLine=\"" + String.valueOf(getSeparateLine()) + "\" ");
		if (getSetAs() != null)
		stringWriter.append("SetAs=\"" + String.valueOf(getSetAs()) + "\" ");
		if (getShowAddressBookButton() != null)
		stringWriter.append("ShowAddressBookButton=\"" + String.valueOf(getShowAddressBookButton()) + "\" ");
		if (getShowAlways() != null)
		stringWriter.append("ShowAlways=\"" + String.valueOf(getShowAlways()) + "\" ");
		if (getShowField() != null)
		stringWriter.append("ShowField=\"" + String.valueOf(getShowField()) + "\" ");
		if (getShowInDisplayForm() != null)
		stringWriter.append("ShowInDisplayForm=\"" + String.valueOf(getShowInDisplayForm()) + "\" ");
		if (getShowInEditForm() != null)
		stringWriter.append("ShowInEditForm=\"" + String.valueOf(getShowInEditForm()) + "\" ");		
		if (getShowInFileDlg() != null)
		stringWriter.append("ShowInFileDlg=\"" + String.valueOf(getShowInFileDlg()) + "\" ");
		if (getShowInListSettings() != null)
		stringWriter.append("ShowInListSettings=\"" + String.valueOf(getShowInListSettings()) + "\" ");
		if (getShowInNewForm() != null)
		stringWriter.append("ShowInNewForm=\"" + String.valueOf(getShowInNewForm()) + "\" ");
		if (getShowInVersionHistory() != null)
		stringWriter.append("ShowInVersionHistory=\"" + String.valueOf(getShowInVersionHistory()) + "\" ");
		if (getShowInViewForms() != null)
		stringWriter.append("ShowInViewForms=\"" + String.valueOf(getShowInViewForms()) + "\" ");
		if (getSortable() != null)
		stringWriter.append("Sortable=\"" + String.valueOf(getSortable()) + "\" ");
		if (getSourceID() != null)
		stringWriter.append("SourceID=\"" + String.valueOf(getSourceID()) + "\" ");
		if (getStaticName() != null)
		stringWriter.append("StaticName=\"" + String.valueOf(getStaticName()) + "\" ");
		if (getStorageTZ() != null)
		stringWriter.append("StorageTZ=\"" + String.valueOf(getStorageTZ()) + "\" ");
		if (getStripWS() != null)
		stringWriter.append("StripWS=\"" + String.valueOf(getStripWS()) + "\" ");
		if (getSuppressNameDisplay() != null)
		stringWriter.append("SuppressNameDisplay=\"" + String.valueOf(getSuppressNameDisplay()) + "\" ");		
		if (getTextOnly() != null)
		stringWriter.append("TextOnly=\"" + String.valueOf(getTextOnly()) + "\" ");
		if (getTitle() != null)
		stringWriter.append("Title=\"" + String.valueOf(getTitle()) + "\" ");
		if (getType() != null)
		stringWriter.append("Type=\"" + String.valueOf(getType()) + "\" ");
		if (getUniqueId() != null)
		stringWriter.append("UniqueId=\"" + String.valueOf(getUniqueId()) + "\" ");
		if (getUnlimitedLengthInDocumentLibrary() != null)
		stringWriter.append("UnlimitedLengthInDocumentLibrary=\"" + String.valueOf(getUnlimitedLengthInDocumentLibrary()) + "\" ");
		if (getUrlEncode() != null)
		stringWriter.append("URLEncode=\"" + String.valueOf(getUrlEncode()) + "\" ");
		if (getUrlEncodeAsUrl() != null)
		stringWriter.append("URLEncodeAsUrl=\"" + String.valueOf(getUrlEncodeAsUrl()) + "\" ");
		if (getUserSelectionMode() != null)
		stringWriter.append("UserSelectionMode=\"" + String.valueOf(getUserSelectionMode()) + "\" ");
		if (getUserSelectionScope() != null)
		stringWriter.append("UserSelectionScope=\"" + String.valueOf(getUserSelectionScope()) + "\" ");
		if (getVersion() != null)
		stringWriter.append("Version=\"" + String.valueOf(getVersion()) + "\" ");
		if (getViewable() != null)
		stringWriter.append("Viewable=\"" + String.valueOf(getViewable()) + "\" ");
		if (getWebId() != null)
		stringWriter.append("WebId=\"" + String.valueOf(getWebId()) + "\" ");
		if (getWidth() != null)
		stringWriter.append("Width=\"" + String.valueOf(getWidth()) + "\" ");
		if (getWikiLinking() != null)
		stringWriter.append("WikiLinking=\"" + String.valueOf(getWikiLinking()) + "\" ");
		if (getxName() != null)
		stringWriter.append("XName=\"" + String.valueOf(getxName()) + "\" ");		
		stringWriter.append("</Field>");
				 
		return stringWriter.toString();
	}

	/**
	 * @return the aggregation
	 */
	public AggregationEnum getAggregation() {
		return aggregation;
	}

	/**
	 * @param aggregation
	 *            the aggregation to set
	 */
	public void setAggregation(AggregationEnum aggregation) {
		this.aggregation = aggregation;
	}

	/**
	 * @return the allowDeletion
	 */
	public Boolean getAllowDeletion() {
		return allowDeletion;
	}

	/**
	 * @param allowDeletion
	 *            the allowDeletion to set
	 */
	public void setAllowDeletion(Boolean allowDeletion) {
		this.allowDeletion = allowDeletion;
	}

	/**
	 * @return the allowHyperlink
	 */
	public Boolean getAllowHyperlink() {
		return allowHyperlink;
	}

	/**
	 * @param allowHyperlink
	 *            the allowHyperlink to set
	 */
	public void setAllowHyperlink(Boolean allowHyperlink) {
		this.allowHyperlink = allowHyperlink;
	}

	/**
	 * @return the allowMultiVote
	 */
	public Boolean getAllowMultiVote() {
		return allowMultiVote;
	}

	/**
	 * @param allowMultiVote
	 *            the allowMultiVote to set
	 */
	public void setAllowMultiVote(Boolean allowMultiVote) {
		this.allowMultiVote = allowMultiVote;
	}

	/**
	 * @return the appendOnly
	 */
	public Boolean getAppendOnly() {
		return appendOnly;
	}

	/**
	 * @param appendOnly
	 *            the appendOnly to set
	 */
	public void setAppendOnly(Boolean appendOnly) {
		this.appendOnly = appendOnly;
	}

	/**
	 * @return the authoringInfo
	 */
	public String getAuthoringInfo() {
		return authoringInfo;
	}

	/**
	 * @param authoringInfo
	 *            the authoringInfo to set
	 */
	public void setAuthoringInfo(String authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	/**
	 * @return the baseType
	 */
	public SpBaseTypeEnum getBaseType() {
		return baseType;
	}

	/**
	 * @param baseType
	 *            the baseType to set
	 */
	public void setBaseType(SpBaseTypeEnum baseType) {
		this.baseType = baseType;
	}

	/**
	 * @return the calType
	 */
	public Integer getCalType() {
		return calType;
	}

	/**
	 * @param calType
	 *            the calType to set
	 */
	public void setCalType(Integer calType) {
		this.calType = calType;
	}

	/**
	 * @return the canToggleHidden
	 */
	public Boolean getCanToggleHidden() {
		return canToggleHidden;
	}

	/**
	 * @param canToggleHidden
	 *            the canToggleHidden to set
	 */
	public void setCanToggleHidden(Boolean canToggleHidden) {
		this.canToggleHidden = canToggleHidden;
	}

	/**
	 * @return the classInfo
	 */
	public String getClassInfo() {
		return classInfo;
	}

	/**
	 * @param classInfo
	 *            the classInfo to set
	 */
	public void setClassInfo(String classInfo) {
		this.classInfo = classInfo;
	}

	/**
	 * @return the colName
	 */
	public String getColName() {
		return colName;
	}

	/**
	 * @param colName
	 *            the colName to set
	 */
	public void setColName(String colName) {
		this.colName = colName;
	}

	/**
	 * @return the colName2
	 */
	public String getColName2() {
		return colName2;
	}

	/**
	 * @param colName2
	 *            the colName2 to set
	 */
	public void setColName2(String colName2) {
		this.colName2 = colName2;
	}

	/**
	 * @return the commas
	 */
	public Boolean getCommas() {
		return commas;
	}

	/**
	 * @param commas
	 *            the commas to set
	 */
	public void setCommas(Boolean commas) {
		this.commas = commas;
	}

	/**
	 * @return the customization
	 */
	public String getCustomization() {
		return customization;
	}

	/**
	 * @param customization
	 *            the customization to set
	 */
	public void setCustomization(String customization) {
		this.customization = customization;
	}

	/**
	 * @return the decimals
	 */
	public Integer getDecimals() {
		return decimals;
	}

	/**
	 * @param decimals
	 *            the decimals to set
	 */
	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the dir
	 */
	public String getDir() {
		return dir;
	}

	/**
	 * @param dir
	 *            the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the displaceOnUpgrade
	 */
	public Boolean getDisplaceOnUpgrade() {
		return displaceOnUpgrade;
	}

	/**
	 * @param displaceOnUpgrade
	 *            the displaceOnUpgrade to set
	 */
	public void setDisplaceOnUpgrade(Boolean displaceOnUpgrade) {
		this.displaceOnUpgrade = displaceOnUpgrade;
	}

	/**
	 * @return the displayImage
	 */
	public String getDisplayImage() {
		return displayImage;
	}

	/**
	 * @param displayImage
	 *            the displayImage to set
	 */
	public void setDisplayImage(String displayImage) {
		this.displayImage = displayImage;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the displayNameSrcField
	 */
	public String getDisplayNameSrcField() {
		return displayNameSrcField;
	}

	/**
	 * @param displayNameSrcField
	 *            the displayNameSrcField to set
	 */
	public void setDisplayNameSrcField(String displayNameSrcField) {
		this.displayNameSrcField = displayNameSrcField;
	}

	/**
	 * @return the displaySize
	 */
	public Integer getDisplaySize() {
		return displaySize;
	}

	/**
	 * @param displaySize
	 *            the displaySize to set
	 */
	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	/**
	 * @return the div
	 */
	public Integer getDiv() {
		return div;
	}

	/**
	 * @param div
	 *            the div to set
	 */
	public void setDiv(Integer div) {
		this.div = div;
	}

	/**
	 * @return the enableLookup
	 */
	public Boolean getEnableLookup() {
		return enableLookup;
	}

	/**
	 * @param enableLookup
	 *            the enableLookup to set
	 */
	public void setEnableLookup(Boolean enableLookup) {
		this.enableLookup = enableLookup;
	}

	/**
	 * @return the enforceUniqueValues
	 */
	public Boolean getEnforceUniqueValues() {
		return enforceUniqueValues;
	}

	/**
	 * @param enforceUniqueValues
	 *            the enforceUniqueValues to set
	 */
	public void setEnforceUniqueValues(Boolean enforceUniqueValues) {
		this.enforceUniqueValues = enforceUniqueValues;
	}

	/**
	 * @return the exceptionImage
	 */
	public String getExceptionImage() {
		return exceptionImage;
	}

	/**
	 * @param exceptionImage
	 *            the exceptionImage to set
	 */
	public void setExceptionImage(String exceptionImage) {
		this.exceptionImage = exceptionImage;
	}

	/**
	 * @return the fieldRef
	 */
	public String getFieldRef() {
		return fieldRef;
	}

	/**
	 * @param fieldRef
	 *            the fieldRef to set
	 */
	public void setFieldRef(String fieldRef) {
		this.fieldRef = fieldRef;
	}

	/**
	 * @return the fillInChoice
	 */
	public Boolean getFillInChoice() {
		return fillInChoice;
	}

	/**
	 * @param fillInChoice
	 *            the fillInChoice to set
	 */
	public void setFillInChoice(Boolean fillInChoice) {
		this.fillInChoice = fillInChoice;
	}

	/**
	 * @return the filterable
	 */
	public Boolean getFilterable() {
		return filterable;
	}

	/**
	 * @param filterable
	 *            the filterable to set
	 */
	public void setFilterable(Boolean filterable) {
		this.filterable = filterable;
	}

	/**
	 * @return the filterableNoRecurrence
	 */
	public Boolean getFilterableNoRecurrence() {
		return filterableNoRecurrence;
	}

	/**
	 * @param filterableNoRecurrence
	 *            the filterableNoRecurrence to set
	 */
	public void setFilterableNoRecurrence(Boolean filterableNoRecurrence) {
		this.filterableNoRecurrence = filterableNoRecurrence;
	}

	/**
	 * @return the forcedDisplay
	 */
	public String getForcedDisplay() {
		return forcedDisplay;
	}

	/**
	 * @param forcedDisplay
	 *            the forcedDisplay to set
	 */
	public void setForcedDisplay(String forcedDisplay) {
		this.forcedDisplay = forcedDisplay;
	}

	/**
	 * @return the forcePromoteDemote
	 */
	public Boolean getForcePromoteDemote() {
		return forcePromoteDemote;
	}

	/**
	 * @param forcePromoteDemote
	 *            the forcePromoteDemote to set
	 */
	public void setForcePromoteDemote(Boolean forcePromoteDemote) {
		this.forcePromoteDemote = forcePromoteDemote;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the fromBaseType
	 */
	public Boolean getFromBaseType() {
		return fromBaseType;
	}

	/**
	 * @param fromBaseType
	 *            the fromBaseType to set
	 */
	public void setFromBaseType(Boolean fromBaseType) {
		this.fromBaseType = fromBaseType;
	}

	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return the headerImage
	 */
	public String getHeaderImage() {
		return headerImage;
	}

	/**
	 * @param headerImage
	 *            the headerImage to set
	 */
	public void setHeaderImage(String headerImage) {
		this.headerImage = headerImage;
	}

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @return the hidden
	 */
	public Boolean getHidden() {
		return hidden;
	}

	/**
	 * @param hidden
	 *            the hidden to set
	 */
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	/**
	 * @return the htmlEncode
	 */
	public Boolean getHtmlEncode() {
		return htmlEncode;
	}

	/**
	 * @param htmlEncode
	 *            the htmlEncode to set
	 */
	public void setHtmlEncode(Boolean htmlEncode) {
		this.htmlEncode = htmlEncode;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the iMEMode
	 */
	public String getiMEMode() {
		return iMEMode;
	}

	/**
	 * @param iMEMode
	 *            the iMEMode to set
	 */
	public void setiMEMode(String iMEMode) {
		this.iMEMode = iMEMode;
	}

	/**
	 * @return the indexed
	 */
	public Boolean getIndexed() {
		return indexed;
	}

	/**
	 * @param indexed
	 *            the indexed to set
	 */
	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;
	}

	/**
	 * @return the isolateStyles
	 */
	public Boolean getIsolateStyles() {
		return isolateStyles;
	}

	/**
	 * @param isolateStyles
	 *            the isolateStyles to set
	 */
	public void setIsolateStyles(Boolean isolateStyles) {
		this.isolateStyles = isolateStyles;
	}

	/**
	 * @return the isRelationship
	 */
	public Boolean getIsRelationship() {
		return isRelationship;
	}

	/**
	 * @param isRelationship
	 *            the isRelationship to set
	 */
	public void setIsRelationship(Boolean isRelationship) {
		this.isRelationship = isRelationship;
	}

	/**
	 * @return the joinColName
	 */
	public String getJoinColName() {
		return joinColName;
	}

	/**
	 * @param joinColName
	 *            the joinColName to set
	 */
	public void setJoinColName(String joinColName) {
		this.joinColName = joinColName;
	}

	/**
	 * @return the joinRowOrdinal
	 */
	public Integer getJoinRowOrdinal() {
		return joinRowOrdinal;
	}

	/**
	 * @param joinRowOrdinal
	 *            the joinRowOrdinal to set
	 */
	public void setJoinRowOrdinal(Integer joinRowOrdinal) {
		this.joinRowOrdinal = joinRowOrdinal;
	}

	/**
	 * @return the joinType
	 */
	public String getJoinType() {
		return joinType;
	}

	/**
	 * @param joinType
	 *            the joinType to set
	 */
	public void setJoinType(String joinType) {
		this.joinType = joinType;
	}

	/**
	 * @return the lCID
	 */
	public Integer getLCID() {
		return LCID;
	}

	/**
	 * @param lCID
	 *            the lCID to set
	 */
	public void setLCID(Integer lCID) {
		LCID = lCID;
	}

	/**
	 * @return the linkToItem
	 */
	public Boolean getLinkToItem() {
		return linkToItem;
	}

	/**
	 * @param linkToItem
	 *            the linkToItem to set
	 */
	public void setLinkToItem(Boolean linkToItem) {
		this.linkToItem = linkToItem;
	}

	/**
	 * @return the linkToItemAllowed
	 */
	public String getLinkToItemAllowed() {
		return linkToItemAllowed;
	}

	/**
	 * @param linkToItemAllowed
	 *            the linkToItemAllowed to set
	 */
	public void setLinkToItemAllowed(String linkToItemAllowed) {
		this.linkToItemAllowed = linkToItemAllowed;
	}

	/**
	 * @return the list
	 */
	public String getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(String list) {
		this.list = list;
	}

	/**
	 * @return the listItemMenu
	 */
	public Boolean getListItemMenu() {
		return listItemMenu;
	}

	/**
	 * @param listItemMenu
	 *            the listItemMenu to set
	 */
	public void setListItemMenu(Boolean listItemMenu) {
		this.listItemMenu = listItemMenu;
	}

	/**
	 * @return the max
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * @return the maxLength
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * @param maxLength
	 *            the maxLength to set
	 */
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(Integer min) {
		this.min = min;
	}

	/**
	 * @return the mult
	 */
	public Boolean getMult() {
		return mult;
	}

	/**
	 * @param mult
	 *            the mult to set
	 */
	public void setMult(Boolean mult) {
		this.mult = mult;
	}

	/**
	 * @return the negativeFormat
	 */
	public NegativeFormatEnum getNegativeFormat() {
		return NegativeFormat;
	}

	/**
	 * @param negativeFormat
	 *            the negativeFormat to set
	 */
	public void setNegativeFormat(NegativeFormatEnum negativeFormat) {
		NegativeFormat = negativeFormat;
	}

	/**
	 * @return the node
	 */
	public String getNode() {
		return node;
	}

	/**
	 * @param node
	 *            the node to set
	 */
	public void setNode(String node) {
		this.node = node;
	}

	/**
	 * @return the noEditFormBreak
	 */
	public Boolean getNoEditFormBreak() {
		return noEditFormBreak;
	}

	/**
	 * @param noEditFormBreak
	 *            the noEditFormBreak to set
	 */
	public void setNoEditFormBreak(Boolean noEditFormBreak) {
		this.noEditFormBreak = noEditFormBreak;
	}

	/**
	 * @return the numLines
	 */
	public Integer getNumLines() {
		return numLines;
	}

	/**
	 * @param numLines
	 *            the numLines to set
	 */
	public void setNumLines(Integer numLines) {
		this.numLines = numLines;
	}

	/**
	 * @return the percentage
	 */
	public Boolean getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(Boolean percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the piAttribute
	 */
	public String getPiAttribute() {
		return piAttribute;
	}

	/**
	 * @param piAttribute
	 *            the piAttribute to set
	 */
	public void setPiAttribute(String piAttribute) {
		this.piAttribute = piAttribute;
	}

	/**
	 * @return the piTarget
	 */
	public String getPiTarget() {
		return piTarget;
	}

	/**
	 * @param piTarget
	 *            the piTarget to set
	 */
	public void setPiTarget(String piTarget) {
		this.piTarget = piTarget;
	}

	/**
	 * @return the prependId
	 */
	public Boolean getPrependId() {
		return prependId;
	}

	/**
	 * @param prependId
	 *            the prependId to set
	 */
	public void setPrependId(Boolean prependId) {
		this.prependId = prependId;
	}

	/**
	 * @return the presence
	 */
	public Boolean getPresence() {
		return presence;
	}

	/**
	 * @param presence
	 *            the presence to set
	 */
	public void setPresence(Boolean presence) {
		this.presence = presence;
	}

	/**
	 * @return the primaryKey
	 */
	public Boolean getPrimaryKey() {
		return primaryKey;
	}

	/**
	 * @param primaryKey
	 *            the primaryKey to set
	 */
	public void setPrimaryKey(Boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	/**
	 * @return the primaryPIAttribute
	 */
	public String getPrimaryPIAttribute() {
		return primaryPIAttribute;
	}

	/**
	 * @param primaryPIAttribute
	 *            the primaryPIAttribute to set
	 */
	public void setPrimaryPIAttribute(String primaryPIAttribute) {
		this.primaryPIAttribute = primaryPIAttribute;
	}

	/**
	 * @return the primaryPITarget
	 */
	public String getPrimaryPITarget() {
		return primaryPITarget;
	}

	/**
	 * @param primaryPITarget
	 *            the primaryPITarget to set
	 */
	public void setPrimaryPITarget(String primaryPITarget) {
		this.primaryPITarget = primaryPITarget;
	}

	/**
	 * @return the readOnly
	 */
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * @param readOnly
	 *            the readOnly to set
	 */
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	/**
	 * @return the readOnlyEnforced
	 */
	public Boolean getReadOnlyEnforced() {
		return readOnlyEnforced;
	}

	/**
	 * @param readOnlyEnforced
	 *            the readOnlyEnforced to set
	 */
	public void setReadOnlyEnforced(Boolean readOnlyEnforced) {
		this.readOnlyEnforced = readOnlyEnforced;
	}

	/**
	 * @return the relationshipDeleteBehavior
	 */
	public String getRelationshipDeleteBehavior() {
		return relationshipDeleteBehavior;
	}

	/**
	 * @param relationshipDeleteBehavior
	 *            the relationshipDeleteBehavior to set
	 */
	public void setRelationshipDeleteBehavior(String relationshipDeleteBehavior) {
		this.relationshipDeleteBehavior = relationshipDeleteBehavior;
	}

	/**
	 * @return the renderXMLUsingPattern
	 */
	public Boolean getRenderXMLUsingPattern() {
		return renderXMLUsingPattern;
	}

	/**
	 * @param renderXMLUsingPattern
	 *            the renderXMLUsingPattern to set
	 */
	public void setRenderXMLUsingPattern(Boolean renderXMLUsingPattern) {
		this.renderXMLUsingPattern = renderXMLUsingPattern;
	}

	/**
	 * @return the required
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * @param required
	 *            the required to set
	 */
	public void setRequired(Boolean required) {
		this.required = required;
	}

	/**
	 * @return the restrictedMode
	 */
	public Boolean getRestrictedMode() {
		return restrictedMode;
	}

	/**
	 * @param restrictedMode
	 *            the restrictedMode to set
	 */
	public void setRestrictedMode(Boolean restrictedMode) {
		this.restrictedMode = restrictedMode;
	}

	/**
	 * @return the resultType
	 */
	public String getResultType() {
		return resultType;
	}

	/**
	 * @param resultType
	 *            the resultType to set
	 */
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	/**
	 * @return the richText
	 */
	public Boolean getRichText() {
		return richText;
	}

	/**
	 * @param richText
	 *            the richText to set
	 */
	public void setRichText(Boolean richText) {
		this.richText = richText;
	}

	/**
	 * @return the richTextMode
	 */
	public String getRichTextMode() {
		return richTextMode;
	}

	/**
	 * @param richTextMode
	 *            the richTextMode to set
	 */
	public void setRichTextMode(String richTextMode) {
		this.richTextMode = richTextMode;
	}

	/**
	 * @return the rowOrdinal
	 */
	public Integer getRowOrdinal() {
		return rowOrdinal;
	}

	/**
	 * @param rowOrdinal
	 *            the rowOrdinal to set
	 */
	public void setRowOrdinal(Integer rowOrdinal) {
		this.rowOrdinal = rowOrdinal;
	}

	/**
	 * @return the sealed
	 */
	public Boolean getSealed() {
		return sealed;
	}

	/**
	 * @param sealed
	 *            the sealed to set
	 */
	public void setSealed(Boolean sealed) {
		this.sealed = sealed;
	}

	/**
	 * @return the separateLine
	 */
	public Boolean getSeparateLine() {
		return separateLine;
	}

	/**
	 * @param separateLine
	 *            the separateLine to set
	 */
	public void setSeparateLine(Boolean separateLine) {
		this.separateLine = separateLine;
	}

	/**
	 * @return the setAs
	 */
	public String getSetAs() {
		return setAs;
	}

	/**
	 * @param setAs
	 *            the setAs to set
	 */
	public void setSetAs(String setAs) {
		this.setAs = setAs;
	}

	/**
	 * @return the showAddressBookButton
	 */
	public Boolean getShowAddressBookButton() {
		return showAddressBookButton;
	}

	/**
	 * @param showAddressBookButton
	 *            the showAddressBookButton to set
	 */
	public void setShowAddressBookButton(Boolean showAddressBookButton) {
		this.showAddressBookButton = showAddressBookButton;
	}

	/**
	 * @return the showAlways
	 */
	public Boolean getShowAlways() {
		return showAlways;
	}

	/**
	 * @param showAlways
	 *            the showAlways to set
	 */
	public void setShowAlways(Boolean showAlways) {
		this.showAlways = showAlways;
	}

	/**
	 * @return the listItemMenuAllowed
	 */
	public String getListItemMenuAllowed() {
		return listItemMenuAllowed;
	}

	/**
	 * @param listItemMenuAllowed
	 *            the listItemMenuAllowed to set
	 */
	public void setListItemMenuAllowed(String listItemMenuAllowed) {
		this.listItemMenuAllowed = listItemMenuAllowed;
	}

	/**
	 * @return the showField
	 */
	public ShowFieldEnum getShowField() {
		return showField;
	}

	/**
	 * @param showField
	 *            the showField to set
	 */
	public void setShowField(ShowFieldEnum showField) {
		this.showField = showField;
	}

	/**
	 * @return the showInDisplayForm
	 */
	public Boolean getShowInDisplayForm() {
		return showInDisplayForm;
	}

	/**
	 * @param showInDisplayForm
	 *            the showInDisplayForm to set
	 */
	public void setShowInDisplayForm(Boolean showInDisplayForm) {
		this.showInDisplayForm = showInDisplayForm;
	}

	/**
	 * @return the showInEditForm
	 */
	public Boolean getShowInEditForm() {
		return showInEditForm;
	}

	/**
	 * @param showInEditForm
	 *            the showInEditForm to set
	 */
	public void setShowInEditForm(Boolean showInEditForm) {
		this.showInEditForm = showInEditForm;
	}

	/**
	 * @return the showInFileDlg
	 */
	public Boolean getShowInFileDlg() {
		return showInFileDlg;
	}

	/**
	 * @param showInFileDlg
	 *            the showInFileDlg to set
	 */
	public void setShowInFileDlg(Boolean showInFileDlg) {
		this.showInFileDlg = showInFileDlg;
	}

	/**
	 * @return the showInListSettings
	 */
	public Boolean getShowInListSettings() {
		return showInListSettings;
	}

	/**
	 * @param showInListSettings
	 *            the showInListSettings to set
	 */
	public void setShowInListSettings(Boolean showInListSettings) {
		this.showInListSettings = showInListSettings;
	}

	/**
	 * @return the showInNewForm
	 */
	public Boolean getShowInNewForm() {
		return showInNewForm;
	}

	/**
	 * @param showInNewForm
	 *            the showInNewForm to set
	 */
	public void setShowInNewForm(Boolean showInNewForm) {
		this.showInNewForm = showInNewForm;
	}

	/**
	 * @return the showInVersionHistory
	 */
	public Boolean getShowInVersionHistory() {
		return showInVersionHistory;
	}

	/**
	 * @param showInVersionHistory
	 *            the showInVersionHistory to set
	 */
	public void setShowInVersionHistory(Boolean showInVersionHistory) {
		this.showInVersionHistory = showInVersionHistory;
	}

	/**
	 * @return the showInViewForms
	 */
	public Boolean getShowInViewForms() {
		return showInViewForms;
	}

	/**
	 * @param showInViewForms
	 *            the showInViewForms to set
	 */
	public void setShowInViewForms(Boolean showInViewForms) {
		this.showInViewForms = showInViewForms;
	}

	/**
	 * @return the sortable
	 */
	public Boolean getSortable() {
		return sortable;
	}

	/**
	 * @param sortable
	 *            the sortable to set
	 */
	public void setSortable(Boolean sortable) {
		this.sortable = sortable;
	}

	/**
	 * @return the sourceID
	 */
	public String getSourceID() {
		return sourceID;
	}

	/**
	 * @param sourceID
	 *            the sourceID to set
	 */
	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	/**
	 * @return the staticName
	 */
	public String getStaticName() {
		return staticName;
	}

	/**
	 * @param staticName
	 *            the staticName to set
	 */
	public void setStaticName(String staticName) {
		this.staticName = staticName;
	}

	/**
	 * @return the storageTZ
	 */
	public StorageTZEnum getStorageTZ() {
		return storageTZ;
	}

	/**
	 * @param storageTZ
	 *            the storageTZ to set
	 */
	public void setStorageTZ(StorageTZEnum storageTZ) {
		this.storageTZ = storageTZ;
	}

	/**
	 * @return the stripWS
	 */
	public Boolean getStripWS() {
		return stripWS;
	}

	/**
	 * @param stripWS
	 *            the stripWS to set
	 */
	public void setStripWS(Boolean stripWS) {
		this.stripWS = stripWS;
	}

	/**
	 * @return the suppressNameDisplay
	 */
	public Boolean getSuppressNameDisplay() {
		return suppressNameDisplay;
	}

	/**
	 * @param suppressNameDisplay
	 *            the suppressNameDisplay to set
	 */
	public void setSuppressNameDisplay(Boolean suppressNameDisplay) {
		this.suppressNameDisplay = suppressNameDisplay;
	}

	/**
	 * @return the textOnly
	 */
	public Boolean getTextOnly() {
		return textOnly;
	}

	/**
	 * @param textOnly
	 *            the textOnly to set
	 */
	public void setTextOnly(Boolean textOnly) {
		this.textOnly = textOnly;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * @param uniqueId
	 *            the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * @return the unlimitedLengthInDocumentLibrary
	 */
	public Boolean getUnlimitedLengthInDocumentLibrary() {
		return unlimitedLengthInDocumentLibrary;
	}

	/**
	 * @param unlimitedLengthInDocumentLibrary
	 *            the unlimitedLengthInDocumentLibrary to set
	 */
	public void setUnlimitedLengthInDocumentLibrary(
			Boolean unlimitedLengthInDocumentLibrary) {
		this.unlimitedLengthInDocumentLibrary = unlimitedLengthInDocumentLibrary;
	}

	/**
	 * @return the urlEncode
	 */
	public Boolean getUrlEncode() {
		return urlEncode;
	}

	/**
	 * @param urlEncode
	 *            the urlEncode to set
	 */
	public void setUrlEncode(Boolean urlEncode) {
		this.urlEncode = urlEncode;
	}

	/**
	 * @return the urlEncodeAsUrl
	 */
	public Boolean getUrlEncodeAsUrl() {
		return urlEncodeAsUrl;
	}

	/**
	 * @param urlEncodeAsUrl
	 *            the urlEncodeAsUrl to set
	 */
	public void setUrlEncodeAsUrl(Boolean urlEncodeAsUrl) {
		this.urlEncodeAsUrl = urlEncodeAsUrl;
	}

	/**
	 * @return the userSelectionMode
	 */
	public String getUserSelectionMode() {
		return userSelectionMode;
	}

	/**
	 * @param userSelectionMode
	 *            the userSelectionMode to set
	 */
	public void setUserSelectionMode(String userSelectionMode) {
		this.userSelectionMode = userSelectionMode;
	}

	/**
	 * @return the userSelectionScope
	 */
	public Integer getUserSelectionScope() {
		return userSelectionScope;
	}

	/**
	 * @param userSelectionScope
	 *            the userSelectionScope to set
	 */
	public void setUserSelectionScope(Integer userSelectionScope) {
		this.userSelectionScope = userSelectionScope;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the viewable
	 */
	public Boolean getViewable() {
		return viewable;
	}

	/**
	 * @param viewable
	 *            the viewable to set
	 */
	public void setViewable(Boolean viewable) {
		this.viewable = viewable;
	}

	/**
	 * @return the webId
	 */
	public String getWebId() {
		return webId;
	}

	/**
	 * @param webId
	 *            the webId to set
	 */
	public void setWebId(String webId) {
		this.webId = webId;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the wikiLinking
	 */
	public Boolean getWikiLinking() {
		return wikiLinking;
	}

	/**
	 * @param wikiLinking
	 *            the wikiLinking to set
	 */
	public void setWikiLinking(Boolean wikiLinking) {
		this.wikiLinking = wikiLinking;
	}

	/**
	 * @return the xName
	 */
	public String getxName() {
		return xName;
	}

	/**
	 * @param xName
	 *            the xName to set
	 */
	public void setxName(String xName) {
		this.xName = xName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
