package org.korecky.sharepoint.ws;

import com.microsoft.schemas.sharepoint.AlertsStub;
import com.microsoft.schemas.sharepoint.AlertsStub.AlertInfo;
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
import org.korecky.sharepoint.SPAlert;
import org.korecky.sharepoint.SPList;
import org.korecky.sharepoint.SPListTemplate;

/**
 * Object for communication with Lists web service
 *
 * @author "Vladislav Korecký"
 *
 */
public class AlertsWS extends BaseWebService {

    private static final Logger logger = Logger.getLogger(AlertsWS.class);
    private static volatile AlertsWS instance;
    private AlertsStub webServiceStub = null;
    private URL url;

    private AlertsWS() {
    }

    public static AlertsWS getInstance(URL url) throws GeneralSecurityException, IOException {
        if (instance == null) {
            instance = new AlertsWS();
            instance.webServiceStub = new AlertsStub();
            instance.initializeWebService(instance.webServiceStub, getWsUrl(url));
        } else {
            instance.changeWebServiceUrl(instance.webServiceStub, getWsUrl(url));
        }
        instance.url = url;
        return instance;
    }

    private static URL getWsUrl(URL url) throws MalformedURLException {
        return new URL(url, "/_vti_bin/Alerts.asmx");
    }

    public List<SPAlert> getAlerts() throws RemoteException {
        final List<SPAlert> alertCollection = new ArrayList<SPAlert>();

        // GetListCollection
        AlertInfo result = webServiceStub.getAlerts();
//        for (int i = 0; i < result.getAlerts().getAlert().length; i++) {
//            SPAlert newAlert = new SPAlert(url);
//        }
//
//        final Iterator children = result.get.getExtraElement().getChildElements();
//        while (children.hasNext()) {
//            final OMElement element = (OMElement) children.next();
//            final SPList newList = new SPList(element, url);
//            alertCollection.add(newList);
//        }

        return alertCollection;
    }
}
