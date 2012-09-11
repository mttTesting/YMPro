package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityATSPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityATSPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[3]/div/div/div/div/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная АТС без расходов на «железо»"));	
	}
}
