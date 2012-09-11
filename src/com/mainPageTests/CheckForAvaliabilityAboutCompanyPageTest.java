package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityAboutCompanyPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[3]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("О Компании"));
	}
}