package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMElement;

/**
 * Represents a list definition or a list template, which defines the fields and
 * views for a list. List definitions are contained in files within
 * %ProgramFiles%\Common Files\Microsoft Shared\web server
 * extensions\15\TEMPLATE\FEATURES, but list templates are created through the
 * user interface or through the object model when a list is saved as a
 * template.
 *
 * @author vkorecky
 */
public class SPListTemplate extends SpObject {

    private String name;
    private int type;
    private int baseType;
    private boolean onQuickLaunch;
    private int securityBits;
    private int sequence;
    private String displayName;
    private String description;
    private String image;
    private int documentTemplate;
    private String featureId;
    private final URL webAbsluteUrl;

    public SPListTemplate(URL webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
    }

    public SPListTemplate(String xmlString, URL webAbsluteUrl) throws XMLStreamException, MalformedURLException {
        this.webAbsluteUrl = webAbsluteUrl;
        OMElement xmlElement = null;
        xmlElement = Support.stringToOmElement(xmlString);

        if (xmlElement != null) {
            try {
                parse(xmlElement);
            } catch (ParseException ex) {
                Logger.getLogger(SPList.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
    }

    public SPListTemplate(OMElement xmlElement, URL webAbsluteUrl) throws MalformedURLException {
        this.webAbsluteUrl = webAbsluteUrl;
        try {
            parse(xmlElement);
        } catch (ParseException ex) {
            Logger.getLogger(SPList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void parse(OMElement xmlElement) throws ParseException, MalformedURLException {
        String tempAttributeValue = null;
        tempAttributeValue = xmlElement.getAttributeValue(new QName("Name"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.name = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Description"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.description = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("DisplayName"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.displayName = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Image"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.image = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("FeatureId"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.featureId = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Type"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.type = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("BaseType"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.baseType = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("OnQuickLaunch"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.onQuickLaunch = Boolean.valueOf(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("SecurityBits"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.securityBits = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Sequence"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.sequence = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("DocumentTemplate"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.documentTemplate = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;
    }

    @Override
    public String getAsXmlString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getBaseType() {
        return baseType;
    }

    public boolean isOnQuickLaunch() {
        return onQuickLaunch;
    }

    public int getSecurityBits() {
        return securityBits;
    }

    public int getSequence() {
        return sequence;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public int getDocumentTemplate() {
        return documentTemplate;
    }

    public String getFeatureId() {
        return featureId;
    }

    public URL getWebAbsluteUrl() {
        return webAbsluteUrl;
    }
}
