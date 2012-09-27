package com.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

//9. �������� ����������� ������� ���� "������������"
public class CheckForAvailabilityAdvantagesPagesTest extends TestBaseReg{
	@Test
	public void  checkForAvailabilityAdvantagesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp.lan");
		selenium.click("//li/ul/li/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ��� ��� �������� �� �������"));
		selenium.click("//li/ul/li[3]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �������������"));
		selenium.click("//li/ul/li[5]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������ ������� ����������"));
		selenium.click("//li/ul/li[7]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������ ������������� ������������"));
		selenium.click("//li/ul/li[9]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("5 ���������� ���������� �������"));
		selenium.click("//li/ul/li[11]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������� ��������������"));
		selenium.click("//li/ul/li[13]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������������� ���������"));
		selenium.click("//li/ul/li[2]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("���������� ������ ������ ����"));
		selenium.click("//li/ul/li[4]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� �������� �����"));
		selenium.click("//li/ul/li[6]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� � ����� ����� � � ����� �����"));
		selenium.click("//li/ul/li[8]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ������ �����������"));
		selenium.click("//li/ul/li[10]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ������ ����"));
		selenium.click("//li/ul/li[12]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� �� ���� �����������"));
		selenium.click("//li/ul/li[14]/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));	
	}

}
