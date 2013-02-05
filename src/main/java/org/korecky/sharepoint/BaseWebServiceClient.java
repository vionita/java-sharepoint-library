/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.net.Authenticator;
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
public class BaseWebServiceClient {

    protected Authenticator credentials;
    protected HttpProxy httpProxy;
    protected URL url;
    protected boolean trustAllSSLs = false;

    public BaseWebServiceClient(URL url, Authenticator credentials) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, null, false);
    }

    public BaseWebServiceClient(URL url, Authenticator credentials, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, null, trustAllSSLs);
    }

    public BaseWebServiceClient(URL url, Authenticator credentials, HttpProxy httpProxy) throws NoSuchAlgorithmException, KeyManagementException {
        this(url, credentials, httpProxy, false);
    }

    public BaseWebServiceClient(URL url, Authenticator credentials, HttpProxy httpProxy, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
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
}
