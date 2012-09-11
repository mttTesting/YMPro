package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilitySettingsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilitySettingsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[3]/div/div/div[2]/div/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка"));
		
	}

}
