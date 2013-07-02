/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
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
public class SPListTest {

    private SPList instance;

    public SPListTest() throws NoSuchAlgorithmException, KeyManagementException, MalformedURLException, ParseException {
        this.instance = TestSuite.getSite().getRootWeb().getLists().items.get(0);
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
     * Test of delete method, of class SPList.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String listName = "Test List";
        String description = "Smazat";
        SPListTemplateCollection listTemplates = TestSuite.getSite().getRootWeb().getListTemplates();
        SPList list = TestSuite.getSite().getRootWeb().addList(listName, description, listTemplates.getItem(1));
        list.delete();
    }

    /**
     * Test of getViews method, of class SPList.
     */
    @Test
    public void testGetViews() throws Exception {
        System.out.println("getViews");
        SPViewCollection result = instance.getViews();
        assertNotNull(result);
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
        SPListItemCollection result = instance.getItems(query, viewFields, rowLimit);
        assertNotNull(result);
    }

    /**
     * Test of getItems method, of class SPList.
     */
    @Test
    public void testGetItems_0args() throws Exception {
        System.out.println("getItems");
        SPListItemCollection result = instance.getItems();
        assertNotNull(result);
    }

    /**
     * Test of getItemsFromRoot method, of class SPList.
     */
    @Test
    public void testGetItemsFromRoot() throws Exception {
        System.out.println("getItemsFromRoot");
        SPListItemCollection result = instance.getItemsFromRoot();
        assertNotNull(result);
    }

    /**
     * Test of getFolders method, of class SPList.
     */
    @Test
    public void testGetFolders() throws Exception {
        System.out.println("getFolders");
        SPFolderCollection result = instance.getFolders();
        assertNotNull(result);
    }

    /**
     * Test of getFoldersFromRoot method, of class SPList.
     */
    @Test
    public void testGetFoldersFromRoot() throws Exception {
        System.out.println("getFoldersFromRoot");
        SPFolderCollection result = instance.getFoldersFromRoot();
        assertNotNull(result);
    }

    /**
     * Test of getFiles method, of class SPList.
     */
    @Test
    public void testGetFiles() throws Exception {
        System.out.println("getFiles");
        SPFileCollection result = instance.getFiles();
        assertNotNull(result);
    }

    /**
     * Test of getFilesFromRoot method, of class SPList.
     */
    @Test
    public void testGetFilesFromRoot() throws Exception {
        System.out.println("getFilesFromRoot");
        SPFileCollection result = instance.getFilesFromRoot();
        assertNotNull(result);
    }

    /**
     * Test of getId method, of class SPList.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UUID result = instance.getId();
        assertNotNull(result);
    }

    /**
     * Test of getTitle method, of class SPList.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String result = instance.getTitle();
        assertNotNull(result);
    }

    /**
     * Test of getName method, of class SPList.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String result = instance.getName();
        assertNotNull(result);
    }

    /**
     * Test of getDescription method, of class SPList.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String result = instance.getDescription();
        assertNotNull(result);
    }

    /**
     * Test of getBaseType method, of class SPList.
     */
    @Test
    public void testGetBaseType() {
        System.out.println("getBaseType");
        int result = instance.getBaseType();
        assertNotNull(result);
    }

    /**
     * Test of getImageUrl method, of class SPList.
     */
    @Test
    public void testGetImageUrl() {
        System.out.println("getImageUrl");
        String result = instance.getImageUrl();
        assertNotNull(result);
    }

    /**
     * Test of getDocTemplateUrl method, of class SPList.
     */
    @Test
    public void testGetDocTemplateUrl() {
        System.out.println("getDocTemplateUrl");
        String result = instance.getDocTemplateUrl();
        assertNotNull(result);
    }

    /**
     * Test of getDefaultViewUrl method, of class SPList.
     */
    @Test
    public void testGetDefaultViewUrl() {
        System.out.println("getDefaultViewUrl");
        String result = instance.getDefaultViewUrl();
        assertNotNull(result);
    }

    /**
     * Test of getMobileDefaultViewUrl method, of class SPList.
     */
    @Test
    public void testGetMobileDefaultViewUrl() {
        System.out.println("getMobileDefaultViewUrl");
        String result = instance.getMobileDefaultViewUrl();
        assertNotNull(result);
    }

    /**
     * Test of getFeatureId method, of class SPList.
     */
    @Test
    public void testGetFeatureId() {
        System.out.println("getFeatureId");
        String result = instance.getFeatureId();
        assertNotNull(result);
    }

    /**
     * Test of getServerTemplate method, of class SPList.
     */
    @Test
    public void testGetServerTemplate() {
        System.out.println("getServerTemplate");
        int result = instance.getServerTemplate();
        assertNotSame(0, result);
    }

    /**
     * Test of getCreated method, of class SPList.
     */
    @Test
    public void testGetCreated() {
        System.out.println("getCreated");
        Date result = instance.getCreated();
        assertNotNull(result);
    }

    /**
     * Test of getModified method, of class SPList.
     */
    @Test
    public void testGetModified() {
        System.out.println("getModified");
        Date result = instance.getModified();
        assertNotNull(result);
    }

    /**
     * Test of getLastDeleted method, of class SPList.
     */
    @Test
    public void testGetLastDeleted() {
        System.out.println("getLastDeleted");
        Date result = instance.getLastDeleted();
        assertNotNull(result);
    }

    /**
     * Test of getVersion method, of class SPList.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        int result = instance.getVersion();
        assertNotSame(0, result);
    }

    /**
     * Test of getDirection method, of class SPList.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        String result = instance.getDirection();
        assertNotNull(result);
    }

    /**
     * Test of getThumbnailSize method, of class SPList.
     */
    @Test
    public void testGetThumbnailSize() {
        System.out.println("getThumbnailSize");
        String result = instance.getThumbnailSize();
        assertNotNull(result);
    }

    /**
     * Test of getWebImageWidth method, of class SPList.
     */
    @Test
    public void testGetWebImageWidth() {
        System.out.println("getWebImageWidth");
        int result = instance.getWebImageWidth();
        assertSame(0, result);
    }

    /**
     * Test of getWebImageHeight method, of class SPList.
     */
    @Test
    public void testGetWebImageHeight() {
        System.out.println("getWebImageHeight");
        int result = instance.getWebImageHeight();
        assertSame(0, result);
    }

    /**
     * Test of getFlags method, of class SPList.
     */
    @Test
    public void testGetFlags() {
        System.out.println("getFlags");
        String result = instance.getFlags();
        assertNotNull(result);
    }

    /**
     * Test of getItemCount method, of class SPList.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        int result = instance.getItemCount();
        assertNotSame(0, result);
    }

    /**
     * Test of getAnonymousPermMask method, of class SPList.
     */
    @Test
    public void testGetAnonymousPermMask() {
        System.out.println("getAnonymousPermMask");
        int result = instance.getAnonymousPermMask();
        assertSame(0, result);
    }

    /**
     * Test of getRootFolder method, of class SPList.
     */
    @Test
    public void testGetRootFolder() {
        System.out.println("getRootFolder");
        String result = instance.getRootFolder();
        assertNotNull(result);
    }

    /**
     * Test of getReadSecurity method, of class SPList.
     */
    @Test
    public void testGetReadSecurity() {
        System.out.println("getReadSecurity");
        int result = instance.getReadSecurity();
        assertNotSame(0, result);
    }

    /**
     * Test of getWriteSecurity method, of class SPList.
     */
    @Test
    public void testGetWriteSecurity() {
        System.out.println("getWriteSecurity");
        int result = instance.getWriteSecurity();
        assertNotSame(0, result);
    }

    /**
     * Test of getAuthorID method, of class SPList.
     */
    @Test
    public void testGetAuthorID() {
        System.out.println("getAuthorID");
        int result = instance.getAuthorID();
        assertNotSame(0, result);
    }

    /**
     * Test of getEventSinkAssembly method, of class SPList.
     */
    @Test
    public void testGetEventSinkAssembly() {
        System.out.println("getEventSinkAssembly");
        String result = instance.getEventSinkAssembly();
        assertNotNull(result);
    }

    /**
     * Test of getEventSinkClass method, of class SPList.
     */
    @Test
    public void testGetEventSinkClass() {
        System.out.println("getEventSinkClass");
        String result = instance.getEventSinkClass();
        assertNotNull(result);
    }

    /**
     * Test of getEventSinkData method, of class SPList.
     */
    @Test
    public void testGetEventSinkData() {
        System.out.println("getEventSinkData");
        String result = instance.getEventSinkData();
        assertNotNull(result);
    }

    /**
     * Test of getEmailInsertsFolder method, of class SPList.
     */
    @Test
    public void testGetEmailInsertsFolder() {
        System.out.println("getEmailInsertsFolder");
        String result = instance.getEmailInsertsFolder();
        assertNotNull(result);
    }

    /**
     * Test of getEmailAlias method, of class SPList.
     */
    @Test
    public void testGetEmailAlias() {
        System.out.println("getEmailAlias");
        String result = instance.getEmailAlias();
        assertNotNull(result);
    }

    /**
     * Test of getWebFullUrl method, of class SPList.
     */
    @Test
    public void testGetWebFullUrl() {
        System.out.println("getWebFullUrl");
        String result = instance.getWebFullUrl();
        assertNotNull(result);
    }

    /**
     * Test of getWebId method, of class SPList.
     */
    @Test
    public void testGetWebId() {
        System.out.println("getWebId");
        String result = instance.getWebId();
        assertNotNull(result);
    }

    /**
     * Test of getSendToLocation method, of class SPList.
     */
    @Test
    public void testGetSendToLocation() {
        System.out.println("getSendToLocation");
        String result = instance.getSendToLocation();
        assertNotNull(result);
    }

    /**
     * Test of getScopeId method, of class SPList.
     */
    @Test
    public void testGetScopeId() {
        System.out.println("getScopeId");
        String result = instance.getScopeId();
        assertNotNull(result);
    }

    /**
     * Test of getMajorVersionLimit method, of class SPList.
     */
    @Test
    public void testGetMajorVersionLimit() {
        System.out.println("getMajorVersionLimit");
        int result = instance.getMajorVersionLimit();
        assertNotNull(result);
    }

    /**
     * Test of getMajorWithMinorVersionsLimit method, of class SPList.
     */
    @Test
    public void testGetMajorWithMinorVersionsLimit() {
        System.out.println("getMajorWithMinorVersionsLimit");
        int result = instance.getMajorWithMinorVersionsLimit();
        assertNotNull(result);
    }

    /**
     * Test of getWorkFlowId method, of class SPList.
     */
    @Test
    public void testGetWorkFlowId() {
        System.out.println("getWorkFlowId");
        String result = instance.getWorkFlowId();
        assertNotNull(result);
    }

    /**
     * Test of isHasUniqueScopes method, of class SPList.
     */
    @Test
    public void testIsHasUniqueScopes() {
        System.out.println("isHasUniqueScopes");
        boolean result = instance.isHasUniqueScopes();
    }

    /**
     * Test of isAllowDeletion method, of class SPList.
     */
    @Test
    public void testIsAllowDeletion() {
        System.out.println("isAllowDeletion");
        boolean expResult = true;
        boolean result = instance.isAllowDeletion();
        assertEquals(expResult, result);
    }

    /**
     * Test of isAllowMultiResponses method, of class SPList.
     */
    @Test
    public void testIsAllowMultiResponses() {
        System.out.println("isAllowMultiResponses");
        boolean expResult = false;
        boolean result = instance.isAllowMultiResponses();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEnableAttachments method, of class SPList.
     */
    @Test
    public void testIsEnableAttachments() {
        System.out.println("isEnableAttachments");
        boolean expResult = true;
        boolean result = instance.isEnableAttachments();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEnableModeration method, of class SPList.
     */
    @Test
    public void testIsEnableModeration() {
        System.out.println("isEnableModeration");
        boolean expResult = false;
        boolean result = instance.isEnableModeration();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEnableVersioning method, of class SPList.
     */
    @Test
    public void testIsEnableVersioning() {
        System.out.println("isEnableVersioning");
        boolean expResult = false;
        boolean result = instance.isEnableVersioning();
        assertEquals(expResult, result);
    }

    /**
     * Test of isHidden method, of class SPList.
     */
    @Test
    public void testIsHidden() {
        System.out.println("isHidden");
        boolean expResult = false;
        boolean result = instance.isHidden();
        assertEquals(expResult, result);
    }

    /**
     * Test of isMultipleDataList method, of class SPList.
     */
    @Test
    public void testIsMultipleDataList() {
        System.out.println("isMultipleDataList");
        boolean expResult = false;
        boolean result = instance.isMultipleDataList();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOrdered method, of class SPList.
     */
    @Test
    public void testIsOrdered() {
        System.out.println("isOrdered");
        boolean expResult = false;
        boolean result = instance.isOrdered();
        assertEquals(expResult, result);
    }

    /**
     * Test of isShowUser method, of class SPList.
     */
    @Test
    public void testIsShowUser() {
        System.out.println("isShowUser");
        boolean expResult = true;
        boolean result = instance.isShowUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEnableMinorVersion method, of class SPList.
     */
    @Test
    public void testIsEnableMinorVersion() {
        System.out.println("isEnableMinorVersion");
        boolean expResult = false;
        boolean result = instance.isEnableMinorVersion();
        assertEquals(expResult, result);
    }

    /**
     * Test of isRequireCheckout method, of class SPList.
     */
    @Test
    public void testIsRequireCheckout() {
        System.out.println("isRequireCheckout");
        boolean expResult = false;
        boolean result = instance.isRequireCheckout();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWebAbsluteUrl method, of class SPList.
     */
    @Test
    public void testGetWebAbsluteUrl() {
        System.out.println("getWebAbsluteUrl");
        String result = instance.getWebAbsluteUrl();
        assertNotNull(result);
    }
}