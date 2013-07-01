/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vkorecky
 */
public class SPWebTest {

    private SPWeb instance;

    public SPWebTest() throws KeyManagementException, NoSuchAlgorithmException, MalformedURLException {
        this.instance = TestSuite.getSite().getRootWeb();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class SPWeb.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String result = instance.getTitle();
        assertNotNull(result);
    }

    /**
     * Test of getUrl method, of class SPWeb.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        String result = instance.getUrl();
        assertNotNull(result);
    }

    /**
     * Test of getDescription method, of class SPWeb.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String result = instance.getDescription();
        assertNotNull(result);
    }

    /**
     * Test of getLanguage method, of class SPWeb.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        long result = instance.getLanguage();
        assertNotSame(0, result);
    }

    /**
     * Test of getTheme method, of class SPWeb.
     */
    @Test
    public void testGetTheme() {
        System.out.println("getTheme");
        String result = instance.getTheme();
        assertNotNull(result);
    }

    /**
     * Test of getAlerts method, of class SPWeb.
     */
    @Test
    public void testGetAlerts() throws Exception {
        System.out.println("getAlerts");
        SPAlertCollection result = instance.getAlerts();
        assertNotNull(result);
    }

    /**
     * Test of getAllProperties method, of class SPWeb.
     */
    @Test
    public void testGetAllProperties() throws Exception {
        System.out.println("getAllProperties");
        Map result = instance.getAllProperties();
        assertNotNull(result);
    }

    /**
     * Test of getLists method, of class SPWeb.
     */
    @Test
    public void testGetLists() throws Exception {
        System.out.println("getLists");
        SPListCollection result = instance.getLists();
        assertNotNull(result);
    }

    /**
     * Test of addList method, of class SPWeb.
     */
    @Test
    public void testAddList() throws Exception {
        System.out.println("addList");
        String listName = "Test List";
        String description = "Smazat";
        List<SPListTemplate> listTemplates = instance.getListTemplates();
        SPList result = instance.addList(listName, description, listTemplates.get(1));
        assertNotNull(result);
        result.delete();
    }

    /**
     * Test of getListTemplates method, of class SPWeb.
     */
    @Test
    public void testGetListTemplates() throws Exception {
        System.out.println("getListTemplates");
        List result = instance.getListTemplates();
        assertNotNull(result);
    }
}