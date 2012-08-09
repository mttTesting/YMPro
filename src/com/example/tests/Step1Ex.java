package com.example.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.example.tests.StaticProviderEx;

public class Step1Ex extends TestBaseEx {

	@Test (dataProvider = "step1", dataProviderClass = StaticProviderEx.class)
	public void testStep1(String town, String tname, String pref, String num) throws Exception {
		selenium.logComment("Step1 with town = "+town+" tname= "+tname+" pref= "+pref+" num= "+num);
		selenium.open("http://umagicpro-pp/");
		selenium.click("id=bHRegisterText");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.content_body_header"), "Выбор номера");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		//AssertJUnit.assertTrue(selenium.isTextPresent("Выбор номера"));
		selenium.click("css=b.trigger"); //выпадающее меню городов
		selenium.click(town); //выбрать город
		
		for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout");
			try { if (selenium.isTextPresent(pref)) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		
		selenium.click(num); //выбрать номер (чекбокс)
		selenium.click("id=edit-next"); //нажать "Далее
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.content_body_header"), "Персональная информация");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
	}	

	
	@Test (dataProvider = "step1find", dataProviderClass = StaticProviderEx.class)	
	public void testStep1Find(String find, String result) throws Exception {
		while (selenium.isAlertPresent()) { 
		    selenium.getAlert(); 
		} 
		selenium.logComment("Step1 with find = "+find+" result= "+result);
		selenium.open("http://umagicpro-pp/");
		selenium.click("id=bHRegisterText");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.content_body_header"), "Выбор номера");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		selenium.type("id=edit-phone-mask", find);
		//selenium.click("edit-phone-mask-submit"); 
		selenium.keyPress("id=edit-phone-mask-submit", "\\13");
		
		for (int second = 0;; second++) {
			if (second >= 30) AssertJUnit.fail("timeout during the selection num");
				try { if (selenium.isTextPresent("Нет свободных номеров")) 
				    {System.out.print("Нет свободных номеров"); break;}
				    	else { if (selenium.isTextPresent(result))
						{AssertJUnit.assertTrue(selenium.isTextPresent(result)); break;}
				    	}
					}	
				   catch (Exception e) {}	
				   Thread.sleep(1000);
				}
		}
	
	}