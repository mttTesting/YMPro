package com.LKA_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteMenusTest extends TestBaseReg{
	@Test
	public void addAndDeleteMenusTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("60000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		
		selenium.click("link=���������"); //������� � ���� "���������"->" ��������� ����"
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[4]/a/div");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.bSongFiles_AddFileText"); //���� �� ������ "�������� ����"
		Thread.sleep(17000);
		
		
		
		selenium.click("id=edit-ivr-name"); //���� �������� � �������������� ����
		selenium.type("id=edit-ivr-name", "����");
		selenium.click("id=edit-submit"); //������� ������ "���������"
		Thread.sleep(8000);
		AssertJUnit.assertTrue(selenium.isTextPresent("����")); //�������� ������� �� �������� ������ � ��������� ������������ ����
		selenium.click("css=span.bSongdelete.bSongFiles_MarginControls"); //���� �� ����������� �������� ����
		selenium.click("css=span.phone_confirm_text"); //������������� ��������
		selenium.waitForPageToLoad("30000");	
		AssertJUnit.assertFalse(selenium.isTextPresent("����")); //�������� ���������� �� �������� ������ � ��������� ���������� ����
	}
}
