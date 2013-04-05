package org.korecky.sharepoint;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMElement;
import org.korecky.sharepoint.ws.ListsWS;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb extends SpObject {

    String title;
    URL url;
    String description;
    int language = -1;
    String theme;

    /**
     * Initializes a new instance of the SPWeb
     */
    public SPWeb() {
    }

    public SPWeb(String xmlString) throws XMLStreamException, MalformedURLException {
        OMElement xmlElement = null;
        xmlElement = Support.stringToOmElement(xmlString);

        if (xmlElement != null) {
            try {
                parse(xmlElement);
            } catch (ParseException ex) {
                Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
    }

    public SPWeb(OMElement xmlElement) throws MalformedURLException {
        try {
            parse(xmlElement);
        } catch (ParseException ex) {
            Logger.getLogger(SPWeb.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public void parse(OMElement xmlElement) throws ParseException, MalformedURLException {
        String tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Title"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.title = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Url"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.url = new URL(tempAttributeValue);
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Description"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.description = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Theme"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.theme = tempAttributeValue;
        tempAttributeValue = null;

        tempAttributeValue = xmlElement.getAttributeValue(new QName("Language"));
        if ((tempAttributeValue != null) && (tempAttributeValue.length() > 0))
            this.language = Integer.valueOf(tempAttributeValue);
        tempAttributeValue = null;
    }

    @Override
    public String getAsXmlString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return url.toString();
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

//    /**
//     * Gets the collection of alerts for the site or subsite.
//     *
//     * @return
//     * @throws NoSuchAlgorithmException
//     * @throws KeyManagementException
//     * @throws MalformedURLException
//     */
//    public List<SPAlert> getAlerts() {
//        List<SPAlert> alertCollection = null;
//        AlertInfo alertInfo = WsContext.getAlertsStub(new URL(url)).getAlerts();
//        if (alertInfo != null) {
//            alertCollection = new ArrayList<SPAlert>();
//            for (Alert tmpAlert : alertInfo.getAlerts().getAlert()) {
//                SPAlert alert = new SPAlert(url);
//                alert.loadFromAlert(tmpAlert);
//                alertCollection.add(alert);
//            }
//        }
//        return alertCollection;
//    }
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
    public List<SPList> getLists() throws GeneralSecurityException, IOException {
        List<SPList> listsCollection = null;
        ListsWS listsWS = ListsWS.getInstance(url);
        listsCollection = listsWS.getListCollection();
        return listsCollection;
    }
//    /**
//     * Gets the collection of all lists that are contained in the website.
//     *
//     * @return
//     * @throws NoSuchAlgorithmException
//     * @throws KeyManagementException
//     * @throws MalformedURLException
//     */
//    public List<SPList> addList(String listName, String description, SPListTemplate listTemplate) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
//        List<SPList> listsCollection = null;
//        AddListResult result = WsContext.getListsStub(new URL(url)).addList(listName, description, listTemplate.getType());
////        if (result.getContent() != null) {
////            for (Object content : result.getContent()) {
////                if (content instanceof Element) {
////                    // Parse XML file
////                    Element rootElement = (Element) content;
////                    if (StringUtils.equals(rootElement.getLocalName(), "Lists")) {
////                        listTemplatesCollection = new ArrayList<SPList>();
////                        NodeList listTemplateNodeList = rootElement.getElementsByTagName("List");
////                        for (int i = 0; i < listTemplateNodeList.getLength(); i++) {
////                            Element listTemplateElement = (Element) listTemplateNodeList.item(i);
////                            SPList listTemplate = new SPList(url);
////                            listTemplate.loadFromXml(listTemplateElement);
////                            listTemplatesCollection.add(listTemplate);
////                        }
////
////                    }
////                }
////            }
////        }
//        return listsCollection;
//    }
//
//    /**
//     * Gets the collection of all lists that are contained in the website.
//     *
//     * @return
//     * @throws NoSuchAlgorithmException
//     * @throws KeyManagementException
//     * @throws MalformedURLException
//     */
//    public List<SPListTemplate> getListTemplates() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
//        List<SPListTemplate> listTemplatesCollection = null;
//        GetListTemplatesResult result = WsContext.getWebsStub(new URL(url)).getListTemplates();
//        if (result.getContent() != null) {
//            for (Object content : result.getContent()) {
//                if (content instanceof Element) {
//                    // Parse XML file
//                    Element rootElement = (Element) content;
//                    if (StringUtils.equals(rootElement.getLocalName(), "ListTemplates")) {
//                        listTemplatesCollection = new ArrayList<SPListTemplate>();
//                        NodeList listTemplateNodeList = rootElement.getElementsByTagName("ListTemplate");
//                        for (int i = 0; i < listTemplateNodeList.getLength(); i++) {
//                            Element listTemplateElement = (Element) listTemplateNodeList.item(i);
//                            SPListTemplate listTemplate = new SPListTemplate(url);
//                            listTemplate.loadFromXml(listTemplateElement);
//                            listTemplatesCollection.add(listTemplate);
//                        }
//
//                    }
//                }
//            }
//        }
//        return listTemplatesCollection;
//    }

    /**
     * Update current object properties from web
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    private void updateProperties() {
//        try {
//            GetWebResponse.GetWebResult result = WsContext.getWebsStub(new URL(url)).getWeb(url);
//            if (result.getContent() != null) {
//                for (Object content : result.getContent()) {
//                    if (content instanceof Element) {
//                        // Parse XML file
//                        Element webElement = (Element) content;
//                        if (StringUtils.equals(webElement.getLocalName(), "Web")) {
//                            loadFromXml(webElement);
//                        }
//                    }
//                }
//            }
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (KeyManagementException ex) {
//            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
