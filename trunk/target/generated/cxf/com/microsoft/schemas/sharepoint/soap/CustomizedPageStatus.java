
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizedPageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomizedPageStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Uncustomized"/>
 *     &lt;enumeration value="Customized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomizedPageStatus")
@XmlEnum
public enum CustomizedPageStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Uncustomized")
    UNCUSTOMIZED("Uncustomized"),
    @XmlEnumValue("Customized")
    CUSTOMIZED("Customized");
    private final String value;

    CustomizedPageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomizedPageStatus fromValue(String v) {
        for (CustomizedPageStatus c: CustomizedPageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
