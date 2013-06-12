/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPViewTest {
    
    public SPViewTest() {
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
     * Test of loadFromXml method, of class SPView.
     */
    @Test
    public void testLoadFromXml() throws Exception {
        System.out.println("loadFromXml");
        Element rootElement = null;
        SPView instance = null;
        instance.loadFromXml(rootElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SPView.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SPView instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDefaultView method, of class SPView.
     */
    @Test
    public void testIsDefaultView() {
        System.out.println("isDefaultView");
        SPView instance = null;
        boolean expResult = false;
        boolean result = instance.isDefaultView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class SPView.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        SPView instance = null;
        SPView.SPViewType expResult = null;
        SPView.SPViewType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayName method, of class SPView.
     */
    @Test
    public void testGetDisplayName() {
        System.out.println("getDisplayName");
        SPView instance = null;
        String expResult = "";
        String result = instance.getDisplayName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrl method, of class SPView.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        SPView instance = null;
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class SPView.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        SPView instance = null;
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseViewID method, of class SPView.
     */
    @Test
    public void testGetBaseViewID() {
        System.out.println("getBaseViewID");
        SPView instance = null;
        int expResult = 0;
        int result = instance.getBaseViewID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentTypeID method, of class SPView.
     */
    @Test
    public void testGetContentTypeID() {
        System.out.println("getContentTypeID");
        SPView instance = null;
        String expResult = "";
        String result = instance.getContentTypeID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageUrl method, of class SPView.
     */
    @Test
    public void testGetImageUrl() {
        System.out.println("getImageUrl");
        SPView instance = null;
        String expResult = "";
        String result = instance.getImageUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPView.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        SPView instance = null;
        String expResult = "";
        String result = instance.getWebAbsluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListName method, of class SPView.
     */
    @Test
    public void testGetListName() {
        System.out.println("getListName");
        SPView instance = null;
        String expResult = "";
        String result = instance.getListName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}