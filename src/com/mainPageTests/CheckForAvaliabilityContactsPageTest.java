package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityContactsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityContactsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[4]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Контакты"));
		
	}

}
