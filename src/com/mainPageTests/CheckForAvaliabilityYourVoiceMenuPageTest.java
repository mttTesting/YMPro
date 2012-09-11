package com.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityYourVoiceMenuPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityYourVoiceMenuPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//span[2]/a[2]");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация (Follow me)"));

	}

}
