package com.LKS_Tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class VoiceMailPageTest  extends TestBaseReg{
	@Test
	public void voiceMailPageTest () throws Exception {	 
		selenium.open("http://umagicpro-pp");
		selenium.click("css=span");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "0505804534");
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");
		
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта"));
	}

}
