package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

//9. �������� ����������� ������� ���� "������������"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ��� ��� �������� �� �������"));
		selenium.click("//span[3]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �������������"));
		selenium.click("//span[5]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("���������� ������ ������ ����"));
		selenium.click("//span[7]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� �������� �����"));
		selenium.click("//span[9]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������ ������� ����������"));
		selenium.click("//span[11]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� � ����� ����� � � ����� �����"));
		selenium.click("//span[13]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������������� ������������"));
		selenium.click("//span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������ �����������"));
		selenium.click("//span[4]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 ���������� ���������� �������"));
		selenium.click("//span[6]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ������ ����"));
		selenium.click("//span[8]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������� ��������������"));
		selenium.click("//span[10]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �� ���� �����������"));
		selenium.click("//span[12]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������������� ���������"));
		selenium.click("//span[14]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));	
	}

}
