/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint;

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
public class SPSiteTest {

    private SPSite instance;

    public SPSiteTest() {
        this.instance = TestSuite.getSite();
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
     * Test of getRootWeb method, of class SPSite.
     */
    @Test
    public void testGetRootWeb() throws Exception {
        System.out.println("getRootWeb");
        SPWeb result = instance.getRootWeb();
        assertNotNull(result);
    }

    /**
     * Test of getAllWebs method, of class SPSite.
     */
    @Test
    public void testGetAllWebs() throws Exception {
        System.out.println("getAllWebs");
        List result = instance.getAllWebs();
        assertNotNull(result);
    }
}