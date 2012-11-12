
package com.microsoft.schemas.sharepoint.soap.meetings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendeeResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendeeResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="responseAccepted"/>
 *     &lt;enumeration value="responseTentative"/>
 *     &lt;enumeration value="responseDeclined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttendeeResponse")
@XmlEnum
public enum AttendeeResponse {

    @XmlEnumValue("responseAccepted")
    RESPONSE_ACCEPTED("responseAccepted"),
    @XmlEnumValue("responseTentative")
    RESPONSE_TENTATIVE("responseTentative"),
    @XmlEnumValue("responseDeclined")
    RESPONSE_DECLINED("responseDeclined");
    private final String value;

    AttendeeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttendeeResponse fromValue(String v) {
        for (AttendeeResponse c: AttendeeResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
