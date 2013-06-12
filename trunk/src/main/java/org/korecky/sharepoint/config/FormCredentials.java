package org.korecky.sharepoint.config;

/**
 * Credentials for form authentication.
 *
 * @author vkorecky
 *
 */
public class FormCredentials extends AbstractCredentials {

    public FormCredentials(String user, String password) {
        super(user, password);
    }

    public FormCredentials(String domain, String user, String password) {
        super(domain, user, password);
    }
}
