package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityDocumentsPageTest extends TestBaseReg{
		@Test
		public void  checkForAvaliabilityDocumentsPageTest() throws Exception {
			selenium.open("http://umagicpro-pp");
			selenium.click("//div[5]/a");
			selenium.waitForPageToLoad("30000");
			AssertJUnit.assertTrue(selenium.isTextPresent("Документы"));
			
		}
}
