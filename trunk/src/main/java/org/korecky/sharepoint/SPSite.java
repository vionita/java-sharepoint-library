package org.korecky.sharepoint;

import java.io.IOException;
import org.korecky.sharepoint.config.AbstractCredentials;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.apache.axis2.AxisFault;
import org.korecky.sharepoint.config.HttpProxy;
import org.korecky.sharepoint.ws.WebsWS;
import org.korecky.sharepoint.ws.WsContext;

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

    private URL url;

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, AbstractCredentials credentials) throws NoSuchAlgorithmException, KeyManagementException {
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
    public SPSite(URL url, AbstractCredentials credentials, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
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
    public SPSite(URL url, AbstractCredentials credentials, HttpProxy httpProxy) throws NoSuchAlgorithmException, KeyManagementException {
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
    public SPSite(URL url, AbstractCredentials credentials, HttpProxy httpProxy, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        this.url = url;
        WsContext wsContext = WsContext.getInstance();
        wsContext.setCredentials(credentials);
        wsContext.setHttpProxy(httpProxy);
        wsContext.setTrustAllSSLs(trustAllSSLs);
    }

    /**
     * Gets the root Web site of the site collection.
     *
     * @return NodeList contains web elements
     */
    public SPWeb getRootWeb() throws AxisFault, MalformedURLException, RemoteException, GeneralSecurityException, IOException {
        SPWeb rootWeb = null;
        WebsWS websWs = WebsWS.getInstance(url);
        rootWeb = websWs.getWeb(url);
        return rootWeb;
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return NodeList contains web elements
     */
    public List<SPWeb> getAllWebs() throws AxisFault, MalformedURLException, RemoteException, GeneralSecurityException, IOException {
        List<SPWeb> allWebs = null;
        WebsWS websWs = WebsWS.getInstance(url);
        allWebs = websWs.getWebCollection();
        return allWebs;
    }
}
