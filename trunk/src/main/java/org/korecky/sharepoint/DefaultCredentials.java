package org.korecky.sharepoint;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Use credentials form system. Works only on Windows OS!  
 * @author vkorecky
 *
 */
public class DefaultCredentials extends Authenticator {
	public DefaultCredentials() {
		super();
	}
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {		  
		return super.getPasswordAuthentication();
	}
}
