package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

//9. Проверка доступности страниц меню "Преимущества"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная АТС без расходов на «железо»"));
		selenium.click("//span[3]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Немедленное использование"));
		selenium.click("//span[5]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Бесплатные звонки внутри сети"));
		selenium.click("//span[7]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Высокое качество связи"));
		selenium.click("//span[9]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Персональный личный кабинет сотрудника"));
		selenium.click("//span[11]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Мобильность в любое время и в любом месте"));
		selenium.click("//span[13]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Качественное постпродажное обслуживание"));
		selenium.click("//span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Быстрая онлайн регистрация"));
		selenium.click("//span[4]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 бесплатных внутренних номеров"));
		selenium.click("//span[6]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Уникально низкие цены"));
		selenium.click("//span[8]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Удобный кабинет администратора"));
		selenium.click("//span[10]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Доступность на всех устройствах"));
		selenium.click("//span[12]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Квалифицированная поддержка"));
		selenium.click("//span[14]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Сравнение с другими АТС"));	
	}

}
