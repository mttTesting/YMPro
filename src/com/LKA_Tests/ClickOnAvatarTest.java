package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnAvatarTest extends TestBaseReg{
	@Test
public void clickOnAvatarTest () throws Exception {	 
		selenium.open("http://account.umagicpro-pp.lan"); //Вход на сайт http://umagicpro-pp.lan/
		selenium.waitForPageToLoad("30000");	
		selenium.type("id=edit-name-1", "100126"); //Ввод персональных данных(логин - 100126, пароль - 1234)
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //Нажатие на кнопку "Вход"
		selenium.waitForPageToLoad("30000");	
		
		selenium.click("css=a.bPopup__eClose.instructions-close"); //Закрытие всплывающих сообщений
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("css=img.imagecache.imagecache-customer-logo"); //Клик по пиктограмме YouMagic
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Структура расходов")); //Проверить, что на странице есть текст "Полноценная виртуальная офисная АТС за несколько минут "
	 }

}