package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteGroupsTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("link=���������");//������� � ���� "���������"
		selenium.click("//div[3]/a/div");//������� � ���� "���������"->"������"
		selenium.waitForPageToLoad("30000");
		selenium.click("//td[2]/div/span");//���� �� ������ "�������� ������"
		selenium.click("css=span.bSongFiles_AddFileText");
		selenium.type("id=edit-group-name", "������");//���� �������� � ����������� ������
		selenium.type("id=edit-group-id", "123");
		selenium.click("id=edit-submit");//������� ������ "���������"
		AssertJUnit.assertTrue(selenium.isTextPresent("������"));//�������� ������� �� �������� ������ � ��������� ����������� ������
		selenium.click("css=span.bGroup_gControls_delete");//�������� ������
		selenium.click("css=span.phone_confirm_text");
		selenium.waitForPageToLoad("30000");
		selenium.click("//td[2]/div/span");
		
	}
}
