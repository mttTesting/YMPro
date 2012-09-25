package com.LKS_Tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneAddNumberToContactTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("60000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//tr[5]/td[2]/a");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-telephone3", "333");
		selenium.click("id=edit-save");
		Thread.sleep(4000);
		selenium.click("id=edit-submit");
		Thread.sleep(4000);
		selenium.click("//dl[3]/div/div/div[4]");
		Thread.sleep(14000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//tr[5]/td[2]/a");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-telephone3", "");
		selenium.click("id=edit-save");
		Thread.sleep(4000);
		selenium.click("id=edit-submit");
		Thread.sleep(4000);
	}
}