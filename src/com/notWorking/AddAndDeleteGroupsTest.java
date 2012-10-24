package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteGroupsTest extends TestBaseReg{
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
		
		selenium.click("link=Настройки");//Переход в меню "Настройки"
		selenium.click("//div[3]/a/div");//Переход в меню "Настройки"->"Группы"
		selenium.waitForPageToLoad("30000");
		selenium.click("//td[2]/div/span");//Клик по ссылке "Добавить группу"
		selenium.click("css=span.bSongFiles_AddFileText");
		selenium.type("id=edit-group-name", "Группа");//Ввод названия и внутреннего номера
		selenium.type("id=edit-group-id", "123");
		selenium.click("id=edit-submit");//Нажатие кнопки "Сохранить"
		AssertJUnit.assertTrue(selenium.isTextPresent("Группа"));//Проверка наличия на странице текста с названием добавленной группы
		selenium.click("css=span.bGroup_gControls_delete");//удаление группы
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");
		selenium.click("//td[2]/div/span");
		
	}
}
