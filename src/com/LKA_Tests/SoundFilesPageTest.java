package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SoundFilesPageTest extends TestBaseReg{
	@Test
	public void soundFilesTest() throws Exception {
	selenium.open("http://umagicpro-pp");
	selenium.click("css=#administrator > span");
	selenium.waitForPageToLoad("30000");
	selenium.type("id=edit-name-1", "100126");
	selenium.type("id=edit-pass-1", "1234");
	selenium.click("id=edit-submit-1");
	selenium.waitForPageToLoad("30000");
	selenium.click("css=a.bPopup__eClose.instructions-close");
	selenium.click("//div[4]/a");
	selenium.click("//div/span[3]/a");
	selenium.waitForPageToLoad("30000");
	selenium.click("//div[2]/a/div");
	Thread.sleep(3000);
	AssertJUnit.assertTrue(selenium.isElementPresent("css=div.bSoundFileblock"));
	}
}
