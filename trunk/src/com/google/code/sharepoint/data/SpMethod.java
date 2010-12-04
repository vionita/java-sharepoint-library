/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.code.sharepoint.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;

/**
 *
 * @author vkorecky
 */

//<Method ID="Text"
//	  Cmd = "Text"
//	  ID = "Text">
//</Method>


//<Batch OnError="Return">
//<Method ID="0,ExportList">
//  <SetList Scope="Request">EF2F5A21-0FD0-4654-84ED-
//      112B4F5A48F8</SetList>
//  <SetVar Name="Cmd">ExportList</SetVar>
//</Method>
//</Batch>



public class SpMethod extends DataObject {
    public enum CommandEnum{
        /** Delete an item */
        Delete,
        /** Create an item */
        New,
        /** Modify an item */
        Update,
        /** Move an item */
        Move
    }

    private Integer id = null;
    private CommandEnum cmd = null;
    //private Vector<SpField> fields = new Vector<SpField>();

    /**
     * Creates SpListItemMethod
     */
	public SpMethod() {
	}

	public SpMethod(String xmlString) throws XMLStreamException, ParseException {		
		 OMElement xmlElement = null;
		 xmlElement = Support.StringToOmElement(xmlString);
		
		 if (xmlElement != null) {		 
			 Parse(xmlElement);
		 }
	}

	public SpMethod(OMElement xmlElement) throws ParseException {
		 Parse(xmlElement);
	}		      

	@Override
	public void Parse(OMElement xmlElement) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat("yyyymmdd hh:MM:ss");
		String tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName(
				"ID"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setId(Integer.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		tempAttributeValue = xmlElement.getAttributeValue(new QName("Cmd"));
		if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
			this.setCmd(CommandEnum.valueOf(tempAttributeValue));
		tempAttributeValue = null;

		
	}	

    /**
     * Gets this object as xml string
     * @return
     */
	@Override
    public String GetAsXmlString()
    {
        String xmlString = "<Method ";
        if (getId() != null)
            xmlString += "ID='" + String.valueOf(this.getId()) + "' ";
        if (getCmd() != null)
            xmlString += "Cmd='" + this.getCmd().toString() + "' ";
        xmlString += ">";
        
        xmlString += "</Method>";

        return xmlString;
    }

    /**
     * Gets method command
     * @return
     */
    public CommandEnum getCmd() {
        return cmd;
    }

    /**
     * Sets method command
     * @param cmd
     */
    public void setCmd(CommandEnum cmd) {
        this.cmd = cmd;
    }
   
    /**
     * Gets method id
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets method id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
