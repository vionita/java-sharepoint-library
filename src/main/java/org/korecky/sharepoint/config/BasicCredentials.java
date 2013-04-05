package org.korecky.sharepoint.config;

/**
 * Credentials for basic authentication.
 *
 * @author vkorecky
 *
 */
public class BasicCredentials extends AbstractCredentials {

    public BasicCredentials(String user, String password) {
        super(user, password);
    }
}
