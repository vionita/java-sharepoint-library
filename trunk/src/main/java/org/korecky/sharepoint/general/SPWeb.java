package org.korecky.sharepoint.general;

import com.microsoft.schemas.sharepoint.soap.alerts.AlertInfo;
import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

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
    int language;
    String theme;

    /**
     * Initializes a new instance of the SPWeb
     */
    protected SPWeb() {
    }

    /**
     * Initializes a new instance of the SPWeb
     *
     * @param title
     * @param url
     */
    protected SPWeb(String title, String url) {
        this.title = title;
        this.url = url;
    }

    /**
     * Updates the database with changes that are made to the website.
     *
     * @throws Exception
     */
    public void update() throws Exception {
        throw new Exception("Not yet implemented.");
    }

    /**
     * @return Gets the title for the website.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param Sets the title for the website.
     */
    public void setTitle(String title) {
        this.title = title;
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
        return description;
    }

    /**
     * @param Sets the description for the website.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Gets the locale identifier (LCID) for the default language of the
     * website.
     */
    public int getLanguage() {
        return language;
    }

    /**
     * @return Gets the name of the theme that is applied to the website.
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Gets the collection of alerts for the site or subsite.
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException 
     */
    protected AlertInfo getAlertsWs() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        return WsContext.getAlertsPort().getAlerts();
    }
}
