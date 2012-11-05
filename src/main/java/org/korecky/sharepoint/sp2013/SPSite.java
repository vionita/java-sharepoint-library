package org.korecky.sharepoint.sp2013;

/**
 * Represents a collection of sites in a Web application, including a top-level Web site and all its subsites. Each SPSite object, or site collection, is represented within an SPSiteCollection object that consists of the collection of all site collections in the Web application.
 * 
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPSite extends org.korecky.sharepoint.sp2010.SPSite {
	/**
	 * Initializes a new instance of the SPSite class based on the specified URL.
	 * @param url
	 */
	public SPSite(String url) {
		super(url);
	}
}
