package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistorySwitchOnlyYearAndMonth extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //���� �� ���� http://umagicpro-pp/
		selenium.waitForPageToLoad("30000");
		selenium.click("link=���������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		//selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		
		selenium.click("link=�������"); //������� �� ������ "�������"
		Thread.sleep(3000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//������� �� ������ ����
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ����
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ������
		selenium.click("link=���");//
		selenium.click("id=edit-from-date-datepicker-popup-0");//����� ���
		AssertJUnit.assertEquals(selenium.getValue("id=edit-from-date-datepicker-popup-0"), "2012-09-01"); //��������
	}
}