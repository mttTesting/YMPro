package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilitySupportPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilitySupportPagesTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[7]/div[2]/div/div/span/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обратная связь"));
		selenium.click("//div[7]/div[2]/div/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Вопросы-ответы"));
		selenium.click("//div[7]/div[2]/div/div/span[3]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Обучение"));
	}
}
