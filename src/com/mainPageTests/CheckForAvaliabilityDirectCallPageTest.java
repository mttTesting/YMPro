package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityDirectCallPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityDirectCallPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span.bTabsTextHeader > a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ��������� �����"));
		
	}

}
