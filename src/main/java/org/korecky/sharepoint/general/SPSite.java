package org.korecky.sharepoint.general;

import com.microsoft.schemas.sharepoint.soap.webs.GetAllSubWebCollectionResponse.GetAllSubWebCollectionResult;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.lang3.StringUtils;
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
public class SPSite {

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    protected SPSite(URL url, Authenticator credentials) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, null, false);
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
    protected SPSite(URL url, Authenticator credentials, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, null, trustAllSSLs);
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
    protected SPSite(URL url, Authenticator credentials, HttpProxy httpProxy) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, httpProxy, false);
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
    protected SPSite(URL url, Authenticator credentials, HttpProxy httpProxy, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        WsContext.setCredentials(credentials);
        WsContext.setHttpProxy(httpProxy);
        WsContext.setUrl(url);
        WsContext.setTrustAllSSLs(trustAllSSLs);
        WsContext.configureEnviroment();
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return NodeList contains web elements
     */
    protected NodeList getAllWebsWs() throws KeyManagementException, NoSuchAlgorithmException, MalformedURLException {
        NodeList webNodeList = null;
        GetAllSubWebCollectionResult result = WsContext.getWebsPort().getAllSubWebCollection();

        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof Element) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    if (StringUtils.equals(rootElement.getLocalName(), "Webs")) {
                        webNodeList = rootElement.getElementsByTagName("Web");
                        break;
                    }
                }
            }
        }
        return webNodeList;
    }
}
