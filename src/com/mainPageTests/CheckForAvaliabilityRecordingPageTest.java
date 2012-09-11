package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityRecordingPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityRecordingPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[4]/div[2]/div/div[3]/span");
		selenium.click("//div[3]/div/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Запись разговоров"));
		
	}

}
