package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.lists.GetListItemChanges;
import com.microsoft.schemas.sharepoint.soap.lists.GetListItems.Query;
import com.microsoft.schemas.sharepoint.soap.lists.GetListItemsResponse;
import com.microsoft.schemas.sharepoint.soap.views.GetViewCollectionResponse.GetViewCollectionResult;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Represents a list on a Microsoft SharePoint Foundation Web site.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPList {

    private final String DATE_TIME_PATTERN = "yyyyMMdd HH:mm:ss";
    private final SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_PATTERN);
    private String id;
    private String title;
    private String name;
    private String description;
    private int baseType;
    private String imageUrl;
    private String docTemplateUrl;
    private String defaultViewUrl;
    private String mobileDefaultViewUrl;
    private String featureId;
    private int serverTemplate;
    private Date created;
    private Date modified;
    private Date lastDeleted;
    private int version;
    private String direction;
    private String thumbnailSize;
    private int webImageWidth;
    private int webImageHeight;
    private String flags;
    private int itemCount;
    private int anonymousPermMask;
    private String rootFolder;
    private int readSecurity;
    private int writeSecurity;
    private int authorID;
    private String eventSinkAssembly;
    private String eventSinkClass;
    private String eventSinkData;
    private String emailInsertsFolder;
    private String emailAlias;
    private String webFullUrl;
    private String webId;
    private String sendToLocation;
    private String scopeId;
    private int majorVersionLimit;
    private int majorWithMinorVersionsLimit;
    private String workFlowId;
    private boolean hasUniqueScopes;
    private boolean allowDeletion;
    private boolean allowMultiResponses;
    private boolean enableAttachments;
    private boolean enableModeration;
    private boolean enableVersioning;
    private boolean hidden;
    private boolean multipleDataList;
    private boolean ordered;
    private boolean showUser;
    private boolean enableMinorVersion;
    private boolean requireCheckout;
    private final String webAbsluteUrl;

    protected SPList(String webAbsluteUrl) {
        this.webAbsluteUrl = webAbsluteUrl;
    }

    /**
     * Initialize object form XML
     *
     * @param rootElement
     * @throws ParseException
     */
    public void loadFromXml(Element rootElement) throws ParseException {
        // Parse XML file                            
        if (StringUtils.equals(rootElement.getLocalName(), "List")) {
            id = rootElement.getAttribute("Id");
            title = rootElement.getAttribute("Title");
            name = rootElement.getAttribute("Name");
            description = rootElement.getAttribute("Description");
            if (StringUtils.isNotBlank(rootElement.getAttribute("BaseType"))) {
                baseType = Integer.valueOf(rootElement.getAttribute("BaseType"));
            }
            imageUrl = rootElement.getAttribute("ImageUrl");
            docTemplateUrl = rootElement.getAttribute("DocTemplateUrl");
            defaultViewUrl = rootElement.getAttribute("DefaultViewUrl");
            mobileDefaultViewUrl = rootElement.getAttribute("MobileDefaultViewUrl");
            featureId = rootElement.getAttribute("FeatureId");
            if (StringUtils.isNotBlank(rootElement.getAttribute("ServerTemplate"))) {
                serverTemplate = Integer.valueOf(rootElement.getAttribute("ServerTemplate"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Created"))) {
                created = formatter.parse(rootElement.getAttribute("Created"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Modified"))) {
                modified = formatter.parse(rootElement.getAttribute("Modified"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Version"))) {
                version = Integer.valueOf(rootElement.getAttribute("Version"));
            }
            direction = rootElement.getAttribute("Direction");
            thumbnailSize = rootElement.getAttribute("ThumbnailSize");
            if (StringUtils.isNotBlank(rootElement.getAttribute("WebImageWidth"))) {
                webImageWidth = Integer.valueOf(rootElement.getAttribute("WebImageWidth"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("WebImageHeight"))) {
                webImageHeight = Integer.valueOf(rootElement.getAttribute("WebImageHeight"));
            }
            flags = rootElement.getAttribute("Flags");
            if (StringUtils.isNotBlank(rootElement.getAttribute("ItemCount"))) {
                itemCount = Integer.valueOf(rootElement.getAttribute("ItemCount"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("AnonymousPermMask"))) {
                anonymousPermMask = Integer.valueOf(rootElement.getAttribute("AnonymousPermMask"));
            }
            rootFolder = rootElement.getAttribute("RootFolder");
            if (StringUtils.isNotBlank(rootElement.getAttribute("ReadSecurity"))) {
                readSecurity = Integer.valueOf(rootElement.getAttribute("ReadSecurity"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("WriteSecurity"))) {
                writeSecurity = Integer.valueOf(rootElement.getAttribute("WriteSecurity"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("AuthorID"))) {
                authorID = Integer.valueOf(rootElement.getAttribute("AuthorID"));
            }
            eventSinkAssembly = rootElement.getAttribute("EventSinkAssembly");
            eventSinkClass = rootElement.getAttribute("EventSinkClass");
            eventSinkData = rootElement.getAttribute("EventSinkData");
            emailInsertsFolder = rootElement.getAttribute("EmailInsertsFolder");
            emailAlias = rootElement.getAttribute("EmailAlias");
            webFullUrl = rootElement.getAttribute("WebFullUrl");
            webId = rootElement.getAttribute("WebId");
            sendToLocation = rootElement.getAttribute("SendToLocation");
            scopeId = rootElement.getAttribute("ScopeId");
            if (StringUtils.isNotBlank(rootElement.getAttribute("MajorVersionLimit"))) {
                majorVersionLimit = Integer.valueOf(rootElement.getAttribute("MajorVersionLimit"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("MajorWithMinorVersionsLimit"))) {
                majorWithMinorVersionsLimit = Integer.valueOf(rootElement.getAttribute("MajorWithMinorVersionsLimit"));
            }
            workFlowId = rootElement.getAttribute("WorkFlowId");
            if (StringUtils.isNotBlank(rootElement.getAttribute("HasUniqueScopes"))) {
                hasUniqueScopes = Boolean.valueOf(rootElement.getAttribute("HasUniqueScopes"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("AllowDeletion"))) {
                allowDeletion = Boolean.valueOf(rootElement.getAttribute("AllowDeletion"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("AllowMultiResponses"))) {
                allowMultiResponses = Boolean.valueOf(rootElement.getAttribute("AllowMultiResponses"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("EnableAttachments"))) {
                enableAttachments = Boolean.valueOf(rootElement.getAttribute("EnableAttachments"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("EnableModeration"))) {
                enableModeration = Boolean.valueOf(rootElement.getAttribute("EnableModeration"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("EnableVersioning"))) {
                enableVersioning = Boolean.valueOf(rootElement.getAttribute("EnableVersioning"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Hidden"))) {
                hidden = Boolean.valueOf(rootElement.getAttribute("Hidden"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("MultipleDataList"))) {
                multipleDataList = Boolean.valueOf(rootElement.getAttribute("MultipleDataList"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("Ordered"))) {
                ordered = Boolean.valueOf(rootElement.getAttribute("Ordered"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("ShowUser"))) {
                showUser = Boolean.valueOf(rootElement.getAttribute("ShowUser"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("EnableMinorVersion"))) {
                enableMinorVersion = Boolean.valueOf(rootElement.getAttribute("EnableMinorVersion"));
            }
            if (StringUtils.isNotBlank(rootElement.getAttribute("RequireCheckout"))) {
                requireCheckout = Boolean.valueOf(rootElement.getAttribute("RequireCheckout"));
            }
        }
    }

    /**
     * Gets the collection of view objects that represents all the views of the
     * list.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     * @throws ParseException
     */
    public List<SPView> getViews() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        List<SPView> viewsCollection = null;
        GetViewCollectionResult result = WsContext.getViewsPort(new URL(webAbsluteUrl)).getViewCollection(name);
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "Views")) {
                        NodeList viewNodeList = rootElement.getElementsByTagName("View");
                        viewsCollection = new ArrayList<SPView>();
                        for (int i = 0; i < viewNodeList.getLength(); i++) {
                            Element viewElement = (Element) viewNodeList.item(i);
                            SPView view = new SPView(name, webAbsluteUrl);
                            view.loadFromXml(viewElement);
                            viewsCollection.add(view);
                        }
                    }
                }
            }
        }
        return viewsCollection;
    }

    /**
     * Returns a collection of list items from the list based on the specified
     * view.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     * @throws ParseException
     */
    public List<SPListItem> getItems(String strQuery, String strViewFields, int rowLimit) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException, ParserConfigurationException, IOException, SAXException {
        List<SPListItem> itemsCollection = null;
        String strResult = WsContext.getSiteDataPort(new URL(webAbsluteUrl)).getListItems(name, strQuery, strViewFields, rowLimit);
        Element rootElement = WsContext.stringToXmlElement(strResult);
        if (StringUtils.equals(rootElement.getLocalName(), "listitems")) {
            NodeList dataNodeList = rootElement.getElementsByTagNameNS("urn:schemas-microsoft-com:rowset", "data");
            for (int i = 0; i < dataNodeList.getLength(); i++) {
                Element dataElement = (Element) dataNodeList.item(i);
                itemsCollection = new ArrayList<SPListItem>();
                NodeList rowNodeList = dataElement.getElementsByTagNameNS("#RowsetSchema", "row");
                for (int j = 0; j < rowNodeList.getLength(); j++) {
                    Element rowElement = (Element) rowNodeList.item(j);
                    SPListItem item = new SPListItem(name, webAbsluteUrl);
                    item.loadFromXml(rowElement);
                    itemsCollection.add(item);
                }

            }
        }
        return itemsCollection;
    }

//    /**
//     * Returns a collection of list items from the list based on the specified
//     * view.
//     *
//     * @return
//     * @throws NoSuchAlgorithmException
//     * @throws KeyManagementException
//     * @throws MalformedURLException
//     * @throws ParseException
//     */
//    public List<SPListItem> getItems(SPView view, Query query, GetListItemChanges.ViewFields String rowLimit, ) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
//        List<SPListItem> itemsCollection = null;        
//        GetListItemsResponse.GetListItemsResult result = WsContext.getListsPort(new URL(webAbsluteUrl)).getListItems(title, view.getName(), query, rowLimit, null, null, webId);
//        if (result.getContent() != null) {
//            for (Object content : result.getContent()) {
//                if (content instanceof Element) {
//                    // Parse XML file                    
//                    Element rootElement = (Element) content;
//                    if (StringUtils.equals(rootElement.getLocalName(), "listitems")) {
//                        NodeList dataNodeList = rootElement.getElementsByTagNameNS("urn:schemas-microsoft-com:rowset", "data");
//                        for (int i = 0; i < dataNodeList.getLength(); i++) {
//                            Element dataElement = (Element) dataNodeList.item(i);
//                            itemsCollection = new ArrayList<SPListItem>();
//                            NodeList rowNodeList = dataElement.getElementsByTagNameNS("#RowsetSchema", "row");
//                            for (int j = 0; j < rowNodeList.getLength(); j++) {
//                                Element rowElement = (Element) rowNodeList.item(j);
//                                SPListItem item = new SPListItem(name, webAbsluteUrl);
//                                item.loadFromXml(rowElement);
//                                itemsCollection.add(item);
//                            }
//
//                        }
//                    }
//                }
//            }
//        }
//        return itemsCollection;
//    }
//    Delete
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getBaseType() {
        return baseType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDocTemplateUrl() {
        return docTemplateUrl;
    }

    public String getDefaultViewUrl() {
        return defaultViewUrl;
    }

    public String getMobileDefaultViewUrl() {
        return mobileDefaultViewUrl;
    }

    public String getFeatureId() {
        return featureId;
    }

    public int getServerTemplate() {
        return serverTemplate;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public Date getLastDeleted() {
        return lastDeleted;
    }

    public int getVersion() {
        return version;
    }

    public String getDirection() {
        return direction;
    }

    public String getThumbnailSize() {
        return thumbnailSize;
    }

    public int getWebImageWidth() {
        return webImageWidth;
    }

    public int getWebImageHeight() {
        return webImageHeight;
    }

    public String getFlags() {
        return flags;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getAnonymousPermMask() {
        return anonymousPermMask;
    }

    public String getRootFolder() {
        return rootFolder;
    }

    public int getReadSecurity() {
        return readSecurity;
    }

    public int getWriteSecurity() {
        return writeSecurity;
    }

    public int getAuthorID() {
        return authorID;
    }

    public String getEventSinkAssembly() {
        return eventSinkAssembly;
    }

    public String getEventSinkClass() {
        return eventSinkClass;
    }

    public String getEventSinkData() {
        return eventSinkData;
    }

    public String getEmailInsertsFolder() {
        return emailInsertsFolder;
    }

    public String getEmailAlias() {
        return emailAlias;
    }

    public String getWebFullUrl() {
        return webFullUrl;
    }

    public String getWebId() {
        return webId;
    }

    public String getSendToLocation() {
        return sendToLocation;
    }

    public String getScopeId() {
        return scopeId;
    }

    public int getMajorVersionLimit() {
        return majorVersionLimit;
    }

    public int getMajorWithMinorVersionsLimit() {
        return majorWithMinorVersionsLimit;
    }

    public String getWorkFlowId() {
        return workFlowId;
    }

    public boolean isHasUniqueScopes() {
        return hasUniqueScopes;
    }

    public boolean isAllowDeletion() {
        return allowDeletion;
    }

    public boolean isAllowMultiResponses() {
        return allowMultiResponses;
    }

    public boolean isEnableAttachments() {
        return enableAttachments;
    }

    public boolean isEnableModeration() {
        return enableModeration;
    }

    public boolean isEnableVersioning() {
        return enableVersioning;
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isMultipleDataList() {
        return multipleDataList;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public boolean isShowUser() {
        return showUser;
    }

    public boolean isEnableMinorVersion() {
        return enableMinorVersion;
    }

    public boolean isRequireCheckout() {
        return requireCheckout;
    }

    public String getWebAbsluteUrl() {
        return webAbsluteUrl;
    }
}
