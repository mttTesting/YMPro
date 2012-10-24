package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteBlacklistTest extends TestBaseReg{
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
		
		selenium.click("//div[2]/div/div/div/span/a"); //������� ������ "���������"
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[6]/a/div"); //������� ������ "������ ������"
		selenium.waitForPageToLoad("30000");
		
		selenium.click("id=edit-blacklist-items-add-bl-owner");	//������� '�������� � ������ ������'
		Thread.sleep(3000);
		selenium.type("//input", "12345678"); //���� 12345678 � ������
		selenium.click("id=edit-submit"); // ������� "���������"
		Thread.sleep(12000);
		
		AssertJUnit.assertEquals(selenium.getValue("//div/input"), "12345678");//java.lang.AssertionError: expected:<addOwnerNumber> but was:<12345678>

	}
}