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
import org.korecky.sharepoint.ws.AlertsWS;
import org.korecky.sharepoint.ws.ListsWS;
import org.korecky.sharepoint.ws.WebsWS;

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
    public SPWeb(URL url) {
        this.url = url;
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

    /**
     * Gets the collection of alerts for the site or subsite.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPAlert> getAlerts() throws GeneralSecurityException, IOException {
        List<SPAlert> alertCollection = null;
        AlertsWS alertsWS = AlertsWS.getInstance(url);
        alertCollection = alertsWS.getAlerts();
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
    public List<SPList> getLists() throws GeneralSecurityException, IOException {
        List<SPList> listsCollection = null;
        ListsWS listsWS = ListsWS.getInstance(url);
        listsCollection = listsWS.getListCollection();
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
    public SPList addList(String listName, String description, SPListTemplate listTemplate) throws GeneralSecurityException, IOException {
        SPList list = null;
        ListsWS listsWS = ListsWS.getInstance(url);
        list = listsWS.addList(listName, description, listTemplate.getType());
        return list;
    }

    /**
     * Gets the collection of all lists that are contained in the website.
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    public List<SPListTemplate> getListTemplates() throws GeneralSecurityException, IOException {
        List<SPListTemplate> listTemplatesCollection = null;
        WebsWS websWs = WebsWS.getInstance(url);
        listTemplatesCollection = websWs.getListTemplates();
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
            WebsWS websWs = WebsWS.getInstance(url);
            SPWeb web = websWs.getWeb(url);
            this.title = web.getTitle();
            this.description = web.getDescription();
            this.theme = web.getTheme();
            this.language = web.getLanguage();
        } catch (GeneralSecurityException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SPWeb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
