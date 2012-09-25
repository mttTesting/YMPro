package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneChangeContactFirstNameTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=Редактировать контакты");
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");
		selenium.click("id=edit-save");
		Thread.sleep(4000);
		selenium.click("id=edit-submit");
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("B1"));
		selenium.click("link=Редактировать контакты");
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x1");
		selenium.click("id=edit-save");
		Thread.sleep(4000);
		selenium.click("id=edit-submit");
		Thread.sleep(4000);
	}
}