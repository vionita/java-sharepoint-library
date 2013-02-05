/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.korecky.sharepoint.sp2007;

import java.net.MalformedURLException;
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
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SPSite("https://devport2.gordic.cz");        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllWebs method, of class SPSite.
     */
    @Test
    public void testGetAllWebs() throws MalformedURLException {
        System.out.println("getAllWebs");        
        List<SPWeb> expResult = null;        
        List<SPWeb> result = instance.getAllWebs();                
        assertEquals(expResult, result);        
    }
}
