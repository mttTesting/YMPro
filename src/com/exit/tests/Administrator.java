package com.exit.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class Administrator extends TestBaseExit {
	
	//Ошибка "Вход в личный кабинет администратора"
	@Test (dataProvider = "warning1", dataProviderClass = DataProviderExit.class)
	public void testwarning1 (String login, String pass) throws Exception {
	selenium.logComment("Administrator with login = "+login+" password= "+pass);
			
		selenium.open("http://umagicpro-pp/");
		selenium.click("id=bHEnterText");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("link=Администратор"));
		selenium.type("name", login);
		selenium.type("pass", pass);
		selenium.click("op");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue("Поле обязательно для заполнения.", true);
		//AssertJUnit.assertEquals(selenium.getText("css=div.messages.error"), "Поле обязательно для заполнения.");
		//AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
	}
		
	//Ошибка "Логин или пароль введены неверно (восстановление пароля)."
	@Test (dataProvider = "warning2", dataProviderClass = DataProviderExit.class)
	public void testwarning2 (String login, String pass) throws Exception {
	selenium.logComment("Administrator with login = "+login+" password= "+pass);
				
		selenium.open("http://umagicpro-pp/");
		selenium.click("id=bHEnterText");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("link=Администратор"));
		selenium.type("pass", login);
		selenium.type("name", pass);
		selenium.click("op");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.messages.error"), "Логин или пароль введены неверно (восстановление пароля).");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
	}
	
	//Восстановление пароля False
	@Test (dataProvider = "restorPassFalse", dataProviderClass = DataProviderExit.class)
	public void testRestorPassFalse (String mail) throws Exception {
	selenium.logComment("Restorу pass with e-mail= "+mail);
				
		selenium.open("http://umagicpro-pp/user/login");
		AssertJUnit.assertTrue(selenium.isElementPresent("link=Администратор"));
		selenium.click("link=Восстановить пароль");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=span"), "Имя пользователя или адрес e-mail: *");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		selenium.type("name", "");
		selenium.click("op");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.messages.error"), "Поле обязательно для заполнения.");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		//Запись не найдена:
		selenium.type("name", mail);
		selenium.click("op");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.messages.error"), "Запись «" + mail + "» не найдена среди имён пользователей и почтовых адресов.");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));

	}
	
	//Восстановление пароля True
		@Test (dataProvider = "restorPassTrue", dataProviderClass = DataProviderExit.class)
		public void testRestorPassTrue (String mail) throws Exception {
		selenium.logComment("Restorу pass with e-mail= "+mail);
					
		selenium.open("http://umagicpro-pp/user/login");
		AssertJUnit.assertTrue(selenium.isElementPresent("link=Администратор"));
		selenium.click("link=Восстановить пароль");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=span"), "Имя пользователя или адрес e-mail: *");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		selenium.type("name", mail);
		selenium.click("op");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=th"), "Вход в личный кабинет администратора");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		AssertJUnit.assertEquals(selenium.getText("css=div.messages.status"), "Дальнейшие инструкции отправлены на указанный почтовый адрес.");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		//}

		//Проверка почты		
		selenium.open("http://mail.yandex.ru");
		selenium.type("id=b-mail-domik-username11", "SqaTest");
		selenium.type("id=b-mail-domik-password11", "gtnhjczy");
		selenium.click("css=input.b-mail-button__button");		
		//if (selenium.getText("The site's security certificate is not trusted!") != null
		
		for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout входа в почту");
			try { if (selenium.isElementPresent("css=label.b-messages-head__title")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}	
			
		AssertJUnit.assertEquals(selenium.getText("css=span.b-messages__subject"), "Восстановление пароля");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));	
		//Открыть письмо
		selenium.click("css=span.b-messages__subject");
		AssertJUnit.assertTrue("From: no-reply@YM.pro [mailto:no-reply@YM.pro]", true);
		AssertJUnit.assertTrue("Subject: Восстановление пароля", true);
		AssertJUnit.assertTrue("Вы можете войти в личный кабинет, используя ссылку, указанную ниже", true);
		AssertJUnit.assertTrue("link=exact:http://umagicpro-pp/user/reset/*", true);
		clickOn(xpath("link=exact:http://umagicpro-pp/user/reset/*"));
		}

}

