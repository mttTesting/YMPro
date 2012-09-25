package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneIncorrectDataSearchTest extends TestBaseReg{
	@Test
	public void phoneIncorrectDataSearchTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.open("http://umagicpro-pp");
		selenium.click("id=bHEnterText");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.type("//td/div/input", "aaa");
		AssertJUnit.assertFalse(selenium.isTextPresent("111"));
		AssertJUnit.assertFalse(selenium.isTextPresent("222"));
	}
}