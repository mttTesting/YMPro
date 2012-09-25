package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneAddGroupAndCancelTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=Редактировать контакты");
		Thread.sleep(3000);
		selenium.click("link=Добавить группу");
		Thread.sleep(3000);
		selenium.type("//div[2]/input", "g1");
		selenium.click("css=a.bPopup__eClose.close");
		selenium.click("//div[@id='contacts-block-wrapper']/dl[2]/dt/div");
		AssertJUnit.assertFalse(selenium.isTextPresent("g1"));
	}
}