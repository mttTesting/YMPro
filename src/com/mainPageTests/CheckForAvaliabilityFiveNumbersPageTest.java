package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityFiveNumbersPageTest  extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFiveNumbersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[3]/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));

	}

}
