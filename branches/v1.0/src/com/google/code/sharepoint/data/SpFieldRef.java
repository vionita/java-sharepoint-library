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
 * @author "Vladislav Korecký"
 *
 */

//<FieldRef
//	Aggregation="sum" | "count" | "average" | "min" | "max" | "merge" | "plaintext" | "first" | "last"
//	Customization="Text"
//	DefaultValue="Text"
//	Description="Text"
//	DisplayName="Text"
//	Format="Text"
//	Filterable="TRUE" | "FALSE"
//	FilterableNoRecurrence="TRUE" | "FALSE"
//	FromBaseType="TRUE" | "FALSE"
//	Hidden="TRUE" | "FALSE" | "orResource"
//	ID="Text"
//	Locked="TRUE" | "FALSE"
//	Name="Text"
//	Node="Text"
//	NumLines="Integer"
//	PIAttribute="Text"
//	PITarget="Text"
//	PrimaryPIAttribute="Text"
//	PrimaryPITarge="Text"
//	ReadOnly="TRUE" | "FALSE"
//	ReadOnlyClient="TRUE" | "FALSE"
//	Required="TRUE" | "FALSE"
//	Sealed="TRUE" | "FALSE"
//	ShowInDisplayForm="TRUE" | "FALSE"
//	ShowInEditForm="TRUE" | "FALSE"
//	ShowInFileDlg="TRUE" | "FALSE"
//	ShowInListSettings="TRUE" | "FALSE"
//	ShowInNewForm="TRUE" | "FALSE"
//	Sortable="TRUE" | "FALSE">
//</FieldRef>


public class SpFieldRef extends DataObject {
	private AggregationEnum aggregation = null;
	private String customization = null;
	private String defaultValue = null;
	private String description = null;
	private String displayName = null;
	private String format = null;
	private Boolean filterable = null;
	private Boolean filterableNoRecurrence = null;
	private Boolean fromBaseType = null;
	private Boolean hidden = null;
	private String ID = null;
	private Boolean locked = null;
	private String name = null;
	private String node = null;
	private Integer numLines = null;
	private String piAttribute = null;
	private String piTarget = null;
	private String primaryPIAttribute = null;
	private String primaryPITarge = null;
	private Boolean readOnly = null;
	private Boolean readOnlyClient = null;
	private Boolean required = null;
	private Boolean sealed = null;
	private Boolean showInDisplayForm = null;
	private Boolean showInEditForm = null;
	private Boolean showInFileDlg = null;
	private Boolean showInListSettings = null;
	private Boolean showInNewForm = null;
	private Boolean sortable = null;
	
	
	public SpFieldRef() {
    }    

	public SpFieldRef(String xmlString) throws XMLStreamException, ParseException { 
		OMElement xmlElement = null;
		xmlElement = Support.stringToOmElement(xmlString);

		if (xmlElement != null) {		
			parse(xmlElement);			
		}
	}

	public SpFieldRef(OMElement xmlElement) throws ParseException { 
		parse(xmlElement);
	}
		
	@Override
	public void parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd hh:mm:ss");
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Aggregation"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setAggregation(AggregationEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Customization"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCustomization(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("DefaultValue"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDefaultValue(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Description"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDescription(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("DisplayName"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setDisplayName(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Format"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFormat(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Filterable"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFilterable(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("FilterableNoRecurrence"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFilterableNoRecurrence(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("FromBaseType"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setFromBaseType(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Hidden"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setHidden(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setID(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Locked"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setLocked(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Name"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setName(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Node"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNode(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("NumLines"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setNumLines(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("PIAttribute"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPiAttribute(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("PITarget"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPiTarget(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("PrimaryPIAttribute"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPrimaryPIAttribute(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("PrimaryPITarge"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setPrimaryPITarge(tempAttributeValue);
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ReadOnly"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setReadOnly(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ReadOnlyClient"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setReadOnlyClient(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Required"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setRequired(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Sealed"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSealed(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ShowInDisplayForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInDisplayForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ShowInEditForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInEditForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ShowInFileDlg"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInFileDlg(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ShowInListSettings"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInListSettings(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("ShowInNewForm"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setShowInNewForm(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
		
		tempAttributeValue = xmlElement.getAttributeValue(new QName("Sortable"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setSortable(Boolean.valueOf(tempAttributeValue));
		tempAttributeValue = null;
	}
	@Override
	public String getAsXmlString() {
		StringWriter stringWriter = new StringWriter();
		stringWriter.append("<FieldRef ");
		if (getAggregation() != null)
		stringWriter.append("Aggregation=\"" + String.valueOf(getAggregation()) + "\" ");
		if (getCustomization() != null)
		stringWriter.append("Customization=\"" + String.valueOf(getCustomization()) + "\" ");
		if (getDefaultValue() != null)
		stringWriter.append("DefaultValue=\"" + String.valueOf(getDefaultValue()) + "\" ");
		if (getDescription() != null)
		stringWriter.append("Description=\"" + String.valueOf(getDescription()) + "\" ");
		if (getDisplayName() != null)
		stringWriter.append("DisplayName=\"" + String.valueOf(getDisplayName()) + "\" ");
		if (getFormat() != null)
		stringWriter.append("Format=\"" + String.valueOf(getFormat()) + "\" ");
		if (getFilterable() != null)
		stringWriter.append("Filterable=\"" + String.valueOf(getFilterable()) + "\" ");
		if (getFilterableNoRecurrence() != null)
		stringWriter.append("FilterableNoRecurrence=\"" + String.valueOf(getFilterableNoRecurrence()) + "\" ");
		if (getFromBaseType() != null)
		stringWriter.append("FromBaseType=\"" + String.valueOf(getFromBaseType()) + "\" ");
		if (getHidden() != null)
		stringWriter.append("Hidden=\"" + String.valueOf(getHidden()) + "\" ");
		if (getID() != null)
		stringWriter.append("ID=\"" + String.valueOf(getID()) + "\" ");
		if (getLocked() != null)
		stringWriter.append("Locked=\"" + String.valueOf(getLocked()) + "\" ");
		if (getName() != null)
		stringWriter.append("Name=\"" + String.valueOf(getName()) + "\" ");
		if (getNode() != null)
		stringWriter.append("Node=\"" + String.valueOf(getNode()) + "\" ");
		if (getNumLines() != null)
		stringWriter.append("NumLines=\"" + String.valueOf(getNumLines()) + "\" ");
		if (getPiAttribute() != null)
		stringWriter.append("PIAttribute=\"" + String.valueOf(getPiAttribute()) + "\" ");
		if (getPiTarget() != null)
		stringWriter.append("PITarget=\"" + String.valueOf(getPiTarget()) + "\" ");
		if (getPrimaryPIAttribute() != null)
		stringWriter.append("PrimaryPIAttribute=\"" + String.valueOf(getPrimaryPIAttribute()) + "\" ");
		if (getPrimaryPITarge() != null)
		stringWriter.append("PrimaryPITarge=\"" + String.valueOf(getPrimaryPITarge()) + "\" ");
		if (getReadOnly() != null)
		stringWriter.append("ReadOnly=\"" + String.valueOf(getReadOnly()) + "\" ");
		if (getReadOnlyClient() != null)
		stringWriter.append("ReadOnlyClient=\"" + String.valueOf(getReadOnlyClient()) + "\" ");
		if (getRequired() != null)
		stringWriter.append("Required=\"" + String.valueOf(getRequired()) + "\" ");
		if (getSealed() != null)
		stringWriter.append("Sealed=\"" + String.valueOf(getSealed()) + "\" ");
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
		if (getSortable() != null)
		stringWriter.append("Sortable=\"" + String.valueOf(getSortable()) + "\" ");		
		stringWriter.append("</FieldRef>");
		return stringWriter.toString();
	}
	
	/**
	 * @return the aggregation
	 */
	public AggregationEnum getAggregation() {
		return aggregation;
	}
	/**
	 * @param aggregation the aggregation to set
	 */
	public void setAggregation(AggregationEnum aggregation) {
		this.aggregation = aggregation;
	}
	/**
	 * @return the customization
	 */
	public String getCustomization() {
		return customization;
	}
	/**
	 * @param customization the customization to set
	 */
	public void setCustomization(String customization) {
		this.customization = customization;
	}
	/**
	 * @return the defaultValue
	 */
	public String getDefaultValue() {
		return defaultValue;
	}
	/**
	 * @param defaultValue the defaultValue to set
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the filterable
	 */
	public Boolean getFilterable() {
		return filterable;
	}
	/**
	 * @param filterable the filterable to set
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
	 * @param filterableNoRecurrence the filterableNoRecurrence to set
	 */
	public void setFilterableNoRecurrence(Boolean filterableNoRecurrence) {
		this.filterableNoRecurrence = filterableNoRecurrence;
	}
	/**
	 * @return the fromBaseType
	 */
	public Boolean getFromBaseType() {
		return fromBaseType;
	}
	/**
	 * @param fromBaseType the fromBaseType to set
	 */
	public void setFromBaseType(Boolean fromBaseType) {
		this.fromBaseType = fromBaseType;
	}
	/**
	 * @return the hidden
	 */
	public Boolean getHidden() {
		return hidden;
	}
	/**
	 * @param hidden the hidden to set
	 */
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the locked
	 */
	public Boolean getLocked() {
		return locked;
	}
	/**
	 * @param locked the locked to set
	 */
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the node
	 */
	public String getNode() {
		return node;
	}
	/**
	 * @param node the node to set
	 */
	public void setNode(String node) {
		this.node = node;
	}
	/**
	 * @return the numLines
	 */
	public Integer getNumLines() {
		return numLines;
	}
	/**
	 * @param numLines the numLines to set
	 */
	public void setNumLines(Integer numLines) {
		this.numLines = numLines;
	}
	/**
	 * @return the piAttribute
	 */
	public String getPiAttribute() {
		return piAttribute;
	}
	/**
	 * @param piAttribute the piAttribute to set
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
	 * @param piTarget the piTarget to set
	 */
	public void setPiTarget(String piTarget) {
		this.piTarget = piTarget;
	}
	/**
	 * @return the primaryPIAttribute
	 */
	public String getPrimaryPIAttribute() {
		return primaryPIAttribute;
	}
	/**
	 * @param primaryPIAttribute the primaryPIAttribute to set
	 */
	public void setPrimaryPIAttribute(String primaryPIAttribute) {
		this.primaryPIAttribute = primaryPIAttribute;
	}
	/**
	 * @return the primaryPITarge
	 */
	public String getPrimaryPITarge() {
		return primaryPITarge;
	}
	/**
	 * @param primaryPITarge the primaryPITarge to set
	 */
	public void setPrimaryPITarge(String primaryPITarge) {
		this.primaryPITarge = primaryPITarge;
	}
	/**
	 * @return the readOnly
	 */
	public Boolean getReadOnly() {
		return readOnly;
	}
	/**
	 * @param readOnly the readOnly to set
	 */
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}
	/**
	 * @return the readOnlyClient
	 */
	public Boolean getReadOnlyClient() {
		return readOnlyClient;
	}
	/**
	 * @param readOnlyClient the readOnlyClient to set
	 */
	public void setReadOnlyClient(Boolean readOnlyClient) {
		this.readOnlyClient = readOnlyClient;
	}
	/**
	 * @return the required
	 */
	public Boolean getRequired() {
		return required;
	}
	/**
	 * @param required the required to set
	 */
	public void setRequired(Boolean required) {
		this.required = required;
	}
	/**
	 * @return the sealed
	 */
	public Boolean getSealed() {
		return sealed;
	}
	/**
	 * @param sealed the sealed to set
	 */
	public void setSealed(Boolean sealed) {
		this.sealed = sealed;
	}
	/**
	 * @return the showInDisplayForm
	 */
	public Boolean getShowInDisplayForm() {
		return showInDisplayForm;
	}
	/**
	 * @param showInDisplayForm the showInDisplayForm to set
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
	 * @param showInEditForm the showInEditForm to set
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
	 * @param showInFileDlg the showInFileDlg to set
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
	 * @param showInListSettings the showInListSettings to set
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
	 * @param showInNewForm the showInNewForm to set
	 */
	public void setShowInNewForm(Boolean showInNewForm) {
		this.showInNewForm = showInNewForm;
	}
	/**
	 * @return the sortable
	 */
	public Boolean getSortable() {
		return sortable;
	}
	/**
	 * @param sortable the sortable to set
	 */
	public void setSortable(Boolean sortable) {
		this.sortable = sortable;
	}	
}
