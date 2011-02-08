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
import com.google.code.sharepoint.soap.ListsStub.GetListCollectionResult_type0;
import com.google.code.sharepoint.soap.ListsStub.GetListItemsResult_type0;
import com.google.code.sharepoint.soap.ListsStub.GetListResult_type0;
import com.google.code.sharepoint.soap.ListsStub.QueryOptions_type0;
import com.google.code.sharepoint.soap.ListsStub.Query_type0;
import com.google.code.sharepoint.soap.ListsStub.ViewFields_type0;


/**
 * Object for communication with Lists web service
 * 
 * @author "Vladislav Korecký"
 * 
 */
public class ListsWS extends BaseWebService {
	static Logger logger = Logger.getLogger(ListsWS.class);
	private ListsStub webServiceStub = null;
	
	public ListsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType);
		
		webServiceStub = new ListsStub();
		InitializeWebService(webServiceStub);
	}

	public ListsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy);
		
		webServiceStub = new ListsStub();
		InitializeWebService(webServiceStub);
	}

	public ListsWS(String domain, String userName, String password,
			URL webServiceURL, AuthenticationTypeEnum authenticationType,
			HttpProxy httpProxy, Boolean trustAllSSLs) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy, trustAllSSLs);
		
		webServiceStub = new ListsStub();
		InitializeWebService(webServiceStub);
	}
	
	public SpList GetList(String listName) throws RemoteException
	{
		SpList list = null;
		
		// GetList
		GetListResult_type0 result = webServiceStub.getList(listName);

		OMElement element = (OMElement)result.getExtraElement();			
		list = new SpList(element);
		
		return list;
	}
	
	public List<SpList>  GetListCollection() throws RemoteException
	{
		List<SpList> listCollection = new ArrayList<SpList>();
		
		// GetListCollection
		GetListCollectionResult_type0 result = webServiceStub.getListCollection();

		Iterator children = result.getExtraElement().getChildElements();
		while (children.hasNext()) {
			OMElement element = (OMElement) children.next();			
			SpList newList = new SpList(element);
            listCollection.add(newList);			
		}
		
		return listCollection;
	}
	
	public SpListItems GetListItems(String listID, String viewID, String queryCaml,
			SpViewField viewFields, int itemCount, SpQueryOptions queryOptions,
			String webID) throws XMLStreamException, RemoteException { 		

		SpListItems listItems = null;

		// Create query Element
		Query_type0 queryWs = null;
		if ((queryCaml != null) && (queryCaml.length() > 0))
		{
			queryWs = new Query_type0();
			queryWs.setExtraElement(Support.StringToOmElement(queryCaml));
		}
		
		// Create view fields element
		ViewFields_type0 viewFieldsWs = new ViewFields_type0();
		viewFieldsWs.setExtraElement(Support.StringToOmElement(viewFields.GetAsXmlString()));
		
		// Create query options  element
		QueryOptions_type0 queryOptionsWs = new QueryOptions_type0();
		queryOptionsWs.setExtraElement(Support.StringToOmElement(queryOptions.GetAsXmlString()));
		
		// Call web service
		GetListItemsResult_type0 resutl2 = webServiceStub.getListItems(listID, viewID, queryWs, viewFieldsWs, String.valueOf(itemCount), queryOptionsWs, webID);		
		System.out.println(Support.OmElementToString(resutl2.getExtraElement()));
		listItems = new SpListItems(resutl2.getExtraElement());
		
		return listItems;
	}
}
