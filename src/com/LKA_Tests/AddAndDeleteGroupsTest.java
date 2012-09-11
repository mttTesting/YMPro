package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteGroupsTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("css=#administrator > span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("link=Настройки");
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[3]/a/div");
		selenium.waitForPageToLoad("60000");
		selenium.click("css=span.phone_confirm_text");
		Thread.sleep(15000);
		selenium.type("id=edit-group-name", "Группа");
		selenium.type("id=edit-group-id", "123");
		selenium.click("id=edit-submit");
		Thread.sleep(30000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Группа"));
		selenium.click("css=span.bGroup_gControls_delete");
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[4]/a");
		AssertJUnit.assertFalse(selenium.isTextPresent("Группа"));
	}
}
