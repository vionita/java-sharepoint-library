package org.korecky.sharepoint.ws;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMElement;
import org.apache.log4j.Logger;

import com.microsoft.schemas.sharepoint.WebsStub;
import com.microsoft.schemas.sharepoint.WebsStub.GetListTemplatesResult_type0;
import com.microsoft.schemas.sharepoint.WebsStub.GetWebCollectionResult_type0;
import com.microsoft.schemas.sharepoint.WebsStub.GetWebResult_type0;
import java.net.MalformedURLException;
import org.korecky.sharepoint.SPListTemplate;
import org.korecky.sharepoint.SPWeb;

/**
 * Object for communication with Webs web service
 *
 * @author "Vladislav Korecký"
 *
 */
public class WebsWS extends BaseWebService {

    private static final Logger logger = Logger.getLogger(WebsWS.class);
    private static volatile WebsWS instance;
    private WebsStub webServiceStub = null;
    private URL url;

    private WebsWS() {
    }

    public static WebsWS getInstance(URL url) throws GeneralSecurityException, IOException {
        if (instance == null) {
            instance = new WebsWS();
            instance.webServiceStub = new WebsStub();
            instance.initializeWebService(instance.webServiceStub, getWsUrl(url));
        } else {
            instance.changeWebServiceUrl(instance.webServiceStub, getWsUrl(url));
        }
        instance.url = url;
        return instance;
    }

    private static URL getWsUrl(URL url) throws MalformedURLException {
        return new URL(url, "/_vti_bin/Webs.asmx");
    }

    public List<SPWeb> getWebCollection() throws RemoteException, MalformedURLException {
        List<SPWeb> listCollection = new ArrayList<SPWeb>();
        GetWebCollectionResult_type0 result = webServiceStub.getWebCollection();
        Iterator children = result.getExtraElement().getChildElements();
        while (children.hasNext()) {
            OMElement element = (OMElement) children.next();
            SPWeb newWeb = new SPWeb(element);
            listCollection.add(newWeb);
        }

        return listCollection;
    }

    public List<SPListTemplate> getListTemplates() throws RemoteException, MalformedURLException {
        List<SPListTemplate> listTemplatesCollection = new ArrayList<SPListTemplate>();
        GetListTemplatesResult_type0 result = webServiceStub.getListTemplates();
        Iterator children = result.getExtraElement().getChildElements();
        while (children.hasNext()) {
            OMElement element = (OMElement) children.next();
            SPListTemplate newListTemplate = new SPListTemplate(element, url);
            listTemplatesCollection.add(newListTemplate);
        }
        return listTemplatesCollection;
    }

    public SPWeb getWeb(URL webUrl) throws RemoteException, MalformedURLException {
        SPWeb web = null;
        GetWebResult_type0 result = webServiceStub.getWeb(webUrl.toString());
        OMElement element = result.getExtraElement();
        web = new SPWeb(element);
        return web;
    }
}
