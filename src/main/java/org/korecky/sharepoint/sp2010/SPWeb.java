package org.korecky.sharepoint.sp2010;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb extends org.korecky.sharepoint.general.SPWeb {

    protected SPWeb() {
        super();
    }

    protected SPWeb(String title, String url) {
        super(title, url);
    }
    
}
