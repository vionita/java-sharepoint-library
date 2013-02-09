package org.korecky.sharepoint;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author vkorecky
 */
public class SPTest {

    public SPTest() {
    }

    @Test
    public void complexTest() throws MalformedURLException, NoSuchAlgorithmException, KeyManagementException, ParseException, IOException, URISyntaxException {
        // SPSite test
        NetworkCredentials credentials = new NetworkCredentials("SP20130", "sp_adminuser", "sp13123!@#");
        HttpProxy httpProxy = new HttpProxy("127.0.0.1", 8888);

        SPSite instance = new SPSite(new URL("http://sp2013/"), credentials, httpProxy, true);
        List<SPWeb> result = instance.getAllWebs();
        assertNotNull(result);
        if ((result != null) && (result.size() > 1)) {
            SPWeb web = result.get(0);
            System.out.println(web.getUrl());
            // SPAlert                
            List<SPAlert> alertCollection = web.getAlerts();
            assertNotNull(alertCollection);
            // Web properties
            Map<String, String> webProperties = web.getAllProperties();
            assertNotNull(webProperties);
            // Lists
            List<SPList> lists = web.getLists();
            assertNotNull(lists);
            for (SPList list : lists) {
                System.out.println(list.getTitle());
            }
            if ((lists != null) && (lists.size() > 1)) {
                SPList list = lists.get(0);
                // List views
                List<SPView> views = list.getViews();                

                // List items in list
//                System.out.println(list.getTitle());
//                List<SPListItem> items = list.getItems(null, null);
//                for (SPListItem item : items) {
//                    System.out.println(item.getTitle());
//                }
//
//                // List items in document library
//                list = lists.get(3);
//                System.out.println(list.getTitle());
//                items = list.getItems();
//                File savedFile = null;
//                for (SPListItem item : items) {
//                    savedFile = new File("c:\\Users\\vkorecky\\workspace\\" + item.getFile().getName());
//                    item.getFile().saveBinary(savedFile);
//                }
//
//                // List items with attachements
//                list = lists.get(34);
//                System.out.println(list.getTitle());
//                items = list.getItems();
//                for (SPListItem item : items) {
//                    // Attachements                    
//                    for (SPAttachment attachement : item.getAttachments()) {
//                        File file = new File("c:\\Users\\vkorecky\\workspace\\" + attachement.getName());
//                        attachement.saveBinary(file);
//                    }
//                    
//                    SPAttachment attachment = item.addAttachment(savedFile);
//                    System.out.println(attachment.getAbsoluteUrl());
//                }
            }

            // ListTemplates
            List<SPListTemplate> templates = web.getListTemplates();
            assertNotNull(templates);
            // web.addList("test3", "pokus", templates.get(1));                                 
        }
    }
}
