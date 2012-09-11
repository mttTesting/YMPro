package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CheckForAvaliabilityGroupsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityGroupsPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[2]/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Настройка сотрудников и групп"));

	}

}
