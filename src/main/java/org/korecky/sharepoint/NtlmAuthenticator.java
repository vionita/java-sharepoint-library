package org.korecky.sharepoint;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class NtlmAuthenticator extends Authenticator {
    public PasswordAuthentication getPasswordAuthentication() {
        // I haven't checked getRequestingScheme() here, since for NTLM
        // and Negotiate, the usrname and password are all the same.
        System.err.println("Feeding username and password for " + getRequestingScheme());
        return (new PasswordAuthentication("kuser", "kpass".toCharArray()));
    }
}
