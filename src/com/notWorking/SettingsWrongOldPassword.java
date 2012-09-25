package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsWrongOldPassword   extends TestBaseReg{
	@Test
	public void settingsWrongOldPassword () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0776004151");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("//span[4]/a/span");
		Thread.sleep(7000);
		selenium.type("id=edit-user-password", "111");
		selenium.type("id=edit-pass1", "1234");
		selenium.type("id=edit-pass2", "1234");
		selenium.click("id=edit-submit");
		Thread.sleep(7000);
		AssertJUnit.assertTrue(selenium.isTextPresent("¬веден неверный пароль"));
	}
}