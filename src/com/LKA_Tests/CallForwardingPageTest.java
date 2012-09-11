package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingPageTest extends TestBaseReg{
	@Test
	public void clickOnAvatarTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=#administrator > span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("css=span.modal_cansel_button_text");	
		
		selenium.click("//div[2]/div/div/div/span/a");
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//div[5]/a/div");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.text"));
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.mycheckbox.action-always-processed"));
		AssertJUnit.assertTrue(selenium.isElementPresent("css=div > span.mycheckbox.action-always-processed"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=CallsRetmenu"));
}
}