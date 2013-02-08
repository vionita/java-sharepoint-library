package org.korecky.sharepoint;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
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
    public void complexTest() throws MalformedURLException, NoSuchAlgorithmException, KeyManagementException, ParseException, IOException {
        // SPSite test
        NetworkCredentials credentials = new NetworkCredentials("aaa", "aaa", "aaa");
        HttpProxy httpProxy = new HttpProxy("127.0.0.1", 8888);

        SPSite instance = new SPSite(new URL("https://aaa/"), credentials, httpProxy, true);
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
                // List items in list
                SPList list = lists.get(0);
                System.out.println(list.getTitle());
                List<SPListItem> items = list.getItems();
                for (SPListItem item : items) {
                    System.out.println(item.getTitle());
                }

                // List items in document library
                list = lists.get(3);
                System.out.println(list.getTitle());
                items = list.getItems();
                for (SPListItem item : items) {
                    File file = new File("c:\\Users\\vkorecky\\workspace\\" + item.getFile().getName());
                    item.getFile().saveBinary(file);
                }

                // List items with attachements
                list = lists.get(34);
                System.out.println(list.getTitle());
                items = list.getItems();
                for (SPListItem item : items) {
                    // Attachements                    
                    for (SPAttachment attachement : item.getAttachments()) {
                        File file = new File("c:\\Users\\vkorecky\\workspace\\" + attachement.getName());
                        attachement.saveBinary(file);
                    }
                }
            }
        }
    }
}
