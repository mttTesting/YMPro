package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class NumberSelectionRegistrationTest extends TestBaseReg{
	@Test
	public void numberSelectionRegistrationTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("id=bHRegisterText"); //���� �� ������ "�����������"
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-phone-mask", "**45"); //���� ������ "**45"
		selenium.click("id=edit-phone-mask-submit"); //���� �� ������ "���������"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("45"));
		
	}
}
