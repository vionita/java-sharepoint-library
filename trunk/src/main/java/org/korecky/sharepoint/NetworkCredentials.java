package org.korecky.sharepoint;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Credentials for NTLMv2 authentication.
 *
 * @author vkorecky
 *
 */
public class NetworkCredentials extends Authenticator {

    String domain;
    String user;
    String password;

    public NetworkCredentials(String user, String password) {
        super();
        this.domain = null;
        this.user = user;
        this.password = password;
    }

    public NetworkCredentials(String domain, String user, String password) {
        super();
        this.domain = domain;
        this.user = user;
        this.password = password;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        if (domain != null && !domain.isEmpty()) {
            user = domain + "\\" + user;
        }
        return new PasswordAuthentication(user, password.toCharArray());
    }
}