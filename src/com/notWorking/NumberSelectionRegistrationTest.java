package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class NumberSelectionRegistrationTest extends TestBaseReg{
	@Test
	public void numberSelectionRegistrationTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("id=bHRegisterText"); //клик по кнопке "регистрация"
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-phone-mask", "**45"); //ввод текста "**45"
		selenium.click("id=edit-phone-mask-submit"); //клик по кнопке "Подобрать"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("45"));
		
	}
}
