package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;
import com.microsoft.schemas.sharepoint.soap.lists.AddListResponse.AddListResult;
import com.microsoft.schemas.sharepoint.soap.lists.GetListCollectionResponse;
import com.microsoft.schemas.sharepoint.soap.webs.GetListTemplatesResponse.GetListTemplatesResult;
import com.microsoft.schemas.sharepoint.soap.webs.GetWebResponse;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb {

    String title;
    String url;
    String description;
    int language = -1;
    String theme;

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
    public int getLanguage() {
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
     * Gets the collection of alerts for the site or subsite.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPAlert> getAlerts() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        List<SPAlert> alertCollection = null;
        AlertInfo alertInfo = WsContext.getAlertsPort(new URL(url)).getAlerts();
        if (alertInfo != null) {
            alertCollection = new ArrayList<SPAlert>();
            for (Alert tmpAlert : alertInfo.getAlerts().getAlert()) {
                SPAlert alert = new SPAlert(url);
                alert.loadFromAlert(tmpAlert);
                alertCollection.add(alert);
            }
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
    public List<SPList> getLists() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        List<SPList> listsCollection = null;
        GetListCollectionResponse.GetListCollectionResult result = WsContext.getListsPort(new URL(url)).getListCollection();
        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "Lists")) {
                        listsCollection = new ArrayList<SPList>();
                        NodeList listNodeList = rootElement.getElementsByTagName("List");
                        for (int i = 0; i < listNodeList.getLength(); i++) {
                            Element listElement = (Element) listNodeList.item(i);
                            SPList list = new SPList(url);
                            list.loadFromXml(listElement);
                            listsCollection.add(list);
                        }

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
    public List<SPList> addList(String listName, String description, SPListTemplate listTemplate) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        List<SPList> listsCollection = null;
        AddListResult result = WsContext.getListsPort(new URL(url)).addList(listName, description, listTemplate.getType());
//        if (result.getContent() != null) {
//            for (Object content : result.getContent()) {
//                if (content instanceof Element) {
//                    // Parse XML file                    
//                    Element rootElement = (Element) content;
//                    if (StringUtils.equals(rootElement.getLocalName(), "Lists")) {
//                        listTemplatesCollection = new ArrayList<SPList>();
//                        NodeList listTemplateNodeList = rootElement.getElementsByTagName("List");
//                        for (int i = 0; i < listTemplateNodeList.getLength(); i++) {
//                            Element listTemplateElement = (Element) listTemplateNodeList.item(i);
//                            SPList listTemplate = new SPList(url);
//                            listTemplate.loadFromXml(listTemplateElement);
//                            listTemplatesCollection.add(listTemplate);
//                        }
//
//                    }
//                }
//            }
//        }
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
            GetWebResponse.GetWebResult result = WsContext.getWebsPort(new URL(url)).getWeb(url);
            if (result.getContent() != null) {
                for (Object content : result.getContent()) {
                    if (content instanceof Element) {
                        // Parse XML file                                       
                        Element webElement = (Element) content;
                        if (StringUtils.equals(webElement.getLocalName(), "Web")) {
                            loadFromXml(webElement);
                        }
                    }
                }
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (KeyManagementException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
