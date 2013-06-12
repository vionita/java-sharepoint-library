/**
 *
 */
package org.korecky.sharepoint;

import java.text.ParseException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;

//<User
//	ID="4"
//	Sid="S-1-5-21-2127521184-1604012920-1887927527-34577"
//	Name="User1_Display_Name"
//	LoginName="DOMAIN\User1_Alias"
//	Email="User1_E-mail"
//	Notes="Notes"
//	IsSiteAdmin="False"
//	IsDomainGroup="False"
///>
/**
 *
 * @author Ishan Fernando
 *
 */
public class SPUser extends SpObject {

    private Integer id;
    private String sid;
    private String loginName;
    private String name;
    private String email;
    private String notes;
    private Boolean siteAdmin;
    private Boolean domainGroup;

    public SPUser() {
    }

    public SPUser(final OMElement xmlElement) {
        try {
            parse(xmlElement);
        } catch (final ParseException ex) {
            Logger.getLogger(SPUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void parse(final OMElement xmlElement) throws ParseException {
        // GetUserInfo --> User
        final Iterator children = xmlElement.getChildElements();
        if (!children.hasNext()) {
            return;
        }

        final OMElement childElement = (OMElement) children.next();
        String tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("ID"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setId(Integer.valueOf(tempAttributeValue));
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("Sid"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setSid(tempAttributeValue);
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("Name"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setName(tempAttributeValue);
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("LoginName"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setLoginName(tempAttributeValue);
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("Email"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setEmail(tempAttributeValue);
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("Notes"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setNotes(tempAttributeValue);
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("IsSiteAdmin"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setSiteAdmin(Boolean.valueOf(tempAttributeValue));
        }
        tempAttributeValue = null;

        tempAttributeValue = childElement.getAttributeValue(new QName("IsDomainGroup"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0)) {
            setDomainGroup(Boolean.valueOf(tempAttributeValue));
        }
        tempAttributeValue = null;
    }

    @Override
    public String getAsXmlString() {
        // TODO
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(final String sid) {
        this.sid = sid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(final String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(final Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public Boolean getDomainGroup() {
        return domainGroup;
    }

    public void setDomainGroup(final Boolean domainGroup) {
        this.domainGroup = domainGroup;
    }
}
