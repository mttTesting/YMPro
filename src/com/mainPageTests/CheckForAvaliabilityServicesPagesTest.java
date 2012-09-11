package com.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.registration.tests.TestBaseReg;


//10. Проверка доступности страниц меню "Услуги"
public class CheckForAvaliabilityServicesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityServicesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[5]/div[2]/div/div/span/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Прямой городской номер"));
		selenium.click("//div[5]/div[2]/div/div/span[3]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка сотрудников и групп"));
		selenium.click("//div[5]/div[2]/div/div/span[5]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта (Voice to Email)"));
		selenium.click("//div[5]/div[2]/div/div/span[7]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Переадресация (Follow me)"));
		selenium.click("//div[5]/div[2]/div/div/span[9]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("История и детализация звонков"));
		selenium.click("//div[5]/div[2]/div/div/span[11]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Виртуальный факс"));
		selenium.click("//div[5]/div[2]/div/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Неограниченное количество внутренних номеров"));
		selenium.click("//div[5]/div[2]/div/div/span[4]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовое меню (IVR)"));
		selenium.click("//div[5]/div[2]/div/div/span[6]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обработка входящих вызовов"));
		selenium.click("//div[5]/div[2]/div/div/span[8]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка расписаний"));
		selenium.click("//div[5]/div[2]/div/div/span[10]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Черный список"));
		selenium.click("//div[5]/div[2]/div/div/span[12]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
