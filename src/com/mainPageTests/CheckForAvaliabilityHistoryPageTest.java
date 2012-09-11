package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityHistoryPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityHistoryPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");	
		selenium.click("//div[3]/div/div[2]/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("История и детализация звонков"));
		
	}

}
