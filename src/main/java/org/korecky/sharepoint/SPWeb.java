package org.korecky.sharepoint;

import org.korecky.sharepoint.support.WsContext;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;
import com.microsoft.schemas.sharepoint.soap.lists.AddListResponse.AddListResult;
import com.microsoft.schemas.sharepoint.soap.lists.GetListCollectionResponse;
import com.microsoft.schemas.sharepoint.soap.sitedata.ArrayOfSFPUrl;
import com.microsoft.schemas.sharepoint.soap.sitedata.ArrayOfSListWithTime;
import com.microsoft.schemas.sharepoint.soap.sitedata.ArrayOfSWebWithTime;
import com.microsoft.schemas.sharepoint.soap.sitedata.ArrayOfString;
import com.microsoft.schemas.sharepoint.soap.sitedata.SWebMetadata;
import com.microsoft.schemas.sharepoint.soap.webs.GetListTemplatesResponse.GetListTemplatesResult;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.Holder;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb {

    private final String DATE_TIME_PATTERN = "yyyyMMdd HH:mm:ss";
    private final SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_PATTERN);
    UUID id;
    String title;
    String url;
    String description;
    long language = -1;
    String theme;
    SPAlertCollection alerts;
    SPUser author;
    Date lastModified;
    Date lastModifiedForceRecrawl;
    Boolean validSecurityInfo;
    Boolean inheritedSecurity;
    Boolean allowAnonymousAccess;
    Boolean anonymousViewListItems;
    SPPermissionCollection permissions;
    Boolean externalSecurity;
    Boolean bucketWeb;
    Boolean usedInAutocat;
    SPWebCollection webs;
    SPListCollection lists;
    SPRoleDefinitionCollection roleDefinitions;

    /**
     * Initializes a new instance of the SPWeb
     */
    protected SPWeb() {
    }

    public void loadFromXml(Element rootElement) {
        // Parse XML file                            
        if (StringUtils.equals(rootElement.getLocalName(), "Web")) {
            title = rootElement.getAttribute("Title");
            url = rootElement.getAttribute("Url");
            description = rootElement.getAttribute("Description");
            theme = rootElement.getAttribute("Theme");
            if (StringUtils.isNotBlank(rootElement.getAttribute("Language"))) {
                language = Integer.valueOf(rootElement.getAttribute("Language"));
            }
        }
    }

    /**
     * Gets the GUID for the site.
     *
     * @return
     */
    public UUID getId() {
        if (id == null) {
            updateProperties();
        }
        return id;
    }

    /**
     * Gets a user object that represents the user who created the website.
     * (Read-only in sandboxed solutions.)
     *
     * @return
     */
    public SPUser getAuthor() {
        if (author == null) {
            updateProperties();
        }
        return author;
    }

    /**
     * Sets a user object that represents the user who created the website.
     * (Read-only in sandboxed solutions.)
     *
     * @param author
     */
    public void setAuthor(SPUser author) {
        this.author = author;
    }

    /**
     * @return Gets the title for the website.
     */
    public String getTitle() {
        if (title == null) {
            updateProperties();
        }
        return title;
    }

    /**
     * @return Gets the absolute URL for the website.
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return Gets the description for the website.
     */
    public String getDescription() {
        if (description == null) {
            updateProperties();
        }
        return description;
    }

    /**
     * @return Gets the locale identifier (LCID) for the default language of the
     * website.
     */
    public long getLanguage() {
        if (language == -1) {
            updateProperties();
        }
        return language;
    }

    /**
     * @return Gets the name of the theme that is applied to the website.
     */
    public String getTheme() {
        if (theme == null) {
            updateProperties();
        }
        return theme;
    }

    /**
     * Gets a LastModified
     *
     * @return
     */
    public Date getLastModified() {
        if (lastModified == null) {
            updateProperties();
        }
        return lastModified;
    }

    /**
     * Gets a LastModifiedForceRecrawl
     *
     * @return
     */
    public Date getLastModifiedForceRecrawl() {
        if (lastModifiedForceRecrawl == null) {
            updateProperties();
        }
        return lastModifiedForceRecrawl;
    }

    /**
     * Gets a Boolean value that indicates ValidSecurityInfo
     *
     * @return
     */
    public boolean hasValidSecurityInfo() {
        if (validSecurityInfo == null) {
            updateProperties();
        }
        return validSecurityInfo.booleanValue();
    }

    /**
     * Gets a Boolean value that indicates InheritedSecurity
     *
     * @return
     */
    public boolean hasInheritedSecurity() {
        if (inheritedSecurity == null) {
            updateProperties();
        }
        return inheritedSecurity.booleanValue();
    }

    /**
     * Gets a Boolean value that indicates whether anonymous access is allowed
     * for the website.
     *
     * @return
     */
    public boolean isAllowAnonymousAccess() {
        if (allowAnonymousAccess == null) {
            updateProperties();
        }
        return allowAnonymousAccess.booleanValue();
    }

    /**
     * Gets a Boolean value that indicates AnonymousViewListItems
     *
     * @return
     */
    public boolean canAnonymousViewListItems() {
        if (anonymousViewListItems == null) {
            updateProperties();
        }
        return anonymousViewListItems.booleanValue();
    }

    /**
     * Gets the collection of permissions for the website.
     *
     * @return
     */
    public SPPermissionCollection getPermissions() {
        if (permissions == null) {
            updateProperties();
        }
        return permissions;
    }

    /**
     * Gets a Boolean value that indicates ExternalSecurity
     *
     * @return
     */
    public boolean hasExternalSecurity() {
        if (externalSecurity == null) {
            updateProperties();
        }
        return externalSecurity.booleanValue();
    }

    /**
     * Gets a Boolean value that indicates BucketWeb
     *
     * @return
     */
    public boolean isBucketWeb() {
        if (bucketWeb == null) {
            updateProperties();
        }
        return bucketWeb.booleanValue();
    }

    /**
     * Gets a Boolean value that indicates UsedInAutocat
     *
     * @return
     */
    public boolean isUsedInAutocat() {
        if (usedInAutocat == null) {
            updateProperties();
        }
        return usedInAutocat.booleanValue();
    }

    /**
     * Gets a website collection object that represents all websites immediately
     * beneath the website, excluding children of those websites.
     *
     * @return
     */
    public SPWebCollection getWebs() {
        if (webs == null) {
            updateProperties();
        }
        return webs;
    }

    /**
     * Gets the collection of role definitions for the website.
     *
     * @return
     */
    public SPRoleDefinitionCollection getRoleDefinitions() {
        if (roleDefinitions == null) {
            updateProperties();
        }
        return roleDefinitions;
    }

    /**
     * Gets the collection of alerts for the site or subsite.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public SPAlertCollection getAlerts() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        SPAlertCollection alertCollection = null;
        AlertInfo alertInfo = WsContext.getAlertsPort(new URL(url)).getAlerts();
        if (alertInfo != null) {
            alertCollection = new SPAlertCollection(url);
            alertCollection.loadFromXml(alertInfo);
        }
        return alertCollection;
    }

    /**
     * Gets a hash map that contains metadata for the website.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public Map<String, String> getAllProperties() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        Map<String, String> properties = null;
        properties = new HashMap<String, String>();
        properties.put("Title", getTitle());
        properties.put("Url", getUrl());
        properties.put("Description", getDescription());
        properties.put("Theme", getTheme());
        properties.put("Language", String.valueOf(getLanguage()));
        return properties;
    }

    /**
     * Gets the collection of all lists that are contained in the website.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public SPListCollection getLists() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        SPListCollection listsCollection = null;
        GetListCollectionResponse.GetListCollectionResult result = WsContext.getListsPort(new URL(url)).getListCollection();
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "Lists")) {
                        listsCollection = new SPListCollection(url);
                        listsCollection.loadFromXml(rootElement);
                    }
                }
            }
        }
        return listsCollection;
    }

    /**
     * Gets the collection of all lists that are contained in the website.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public SPList addList(String listName, String description, SPListTemplate listTemplate) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        SPList newList = null;
        AddListResult result = WsContext.getListsPort(new URL(url)).addList(listName, description, listTemplate.getType());
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element listElement = (Element) content;
                    newList = new SPList(url);
                    newList.loadFromXml(listElement);
                }
            }
        }
        return newList;
    }

    /**
     * Gets the collection of all lists that are contained in the website.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPListTemplate> getListTemplates() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        List<SPListTemplate> listTemplatesCollection = null;
        GetListTemplatesResult result = WsContext.getWebsPort(new URL(url)).getListTemplates();
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "ListTemplates")) {
                        listTemplatesCollection = new ArrayList<SPListTemplate>();
                        NodeList listTemplateNodeList = rootElement.getElementsByTagName("ListTemplate");
                        for (int i = 0; i < listTemplateNodeList.getLength(); i++) {
                            Element listTemplateElement = (Element) listTemplateNodeList.item(i);
                            SPListTemplate listTemplate = new SPListTemplate(url);
                            listTemplate.loadFromXml(listTemplateElement);
                            listTemplatesCollection.add(listTemplate);
                        }

                    }
                }
            }
        }
        return listTemplatesCollection;
    }

    /**
     * Update current object properties from web
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    private void updateProperties() {
        try {
            Holder<Long> getWebResult = new Holder<Long>();
            Holder<SWebMetadata> sWebMetadata = new Holder<SWebMetadata>();
            Holder<ArrayOfSWebWithTime> vWebs = new Holder<ArrayOfSWebWithTime>();
            Holder<ArrayOfSListWithTime> vLists = new Holder<ArrayOfSListWithTime>();
            Holder<ArrayOfSFPUrl> vFPUrls = new Holder<ArrayOfSFPUrl>();
            Holder<String> strRoles = new Holder<String>();
            Holder<ArrayOfString> vRolesUsers = new Holder<ArrayOfString>();
            Holder<ArrayOfString> vRolesGroups = new Holder<ArrayOfString>();
            WsContext.getSiteDataPort(new URL(url)).getWeb(getWebResult, sWebMetadata, vWebs, vLists, vFPUrls, strRoles, vRolesUsers, vRolesGroups);
            if (sWebMetadata.value != null) {
                String guid = sWebMetadata.value.getWebID();
                guid = StringUtils.remove(guid, "{");
                guid = StringUtils.remove(guid, "}");
                id = UUID.fromString(guid);
                title = sWebMetadata.value.getTitle();
                description = sWebMetadata.value.getDescription();
                author = new SPUser(sWebMetadata.value.getAuthor());
                language = sWebMetadata.value.getLanguage();
                lastModified = sWebMetadata.value.getLastModified().toGregorianCalendar().getTime();
                lastModifiedForceRecrawl = sWebMetadata.value.getLastModifiedForceRecrawl().toGregorianCalendar().getTime();
                validSecurityInfo = sWebMetadata.value.isValidSecurityInfo();
                inheritedSecurity = sWebMetadata.value.isInheritedSecurity();
                allowAnonymousAccess = sWebMetadata.value.isAllowAnonymousAccess();
                anonymousViewListItems = sWebMetadata.value.isAnonymousViewListItems();
                externalSecurity = sWebMetadata.value.isExternalSecurity();
                bucketWeb = sWebMetadata.value.isIsBucketWeb();
                usedInAutocat = sWebMetadata.value.isUsedInAutocat();
                permissions = new SPPermissionCollection(this, url);
                permissions.loadFromXmlString(sWebMetadata.value.getPermissions());



//                for (Object content :  {
//                }
//                .getAuthor().getContent()
//                
//                    
//                    
//                    
//                    
//                    
//                    
//                    
//                    
//                    ) {
//                    if (content instanceof Element) {
//                        // Parse XML file                                       
//                        Element webElement = (Element) content;
//                        if (StringUtils.equals(webElement.getLocalName(), "Web")) {
//                            loadFromXml(webElement);
//                        }
//                    }
//                }
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SPWeb.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(SPWeb.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SPWeb.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
