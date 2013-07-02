/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
public class SPListItemTest {

    public SPListItemTest() {
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
     * Test of loadFromXml method, of class SPListItem.
     */
    @Test
    public void testLoadFromXml() throws Exception {
        System.out.println("loadFromXml");
        Element rootElement = null;
        SPListItem instance = null;
        instance.loadFromXml(rootElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class SPListItem.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        SPListItem instance = null;
        SPFile expResult = null;
        SPFile result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttachments method, of class SPListItem.
     */
    @Test
    public void testGetAttachments() throws Exception {
        System.out.println("getAttachments");
        SPListItem instance = null;
        List expResult = null;
        SPAttachmentCollection result = instance.getAttachments();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAttachment method, of class SPListItem.
     */
    @Test
    public void testAddAttachment_String_byteArr() throws Exception {
        System.out.println("addAttachment");
        String fileName = "";
        byte[] fileContent = null;
        SPListItem instance = null;
        SPAttachment expResult = null;
        SPAttachment result = instance.addAttachment(fileName, fileContent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAttachment method, of class SPListItem.
     */
    @Test
    public void testAddAttachment_File() throws Exception {
        System.out.println("addAttachment");
        File localFile = null;
        SPListItem instance = null;
        SPAttachment expResult = null;
        SPAttachment result = instance.addAttachment(localFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SPListItem.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SPListItem instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLevel method, of class SPListItem.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        SPListItem instance = null;
        int expResult = 0;
        int result = instance.getLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class SPListItem.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasAttachments method, of class SPListItem.
     */
    @Test
    public void testIsHasAttachments() {
        System.out.println("isHasAttachments");
        SPListItem instance = null;
        boolean expResult = false;
        boolean result = instance.isHasAttachments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinkTitle method, of class SPListItem.
     */
    @Test
    public void testGetLinkTitle() {
        System.out.println("getLinkTitle");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getLinkTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwshiddenversion method, of class SPListItem.
     */
    @Test
    public void testGetOwshiddenversion() {
        System.out.println("getOwshiddenversion");
        SPListItem instance = null;
        int expResult = 0;
        int result = instance.getOwshiddenversion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUniqueId method, of class SPListItem.
     */
    @Test
    public void testGetUniqueId() {
        System.out.println("getUniqueId");
        SPListItem instance = null;
        String expResult = "";
        UUID result = instance.getUniqueId();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class SPListItem.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        SPListItem instance = null;
        Date expResult = null;
        Date result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class SPListItem.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        SPListItem instance = null;
        Date expResult = null;
        Date result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPListItem.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getWebAbsluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMetaInfo method, of class SPListItem.
     */
    @Test
    public void testGetMetaInfo() {
        System.out.println("getMetaInfo");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getMetaInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class SPListItem.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        SPListItem instance = null;
        Map expResult = null;
        Map result = instance.getProperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileRef method, of class SPListItem.
     */
    @Test
    public void testGetFileRef() {
        System.out.println("getFileRef");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getFileRef();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class SPListItem.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentTypeId method, of class SPListItem.
     */
    @Test
    public void testGetContentTypeId() {
        System.out.println("getContentTypeId");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getContentTypeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListName method, of class SPListItem.
     */
    @Test
    public void testGetListName() {
        System.out.println("getListName");
        SPListItem instance = null;
        String expResult = "";
        String result = instance.getListName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}