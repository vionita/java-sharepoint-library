/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.io.File;
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
public class SPFileBaseTest {
    
    public SPFileBaseTest() {
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
     * Test of saveBinary method, of class SPFileBase.
     */
    @Test
    public void testSaveBinary_0args() throws Exception {
        System.out.println("saveBinary");
        SPFileBase instance = null;
        byte[] expResult = null;
        byte[] result = instance.saveBinary();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveBinary method, of class SPFileBase.
     */
    @Test
    public void testSaveBinary_File() throws Exception {
        System.out.println("saveBinary");
        File file = null;
        SPFileBase instance = null;
        instance.saveBinary(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrl method, of class SPFileBase.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        SPFileBase instance = null;
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SPFileBase.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SPFileBase instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsoluteUrl method, of class SPFileBase.
     */
    @Test
    public void testGetAbsoluteUrl() throws Exception {
        System.out.println("getAbsoluteUrl");
        SPFileBase instance = null;
        String expResult = "";
        String result = instance.getAbsoluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPFileBase.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        SPFileBase instance = null;
        String expResult = "";
        String result = instance.getWebAbsluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListName method, of class SPFileBase.
     */
    @Test
    public void testGetListName() {
        System.out.println("getListName");
        SPFileBase instance = null;
        String expResult = "";
        String result = instance.getListName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SPFileBaseImpl extends SPFileBase {

        public SPFileBaseImpl() {
            super("", "");
        }
    }
}