package org.korecky.sharepoint.general;

import com.microsoft.schemas.sharepoint.soap.webs.GetAllSubWebCollectionResponse.GetAllSubWebCollectionResult;
import com.microsoft.schemas.sharepoint.soap.webs.Webs;
import com.microsoft.schemas.sharepoint.soap.webs.WebsSoap;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import java.net.Authenticator;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;
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

    private Authenticator credentials;
    private HttpProxy httpProxy;
    private URL url;
    private boolean trustAllSSLs = false;
    private WebsSoap websPort;

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
        this.credentials = credentials;
        this.httpProxy = httpProxy;
        this.url = url;
        this.trustAllSSLs = trustAllSSLs;
        configureEnviroment();
    }

    private void configureEnviroment() throws NoSuchAlgorithmException, KeyManagementException {
        // Set httpProxy        
        if (this.httpProxy != null) {
            // Proxy            
            System.setProperty("http.proxyHost", this.httpProxy.getProxyHost());
            System.setProperty("http.proxyPort", String.valueOf(this.httpProxy.getProxyPort()));
            System.setProperty("https.proxyHost", this.httpProxy.getProxyHost());
            System.setProperty("https.proxyPort", String.valueOf(this.httpProxy.getProxyPort()));
            // Proxy authentication
            if ((this.httpProxy.getDomain() != null) && (this.httpProxy.getUserName() != null)) {
                System.setProperty("http.proxyUser", this.httpProxy.getDomain() + "\\" + this.httpProxy.getUserName());
                System.setProperty("http.proxyPassword", this.httpProxy.getPassword());
            } else if (this.httpProxy.getUserName() != null) {
                System.setProperty("http.proxyUser", this.httpProxy.getUserName());
                System.setProperty("http.proxyPassword", this.httpProxy.getPassword());
            }
        }

        // Authentication        
        Authenticator.setDefault(this.credentials);

        // SSL settings        
        if (this.trustAllSSLs) {
            // Trust all SSLs, create a trust manager that does not validate certificate chains            
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(
                    java.security.cert.X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(
                    java.security.cert.X509Certificate[] certs, String authType) {
            }
        }};
            // Install the all-trusting trust manager                    
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        }
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    private WebsSoap getPort() throws NoSuchAlgorithmException, KeyManagementException {
        if (websPort == null) {
            Webs service = new Webs();
            websPort = service.getWebsSoap();
            ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());
        }
        return websPort;
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return NodeList contains web elements
     */
    protected NodeList getAllWebsWs() throws KeyManagementException, NoSuchAlgorithmException {
        NodeList webNodeList = null;
        GetAllSubWebCollectionResult result = getPort().getAllSubWebCollection();

        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof ElementNSImpl) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    webNodeList = rootElement.getElementsByTagName("Web");
                    break;                    
                }
            }
        }
        return webNodeList;
    }
}
