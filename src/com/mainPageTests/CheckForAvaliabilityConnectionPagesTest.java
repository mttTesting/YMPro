package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityConnectionPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityConnectionTest() throws Exception {
	selenium.open("http://umagicpro-pp");
	selenium.click("//div[6]/div[2]/div/div/span/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Регистрация"));
	selenium.click("//div[6]/div[2]/div/div/span[2]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Настройка"));
	selenium.click("//div[6]/div[2]/div/div/span[3]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Дисковое пространство"));
	selenium.click("//div[6]/div[2]/div/div/span[4]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Оборудование"));
	selenium.click("//div[6]/div[2]/div/div/span[5]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Приложения"));
	selenium.click("//div[6]/div[2]/div/div/span[6]/span/a");
	selenium.waitForPageToLoad("30000");
	AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));
	}
}
