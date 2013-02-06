package org.korecky.sharepoint.general;

import com.microsoft.schemas.sharepoint.soap.alerts.Alerts;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertsSoap;
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
import org.korecky.sharepoint.HttpProxy;

/**
 *
 * @author vkorecky
 */
class WsContext {

    private static Authenticator credentials;
    private static HttpProxy httpProxy;
    private static URL url;
    private static boolean trustAllSSLs = false;
    private static AlertsSoap alertsPort;
    private static WebsSoap websPort;
    

    /**
     * Get instance of webs web service
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException 
     */
    protected static WebsSoap getWebsPort() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        if (websPort == null) {
            Webs service = new Webs();
            websPort = service.getWebsSoap();
            URL wsURL = new URL(url, "/_vti_bin/Webs.asmx");
            ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        }
        return websPort;
    }
    
    /**
     * Get instance of alerts web service
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException 
     */
    protected static AlertsSoap getAlertsPort() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        if (alertsPort == null) {
            Alerts service = new Alerts();
            alertsPort = service.getAlertsSoap();
            URL wsURL = new URL(url, "/_vti_bin/Alerts.asmx");
            ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        }
        return alertsPort;
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

    public static Authenticator getCredentials() {
        return credentials;
    }

    public static void setCredentials(Authenticator credentials) {
        WsContext.credentials = credentials;
    }

    public static HttpProxy getHttpProxy() {
        return httpProxy;
    }

    public static void setHttpProxy(HttpProxy httpProxy) {
        WsContext.httpProxy = httpProxy;
    }

    public static URL getUrl() {
        return url;
    }

    public static void setUrl(URL url) {
        WsContext.url = url;
    }

    public static boolean isTrustAllSSLs() {
        return trustAllSSLs;
    }

    public static void setTrustAllSSLs(boolean trustAllSSLs) {
        WsContext.trustAllSSLs = trustAllSSLs;
    }
}
