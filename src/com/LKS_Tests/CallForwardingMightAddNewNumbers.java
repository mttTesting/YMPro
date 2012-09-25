package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingMightAddNewNumbers   extends TestBaseReg{
	@Test
	public void callForwardingMightAddNewNumbers () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=Переадресация вызовов");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-add-number"));
	}
}