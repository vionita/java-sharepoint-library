/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.io.File;
import java.util.Date;
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
public class SPFileTest {
    
    public SPFileTest() {
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
     * Test of saveBinary method, of class SPFile.
     */
    @Test
    public void testSaveBinary_0args() throws Exception {
        System.out.println("saveBinary");
        SPFile instance = null;
        byte[] expResult = null;
        byte[] result = instance.saveBinary();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveBinary method, of class SPFile.
     */
    @Test
    public void testSaveBinary_File() throws Exception {
        System.out.println("saveBinary");
        File file = null;
        SPFile instance = null;
        instance.saveBinary(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExists method, of class SPFile.
     */
    @Test
    public void testIsExists() {
        System.out.println("isExists");
        SPFile instance = null;
        boolean expResult = false;
        boolean result = instance.isExists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SPFile.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SPFile instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class SPFile.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        SPFile instance = null;
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class SPFile.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        SPFile instance = null;
        Date expResult = null;
        Date result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class SPFile.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        SPFile instance = null;
        Date expResult = null;
        Date result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}