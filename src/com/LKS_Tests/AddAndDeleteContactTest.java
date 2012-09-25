package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteContactTest   extends TestBaseReg{
	@Test
	public void addAndDeleteContactTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");
		Thread.sleep(3000);
		selenium.type("id=edit-contact-first-name", "x3");
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-save");
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("333"));
		AssertJUnit.assertTrue(selenium.isTextPresent("x3"));
		selenium.click("link=Редактировать контакты");
		Thread.sleep(5000);
		selenium.click("xpath=(//a[contains(text(),'уд.')])[3]");
		selenium.click("id=edit-submit");
		Thread.sleep(10000);
		AssertJUnit.assertFalse(selenium.isTextPresent("333"));
		
		

	}
}