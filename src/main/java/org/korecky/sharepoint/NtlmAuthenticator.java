package org.korecky.sharepoint;

import java.net.PasswordAuthentication;

/**
 * Credentials for NTLMv2 authentication.
 *
 * @author vkorecky
 *
 */
public class NtlmAuthenticator extends AbstractAuthenticator {

    public NtlmAuthenticator(String user, String password) {
        super(user, password);
    }

    public NtlmAuthenticator(String domain, String user, String password) {
        super(domain, user, password);
    }
  
    @Override
    public PasswordAuthentication getPasswordAuthentication() {            
        return new PasswordAuthentication(getUserName(), password.toCharArray());
    }
}