package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class NumberSelectionRegistrationTest extends TestBaseReg{
	@Test
	public void numberSelectionRegistrationTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("id=bHRegisterText"); //click on registration button
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-phone-mask", "**45"); //entering text "**45" in
		selenium.click("id=edit-phone-mask-submit"); //click on button "Podobrat'"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("45"));
		
	}
}
