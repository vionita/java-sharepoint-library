package org.korecky.sharepoint.sp2007;

import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.korecky.sharepoint.HttpProxy;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a collection of sites in a Web application, including a top-level
 * Web site and all its subsites. Each SPSite object, or site collection, is
 * represented within an SPSiteCollection object that consists of the collection
 * of all site collections in the Web application.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite extends org.korecky.sharepoint.general.SPSite {

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param trustAllSSLs
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, trustAllSSLs);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param httpProxy
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, HttpProxy httpProxy) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, httpProxy);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param httpProxy
     * @param trustAllSSLs
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, HttpProxy httpProxy, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, httpProxy, trustAllSSLs);
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return
     */
    public List<SPWeb> getAllWebs() throws KeyManagementException, NoSuchAlgorithmException, MalformedURLException {
        List<SPWeb> allWebs = null;
        NodeList webNodeList = getAllWebsWs();
        if (webNodeList != null) {
            allWebs = new ArrayList<>();
            for (int i = 0; i < webNodeList.getLength(); i++) {
                Element webElement = (Element) webNodeList.item(i);;
                SPWeb web = new SPWeb(webElement.getAttribute("Title"), webElement.getAttribute("Url"));
                allWebs.add(web);
            }
        }
        return allWebs;
    }
}
