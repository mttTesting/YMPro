package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteGroupsTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://account.umagicpro-pp.lan"); //���� �� ���� http://umagicpro-pp.lan/
		selenium.waitForPageToLoad("30000");	
		selenium.type("id=edit-name-1", "100126"); //���� ������������ ������(����� - 100126, ������ - 1234)
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� �� ������ "����"
		selenium.waitForPageToLoad("30000");	
		
		
		selenium.click("css=a.bPopup__eClose.instructions-close"); //�������� ����������� ���������
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("link=���������"); //������� � ���� "���������"->"������"
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[3]/a/div"); 
		selenium.waitForPageToLoad("60000"); //���� �� ������ "�������� ������"
		selenium.click("//a/div/span");
		Thread.sleep(7000);

		selenium.type("//div/input", "������"); //���� �������� � ����������� ������
		selenium.type("//td/div/input", "123");
		selenium.click("//td[2]/div/span"); 
		selenium.click("//div[4]/input"); //������� ������ "���������"
		Thread.sleep(9000);
		AssertJUnit.assertTrue(selenium.isTextPresent("������")); //�������� ������� �� �������� ������ � ��������� ����������� ������
		selenium.click("css=span.bGroup_gControls_delete"); //���� �� ����������� �������� ������
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[4]/a");
		AssertJUnit.assertFalse(selenium.isTextPresent("������")); //�������� ���������� �� �������� ������ � ��������� ��������� ������
	}
}
