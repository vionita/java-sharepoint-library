package org.korecky.sharepoint.authentication;

import java.net.Authenticator;

/**
 * Abstract authenticator
 *
 * @author vkorecky
 */
public abstract class AbstractAuthenticator extends Authenticator {

    String domain;
    String user;
    String password;

    protected AbstractAuthenticator(String user, String password) {
        super();
        this.domain = null;
        this.user = user;
        this.password = password;
    }

    protected AbstractAuthenticator(String domain, String user, String password) {
        super();
        this.domain = domain;
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getDomain() {
        return domain;
    }

    public String getUser() {
        return user;
    }

    public String getUserName() {
        String userName = user;
        if (domain != null && !domain.isEmpty()) {
            userName = domain + "\\" + user;
        }
        return userName;
    }
}
