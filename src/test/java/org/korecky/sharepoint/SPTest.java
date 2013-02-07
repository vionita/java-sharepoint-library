/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
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
    public void complexTest() throws MalformedURLException, NoSuchAlgorithmException, KeyManagementException {
        // SPSite test
        NetworkCredentials credentials = new NetworkCredentials("aaa", "aa", "aa");
        HttpProxy httpProxy = new HttpProxy("127.0.0.1", 8888);

        SPSite instance = new SPSite(new URL("https://devport2.gordic.cz/"), credentials, httpProxy, true);
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
            if ((lists != null) && (lists.size() > 1)) {
                System.out.println(lists.get(0).getTitle());
            }
        }
    }
}
