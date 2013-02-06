package org.korecky.sharepoint.general;

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
    protected void update() throws Exception {
        throw new Exception("Not yet implemented.");
    }

    /**
     * @return Gets the title for the website.
     */
    protected String getTitle() {
        return title;
    }

    /**
     * @param Sets the title for the website.
     */
    protected void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Gets the absolute URL for the website.
     */
    protected String getUrl() {
        return url;
    }

    /**
     * @return Gets the description for the website.
     */
    protected String getDescription() {
        return description;
    }

    /**
     * @param Sets the description for the website.
     */
    protected void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Gets the locale identifier (LCID) for the default language of the
     * website.
     */
    protected int getLanguage() {
        return language;
    }

    /**
     * @return Gets the name of the theme that is applied to the website.
     */
    protected String getTheme() {
        return theme;
    }
}
