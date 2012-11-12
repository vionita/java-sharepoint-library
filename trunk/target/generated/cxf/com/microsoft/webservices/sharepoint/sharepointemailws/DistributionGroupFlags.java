
package com.microsoft.webservices.sharepoint.sharepointemailws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionGroupFlags.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionGroupFlags">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OnlyAllowAuthenticatedEmail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionGroupFlags")
@XmlEnum
public enum DistributionGroupFlags {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OnlyAllowAuthenticatedEmail")
    ONLY_ALLOW_AUTHENTICATED_EMAIL("OnlyAllowAuthenticatedEmail");
    private final String value;

    DistributionGroupFlags(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionGroupFlags fromValue(String v) {
        for (DistributionGroupFlags c: DistributionGroupFlags.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
