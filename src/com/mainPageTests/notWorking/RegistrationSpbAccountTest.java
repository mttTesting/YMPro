package com.mainPageTests.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationSpbAccountTest extends TestBaseReg{
	@Test
	public void registrationSpbAccountTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("id=bHRegisterText");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=b.trigger");
		selenium.click("//div[@id='edit-city-wrapper']/span/ul/li[2]");
		selenium.click("css=span[name=\"abc-numbers\"]");
		Thread.sleep(15000);
		AssertJUnit.assertTrue(selenium.isTextPresent("812"));
		
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		
		selenium.type("id=edit-last-name", "1");
		selenium.type("id=edit-first-name", "1");
		selenium.type("id=edit-middle-name", "1");
		selenium.type("id=edit-mail", "1213@test.com");
		selenium.type("id=edit-personal-phone", "1");
		selenium.click("id=confirm-link");
		Thread.sleep(3000);
		selenium.type("name=smscode", "1234");
		selenium.click("css=span.phone_confirm_text.conf_text");
		selenium.click("//div[3]/div/span");
		
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		//selenium.click("id=bHRegisterText");
		//selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Спасибо за регистрацию. Ваш логин и пароль высланы на указанный email."));
	}
}
