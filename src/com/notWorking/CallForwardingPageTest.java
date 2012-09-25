package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingPageTest  extends TestBaseReg{
	@Test
	public void callForwardingPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		
		selenium.click("//span[2]/a");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=mode_1"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=mode_2"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=mode_3"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-save-forwarding"));
	}

}