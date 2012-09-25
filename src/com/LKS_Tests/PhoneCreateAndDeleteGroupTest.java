package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneCreateAndDeleteGroupTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("60000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=Редактировать контакты");
		Thread.sleep(7000);
		selenium.click("link=Добавить группу");
		Thread.sleep(3000);
		selenium.type("id=edit-group-name", "g1");
		selenium.click("id=edit-save");
		selenium.click("id=edit-submit");
		Thread.sleep(7000);
		selenium.click("xpath=(//dt[@onclick='contactsGroupAccordion(this);'])[2]");
		AssertJUnit.assertTrue(selenium.isTextPresent("g1"));
		selenium.click("link=Редактировать контакты");
		Thread.sleep(5000);
		selenium.click("//td[2]/a[2]");
		Thread.sleep(7000);
		selenium.click("id=edit-submit");
		Thread.sleep(7000);
		AssertJUnit.assertFalse(selenium.isTextPresent("g1"));
	}
}
