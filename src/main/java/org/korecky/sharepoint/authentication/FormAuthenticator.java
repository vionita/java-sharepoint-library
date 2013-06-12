package org.korecky.sharepoint.authentication;

/**
 *  Credentials for form authentication.
 *
 * @author vkorecky
 *
 */
public class FormAuthenticator extends AbstractAuthenticator {    

    public FormAuthenticator(String user, String password) {
        super(user, password);
    }

    public FormAuthenticator(String domain, String user, String password) {
        super(domain, user, password);
    }
    
}