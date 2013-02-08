package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alerts;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertsSoap;
import com.microsoft.schemas.sharepoint.soap.lists.Lists;
import com.microsoft.schemas.sharepoint.soap.lists.ListsSoap;
import com.microsoft.schemas.sharepoint.soap.webs.Webs;
import com.microsoft.schemas.sharepoint.soap.webs.WebsSoap;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author vkorecky
 */
class WsContext {    
    private static Authenticator credentials;
    private static HttpProxy httpProxy;
    private static boolean trustAllSSLs = false;
    private static AlertsSoap alertsPort;
    private static ListsSoap listsPort;
    private static WebsSoap websPort;

    /**
     * Get instance of alerts web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static AlertsSoap getAlertsPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        if (alertsPort == null) {
            URL wsURL = new URL(webUrl, "/_vti_bin/Alerts.asmx");
            URL wsdlURL = new URL(wsURL.toString() + "?WSDL");
            Alerts service = new Alerts(wsdlURL);
            alertsPort = service.getAlertsSoap();            
            ((BindingProvider) alertsPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        }
        return alertsPort;
    }

    /**
     * Get instance of lists web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static ListsSoap getListsPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        if (listsPort == null) {
            URL wsURL = new URL(webUrl, "/_vti_bin/Lists.asmx");
            URL wsdlURL = new URL(wsURL.toString() + "?WSDL");
            Lists service = new Lists(wsdlURL);
            listsPort = service.getListsSoap();            
            ((BindingProvider) listsPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        }
        return listsPort;
    }

    /**
     * Get instance of webs web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static WebsSoap getWebsPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        if (websPort == null) {
            URL wsURL = new URL(webUrl, "/_vti_bin/Webs.asmx");
            URL wsdlURL = new URL(wsURL.toString() + "?WSDL");
            Webs service = new Webs(wsdlURL);
            websPort = service.getWebsSoap();            
            ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        }
        return websPort;
    }

    protected static void configureEnviroment() throws NoSuchAlgorithmException, KeyManagementException {               
        // Set httpProxy        
        if (httpProxy != null) {
            // Proxy            
            System.setProperty("http.proxyHost", httpProxy.getProxyHost());
            System.setProperty("http.proxyPort", String.valueOf(httpProxy.getProxyPort()));
            System.setProperty("https.proxyHost", httpProxy.getProxyHost());
            System.setProperty("https.proxyPort", String.valueOf(httpProxy.getProxyPort()));
            // Proxy authentication
            if ((httpProxy.getDomain() != null) && (httpProxy.getUserName() != null)) {
                System.setProperty("http.proxyUser", httpProxy.getDomain() + "\\" + httpProxy.getUserName());
                System.setProperty("http.proxyPassword", httpProxy.getPassword());
            } else if (httpProxy.getUserName() != null) {
                System.setProperty("http.proxyUser", httpProxy.getUserName());
                System.setProperty("http.proxyPassword", httpProxy.getPassword());
            }
        }

        // Authentication        
        Authenticator.setDefault(credentials);

        // SSL settings        
        if (trustAllSSLs) {
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

    protected static Authenticator getCredentials() {
        return credentials;
    }

    protected static void setCredentials(Authenticator credentials) {
        WsContext.credentials = credentials;
    }

    protected static HttpProxy getHttpProxy() {
        return httpProxy;
    }

    protected static void setHttpProxy(HttpProxy httpProxy) {
        WsContext.httpProxy = httpProxy;
    }

    protected static boolean isTrustAllSSLs() {
        return trustAllSSLs;
    }

    protected static void setTrustAllSSLs(boolean trustAllSSLs) {
        WsContext.trustAllSSLs = trustAllSSLs;
    }
}
