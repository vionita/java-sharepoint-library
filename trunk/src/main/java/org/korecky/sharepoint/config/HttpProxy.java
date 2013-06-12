package org.korecky.sharepoint.config;

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
    private String proxyHost = null;
    private int proxyPort = 0;

    /**
     * Constructor
     *
     * @param httpProxyURL
     */
    public HttpProxy(String proxyHost, int proxyPort) {
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    /**
     * Gets proxy host
     *
     * @return
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * Sets proxy hosts
     *
     * @param proxyHost
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * Gets proxy port
     *
     * @return
     */
    public int getProxyPort() {
        return proxyPort;
    }

    /**
     * Sets proxy port
     *
     * @param proxyPort
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * Sets http proxy login domain
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Gets http proxy login domain
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets http proxy login name
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets http proxy login name
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets http proxy login password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets http proxy login password
     *
     * @return
     */
    public String getPassword() {
        return password;
    }
}
