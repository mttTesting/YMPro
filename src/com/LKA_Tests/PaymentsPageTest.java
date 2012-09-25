package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PaymentsPageTest extends TestBaseReg{
	@Test
	public void soundFilesTest() throws Exception {
	selenium.open("http://umagicpro-pp");
	selenium.click("css=#administrator > span");
	selenium.waitForPageToLoad("30000");
	selenium.type("id=edit-name-1", "100138");
	selenium.type("id=edit-pass-1", "1234");
	selenium.click("id=edit-submit-1");
	selenium.waitForPageToLoad("30000");
	selenium.click("css=a.bPopup__eClose.instructions-close");
	selenium.click("css=span.modal_cansel_button_text");	
	
	selenium.click("link=Платежи");
	Thread.sleep(3000);

	AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));
	AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
	AssertJUnit.assertTrue(selenium.isElementPresent("css=b.trigger"));
	
}
}