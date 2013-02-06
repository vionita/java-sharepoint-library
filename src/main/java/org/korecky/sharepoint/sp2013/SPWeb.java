package org.korecky.sharepoint.sp2013;

import org.korecky.sharepoint.sp2007.*;

/**
 * Represents a SharePoint Foundation website.
 *
 * @author Vladislav Korecký [vladislav@korecky.org] - http://www.korecky.org
 *
 */
public class SPWeb extends org.korecky.sharepoint.general.SPWeb {

    public SPWeb() {
        super();
    }

    public SPWeb(String title, String url) {
        super(title, url);
    }
    
}
