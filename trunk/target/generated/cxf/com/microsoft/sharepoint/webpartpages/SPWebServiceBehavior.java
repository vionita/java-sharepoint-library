
package com.microsoft.sharepoint.webpartpages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPWebServiceBehavior.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SPWebServiceBehavior">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Version3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SPWebServiceBehavior")
@XmlEnum
public enum SPWebServiceBehavior {

    @XmlEnumValue("Version3")
    VERSION_3("Version3");
    private final String value;

    SPWebServiceBehavior(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SPWebServiceBehavior fromValue(String v) {
        for (SPWebServiceBehavior c: SPWebServiceBehavior.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
