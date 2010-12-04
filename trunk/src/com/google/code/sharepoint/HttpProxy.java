package com.google.code.sharepoint;

import java.net.URL;

/**
 * HttpProxy configuration object
 * 
 * @author "Vladislav Korecký"
 * 
 */
public class HttpProxy {
	private String domain = null;
	private String userName = null;
	private String password = null;
	private URL httpProxyURL = null;

	/**
	 * Constructor
	 * @param httpProxyURL
	 */
	public HttpProxy(URL httpProxyURL) {
		this.httpProxyURL = httpProxyURL;
	}
	
	/**
	 * Constructor
	 * @param httpProxyURL
	 * @param domain
	 * @param userName
	 * @param password
	 */
	public HttpProxy(URL httpProxyURL, String domain, String userName,
			String password) {
		this.httpProxyURL = httpProxyURL;
		this.domain = domain;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Sets http proxy URL
	 * @param httpProxyURL
	 */
	public void setHttpProxyURL(URL httpProxyURL) {
		this.httpProxyURL = httpProxyURL;
	}

	/**
	 * Gets http proxy URL
	 * @return
	 */
	public URL getHttpProxyURL() {
		return httpProxyURL;
	}

	/**
	 * Sets http proxy login domain
	 * @param domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
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
	}

	/**
	 * Gets http proxy login password
	 * @return
	 */
	public String getPassword() {
		return password;
	}
}
