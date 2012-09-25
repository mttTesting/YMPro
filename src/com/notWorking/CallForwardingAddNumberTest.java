package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingAddNumberTest extends TestBaseReg{
	@Test
	public void callForwardingAddNumberTest () throws Exception {	 
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
		selenium.click("link=Переадресация вызовов");
		Thread.sleep(5000);
		selenium.click("id=edit-schedule-add-number");
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-followme-number"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=1_always"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-1-schedule-from-week-day"));
	}
}