package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityFastRegistrationPageTest  extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityFastRegistrationPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[3]/div/div/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Быстрая онлайн регистрация"));
		
	}


}
