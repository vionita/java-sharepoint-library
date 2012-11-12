
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Windows"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="Forms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMode")
@XmlEnum
public enum AuthenticationMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Windows")
    WINDOWS("Windows"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("Forms")
    FORMS("Forms");
    private final String value;

    AuthenticationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationMode fromValue(String v) {
        for (AuthenticationMode c: AuthenticationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
