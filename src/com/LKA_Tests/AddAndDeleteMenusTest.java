package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteMenusTest extends TestBaseReg{
	@Test
	public void addAndDeleteMenusTest() throws Exception {
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
		selenium.click("//div[4]/a/div");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.bSongFiles_AddFileText");
		Thread.sleep(15000);
		selenium.click("id=edit-ivr-name");
		selenium.type("id=edit-ivr-name", "Меню");
		selenium.click("id=edit-submit");
		Thread.sleep(30000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Меню"));
		selenium.click("css=span.bSongdelete.bSongFiles_MarginControls");
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");	
		AssertJUnit.assertFalse(selenium.isTextPresent("Меню"));
	}
}
