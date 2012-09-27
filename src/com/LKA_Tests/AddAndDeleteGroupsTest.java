package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteGroupsTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://account.umagicpro-pp.lan"); //Вход на сайт http://umagicpro-pp.lan/
		selenium.waitForPageToLoad("30000");	
		selenium.type("id=edit-name-1", "100126"); //Ввод персональных данных(логин - 100126, пароль - 1234)
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //Нажатие на кнопку "Вход"
		selenium.waitForPageToLoad("30000");	
		
		
		selenium.click("css=a.bPopup__eClose.instructions-close"); //Закрытие всплывающих сообщений
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("link=Настройки"); //Переход в меню "Настройки"->"Группы"
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[3]/a/div"); 
		selenium.waitForPageToLoad("60000"); //Клик по ссылке "Добавить группу"
		selenium.click("//a/div/span");
		Thread.sleep(7000);

		selenium.type("//div/input", "Группа"); //Ввод названия и внутреннего номера
		selenium.type("//td/div/input", "123");
		selenium.click("//td[2]/div/span"); 
		selenium.click("//div[4]/input"); //Нажатие кнопки "Сохранить"
		Thread.sleep(9000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Группа")); //Проверка наличия на странице текста с названием добавленной группы
		selenium.click("css=span.bGroup_gControls_delete"); //Клик по пиктограмме удаления группы
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[4]/a");
		AssertJUnit.assertFalse(selenium.isTextPresent("Группа")); //Проверка отсутствия на странице текста с названием удаленной группы
	}
}
