package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

//9. Проверка доступности страниц меню "Преимущества"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.lan");
		selenium.click("//li/ul/li/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная АТС без расходов на «железо»"));
		selenium.click("//li/ul/li[3]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Немедленное использование"));
		selenium.click("//li/ul/li[5]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Персональный личный кабинет сотрудника"));
		selenium.click("//li/ul/li[7]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Качественное постпродажное обслуживание"));
		selenium.click("//li/ul/li[9]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));
		selenium.click("//li/ul/li[11]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Удобный кабинет администратора"));
		selenium.click("//li/ul/li[13]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Квалифицированная поддержка"));
		selenium.click("//li/ul/li[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Бесплатные звонки внутри сети"));
		selenium.click("//li/ul/li[4]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Высокое качество связи"));
		selenium.click("//li/ul/li[6]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Мобильность в любое время и в любом месте"));
		selenium.click("//li/ul/li[8]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Быстрая онлайн регистрация"));
		selenium.click("//li/ul/li[10]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Уникально низкие цены"));
		selenium.click("//li/ul/li[12]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Доступность на всех устройствах"));
		selenium.click("//li/ul/li[14]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));	
	}

}
