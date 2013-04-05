package org.korecky.sharepoint.ws;

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

import org.korecky.sharepoint.SPListItems;
import org.korecky.sharepoint.SPQueryOptions;
import org.korecky.sharepoint.SPViewField;
import org.korecky.sharepoint.Support;
import com.microsoft.schemas.sharepoint.ListsStub;
import com.microsoft.schemas.sharepoint.ListsStub.AddListResult_type0;
import com.microsoft.schemas.sharepoint.ListsStub.GetListCollectionResult_type0;
import com.microsoft.schemas.sharepoint.ListsStub.GetListItemsResult_type0;
import com.microsoft.schemas.sharepoint.ListsStub.GetListResult_type0;
import com.microsoft.schemas.sharepoint.ListsStub.QueryOptions_type0;
import com.microsoft.schemas.sharepoint.ListsStub.Query_type0;
import com.microsoft.schemas.sharepoint.ListsStub.ViewFields_type0;
import java.net.MalformedURLException;
import org.korecky.sharepoint.SPList;
import org.korecky.sharepoint.SPListTemplate;

/**
 * Object for communication with Lists web service
 *
 * @author "Vladislav Korecký"
 *
 */
public class ListsWS extends BaseWebService {

    private static final Logger logger = Logger.getLogger(ListsWS.class);
    private static volatile ListsWS instance;
    private ListsStub webServiceStub = null;
    private URL url;

    private ListsWS() {
    }

    public static ListsWS getInstance(URL url) throws GeneralSecurityException, IOException {
        if (instance == null) {
            instance = new ListsWS();
            instance.webServiceStub = new ListsStub();
            instance.initializeWebService(instance.webServiceStub, getWsUrl(url));
        } else {
            instance.changeWebServiceUrl(instance.webServiceStub, getWsUrl(url));
        }
        instance.url = url;
        return instance;
    }

    private static URL getWsUrl(URL url) throws MalformedURLException {
        return new URL(url, "/_vti_bin/Lists.asmx");
    }

    public SPList getList(final String listName) throws RemoteException {
        SPList list = null;
        GetListResult_type0 result = webServiceStub.getList(listName);
        OMElement element = result.getExtraElement();
        list = new SPList(element, url);
        return list;
    }

    public SPList addList(String listName, String description, int listTemplateID) throws RemoteException {
        SPList list = null;
        AddListResult_type0 result = webServiceStub.addList(listName, description, listTemplateID);
        OMElement element = result.getExtraElement();
        list = new SPList(element, url);
        return list;
    }

    public List<SPList> getListCollection() throws RemoteException {
        final List<SPList> listCollection = new ArrayList<SPList>();

        // GetListCollection
        final GetListCollectionResult_type0 result = webServiceStub.getListCollection();

        final Iterator children = result.getExtraElement().getChildElements();
        while (children.hasNext()) {
            final OMElement element = (OMElement) children.next();
            final SPList newList = new SPList(element, url);
            listCollection.add(newList);
        }

        return listCollection;
    }

    public SPListItems getListItems(final String listID, final String viewID, final String queryCaml,
            final SPViewField viewFields, final int itemCount, final SPQueryOptions queryOptions,
            final String webID) throws XMLStreamException, RemoteException {

        SPListItems listItems = null;

        // Create query Element
        Query_type0 queryWs = null;
        if ((queryCaml != null) && (queryCaml.length() > 0)) {
            queryWs = new Query_type0();
            queryWs.setExtraElement(Support.stringToOmElement(queryCaml));
        }

        // Create view fields element
        ViewFields_type0 viewFieldsWs = null;
        if (viewFields != null) {
            viewFieldsWs = new ViewFields_type0();
            viewFieldsWs.setExtraElement(Support.stringToOmElement(viewFields.getAsXmlString()));
        }

        // Create query options  element
        QueryOptions_type0 queryOptionsWs = null;
        if (queryOptions != null) {
            queryOptionsWs = new QueryOptions_type0();
            queryOptionsWs.setExtraElement(Support.stringToOmElement(queryOptions.getAsXmlString()));
        }

        // Call web service
        final GetListItemsResult_type0 resutl2 = webServiceStub.getListItems(listID, viewID, queryWs, viewFieldsWs, String.valueOf(itemCount), queryOptionsWs, webID);
        // System.out.println(Support.omElementToString(resutl2.getExtraElement()));
        listItems = new SPListItems(resutl2.getExtraElement());

        return listItems;
    }
}
