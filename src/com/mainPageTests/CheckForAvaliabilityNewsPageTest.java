package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityNewsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityNewsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[7]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Новости"));
		
	}

}
