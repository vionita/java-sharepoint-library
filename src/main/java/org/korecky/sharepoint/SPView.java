package org.korecky.sharepoint;

import java.text.ParseException;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPView {

    UUID id;
    boolean defaultView;
    SPViewType type;
    String displayName;
    String url;
    int level;
    int baseViewID;
    String contentTypeID;
    String imageUrl;
    private final String webAbsluteUrl;
    private final String listName;

    protected SPView(String listName, String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
        this.listName = listName;
    }

    /**
     * Initialize from XML
     *
     * @param rootElement
     * @throws ParseException
     */
    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file                            
        if (StringUtils.contains(rootElement.getLocalName(), "View")) {
            String guid = rootElement.getAttribute("Name");
            guid = StringUtils.remove(guid, "{");
            guid = StringUtils.remove(guid, "}");
            id = UUID.fromString(guid);
            displayName = rootElement.getAttribute("DisplayName");
            url = rootElement.getAttribute("Url");
            contentTypeID = rootElement.getAttribute("ContentTypeID");
            imageUrl = rootElement.getAttribute("ImageUrl");
            if (StringUtils.isNotBlank(rootElement.getAttribute("DefaultView"))) {
                defaultView = Boolean.valueOf(rootElement.getAttribute("DefaultView"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Type"))) {
                type = SPViewType.valueOf(rootElement.getAttribute("Type").toLowerCase());
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Level"))) {
                level = Integer.valueOf(rootElement.getAttribute("Level"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("BaseViewID"))) {
                baseViewID = Integer.valueOf(rootElement.getAttribute("BaseViewID"));
            }
        }
    }

    public UUID getId() {
        return id;
    }

    public boolean isDefaultView() {
        return defaultView;
    }

    public SPViewType getType() {
        return type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUrl() {
        return url;
    }

    public int getLevel() {
        return level;
    }

    public int getBaseViewID() {
        return baseViewID;
    }

    public String getContentTypeID() {
        return contentTypeID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getWebAbsluteUrl() {
        return webAbsluteUrl;
    }

    public String getListName() {
        return listName;
    }

    public enum SPViewType {

        /**
         * Represents a calendar view.
         */
        calendar,
        /**
         * Represents a chart view.
         */
        chart,
        /**
         * Represents a Gantt chart, which provides a graphical illustration of
         * a schedule for planning, coordinating, and tracking specific tasks in
         * a project.
         */
        gantt,
        /**
         * Represents a datasheet view.
         */
        grid,
        /**
         * Represents a standard HTML view.
         */
        html,
        /**
         * Represents a view that displays recurring events.
         */
        recurrence
    }
}
