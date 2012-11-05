package org.korecky.sharepoint.sp2007;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of sites in a Web application, including a top-level Web site and all its subsites. Each SPSite object, or site collection, is represented within an SPSiteCollection object that consists of the collection of all site collections in the Web application.
 * 
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite {
	/**
	 * Initializes a new instance of the SPSite class based on the specified URL.
	 * @param url
	 */
	public SPSite(String url) {
	
	}	
	
	/**
	 * Gets the collection of all Web sites that are contained within the site collection, including the top-level site and its subsites.
	 * @return
	 */
	public List<SPWeb> getAllWebs()
	{
		List<SPWeb> allWebs = null;
		
		
		
//		SiteData ss = new SiteData(wsdlURL, SERVICE_NAME);
//		SiteDataSoap port = ss.getSiteDataSoap();
//
//		//Turn off chunking so that NTLM can occur
//		Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
//		HTTPConduit http = (HTTPConduit) client.getConduit();
//		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
//		httpClientPolicy.setConnectionTimeout(36000);
//		httpClientPolicy.setAllowChunking(false);
//		http.setClient(httpClientPolicy);
//		
//		
//		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//    	factory.getInInterceptors().add(new LoggingInInterceptor());
//    	factory.getOutInterceptors().add(new LoggingOutInterceptor());
//    	factory.setServiceClass(AuthService.class);
//    	factory.setAddress("http://localhost:7001/authManager/services/cxfAuth");
//    	AuthService client = (AuthService) factory.create();
//
//    	Employee employee = client.getEmployee("0223938");
//    	System.out.println("Server said: " + employee.getLastName() + ", " + employee.getFirstName());
//    	System.exit(0);
		
		return allWebs;		
	}
}
