package org.korecky.sharepoint.ws;

import org.korecky.sharepoint.ws.jcifs.NtlmJcifsCredentials;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;


import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.log4j.Logger;
import org.korecky.sharepoint.config.BasicCredentials;
import org.korecky.sharepoint.config.FormCredentials;
import org.korecky.sharepoint.config.NtlmCredentials;

/**
 * Ancestor of all objects calling Sharepoint WebServices
 *
 * @author "Vladislav Korecký"
 *
 */
class BaseWebService {

    private static final Logger logger = Logger.getLogger(BaseWebService.class);
    private static volatile BaseWebService instance;

    protected void changeWebServiceUrl(Stub webServiceStub, URL webServiceURL) {
        Options options = webServiceStub._getServiceClient().getOptions();
        options.setTo(new EndpointReference(webServiceURL.toString()));
        webServiceStub._getServiceClient().setOptions(options); // Apply all service options
    }

    protected void initializeWebService(Stub webServiceStub, URL webServiceURL) throws GeneralSecurityException, IOException {
        WsContext wsContext = WsContext.getInstance();
        Options options = webServiceStub._getServiceClient().getOptions();
        // Set basicAuthenticator
        if (wsContext.getCredentials() != null) {
            if (wsContext.getCredentials() instanceof BasicCredentials) {
                HttpTransportProperties.Authenticator basicAuthenticator = new HttpTransportProperties.Authenticator();
                List<String> authScheme = new ArrayList<String>();
                authScheme.add(HttpTransportProperties.Authenticator.BASIC);
                basicAuthenticator.setAuthSchemes(authScheme);
                basicAuthenticator.setUsername(wsContext.getCredentials().getUser());
                basicAuthenticator.setPassword(wsContext.getCredentials().getPassword());
                basicAuthenticator.setHost(webServiceURL.getHost());
                basicAuthenticator.setPort(webServiceURL.getPort());
                options.setProperty(HTTPConstants.AUTHENTICATE, basicAuthenticator);
            } else if (wsContext.getCredentials() instanceof NtlmCredentials) {
                NtlmJcifsCredentials.register(wsContext.getCredentials().getUser(), wsContext.getCredentials().getPassword(), wsContext.getCredentials().getDomain());
            } else if (wsContext.getCredentials() instanceof FormCredentials) {
                // TODO: Form authentication
            }
        }
        // Set httpProxy
        if (wsContext.getHttpProxy() != null) {
            HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
            proxyProperties.setProxyName(wsContext.getHttpProxy().getProxyHost());
            proxyProperties.setProxyPort(wsContext.getHttpProxy().getProxyPort());
            // Proxy authentication
            if (wsContext.getHttpProxy().getDomain() != null)
                proxyProperties.setUserName(wsContext.getHttpProxy().getDomain());
            if (wsContext.getHttpProxy().getUserName() != null) {
                proxyProperties.setUserName(wsContext.getHttpProxy().getUserName());
                proxyProperties.setUserName(wsContext.getHttpProxy().getPassword());
            }
            options.setProperty(HTTPConstants.PROXY, proxyProperties);
        }
        // HTTP 1.0 protocol
        options.setProperty(HTTPConstants.HTTP_PROTOCOL_VERSION, HTTPConstants.HEADER_PROTOCOL_10);
        // Set web service URL
        options.setTo(new EndpointReference(webServiceURL.toString()));

        // SSL
        if (wsContext.isTrustAllSSLs()) {
            // Trust all SSLs.
            // This code must not be used in production environment because it ignores any certificates but it is convenient to have for testing purposes
            org.apache.commons.httpclient.protocol.Protocol.unregisterProtocol("https");
            int port = webServiceURL.getPort();
            if (webServiceURL.getPort() < 0)
                port = 443; // default https port
            org.apache.commons.httpclient.protocol.Protocol.registerProtocol("https",
                    new Protocol("https", new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(), port));
            System.out.print("WARNING: SSL CERTIFICATE CONFIGURATION IS TURNED OFF!");
        }
        // Apply all service options
        webServiceStub._getServiceClient().setOptions(options);
    }
}
