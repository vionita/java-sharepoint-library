
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoError"/>
 *     &lt;enumeration value="NotInFormsAuthenticationMode"/>
 *     &lt;enumeration value="PasswordNotMatch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginErrorCode")
@XmlEnum
public enum LoginErrorCode {

    @XmlEnumValue("NoError")
    NO_ERROR("NoError"),
    @XmlEnumValue("NotInFormsAuthenticationMode")
    NOT_IN_FORMS_AUTHENTICATION_MODE("NotInFormsAuthenticationMode"),
    @XmlEnumValue("PasswordNotMatch")
    PASSWORD_NOT_MATCH("PasswordNotMatch");
    private final String value;

    LoginErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginErrorCode fromValue(String v) {
        for (LoginErrorCode c: LoginErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
