package org.korecky.sharepoint.ws;

import org.korecky.sharepoint.config.AbstractCredentials;
import org.korecky.sharepoint.config.HttpProxy;

/**
 *
 * @author vkorecky
 */
public class WsContext {

    private static WsContext instance;
    private AbstractCredentials credentials;
    private HttpProxy httpProxy;
    private boolean trustAllSSLs = false;

    private WsContext() {
    }

    public static WsContext getInstance() {
        if (instance == null) {
            instance = new WsContext();
        }
        return instance;
    }

    public AbstractCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(AbstractCredentials credentials) {
        this.credentials = credentials;
    }

    public HttpProxy getHttpProxy() {
        return httpProxy;
    }

    public void setHttpProxy(HttpProxy httpProxy) {
        this.httpProxy = httpProxy;
    }

    public boolean isTrustAllSSLs() {
        return trustAllSSLs;
    }

    public void setTrustAllSSLs(boolean trustAllSSLs) {
        this.trustAllSSLs = trustAllSSLs;
    }
}
