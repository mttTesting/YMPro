package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityBeautifulNumbersPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityBeautifulNumbersPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[2]/div/div/span[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Красивые номера"));
		
	}

}
