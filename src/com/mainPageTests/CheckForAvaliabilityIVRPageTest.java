package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityIVRPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityIVRPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[2]/div[2]/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовое меню (IVR)"));
		
	}

}
