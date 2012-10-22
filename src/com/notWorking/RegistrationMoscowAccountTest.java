package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationMoscowAccountTest extends TestBaseReg{
	@Test
	public void registrationMoscowAccountTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=bHRegisterText"); //клик по кнопке "регистрация"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("css=li.selected.sel"); // выбор номера телефона
		selenium.click("css=span[name=\"abc-numbers\"]");
		Thread.sleep(14000);
		AssertJUnit.assertTrue(selenium.isTextPresent("(499)"));
		selenium.click("id=edit-next"); // нажатие на кнопке "Подтвердить"
		selenium.waitForPageToLoad("30000");
		
		selenium.click("id=confirm-link"); // нажатие на кнопке "Подтвердить"
		Thread.sleep(3000);
		selenium.type("name=smscode", "1234"); // ввод смс-кода 1234
		selenium.click("css=span.phone_confirm_text.conf_text");
		
		selenium.type("id=edit-last-name", "123"); // ввод персональных данных
		selenium.type("id=edit-first-name", "123");
		selenium.type("id=edit-middle-name", "123");
		selenium.type("id=edit-personal-phone", "123");
		selenium.type("id=edit-mail", "125@test.com");
		selenium.click("//div[3]/div/span"); // нажатие на кнопке "Далее"

		
		Thread.sleep(3000);
		selenium.click("//div[2]/input");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Спасибо за регистрацию. Ваш логин и пароль высланы на указанный email."));
	}
}
