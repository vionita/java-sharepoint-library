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
public class SPAttachmentTest {
    
    public SPAttachmentTest() {
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
     * Test of loadFromXml method, of class SPAttachment.
     */
    @Test
    public void testLoadFromXml() throws Exception {
        System.out.println("loadFromXml");
        Element rootElement = null;
        SPAttachment instance = null;
        instance.loadFromXml(rootElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}