/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.code.sharepoint;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import com.google.code.sharepoint.data.SpListItems;
import com.google.code.sharepoint.data.Support;
import com.google.code.sharepoint.data.search.request.QueryPacket;
import com.google.code.sharepoint.data.search.request.QueryText;
import com.google.code.sharepoint.data.search.response.ResponsePacket;
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
        initializeWebService(webServiceStub);
    }

    public SearchWS(String domain, String userName, String password,
            URL webServiceURL, AuthenticationTypeEnum authenticationType,
            HttpProxy httpProxy) throws GeneralSecurityException, IOException {
        super(domain, userName, password, webServiceURL, authenticationType,
                httpProxy);

        webServiceStub = new QueryServiceStub();
        initializeWebService(webServiceStub);
    }

    public SearchWS(String domain, String userName, String password,
            URL webServiceURL, AuthenticationTypeEnum authenticationType,
            HttpProxy httpProxy, Boolean trustAllSSLs) throws GeneralSecurityException, IOException {
        super(domain, userName, password, webServiceURL, authenticationType,
                httpProxy, trustAllSSLs);

        webServiceStub = new QueryServiceStub();
        initializeWebService(webServiceStub);
    }

    public ResponsePacket query(QueryPacket queryPacket) throws RemoteException, XMLStreamException, ParseException {
        String result = null;    
        
//        String query = "<QueryPacket xmlns='urn:Microsoft.Search.Query'>" +
//  "<Query>" +
//    "<Context>" +
//      "<QueryText language='en-US' type='STRING'>SharePoint</QueryText>" +
//    "</Context>" +
//  "</Query>" +
//"</QueryPacket>";
        result = webServiceStub.query(queryPacket.getAsXmlString());
        if (result != null)
        {
        	ResponsePacket responsePacket = new ResponsePacket(result);
        	return responsePacket;
        }
        
        return null;
    }
}
