package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityForPartnersPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityForPartnersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[6]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Партнерам"));
		
	}
	


}
