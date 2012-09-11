package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityBlacklistPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityBlacklistPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("css=#tab3 > span.bTabsControlText");
		selenium.click("//div[3]/div[2]/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Черный список"));
		
	}

}
