package com.LKA_Tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AgreementOPFTest extends TestBaseReg{
	@Test
	public void addAndDeleteNoticesTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		
		selenium.click("css=#administrator > span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100138");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("link=Îôîğìèòü");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[2]");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[3]");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[4]");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[5]");
		selenium.click("css=span.text");
		selenium.click("css=ul.dropdown > li");
	}
}