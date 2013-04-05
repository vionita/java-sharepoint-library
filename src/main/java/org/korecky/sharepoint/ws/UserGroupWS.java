package org.korecky.sharepoint.ws;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;

import org.korecky.sharepoint.SPGroups;
import org.korecky.sharepoint.SPUser;
import com.microsoft.schemas.sharepoint.UserGroupStub;
import com.microsoft.schemas.sharepoint.UserGroupStub.GetGroupCollectionFromUserResult_type0;
import com.microsoft.schemas.sharepoint.UserGroupStub.GetUserInfoResult_type0;
import java.net.MalformedURLException;

/**
 * Class for communicate with UserGroup web service
 *
 * @author Ishan Fernando
 *
 */
public class UserGroupWS extends BaseWebService {

    private static final Logger logger = Logger.getLogger(ListsWS.class);
    private static volatile UserGroupWS instance;
    private UserGroupStub webServiceStub = null;
    private URL url;

    private UserGroupWS() {
    }

    public static UserGroupWS getInstance(URL url) throws GeneralSecurityException, IOException {
        if (instance == null) {
            instance = new UserGroupWS();
            instance.webServiceStub = new UserGroupStub();
            instance.initializeWebService(instance.webServiceStub, getWsUrl(url));
        } else {
            instance.changeWebServiceUrl(instance.webServiceStub, getWsUrl(url));
        }
        instance.url = url;
        return instance;
    }

    private static URL getWsUrl(URL url) throws MalformedURLException {
        return new URL(url, "/_vti_bin/UserGroup.asmx");
    }

    public SPUser getUserInfo(final String userLoginName) throws RemoteException {
        SPUser user = null;

        final GetUserInfoResult_type0 result = webServiceStub.getUserInfo(userLoginName);
        final OMElement element = result.getExtraElement();
        user = new SPUser(element);

        return user;
    }

    public SPGroups getGroupCollectionFromUser(final String userLoginName) throws RemoteException {
        SPGroups groups = null;

        final GetGroupCollectionFromUserResult_type0 result = webServiceStub.getGroupCollectionFromUser(userLoginName);
        final OMElement element = result.getExtraElement();
        groups = new SPGroups(element);

        return groups;
    }
}
