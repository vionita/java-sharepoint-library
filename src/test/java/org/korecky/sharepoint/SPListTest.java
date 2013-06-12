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
import org.w3c.dom.Element;

/**
 *
 * @author vkorecky
 */
public class SPListTest {
    
    public SPListTest() {
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
     * Test of loadFromXml method, of class SPList.
     */
    @Test
    public void testLoadFromXml() throws Exception {
        System.out.println("loadFromXml");
        Element rootElement = null;
        SPList instance = null;
        instance.loadFromXml(rootElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getViews method, of class SPList.
     */
    @Test
    public void testGetViews() throws Exception {
        System.out.println("getViews");
        SPList instance = null;
        List expResult = null;
        List result = instance.getViews();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class SPList.
     */
    @Test
    public void testGetItems_3args() throws Exception {
        System.out.println("getItems");
        CamlQueryRoot query = null;
        FieldRefDefinitions viewFields = null;
        int rowLimit = 0;
        SPList instance = null;
        List expResult = null;
        List result = instance.getItems(query, viewFields, rowLimit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class SPList.
     */
    @Test
    public void testGetItems_0args() throws Exception {
        System.out.println("getItems");
        SPList instance = null;
        List expResult = null;
        List result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsFromRoot method, of class SPList.
     */
    @Test
    public void testGetItemsFromRoot() throws Exception {
        System.out.println("getItemsFromRoot");
        SPList instance = null;
        List expResult = null;
        List result = instance.getItemsFromRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFolders method, of class SPList.
     */
    @Test
    public void testGetFolders() throws Exception {
        System.out.println("getFolders");
        SPList instance = null;
        List expResult = null;
        List result = instance.getFolders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoldersFromRoot method, of class SPList.
     */
    @Test
    public void testGetFoldersFromRoot() throws Exception {
        System.out.println("getFoldersFromRoot");
        SPList instance = null;
        List expResult = null;
        List result = instance.getFoldersFromRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiles method, of class SPList.
     */
    @Test
    public void testGetFiles() throws Exception {
        System.out.println("getFiles");
        SPList instance = null;
        List expResult = null;
        List result = instance.getFiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilesFromRoot method, of class SPList.
     */
    @Test
    public void testGetFilesFromRoot() throws Exception {
        System.out.println("getFilesFromRoot");
        SPList instance = null;
        List expResult = null;
        List result = instance.getFilesFromRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class SPList.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        SPList instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class SPList.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        SPList instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SPList.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SPList instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class SPList.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SPList instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseType method, of class SPList.
     */
    @Test
    public void testGetBaseType() {
        System.out.println("getBaseType");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getBaseType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImageUrl method, of class SPList.
     */
    @Test
    public void testGetImageUrl() {
        System.out.println("getImageUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getImageUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocTemplateUrl method, of class SPList.
     */
    @Test
    public void testGetDocTemplateUrl() {
        System.out.println("getDocTemplateUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getDocTemplateUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefaultViewUrl method, of class SPList.
     */
    @Test
    public void testGetDefaultViewUrl() {
        System.out.println("getDefaultViewUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getDefaultViewUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMobileDefaultViewUrl method, of class SPList.
     */
    @Test
    public void testGetMobileDefaultViewUrl() {
        System.out.println("getMobileDefaultViewUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getMobileDefaultViewUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFeatureId method, of class SPList.
     */
    @Test
    public void testGetFeatureId() {
        System.out.println("getFeatureId");
        SPList instance = null;
        String expResult = "";
        String result = instance.getFeatureId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServerTemplate method, of class SPList.
     */
    @Test
    public void testGetServerTemplate() {
        System.out.println("getServerTemplate");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getServerTemplate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreated method, of class SPList.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        SPList instance = null;
        Date expResult = null;
        Date result = instance.getCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModified method, of class SPList.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        SPList instance = null;
        Date expResult = null;
        Date result = instance.getModified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastDeleted method, of class SPList.
     */
    @Test
    public void testGetLastDeleted() {
        System.out.println("getLastDeleted");
        SPList instance = null;
        Date expResult = null;
        Date result = instance.getLastDeleted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class SPList.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirection method, of class SPList.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        SPList instance = null;
        String expResult = "";
        String result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThumbnailSize method, of class SPList.
     */
    @Test
    public void testGetThumbnailSize() {
        System.out.println("getThumbnailSize");
        SPList instance = null;
        String expResult = "";
        String result = instance.getThumbnailSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebImageWidth method, of class SPList.
     */
    @Test
    public void testGetWebImageWidth() {
        System.out.println("getWebImageWidth");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getWebImageWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebImageHeight method, of class SPList.
     */
    @Test
    public void testGetWebImageHeight() {
        System.out.println("getWebImageHeight");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getWebImageHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlags method, of class SPList.
     */
    @Test
    public void testGetFlags() {
        System.out.println("getFlags");
        SPList instance = null;
        String expResult = "";
        String result = instance.getFlags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class SPList.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnonymousPermMask method, of class SPList.
     */
    @Test
    public void testGetAnonymousPermMask() {
        System.out.println("getAnonymousPermMask");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getAnonymousPermMask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRootFolder method, of class SPList.
     */
    @Test
    public void testGetRootFolder() {
        System.out.println("getRootFolder");
        SPList instance = null;
        String expResult = "";
        String result = instance.getRootFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReadSecurity method, of class SPList.
     */
    @Test
    public void testGetReadSecurity() {
        System.out.println("getReadSecurity");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getReadSecurity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWriteSecurity method, of class SPList.
     */
    @Test
    public void testGetWriteSecurity() {
        System.out.println("getWriteSecurity");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getWriteSecurity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorID method, of class SPList.
     */
    @Test
    public void testGetAuthorID() {
        System.out.println("getAuthorID");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getAuthorID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventSinkAssembly method, of class SPList.
     */
    @Test
    public void testGetEventSinkAssembly() {
        System.out.println("getEventSinkAssembly");
        SPList instance = null;
        String expResult = "";
        String result = instance.getEventSinkAssembly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventSinkClass method, of class SPList.
     */
    @Test
    public void testGetEventSinkClass() {
        System.out.println("getEventSinkClass");
        SPList instance = null;
        String expResult = "";
        String result = instance.getEventSinkClass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventSinkData method, of class SPList.
     */
    @Test
    public void testGetEventSinkData() {
        System.out.println("getEventSinkData");
        SPList instance = null;
        String expResult = "";
        String result = instance.getEventSinkData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailInsertsFolder method, of class SPList.
     */
    @Test
    public void testGetEmailInsertsFolder() {
        System.out.println("getEmailInsertsFolder");
        SPList instance = null;
        String expResult = "";
        String result = instance.getEmailInsertsFolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAlias method, of class SPList.
     */
    @Test
    public void testGetEmailAlias() {
        System.out.println("getEmailAlias");
        SPList instance = null;
        String expResult = "";
        String result = instance.getEmailAlias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebFullUrl method, of class SPList.
     */
    @Test
    public void testGetWebFullUrl() {
        System.out.println("getWebFullUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getWebFullUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebId method, of class SPList.
     */
    @Test
    public void testGetWebId() {
        System.out.println("getWebId");
        SPList instance = null;
        String expResult = "";
        String result = instance.getWebId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSendToLocation method, of class SPList.
     */
    @Test
    public void testGetSendToLocation() {
        System.out.println("getSendToLocation");
        SPList instance = null;
        String expResult = "";
        String result = instance.getSendToLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScopeId method, of class SPList.
     */
    @Test
    public void testGetScopeId() {
        System.out.println("getScopeId");
        SPList instance = null;
        String expResult = "";
        String result = instance.getScopeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMajorVersionLimit method, of class SPList.
     */
    @Test
    public void testGetMajorVersionLimit() {
        System.out.println("getMajorVersionLimit");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getMajorVersionLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMajorWithMinorVersionsLimit method, of class SPList.
     */
    @Test
    public void testGetMajorWithMinorVersionsLimit() {
        System.out.println("getMajorWithMinorVersionsLimit");
        SPList instance = null;
        int expResult = 0;
        int result = instance.getMajorWithMinorVersionsLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkFlowId method, of class SPList.
     */
    @Test
    public void testGetWorkFlowId() {
        System.out.println("getWorkFlowId");
        SPList instance = null;
        String expResult = "";
        String result = instance.getWorkFlowId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHasUniqueScopes method, of class SPList.
     */
    @Test
    public void testIsHasUniqueScopes() {
        System.out.println("isHasUniqueScopes");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isHasUniqueScopes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAllowDeletion method, of class SPList.
     */
    @Test
    public void testIsAllowDeletion() {
        System.out.println("isAllowDeletion");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isAllowDeletion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAllowMultiResponses method, of class SPList.
     */
    @Test
    public void testIsAllowMultiResponses() {
        System.out.println("isAllowMultiResponses");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isAllowMultiResponses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnableAttachments method, of class SPList.
     */
    @Test
    public void testIsEnableAttachments() {
        System.out.println("isEnableAttachments");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isEnableAttachments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnableModeration method, of class SPList.
     */
    @Test
    public void testIsEnableModeration() {
        System.out.println("isEnableModeration");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isEnableModeration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnableVersioning method, of class SPList.
     */
    @Test
    public void testIsEnableVersioning() {
        System.out.println("isEnableVersioning");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isEnableVersioning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHidden method, of class SPList.
     */
    @Test
    public void testIsHidden() {
        System.out.println("isHidden");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isHidden();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMultipleDataList method, of class SPList.
     */
    @Test
    public void testIsMultipleDataList() {
        System.out.println("isMultipleDataList");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isMultipleDataList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOrdered method, of class SPList.
     */
    @Test
    public void testIsOrdered() {
        System.out.println("isOrdered");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isOrdered();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowUser method, of class SPList.
     */
    @Test
    public void testIsShowUser() {
        System.out.println("isShowUser");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isShowUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnableMinorVersion method, of class SPList.
     */
    @Test
    public void testIsEnableMinorVersion() {
        System.out.println("isEnableMinorVersion");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isEnableMinorVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRequireCheckout method, of class SPList.
     */
    @Test
    public void testIsRequireCheckout() {
        System.out.println("isRequireCheckout");
        SPList instance = null;
        boolean expResult = false;
        boolean result = instance.isRequireCheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPList.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        SPList instance = null;
        String expResult = "";
        String result = instance.getWebAbsluteUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}