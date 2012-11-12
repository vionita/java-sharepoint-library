
package com.microsoft.webservices.sharepoint.sharepointemailws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactFlags.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactFlags">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OnlyAllowAuthenticatedEmail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactFlags")
@XmlEnum
public enum ContactFlags {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OnlyAllowAuthenticatedEmail")
    ONLY_ALLOW_AUTHENTICATED_EMAIL("OnlyAllowAuthenticatedEmail");
    private final String value;

    ContactFlags(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactFlags fromValue(String v) {
        for (ContactFlags c: ContactFlags.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
