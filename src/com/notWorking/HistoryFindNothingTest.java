package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryFindNothingTest extends TestBaseReg{
	@Test
	public void historyFindNothingTest () throws Exception {	
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=История");
		Thread.sleep(5000);
		selenium.click("id=edit-submit");
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Нет данных"));
	}
}