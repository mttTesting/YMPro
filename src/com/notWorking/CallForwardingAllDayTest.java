package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingAllDayTest  extends TestBaseReg{
	@Test
	public void callForwardingAddNumberTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=Переадресация вызовов");
		Thread.sleep(4000);
		selenium.click("id=0_always");
		Thread.sleep(4000);
		AssertJUnit.assertFalse(selenium.isElementPresent("id=edit-schedule-add-number"));
	}
}