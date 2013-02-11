package org.korecky.sharepoint;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Use credentials form system. Works only on Windows OS!
 *
 * @author vkorecky
 *
 */
public class DefaultAuthenticator extends Authenticator {

    public DefaultAuthenticator() {
        super();
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return super.getPasswordAuthentication();
    }
}