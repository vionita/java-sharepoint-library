/**
 * 
 */
package com.google.code.sharepoint;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;

import com.google.code.sharepoint.data.SpGroups;
import com.google.code.sharepoint.data.SpUser;
import com.google.code.sharepoint.soap.UserGroupStub;
import com.google.code.sharepoint.soap.UserGroupStub.GetGroupCollectionFromUserResult_type0;
import com.google.code.sharepoint.soap.UserGroupStub.GetUserInfoResult_type0;

/**
 * Class for communicate with UserGroup web service
 * 
 * @author Ishan Fernando
 *
 */
public class UserGroupWS extends BaseWebService {
	
	static Logger logger = Logger.getLogger(ListsWS.class);
	private UserGroupStub webServiceStub = null;

	public UserGroupWS(final String domain, final String userName, final String password, final URL webServiceURL, final AuthenticationTypeEnum authenticationType) throws IOException, GeneralSecurityException {
		super(domain, userName, password, webServiceURL, authenticationType);
		webServiceStub = new UserGroupStub();
		initializeWebService(webServiceStub);
	}

	public UserGroupWS(final String domain, final String userName, final String password, final URL webServiceURL, final AuthenticationTypeEnum authenticationType, final HttpProxy httpProxy) throws IOException, GeneralSecurityException {
		super(domain, userName, password, webServiceURL, authenticationType, httpProxy);
		webServiceStub = new UserGroupStub();
		initializeWebService(webServiceStub);
	}

	public UserGroupWS(final String domain, final String userName, final String password, final URL webServiceURL, final AuthenticationTypeEnum authenticationType, final HttpProxy httpProxy, final Boolean trustAllSSLs) throws IOException, GeneralSecurityException {
		super(domain, userName, password, webServiceURL, authenticationType, httpProxy, trustAllSSLs);
		webServiceStub = new UserGroupStub();
		initializeWebService(webServiceStub);
	}
	
	public SpUser getUserInfo(final String userLoginName) throws RemoteException{
		SpUser user = null;
		
		final GetUserInfoResult_type0 result = webServiceStub.getUserInfo(userLoginName);
		final OMElement element = result.getExtraElement();			
		user = new SpUser(element);
		
		return user;
	}
	
	public SpGroups getGroupCollectionFromUser(final String userLoginName) throws RemoteException{
		SpGroups groups = null;
		
		final GetGroupCollectionFromUserResult_type0 result = webServiceStub.getGroupCollectionFromUser(userLoginName);
		final OMElement element = result.getExtraElement();			
		groups = new SpGroups(element);
		
		return groups;
	}

}
