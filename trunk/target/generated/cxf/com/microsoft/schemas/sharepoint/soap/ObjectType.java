
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VirtualServer"/>
 *     &lt;enumeration value="ContentDatabase"/>
 *     &lt;enumeration value="SiteCollection"/>
 *     &lt;enumeration value="Site"/>
 *     &lt;enumeration value="List"/>
 *     &lt;enumeration value="Folder"/>
 *     &lt;enumeration value="ListItem"/>
 *     &lt;enumeration value="ListItemAttachments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectType")
@XmlEnum
public enum ObjectType {

    @XmlEnumValue("VirtualServer")
    VIRTUAL_SERVER("VirtualServer"),
    @XmlEnumValue("ContentDatabase")
    CONTENT_DATABASE("ContentDatabase"),
    @XmlEnumValue("SiteCollection")
    SITE_COLLECTION("SiteCollection"),
    @XmlEnumValue("Site")
    SITE("Site"),
    @XmlEnumValue("List")
    LIST("List"),
    @XmlEnumValue("Folder")
    FOLDER("Folder"),
    @XmlEnumValue("ListItem")
    LIST_ITEM("ListItem"),
    @XmlEnumValue("ListItemAttachments")
    LIST_ITEM_ATTACHMENTS("ListItemAttachments");
    private final String value;

    ObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectType fromValue(String v) {
        for (ObjectType c: ObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
