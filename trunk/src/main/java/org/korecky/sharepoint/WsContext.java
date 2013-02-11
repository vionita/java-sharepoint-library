package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alerts;
import com.microsoft.schemas.sharepoint.soap.alerts.AlertsSoap;
import com.microsoft.schemas.sharepoint.soap.lists.Lists;
import com.microsoft.schemas.sharepoint.soap.lists.ListsSoap;
import com.microsoft.schemas.sharepoint.soap.sitedata.SiteData;
import com.microsoft.schemas.sharepoint.soap.sitedata.SiteDataSoap;
import com.microsoft.schemas.sharepoint.soap.views.Views;
import com.microsoft.schemas.sharepoint.soap.views.ViewsSoap;
import com.microsoft.schemas.sharepoint.soap.webs.Webs;
import com.microsoft.schemas.sharepoint.soap.webs.WebsSoap;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author vkorecky
 */
class WsContext {
    
    private static Authenticator authenticator;
    private static HttpProxy httpProxy;
    private static boolean trustAllSSLs = false;

    /**
     * Get instance of alerts web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static AlertsSoap getAlertsPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        URL wsURL = new URL(webUrl, "/_vti_bin/Alerts.asmx");
        URL wsdlURL = WsContext.class.getResource("/wsdl/Alerts.asmx");
        Alerts service = new Alerts(wsdlURL);
        AlertsSoap alertsPort = service.getAlertsSoap();
        ((BindingProvider) alertsPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
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
        URL wsURL = new URL(webUrl, "/_vti_bin/Lists.asmx");
        URL wsdlURL = WsContext.class.getResource("/wsdl/Lists.asmx");
        Lists service = new Lists(wsdlURL);
        ListsSoap listsPort = service.getListsSoap();
        ((BindingProvider) listsPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        return listsPort;
    }

    /**
     * Get instance of SiteData web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static SiteDataSoap getSiteDataPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        URL wsURL = new URL(webUrl, "/_vti_bin/SiteData.asmx");
        URL wsdlURL = WsContext.class.getResource("/wsdl/SiteData.asmx");
        SiteData service = new SiteData(wsdlURL);
        SiteDataSoap siteDataPort = service.getSiteDataSoap();
        ((BindingProvider) siteDataPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        return siteDataPort;
    }

    /**
     * Get instance of views web service
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws MalformedURLException
     */
    protected static ViewsSoap getViewsPort(URL webUrl) throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException {
        URL wsURL = new URL(webUrl, "/_vti_bin/Views.asmx");
        URL wsdlURL = WsContext.class.getResource("/wsdl/Views.asmx");
        Views service = new Views(wsdlURL);
        ViewsSoap websPort = service.getViewsSoap();
        ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
        return websPort;
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
        URL wsURL = new URL(webUrl, "/_vti_bin/Webs.asmx");
        URL wsdlURL = WsContext.class.getResource("/wsdl/Webs.asmx");
        Webs service = new Webs(wsdlURL);
        WebsSoap websPort = service.getWebsSoap();
        ((BindingProvider) websPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsURL.toString());
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
        Authenticator.setDefault(authenticator);

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
    
    public static Document stringToDom(String xmlSource)
            throws SAXException, ParserConfigurationException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(new InputSource(new StringReader(xmlSource)));
    }
    
    public static String domToString(Document doc) throws TransformerConfigurationException, TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        return writer.getBuffer().toString();
    }
    
    protected static Authenticator getAuthenticator() {
        return authenticator;
    }
    
    protected static void setAuthenticator(Authenticator authenticator) {
        WsContext.authenticator = authenticator;
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
