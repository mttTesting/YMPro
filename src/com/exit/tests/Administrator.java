package com.exit.tests;

import org.testng.annotations.Test;  
import org.testng.AssertJUnit;


public class Administrator extends TestBaseExit {
	
	//Ошибка "Вход в личный кабинет администратора"
	@Test (dataProvider = "warning1", dataProviderClass = DataProviderExit.class, priority = 0)
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
	@Test (dataProvider = "warning2", dataProviderClass = DataProviderExit.class, priority = 1)
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
	@Test (dataProvider = "restorPassFalse", dataProviderClass = DataProviderExit.class, priority = 2)
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
		@Test (dataProvider = "restorPassTrue", dataProviderClass = DataProviderExit.class, priority = 3)
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
		
		//Перейти по ссылке активации
		
		for(int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout перехода по ссылки из письма");
            try { if (selenium.isElementPresent("//a[contains(text(),'http://umagicpro-pp/user/reset/')]"))
            		{selenium.click("//a[contains(text(),'http://umagicpro-pp/user/reset/')]"); break;}
            	}catch(Exception e) {}
            Thread.sleep(1000);
			}
		
		//selenium.waitForPopUp(selenium.getAllWindowNames()[1], "10000");
		//selenium.selectWindow("css=div.bLayout__eBody");
		//selenium.selectWindow("//a[contains(text(),'http://umagicpro-pp/user/reset/')]");
		
		for(int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout перехода по ссылки из письма");
            try { if (selenium.isTextPresent("Нажмите на эту кнопку для входа на сайт и изменения своего пароля.\r\n\r\nВход в аккаунт с использованием этой ссылки может быть выполнен только один раз."));
            		{selenium.click("id=edit-submit"); break;}
            	}catch(Exception e) {}
            Thread.sleep(1000);
			}
		
		//Ожидаем форму для входа в ЛКА после восстановления пароля
		//selenium.focus("css=div.bLayout__eBody");
		
		/*for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout ожидания страницы восстановления пароля");
			try { if (selenium.isElementPresent("css=div.bLoginFormWrap.mC2")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}*/
		
		//AssertJUnit.assertTrue(selenium.isTextPresent("Нажмите на эту кнопку для входа на сайт и изменения своего пароля.\r\n\r\nВход в аккаунт с использованием этой ссылки может быть выполнен только один раз."));
		
		//Вход в ЛКА для изменения пароля
		selenium.click("id=edit-submit");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getTitle(), "Лицевой счет | YM.pro");
		 
		//Закрыть инструкцию
		for(int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout вход в ЛКА (восстановление пароля)");
            try { if (selenium.isElementPresent("id=slidetitle"))
            		{selenium.click("css=span.phone_confirm_text.conf_text"); break;}
            	}catch(Exception e) {}
            Thread.sleep(1000);
			}
		
		AssertJUnit.assertTrue(selenium.isTextPresent("Сменить пароль"));
		
		selenium.focus("//a[contains(text(),'http://mail.yandex.ru/')]");
		selenium.click("link=Выход");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getTitle(), "Яндекс");
		}
}

