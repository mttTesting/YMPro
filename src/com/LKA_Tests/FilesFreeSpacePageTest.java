package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class FilesFreeSpacePageTest  extends TestBaseReg{
	@Test
	public void filesFreeSpaceTest() throws Exception {
		selenium.open("http://account.umagicpro-pp.lan"); //Вход на сайт http://umagicpro-pp.lan/
		selenium.waitForPageToLoad("30000");	
		selenium.type("id=edit-name-1", "100126"); //Ввод персональных данных(логин - 100126, пароль - 1234)
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //Нажатие на кнопку "Вход"
		selenium.waitForPageToLoad("30000");	
		
	selenium.click("css=a.bPopup__eClose.instructions-close"); //Закрытие всплывающих сообщений
	selenium.click("//td[2]/div/span");
	selenium.click("//div[4]/a"); //Переход в меню "Файлы"->"Все файлы"
	selenium.click("//div/span[3]/a");
	selenium.waitForPageToLoad("30000");
	Thread.sleep(3000);
	AssertJUnit.assertTrue(selenium.isElementPresent("id=free_space_all")); //Проверка, присутствуют ли на странице элемент id=free_space_all
	}
}