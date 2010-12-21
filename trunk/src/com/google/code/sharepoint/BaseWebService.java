package com.google.code.sharepoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NoInitialContextException;
import javax.security.auth.login.LoginException;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.log4j.Logger;

/**
 * Ancestor of all objects calling Sharepoint WebServices
 * 
 * @author "Vladislav Korecký"
 * 
 */
public class BaseWebService {	
	static Logger logger = Logger.getLogger(BaseWebService.class);
	
	/**
	 * Authentication type
	 */
	public enum AuthenticationTypeEnum {
		/** Basic authentication */
		basic,
		/** NTLM (Windows) authentication */
		ntlm
	}

	private String domain = null;
	private String userName = null;
	private String password = null;
	private HttpProxy httpProxy = null;
	private URL webServiceURL = null;
	private AuthenticationTypeEnum authenticationType = AuthenticationTypeEnum.ntlm;
	private Boolean trustAllSSLs = Boolean.TRUE;

	/**
	 * Constructor
	 * 
	 * @param domain
	 * @param userName
	 * @param password
	 * @param webServiceURL
	 * @param authenticationType
	 */
	public BaseWebService(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType) {				
		this.setDomain(domain);
		this.setUserName(userName);
		this.setPassword(password);
		this.setWebServiceURL(webServiceURL);
		this.setAuthenticationType(authenticationType);			
	}

	/**
	 * Constructor
	 * 
	 * @param domain
	 * @param userName
	 * @param password
	 * @param webServiceURL
	 * @param authenticationType
	 * @param httpProxy
	 */
	public BaseWebService(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy) {		
		this.setDomain(domain);
		this.setUserName(userName);
		this.setPassword(password);
		this.setWebServiceURL(webServiceURL);
		this.setAuthenticationType(authenticationType);	
		this.setHttpProxy(httpProxy);
	}

	/**
	 * Constructor
	 * 
	 * @param domain
	 * @param userName
	 * @param password
	 * @param webServiceURL
	 * @param authenticationType
	 * @param httpProxy
	 * @param trustAllSSLs
	 */
	public BaseWebService(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy, Boolean trustAllSSLs) {
		this.setDomain(domain);
		this.setUserName(userName);
		this.setPassword(password);
		this.setWebServiceURL(webServiceURL);
		this.setAuthenticationType(authenticationType);	
		this.setHttpProxy(httpProxy);
		this.setTrustAllSSLs(trustAllSSLs);
	}

	protected void InitializeWebService(Stub webServiceStub)
			throws GeneralSecurityException, IOException {
		// Set authenticator
		Options options = webServiceStub._getServiceClient().getOptions();
		if (this.authenticationType == AuthenticationTypeEnum.basic)
			options.setProperty(HTTPConstants.AUTHENTICATE,
					GetBasicAuthenticator());
		else if (this.authenticationType == AuthenticationTypeEnum.ntlm)
			options.setProperty(HTTPConstants.AUTHENTICATE,
					GetNtlmAuthenticator());

		// Set httpProxy
		if (this.httpProxy != null) {
			// Proxy
			HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
			proxyProperties.setProxyName(this.httpProxy.getHttpProxyURL()
					.getHost());
			proxyProperties.setProxyPort(this.httpProxy.getHttpProxyURL()
					.getPort());
			// Proxy authentication
			if (this.httpProxy.getDomain() != null)
				proxyProperties.setUserName(this.httpProxy.getDomain());
			if (this.httpProxy.getUserName() != null) {
				proxyProperties.setUserName(this.httpProxy.getUserName());
				proxyProperties.setUserName(this.httpProxy.getPassword());
			}
			options.setProperty(HTTPConstants.PROXY, proxyProperties);
		}

		// Set web service URL
		options.setTo(new EndpointReference(getWebServiceURL().toString()));
		
		// SSL
		if (this.trustAllSSLs) {
			// Trust all SSLs
			// This code must not be used in production environment
			// because it ignores any certificates but
			// it is convenient to have for testing purposes
			org.apache.commons.httpclient.protocol.Protocol
					.unregisterProtocol("https");
			org.apache.commons.httpclient.protocol.Protocol
					.registerProtocol(
							"https",
							new Protocol(
									"https",
									new org.apache.commons.httpclient.contrib.ssl.EasySSLProtocolSocketFactory(),
									this.webServiceURL.getPort()));
			System.out
					.print("WARNING: SSL CERTIFICATE CONFIGURATION IS TURNED OFF!");
		}

		// Apply all service options
		webServiceStub._getServiceClient().setOptions(options);
	}

	/**
	 * Gets NTLM authenticator
	 * 
	 * @return
	 */
	private HttpTransportProperties.Authenticator GetNtlmAuthenticator() {
		// NTLM Authentication
		List<String> authScheme = new ArrayList<String>();
		authScheme.add(HttpTransportProperties.Authenticator.NTLM);
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		authenticator.setAuthSchemes(authScheme);
		authenticator.setDomain(this.domain);
		authenticator.setUsername(this.userName);
		authenticator.setPassword(this.password);
		authenticator.setHost(this.webServiceURL.getHost());
		authenticator.setPort(this.webServiceURL.getPort());
		return authenticator;
	}

	/**
	 * Gets Basic authenticator
	 * 
	 * @return
	 */
	private HttpTransportProperties.Authenticator GetBasicAuthenticator() {
		// Base Authentication
		HttpTransportProperties.Authenticator authenticator = new HttpTransportProperties.Authenticator();
		List<String> authScheme = new ArrayList<String>();
		authScheme.add(HttpTransportProperties.Authenticator.BASIC);
		authenticator.setAuthSchemes(authScheme);
		authenticator.setDomain(this.domain);
		authenticator.setUsername(this.userName);
		authenticator.setPassword(this.password);
		authenticator.setHost(this.webServiceURL.getHost());
		authenticator.setPort(this.webServiceURL.getPort());
		return authenticator;
	}	

	/**
	 * Sets authentication type
	 * @param authenticationType
	 */
	public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
		this.authenticationType = authenticationType;
		logger.info("authenticationType=" + this.authenticationType);
	}

	/**
	 * Gets authentication type
	 * @return
	 */
	public AuthenticationTypeEnum getAuthenticationType() {
		return authenticationType;
	}

	/**
	 * Sets http proxy login domain
	 * @param domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
		logger.info("domain=" + this.domain);
	}

	/**
	 * Gets http proxy login domain
	 * @return
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * Sets http proxy login name
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
		logger.info("userName=" + this.userName);
	}

	/**
	 * Gets http proxy login name
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets http proxy login password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
		logger.info("password.length()=" + this.password.length());
	}

	/**
	 * Gets http proxy login password
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets http proxy
	 * @param httpProxy
	 */
	public void setHttpProxy(HttpProxy httpProxy) {
		this.httpProxy = httpProxy;
		logger.info("httpProxy=" + this.httpProxy);
	}

	/**
	 * Gets http proxy
	 * @return
	 */
	public HttpProxy getHttpProxy() {
		return httpProxy;
	}
	

	/**
	 * Sets if should be disabled SSL certificates check
	 * @param trustAllSSLs
	 */
	public void setTrustAllSSLs(Boolean trustAllSSLs) {
		this.trustAllSSLs = trustAllSSLs;
		logger.info("trustAllSSLs=" + this.trustAllSSLs);
	}

	/**
	 * Gets if is disabled SSL certificates check
	 * @return
	 */
	public Boolean isTrustAllSSLs() {
		return trustAllSSLs;
	}	

	/**
	 * Sets wbe service url
	 * @param webServiceURL
	 */
	public void setWebServiceURL(URL webServiceURL) {
		this.webServiceURL = webServiceURL;
		logger.info("webServiceURL=" + this.webServiceURL);
	}

	/**
	 * Gets wbe service url
	 * @return
	 */
	public URL getWebServiceURL() {
		return webServiceURL;
	}

	/**
	 * @return the trustAllSSLs
	 */
	public Boolean getTrustAllSSLs() {
		return trustAllSSLs;		
	}	
}
