package com.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.registration.tests.TestBaseReg;


//10. �������� ����������� ������� ���� "������"
public class CheckForAvaliabilityServicesPagesTest extends TestBaseReg{
	@Test
	public void checkForAvaliabilityServicesPageTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("//div[5]/div[2]/div/div/span/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ��������� �����"));
		selenium.click("//div[5]/div[2]/div/div/span[3]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����������� � �����"));
		selenium.click("//div[5]/div[2]/div/div/span[5]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����� (Voice to Email)"));
		selenium.click("//div[5]/div[2]/div/div/span[7]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������� (Follow me)"));
		selenium.click("//div[5]/div[2]/div/div/span[9]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������� � ����������� �������"));
		selenium.click("//div[5]/div[2]/div/div/span[11]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("����������� ����"));
		selenium.click("//div[5]/div[2]/div/div/span[2]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("�������������� ���������� ���������� �������"));
		selenium.click("//div[5]/div[2]/div/div/span[4]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ���� (IVR)"));
		selenium.click("//div[5]/div[2]/div/div/span[6]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� �������� �������"));
		selenium.click("//div[5]/div[2]/div/div/span[8]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ����������"));
		selenium.click("//div[5]/div[2]/div/div/span[10]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������ ������"));
		selenium.click("//div[5]/div[2]/div/div/span[12]/span/a");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� � ������� ���"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
