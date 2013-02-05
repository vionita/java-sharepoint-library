package org.korecky.sharepoint.sp2007;

import com.microsoft.schemas.sharepoint.soap.webs.GetAllSubWebCollectionResponse.GetAllSubWebCollectionResult;
import com.microsoft.schemas.sharepoint.soap.webs.Webs;
import com.microsoft.schemas.sharepoint.soap.webs.WebsSoap;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import java.net.Authenticator;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.BindingProvider;
import org.korecky.sharepoint.BaseWebServiceClient;
import org.korecky.sharepoint.HttpProxy;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Represents a collection of sites in a Web application, including a top-level
 * Web site and all its subsites. Each SPSite object, or site collection, is
 * represented within an SPSiteCollection object that consists of the collection
 * of all site collections in the Web application.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite extends BaseWebServiceClient {

    protected WebsSoap port;

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param trustAllSSLs
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, trustAllSSLs);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param httpProxy
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, HttpProxy httpProxy) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, httpProxy);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @param url
     * @param credentials
     * @param httpProxy
     * @param trustAllSSLs
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public SPSite(URL url, Authenticator credentials, HttpProxy httpProxy, boolean trustAllSSLs) throws NoSuchAlgorithmException, KeyManagementException {
        super(url, credentials, httpProxy, trustAllSSLs);
    }

    /**
     * Initializes a new instance of the SPSite
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    protected WebsSoap getPort() throws NoSuchAlgorithmException, KeyManagementException {
        if (port == null) {
            Webs service = new Webs();
            port = service.getWebsSoap();
            ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());
        }
        return port;
    }

    /**
     * Gets the collection of all Web sites that are contained within the site
     * collection, including the top-level site and its subsites.
     *
     * @return
     */
    public List<SPWeb> getAllWebs() throws KeyManagementException, NoSuchAlgorithmException {
        List<SPWeb> allWebs = new ArrayList<>();
        GetAllSubWebCollectionResult result = getPort().getAllSubWebCollection();

        if (result.getContent() != null) {
            for (Object content : result.getContent()) {
                if (content instanceof ElementNSImpl) {
                    // Parse XML file                    
                    Element rootElement = (Element) content;
                    NodeList webNodeList = rootElement.getElementsByTagName("Web");
                    for (int i = 0; i < webNodeList.getLength(); i++) {
                        Element webElement = (Element) webNodeList.item(i);;
                        String title = webElement.getAttribute("Title");
                        String url = webElement.getAttribute("Url");
                        SPWeb web = new SPWeb(title, url);
                        allWebs.add(web);
                    }
                }
            }
        }
        return allWebs;
    }
}
