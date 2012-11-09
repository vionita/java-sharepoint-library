package org.korecky.sharepoint.sp2007;

import java.io.IOException;
import java.io.StringReader;
import java.net.Authenticator;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.TrustManager;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.korecky.sharepoint.NtlmAuthenticator;
import org.korecky.sharepoint.TrustAllX509TrustManager;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.microsoft.schemas.sharepoint.soap.GetWebCollectionResponse.GetWebCollectionResult;
import com.microsoft.schemas.sharepoint.soap.Webs;
import com.microsoft.schemas.sharepoint.soap.WebsSoap;

/**
 * Represents a collection of sites in a Web application, including a top-level Web site and all its subsites. Each SPSite object, or site collection, is represented within an SPSiteCollection object that consists of the collection of all site collections in the Web application.
 * 
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite {
	String url;
	
	/**
	 * Initializes a new instance of the SPSite class based on the specified URL.
	 * @param url
	 */
	public SPSite(String url) {
		this.url = url;
	}	
	
	/**
	 * Gets the collection of all Web sites that are contained within the site collection, including the top-level site and its subsites.
	 * @return
	 */
	public List<SPWeb> getAllWebs()
	{
		List<SPWeb> allWebs = null;
		
		//Set the jcifs properties
        Authenticator.setDefault(new NtlmAuthenticator());
        
        Webs service = new Webs();        
        WebsSoap client = service.getWebsSoap12();        
        Client proxy = ClientProxy.getClient(client);        

        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();        
        httpClientPolicy.setConnectionTimeout(36000);
        httpClientPolicy.setAllowChunking(false);
        
        HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
        conduit.setClient(httpClientPolicy);
        TLSClientParameters tcp = new TLSClientParameters();
        tcp.setTrustManagers( new TrustManager[]{ new TrustAllX509TrustManager() } );
        conduit.setTlsClientParameters( tcp );
        
        GetWebCollectionResult webColResult  = client.getWebCollection();
        
        // parse file and build Document        
		try {
			Document xmlDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(webColResult.toString())));
			//get list of elements called order-items
	        NodeList orderItemsNodes = xmlDoc.getElementsByTagName("order-items");

	        //iterate over the elements
	        for(int i = 0 ; i <orderItemsNodes.getLength();i++ ){
	            Node orderItemNode = orderItemsNodes.item(i);
	        }
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allWebs;		
	}

	/**
	 * @return Gets the full URL to the root Web site of the site collection, including host name, port number, and path.
	 */
	public String getUrl() {
		return url;
	}	
}
