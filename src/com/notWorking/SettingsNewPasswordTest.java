package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsNewPasswordTest extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		
		selenium.click("link=Настройки");//переход на страницу настроек
		Thread.sleep(3000);
		selenium.type("id=edit-user-password", "1234");//ввод настроек пароля
		selenium.type("id=edit-pass1", "111");
		selenium.type("id=edit-pass2", "111");
		selenium.click("id=edit-submit");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Спасибо, ваш пароль успешно изменен"));//проверка наличия текста "Спасибо, ваш пароль успешно изменен"
		selenium.click("link=Настройки");
		Thread.sleep(3000);
		selenium.type("id=edit-user-password", "111");//ввод настроек пароля, чтобы можно было запустить тест повторно
		selenium.type("id=edit-pass1", "1234");
		selenium.type("id=edit-pass2", "1234");
		selenium.click("id=edit-submit");

		
	}
}
