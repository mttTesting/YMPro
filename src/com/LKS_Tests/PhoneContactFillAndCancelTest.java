package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneContactFillAndCancelTest extends TestBaseReg{
	@Test
	public void  phoneContactFillAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x3");
		selenium.type("id=edit-contact-last-name", "x3");
		selenium.type("id=edit-contact-middle-name", "x3");
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-cancel");
		AssertJUnit.assertFalse(selenium.isTextPresent("x3"));
	}
}
