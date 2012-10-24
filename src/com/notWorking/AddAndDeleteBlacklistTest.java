package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteBlacklistTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//div[2]/div/div/div/span/a"); //нажатие кнопки "Настройки"
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[6]/a/div"); //нажатие кнопки "Черный список"
		selenium.waitForPageToLoad("30000");
		
		selenium.click("id=edit-blacklist-items-add-bl-owner");	//нажатие 'Добавить в черный список'
		Thread.sleep(3000);
		selenium.type("//input", "12345678"); //ввод 12345678 в список
		selenium.click("id=edit-submit"); // нажатие "сохранить"
		Thread.sleep(12000);
		
		AssertJUnit.assertEquals(selenium.getValue("//div/input"), "12345678");//java.lang.AssertionError: expected:<addOwnerNumber> but was:<12345678>

	}
}