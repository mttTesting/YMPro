package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnPromoTest extends TestBaseReg{
	@Test
public void clickOnPromoTest () throws Exception {	 
		selenium.open("http://account.umagicpro-pp.lan"); //���� �� ���� http://umagicpro-pp.lan/
		selenium.waitForPageToLoad("30000");	
		selenium.type("id=edit-name-1", "100126"); //���� ������������ ������(����� - 100126, ������ - 1234)
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� �� ������ "����"
		selenium.waitForPageToLoad("30000");	
		
		selenium.click("css=a.bPopup__eClose.instructions-close"); //�������� ����������� ���������
		selenium.click("//td[2]/div/span");
		selenium.click("//div[4]/a");
		
		selenium.click("//a[contains(@href, '/promo/nojs/code-dialog')]");//������� ������ "������ ��������"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("������� ���������� ��������"));//���������, ��� �� �������� ���� ����� "��������"
	 }

}