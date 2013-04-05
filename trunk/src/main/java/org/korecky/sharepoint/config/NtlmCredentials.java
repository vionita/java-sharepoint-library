package org.korecky.sharepoint.config;

/**
 * Credentials for NTLM authentication.
 *
 * @author vkorecky
 *
 */
public class NtlmCredentials extends AbstractCredentials {

    public NtlmCredentials(String user, String password) {
        super(user, password);
    }

    public NtlmCredentials(String domain, String user, String password) {
        super(domain, user, password);
    }

    public NtlmCredentials(String domain, String user, String password, String computerName) {
        super(domain, user, password, computerName);
    }
}
