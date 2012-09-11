package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityShedulesPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityShedulesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[4]/div[2]/div/div[2]/span");
		selenium.click("//div[2]/div[2]/div[2]/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка расписаний"));
		
	}

}
