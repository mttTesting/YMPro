package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistorySwitchOnlyYearAndMonth extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");

		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("link=»стори€");
		Thread.sleep(3000);
		selenium.click("id=edit-from-date-datepicker-popup-0");
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("id=edit-from-date-datepicker-popup-0");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("id=edit-from-date-datepicker-popup-0");
		selenium.click("link=янв");
		selenium.click("id=edit-from-date-datepicker-popup-0");
		AssertJUnit.assertEquals(selenium.getValue("id=edit-from-date-datepicker-popup-0"), "2012-09-01");
	}
}