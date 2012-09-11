package com.notWorking;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteBlacklistTest extends TestBaseReg{
	@Test
	public void addAndDeleteGroupsTest() throws Exception {
		selenium.open("http://umagicpro-pp");
		selenium.click("css=#administrator > span"); //click 'enter as administrator'
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //enter login
		selenium.type("id=edit-pass-1", "1234"); //enter password
		selenium.click("id=edit-submit-1"); //click 'submit'
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close"); //closing the first pop-up
		selenium.click("css=span.modal_cansel_button_text"); //closing the second pop-up
		selenium.click("//div[2]/div/div/div/span/a"); //click 'Nastroiki'
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[6]/a/div"); //click 'Chorniy spisok'
		selenium.waitForPageToLoad("30000");
		
		selenium.click("id=edit-blacklist-items-add-bl-owner");	//click 'Dobavit' v cherniy spisok'
		Thread.sleep(3000);
		selenium.type("//input", "12345678"); //input 12345678 in blacklist table
		selenium.click("id=edit-submit"); // click submit
		Thread.sleep(12000);
		
		AssertJUnit.assertEquals(selenium.getValue("//div/input"), "12345678");//java.lang.AssertionError: expected:<addOwnerNumber> but was:<12345678>

	}
}