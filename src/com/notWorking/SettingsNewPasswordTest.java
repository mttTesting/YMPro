package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsNewPasswordTest extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		
		selenium.click("link=���������");//������� �� �������� ��������
		Thread.sleep(3000);
		selenium.type("id=edit-user-password", "1234");//���� �������� ������
		selenium.type("id=edit-pass1", "111");
		selenium.type("id=edit-pass2", "111");
		selenium.click("id=edit-submit");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("�������, ��� ������ ������� �������"));//�������� ������� ������ "�������, ��� ������ ������� �������"
		selenium.click("link=���������");
		Thread.sleep(3000);
		selenium.type("id=edit-user-password", "111");//���� �������� ������, ����� ����� ���� ��������� ���� ��������
		selenium.type("id=edit-pass1", "1234");
		selenium.type("id=edit-pass2", "1234");
		selenium.click("id=edit-submit");

		
	}
}
