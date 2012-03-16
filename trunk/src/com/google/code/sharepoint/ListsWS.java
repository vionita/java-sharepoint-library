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

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;

import com.google.code.sharepoint.data.SpList;
import com.google.code.sharepoint.data.SpListItems;
import com.google.code.sharepoint.data.SpQueryOptions;
import com.google.code.sharepoint.data.SpViewField;
import com.google.code.sharepoint.data.Support;
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
	
	public ListsWS(final String domain, final String userName, final String password,
			final URL webServiceURL, final AuthenticationTypeEnum authenticationType) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType);
		
		webServiceStub = new ListsStub();
		initializeWebService(webServiceStub);
	}

	public ListsWS(final String domain, final String userName, final String password,
			final URL webServiceURL, final AuthenticationTypeEnum authenticationType,
			final HttpProxy httpProxy) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy);
		
		webServiceStub = new ListsStub();
		initializeWebService(webServiceStub);
	}

	public ListsWS(final String domain, final String userName, final String password,
			final URL webServiceURL, final AuthenticationTypeEnum authenticationType,
			final HttpProxy httpProxy, final Boolean trustAllSSLs) throws GeneralSecurityException, IOException {
		super(domain, userName, password, webServiceURL, authenticationType,
				httpProxy, trustAllSSLs);
		
		webServiceStub = new ListsStub();
		initializeWebService(webServiceStub);
	}
	
	public SpList getList(final String listName) throws RemoteException
	{
		SpList list = null;
		
		// GetList
		final GetListResult_type0 result = webServiceStub.getList(listName);

		final OMElement element = result.getExtraElement();			
		list = new SpList(element);
		
		return list;
	}
	
	public List<SpList>  getListCollection() throws RemoteException
	{
		final List<SpList> listCollection = new ArrayList<SpList>();
		
		// GetListCollection
		final GetListCollectionResult_type0 result = webServiceStub.getListCollection();

		final Iterator children = result.getExtraElement().getChildElements();
		while (children.hasNext()) {
			final OMElement element = (OMElement) children.next();			
			final SpList newList = new SpList(element);
            listCollection.add(newList);			
		}
		
		return listCollection;
	}
	
	public SpListItems getListItems(final String listID, final String viewID, final String queryCaml,
			final SpViewField viewFields, final int itemCount, final SpQueryOptions queryOptions,
			final String webID) throws XMLStreamException, RemoteException { 		

		SpListItems listItems = null;

		// Create query Element
		Query_type0 queryWs = null;
		if ((queryCaml != null) && (queryCaml.length() > 0))
		{
			queryWs = new Query_type0();
			queryWs.setExtraElement(Support.stringToOmElement(queryCaml));
		}
		
		// Create view fields element
		ViewFields_type0 viewFieldsWs = null;
		if(viewFields != null) {
			viewFieldsWs = new ViewFields_type0();
			viewFieldsWs.setExtraElement(Support.stringToOmElement(viewFields.getAsXmlString()));
		}
		
		// Create query options  element
		QueryOptions_type0 queryOptionsWs = null;
		if(queryOptions != null) {
			queryOptionsWs = new QueryOptions_type0();
			queryOptionsWs.setExtraElement(Support.stringToOmElement(queryOptions.getAsXmlString()));
		}
		
		// Call web service
		final GetListItemsResult_type0 resutl2 = webServiceStub.getListItems(listID, viewID, queryWs, viewFieldsWs, String.valueOf(itemCount), queryOptionsWs, webID);		
		// System.out.println(Support.omElementToString(resutl2.getExtraElement()));
		listItems = new SpListItems(resutl2.getExtraElement());
		
		return listItems;
	}
}
