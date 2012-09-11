package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class FeedbackPageTest extends TestBaseReg{
	@Test
	public void feedbackPageTest() throws Exception {
	selenium.open("http://umagicpro-pp");
	selenium.click("css=#administrator > span");
	selenium.waitForPageToLoad("30000");
	selenium.type("id=edit-name-1", "100126");
	selenium.type("id=edit-pass-1", "1234");
	selenium.click("id=edit-submit-1");
	selenium.waitForPageToLoad("30000");
	selenium.click("css=a.bPopup__eClose.instructions-close");
	selenium.click("//div[4]/a");
	selenium.click("//span[4]/a");
	selenium.waitForPageToLoad("30000");
	Thread.sleep(3000);
	AssertJUnit.assertTrue(selenium.isTextPresent("Поддержка"));
}
}