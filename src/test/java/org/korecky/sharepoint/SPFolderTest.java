/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.util.Date;
import java.util.List;
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
public class SPFolderTest {

    public SPFolderTest() {
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
     * Test of getFiles method, of class SPFolder.
     */
    @Test
    public void testGetFiles() throws Exception {
        System.out.println("getFiles");
        SPFolder instance = null;
        List expResult = null;
        SPFileCollection result = instance.getFiles();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubFolders method, of class SPFolder.
     */
    @Test
    public void testGetSubFolders() throws Exception {
        System.out.println("getSubFolders");
        SPFolder instance = null;
        List expResult = null;
        SPFolderCollection result = instance.getSubFolders();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SPFolder.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SPFolder instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class SPFolder.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        SPFolder instance = null;
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SPFolder.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SPFolder instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrl method, of class SPFolder.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        SPFolder instance = null;
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class SPFolder.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        SPFolder instance = null;
        Date expResult = null;
        Date result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class SPFolder.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        SPFolder instance = null;
        Date expResult = null;
        Date result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPFolder.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        SPFolder instance = null;
        String expResult = "";
        String result = instance.getWebAbsluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListName method, of class SPFolder.
     */
    @Test
    public void testGetListName() {
        System.out.println("getListName");
        SPFolder instance = null;
        String expResult = "";
        String result = instance.getListName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebId method, of class SPFolder.
     */
    @Test
    public void testGetWebId() {
        System.out.println("getWebId");
        SPFolder instance = null;
        String expResult = "";
        String result = instance.getWebId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}