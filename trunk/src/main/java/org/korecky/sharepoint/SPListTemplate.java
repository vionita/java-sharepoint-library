package org.korecky.sharepoint;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

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
public class SPListTemplate {

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
    private final String webAbsluteUrl;

    protected SPListTemplate(String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
    }

    /**
     * Initialize object form XML
     *
     * @param listTemplateElement
     */
    void loadFromXml(Element listTemplateElement) {
        // Parse XML file                            
        if (StringUtils.equals(listTemplateElement.getLocalName(), "ListTemplate")) {
            name = listTemplateElement.getAttribute("Name");
            name = listTemplateElement.getAttribute("Name");
            description = listTemplateElement.getAttribute("Description");
            displayName = listTemplateElement.getAttribute("DisplayName");
            image = listTemplateElement.getAttribute("Image");
            featureId = listTemplateElement.getAttribute("FeatureId");
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("Type"))) {
                type = Integer.valueOf(listTemplateElement.getAttribute("Type"));
            }
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("BaseType"))) {
                baseType = Integer.valueOf(listTemplateElement.getAttribute("BaseType"));
            }
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("OnQuickLaunch"))) {
                onQuickLaunch = Boolean.valueOf(listTemplateElement.getAttribute("OnQuickLaunch"));
            }
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("SecurityBits"))) {
                securityBits = Integer.valueOf(listTemplateElement.getAttribute("SecurityBits"));
            }
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("Sequence"))) {
                sequence = Integer.valueOf(listTemplateElement.getAttribute("Sequence"));
            }
            if (StringUtils.isNotBlank(listTemplateElement.getAttribute("DocumentTemplate"))) {
                documentTemplate = Integer.valueOf(listTemplateElement.getAttribute("DocumentTemplate"));
            }
        }
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

    public String getWebAbsluteUrl() {
        return webAbsluteUrl;
    }    
}
