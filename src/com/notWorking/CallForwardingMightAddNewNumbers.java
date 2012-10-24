package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingMightAddNewNumbers   extends TestBaseReg{
	@Test
	public void callForwardingMightAddNewNumbers () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Сотрудник");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		
		selenium.click("//span[2]/a");//Нажатие на кнопку "Переадресация"
		Thread.sleep(7000);
		selenium.click("id=mode_3");
		Thread.sleep(7000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-schedule-0-followme-number"));//Проверка наличия элемента "id=edit-schedule-0-followme-number"
	}
}