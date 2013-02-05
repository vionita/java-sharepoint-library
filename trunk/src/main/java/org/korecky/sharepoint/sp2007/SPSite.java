package org.korecky.sharepoint.sp2007;

import com.microsoft.schemas.sharepoint.soap.sites.Sites;
import com.microsoft.schemas.sharepoint.soap.sites.SitesSoap;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;

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

    private String url;
    private Authenticator credentials;

    /**
     * Initializes a new instance of the SPSite class based on the specified
     * URL.
     *
     * @param url
     */
    public SPSite(String url) {
        this.url = url;
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return
     */
    public List<SPWeb> getAllWebs() throws MalformedURLException {
        List<SPWeb> allWebs = null;
        Sites service = new Sites(new URL(url + "?WSDL"));        
        Map<String, Object> context = ((BindingProvider)service).getRequestContext();        
        context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.url);
        context.put(BindingProvider.USERNAME_PROPERTY, "GORDIC\\vkorecky");
        context.put(BindingProvider.PASSWORD_PROPERTY, "ykorec01");
        SitesSoap soap = service.getSitesSoap();
        String result = soap.getSite(url);        
        System.out.println("Server said: " + result);        
        return allWebs;
    }
    
//    protected void initializeWebService(Stub webServiceStub)
//            throws GeneralSecurityException, IOException {
//        // Set authenticator
//        Options options = webServiceStub._getServiceClient().getOptions();
//
//        if (this.authenticationType == BaseWebService.AuthenticationTypeEnum.basic) {
//            options.setProperty(HTTPConstants.AUTHENTICATE,
//                    getBasicAuthenticator());
//        } else if (this.authenticationType == BaseWebService.AuthenticationTypeEnum.ntlm) {
////			options.setProperty(HTTPConstants.AUTHENTICATE,
////					getNtlmAuthenticator());
//            NtlmJcifsCredentials.register(this.userName, this.password, this.domain);
//        }
//
//        // Set httpProxy
//        if (this.httpProxy != null) {
//            // Proxy
//            HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
//            proxyProperties.setProxyName(this.httpProxy.getProxyHost());
//            proxyProperties.setProxyPort(this.httpProxy.getProxyPort());
//            // Proxy authentication
//            if (this.httpProxy.getDomain() != null) {
//                proxyProperties.setUserName(this.httpProxy.getDomain());
//            }
//            if (this.httpProxy.getUserName() != null) {
//                proxyProperties.setUserName(this.httpProxy.getUserName());
//                proxyProperties.setUserName(this.httpProxy.getPassword());
//            }
//            options.setProperty(HTTPConstants.PROXY, proxyProperties);
//        }
//        // HTTP 1.0 protocol
//        options.setProperty(HTTPConstants.HTTP_PROTOCOL_VERSION, HTTPConstants.HEADER_PROTOCOL_10);
//
//        // Set web service URL
//        options.setTo(new EndpointReference(getWebServiceURL().toString()));
//
//        // SSL
//        if (this.trustAllSSLs) {
//            // Trust all SSLs
//            // This code must not be used in production environment
//            // because it ignores any certificates but
//            // it is convenient to have for testing purposes
//
//            org.apache.commons.httpclient.protocol.Protocol
//                    .unregisterProtocol("https");
//
//            int port = this.webServiceURL.getPort();
//            if (this.webServiceURL.getPort() < 0) {
//                port = 443; // default https port
//            }
//            org.apache.commons.httpclient.protocol.Protocol
//                    .registerProtocol(
//                    "https",
//                    new Protocol(
//                    "https",
//                    new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(),
//                    port));
//            System.out
//                    .print("WARNING: SSL CERTIFICATE CONFIGURATION IS TURNED OFF!");
//        }
//
//        // Apply all service options
//        webServiceStub._getServiceClient().setOptions(options);
//    }
}
