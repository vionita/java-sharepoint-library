package org.korecky.sharepoint.net;

/**
 * HttpProxy configuration object
 *
 * @author "Vladislav Korecký"
 *
 */
public class HttpProxy {

    private String domain;
    private String userName;
    private String password;
    private String proxyHost;
    private int proxyPort;

    public HttpProxy(String proxyHost, int proxyPort) {
        this(proxyHost, proxyPort, null, null, null);
    }

    public HttpProxy(String proxyHost, int proxyPort, String userName, String password) {
        this(proxyHost, proxyPort, null, userName, password);
    }

    public HttpProxy(String proxyHost, int proxyPort, String domain, String userName, String password) {
        this.domain = domain;
        this.userName = userName;
        this.password = password;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public String getDomain() {
        return domain;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public int getProxyPort() {
        return proxyPort;
    }
}
