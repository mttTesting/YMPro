package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhonePostPresentTest extends TestBaseReg{
	@Test
	public void settingsPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		AssertJUnit.assertTrue(selenium.isTextPresent("�������"));//�������� ������� ������ "�������"
	}
}