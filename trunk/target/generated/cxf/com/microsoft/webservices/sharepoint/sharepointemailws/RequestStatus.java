
package com.microsoft.webservices.sharepoint.sharepointemailws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="PendingApproval"/>
 *     &lt;enumeration value="ApprovalDenied"/>
 *     &lt;enumeration value="DuplicateAlias"/>
 *     &lt;enumeration value="InvalidArgument"/>
 *     &lt;enumeration value="ServiceNotConfigured"/>
 *     &lt;enumeration value="AccessDenied"/>
 *     &lt;enumeration value="ServerUnavailable"/>
 *     &lt;enumeration value="ObjectNotFound"/>
 *     &lt;enumeration value="InvalidMember"/>
 *     &lt;enumeration value="InternalError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestStatus")
@XmlEnum
public enum RequestStatus {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("PendingApproval")
    PENDING_APPROVAL("PendingApproval"),
    @XmlEnumValue("ApprovalDenied")
    APPROVAL_DENIED("ApprovalDenied"),
    @XmlEnumValue("DuplicateAlias")
    DUPLICATE_ALIAS("DuplicateAlias"),
    @XmlEnumValue("InvalidArgument")
    INVALID_ARGUMENT("InvalidArgument"),
    @XmlEnumValue("ServiceNotConfigured")
    SERVICE_NOT_CONFIGURED("ServiceNotConfigured"),
    @XmlEnumValue("AccessDenied")
    ACCESS_DENIED("AccessDenied"),
    @XmlEnumValue("ServerUnavailable")
    SERVER_UNAVAILABLE("ServerUnavailable"),
    @XmlEnumValue("ObjectNotFound")
    OBJECT_NOT_FOUND("ObjectNotFound"),
    @XmlEnumValue("InvalidMember")
    INVALID_MEMBER("InvalidMember"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError");
    private final String value;

    RequestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestStatus fromValue(String v) {
        for (RequestStatus c: RequestStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
