package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityTariffsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityTariffsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[4]/div/div/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ �� ������"));

	}

}