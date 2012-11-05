
package com.microsoft.sharepoint.webpartpages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormatConversionOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormatConversionOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConvertToWebPartExportFormat"/>
 *     &lt;enumeration value="ConvertToWebPartDesignerPersistenceFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormatConversionOption")
@XmlEnum
public enum FormatConversionOption {

    @XmlEnumValue("ConvertToWebPartExportFormat")
    CONVERT_TO_WEB_PART_EXPORT_FORMAT("ConvertToWebPartExportFormat"),
    @XmlEnumValue("ConvertToWebPartDesignerPersistenceFormat")
    CONVERT_TO_WEB_PART_DESIGNER_PERSISTENCE_FORMAT("ConvertToWebPartDesignerPersistenceFormat");
    private final String value;

    FormatConversionOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormatConversionOption fromValue(String v) {
        for (FormatConversionOption c: FormatConversionOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
