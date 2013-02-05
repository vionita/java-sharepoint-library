package org.korecky.sharepoint.sp2010;

import java.net.Authenticator;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import org.korecky.sharepoint.HttpProxy;

/**
 * Represents a collection of sites in a Web application, including a top-level
 * Web site and all its subsites. Each SPSite object, or site collection, is
 * represented within an SPSiteCollection object that consists of the collection
 * of all site collections in the Web application.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite extends org.korecky.sharepoint.sp2007.SPSite {

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
}
