
package com.microsoft.schemas.sharepoint.dsp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="schemaOnly"/>
 *     &lt;enumeration value="dataOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultContentType")
@XmlEnum
public enum ResultContentType {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("schemaOnly")
    SCHEMA_ONLY("schemaOnly"),
    @XmlEnumValue("dataOnly")
    DATA_ONLY("dataOnly");
    private final String value;

    ResultContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultContentType fromValue(String v) {
        for (ResultContentType c: ResultContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
