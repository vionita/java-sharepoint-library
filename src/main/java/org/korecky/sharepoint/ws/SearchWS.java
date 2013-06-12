package org.korecky.sharepoint.ws;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.text.ParseException;

import javax.xml.stream.XMLStreamException;

import org.korecky.sharepoint.search.request.QueryPacket;
import org.korecky.sharepoint.search.response.ResponsePacket;
import com.microsoft.schemas.sharepoint.QueryServiceStub;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;

/**
 *
 * @author Vladislav Korecký <vladislav@korecky.org>
 */
public class SearchWS extends BaseWebService {

    private static final Logger logger = Logger.getLogger(SearchWS.class);
    private static volatile SearchWS instance;
    private QueryServiceStub webServiceStub = null;
    private URL url;

    private SearchWS() {
    }

    public static SearchWS getInstance(URL url) throws GeneralSecurityException, IOException {
        if (instance == null) {
            instance = new SearchWS();
            instance.webServiceStub = new QueryServiceStub();
            instance.initializeWebService(instance.webServiceStub, getWsUrl(url));
        } else {
            instance.changeWebServiceUrl(instance.webServiceStub, getWsUrl(url));
        }
        instance.url = url;
        return instance;
    }

    private static URL getWsUrl(URL url) throws MalformedURLException {
        return new URL(url, "/_vti_bin/DspSts.asmx");
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
        if (result != null) {
            ResponsePacket responsePacket = new ResponsePacket(result);
            return responsePacket;
        }

        return null;
    }
}
