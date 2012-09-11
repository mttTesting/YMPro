package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

//10. Проверка доступности страниц меню "Цены"
public class CheckForAvaliabilityPricesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityPricesPageTest() throws Exception {
	selenium.open("http://umagicpro-pp");
	selenium.click("//div[4]/div[2]/div/div/span/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Красивые номера"));
	selenium.click("//div[4]/div[2]/div/div/span[2]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Тарифы на звонки"));
	selenium.click("//div[4]/div[2]/div/div/span[3]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Абонентская плата и другие услуги"));
	selenium.click("//div[4]/div[2]/div/div/span[4]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Настройка оборудования"));
	selenium.click("//div[4]/div[2]/div/div/span[5]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Дисковое пространство"));
	selenium.click("//div[4]/div[2]/div/div/span[6]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Доставка документов"));
	selenium.click("//div[4]/div[2]/div/div/span[7]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
	}
}
