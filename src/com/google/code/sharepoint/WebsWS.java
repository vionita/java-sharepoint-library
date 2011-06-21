/**
 * 
 */
package com.google.code.sharepoint;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;

import com.google.code.sharepoint.data.*;
import com.google.code.sharepoint.soap.ListsStub;
import com.google.code.sharepoint.soap.WebsStub;
import com.google.code.sharepoint.soap.ListsStub.GetListCollectionResult_type0;
import com.google.code.sharepoint.soap.ListsStub.GetListItemsResult_type0;
import com.google.code.sharepoint.soap.ListsStub.GetListResult_type0;
import com.google.code.sharepoint.soap.ListsStub.QueryOptions_type0;
import com.google.code.sharepoint.soap.ListsStub.Query_type0;
import com.google.code.sharepoint.soap.ListsStub.ViewFields_type0;
import com.google.code.sharepoint.soap.WebsStub.GetWebCollectionResult_type0;


/**
 * Object for communication with Webs web service
 * 
 * @author "Vladislav Korecký"
 * 
 */
public class WebsWS extends BaseWebService {
	static Logger logger = Logger.getLogger(WebsWS.class);
	private WebsStub webServiceStub = null;
	
	public WebsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType);
		
		webServiceStub = new WebsStub();
		initializeWebService(webServiceStub);
	}

	public WebsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy);
		
		webServiceStub = new WebsStub();
		initializeWebService(webServiceStub);
	}

	public WebsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy, Boolean trustAllSSLs) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy, trustAllSSLs);
		
		webServiceStub = new WebsStub();
		initializeWebService(webServiceStub);
	}
		
	public void  getWebCollection() throws RemoteException
	{
		//List<SpList> listCollection = new ArrayList<SpList>();
		
		// GetWebCollection
		GetWebCollectionResult_type0 result = webServiceStub.getWebCollection();

		Iterator children = result.getExtraElement().getChildElements();
		while (children.hasNext()) {
			OMElement element = (OMElement) children.next();			
//			SpList newList = new SpList(element);
//            listCollection.add(newList);			
		}
		
//		return listCollection;
	}	
}
