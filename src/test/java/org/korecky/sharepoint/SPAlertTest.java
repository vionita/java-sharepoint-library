/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import com.microsoft.schemas.sharepoint.soap.alerts.Alert;
import com.microsoft.schemas.sharepoint.soap.alerts.ErrorType;
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
public class SPAlertTest {
    
    public SPAlertTest() {
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
     * Test of loadFromAlert method, of class SPAlert.
     */
    @Test
    public void testLoadFromAlert() {
        System.out.println("loadFromAlert");
        Alert tmpAlert = null;
        SPAlert instance = null;
        instance.loadFromAlert(tmpAlert);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SPAlert.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Alert tmpAlert = null;
        SPAlert instance = null;
        ErrorType expResult = null;
        ErrorType result = instance.delete(tmpAlert);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SPAlert.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SPAlert instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class SPAlert.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        SPAlert instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventType method, of class SPAlert.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        SPAlert instance = null;
        SPAlert.SPEventType expResult = null;
        SPAlert.SPEventType result = instance.getEventType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventTypeBitmask method, of class SPAlert.
     */
    @Test
    public void testGetEventTypeBitmask() {
        System.out.println("getEventTypeBitmask");
        SPAlert instance = null;
        int expResult = 0;
        int result = instance.getEventTypeBitmask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActive method, of class SPAlert.
     */
    @Test
    public void testIsActive() {
        System.out.println("isActive");
        SPAlert instance = null;
        boolean expResult = false;
        boolean result = instance.isActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlertForTitle method, of class SPAlert.
     */
    @Test
    public void testGetAlertForTitle() {
        System.out.println("getAlertForTitle");
        SPAlert instance = null;
        String expResult = "";
        String result = instance.getAlertForTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlertForUrl method, of class SPAlert.
     */
    @Test
    public void testGetAlertForUrl() {
        System.out.println("getAlertForUrl");
        SPAlert instance = null;
        String expResult = "";
        String result = instance.getAlertForUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditAlertUrl method, of class SPAlert.
     */
    @Test
    public void testGetEditAlertUrl() {
        System.out.println("getEditAlertUrl");
        SPAlert instance = null;
        String expResult = "";
        String result = instance.getEditAlertUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryChanels method, of class SPAlert.
     */
    @Test
    public void testGetDeliveryChanels() {
        System.out.println("getDeliveryChanels");
        SPAlert instance = null;
        List expResult = null;
        List result = instance.getDeliveryChanels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class SPAlert.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        SPAlert instance = null;
        Map expResult = null;
        Map result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}