package org.korecky.sharepoint.sp2007;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SPSiteTest {

	@Test
	public void testGetAllWebs() {
		SPSite site = new SPSite("http://192.168.151.50");
		List<SPWeb> allWebsCollection = site.getAllWebs();
	}

}
