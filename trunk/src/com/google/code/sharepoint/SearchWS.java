/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.code.sharepoint;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;

import com.google.code.sharepoint.data.SpListItems;
import com.google.code.sharepoint.data.Support;
import com.google.code.sharepoint.data.searchSchema.SpQueryText;
import com.google.code.sharepoint.soap.QueryServiceStub;
import com.google.code.sharepoint.soap.ListsStub.GetListItemsResult_type0;
import com.google.code.sharepoint.soap.ListsStub.QueryOptions_type0;
import com.google.code.sharepoint.soap.ListsStub.Query_type0;
import com.google.code.sharepoint.soap.ListsStub.ViewFields_type0;

import org.apache.log4j.Logger;

/**
 *
 * @author Vladislav Korecký <vladislav@korecky.org>
 */
public class SearchWS extends BaseWebService {

    static Logger logger = Logger.getLogger(SearchWS.class);
    private QueryServiceStub webServiceStub = null;

    public SearchWS(String domain, String userName, String password,
            URL webServiceURL, AuthenticationTypeEnum authenticationType) throws GeneralSecurityException, IOException {
        super(domain, userName, password, webServiceURL, authenticationType);

        webServiceStub = new QueryServiceStub();
        InitializeWebService(webServiceStub);
    }

    public SearchWS(String domain, String userName, String password,
            URL webServiceURL, AuthenticationTypeEnum authenticationType,
            HttpProxy httpProxy) throws GeneralSecurityException, IOException {
        super(domain, userName, password, webServiceURL, authenticationType,
                httpProxy);

        webServiceStub = new QueryServiceStub();
        InitializeWebService(webServiceStub);
    }

    public SearchWS(String domain, String userName, String password,
            URL webServiceURL, AuthenticationTypeEnum authenticationType,
            HttpProxy httpProxy, Boolean trustAllSSLs) throws GeneralSecurityException, IOException {
        super(domain, userName, password, webServiceURL, authenticationType,
                httpProxy, trustAllSSLs);

        webServiceStub = new QueryServiceStub();
        InitializeWebService(webServiceStub);
    }

    public String Query(SpQueryText queryText) throws RemoteException {
        String result = null;    
        
        String query = "<QueryPacket xmlns='urn:Microsoft.Search.Query'>" +
  "<Query>" +
    "<Context>" +
      "<QueryText language='en-US' type='STRING'>SharePoint</QueryText>" +
    "</Context>" +
  "</Query>" +
"</QueryPacket>";
        result = webServiceStub.query(query);
        return result;
    }
}
