package org.korecky.sharepoint;

import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.korecky.sharepoint.authentication.NtlmAuthenticator;
import org.korecky.sharepoint.net.HttpProxy;

/**
 *
 * @author vkorecky
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.korecky.sharepoint.SPSiteTest.class, org.korecky.sharepoint.SPWebTest.class, org.korecky.sharepoint.SPListTest.class})
//, , org.korecky.sharepoint.SPAlertTest.class, org.korecky.sharepoint.SPFileBaseTest.class, org.korecky.sharepoint.SPListTemplateTest.class, org.korecky.sharepoint.SPListItemTest.class, , org.korecky.sharepoint.SPViewTest.class, org.korecky.sharepoint.SPAttachmentTest.class, org.korecky.sharepoint.SPFileTest.class, org.korecky.sharepoint.SPFolderTest.class, org.korecky.sharepoint.SPTest.class
public class TestSuite {
    
    private static NtlmAuthenticator credentials;
    private static HttpProxy httpProxy;
    private static SPSite site;
    
    public static SPSite getSite() {
        return site;
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        credentials = new NtlmAuthenticator("aa", "aa", "aa");
        httpProxy = new HttpProxy("127.0.0.1", 8888);
        site = new SPSite(new URL("https://aa/"), credentials, httpProxy, true, SPVersion.WSS3);
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }
}