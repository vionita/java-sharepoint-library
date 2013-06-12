package org.korecky.sharepoint.authentication;

/**
 * Credentials for basic authentication.
 *
 * @author vkorecky
 *
 */
public class BasicAuthenticator extends AbstractAuthenticator {
    public BasicAuthenticator(String user, String password) {
        super(user, password);
    }

    public BasicAuthenticator(String domain, String user, String password) {
        super(domain, user, password);
    }       
}