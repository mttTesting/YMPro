package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityFollowMePageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFollowMePageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[4]/div[2]/div/div[2]/span");
		selenium.click("//div[2]/div[2]/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация (Follow me)"));
		
	}


}
