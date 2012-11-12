
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnMappingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColumnMappingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="element"/>
 *     &lt;enumeration value="attribute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColumnMappingType")
@XmlEnum
public enum ColumnMappingType {

    @XmlEnumValue("element")
    ELEMENT("element"),
    @XmlEnumValue("attribute")
    ATTRIBUTE("attribute");
    private final String value;

    ColumnMappingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnMappingType fromValue(String v) {
        for (ColumnMappingType c: ColumnMappingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
