package com.registration.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class Step2 extends TestBase {

	@Test  (dataProvider = "step2", dataProviderClass = StaticProvider.class)
	public void testStep2(String lastn, String name, String middlen, String mail, String sfera, String num) throws Exception {
		selenium.open("http://umagicpro-pp/user/register/step1");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.content_body_header"), "Выбор номера");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));
		selenium.click("css=span[name=\"abc-numbers\"]"); //выбрать номер (чекбокс)
		//boolean  = selenium.isTextPresent("+7 (499) 704-28-05"); - как считать текст???
		selenium.click("id=edit-next"); //нажать "Далее
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals(selenium.getText("css=div.content_body_header"), "Персональная информация");
		AssertJUnit.assertFalse(selenium.isElementPresent("id=error"));	
		
		
		
		//Ввод данных
		selenium.type("id=edit-last-name", lastn);  //Фамилия
		selenium.type("id=edit-first-name", name);  //Имя
		selenium.type("id=edit-middle-name", middlen);  //Отчество
		selenium.click("css=span.text"); 
		selenium.click(sfera); //Сфера деятельности компании
		selenium.type("id=edit-workers-count", num); //Количесвто человек в компании
		
		//Мобила:
		
		//Наличие кнопки "Подтвердить"
		AssertJUnit.assertEquals(selenium.isTextPresent("Подтвердить"), true);
		
		//Подтверждение номера (false)
		selenium.type("id=edit-personal-phone", "12345");  //Ввод моб номера
		selenium.click("id=confirm-link"); //Нажать "Подтвердить"
		AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), true); //Появилось окно "Подтверждения номера"
		AssertJUnit.assertEquals(selenium.isTextPresent("Подтверждение номера"), true);
		selenium.type("smscode", "54321"); //Ввод неверного кода
		selenium.click("css=span.phone_confirm_text.conf_text"); //Клик по "Подтверждаю" - подтверждение false
		AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), true);
		
		for (int second = 0;; second++) {
			if (second >= 60) Assert.fail("timeout after click on button 'Подтверждаю'");
			try { if (selenium.isTextPresent("Неправильный код подтверждения")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		} 
		
		//assertTrue(selenium.isTextPresent("Неправильный код подтверждения"));
		
		//Отменить подтверждение
		selenium.click("css=span.modal_cansel_button_text"); //Отмена
		AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), false);
		
		//Подтверждение Отменено, кнопка "Подтвердить"
		AssertJUnit.assertEquals(selenium.isTextPresent("Подтвердить"), true);
	
		
		//Подтверждение номера (true)
		selenium.type("id=edit-personal-phone", "12345");  //Ввод моб номера
		selenium.click("id=confirm-link"); //Нажать "Подтвердить"
		AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), true); //Появилось окно "Подтверждения номера"
		AssertJUnit.assertEquals(selenium.isTextPresent("Подтверждение номера"), true);
		selenium.type("smscode", "12345"); //ввод верного кода
        Thread.sleep(3000);
		
		//Клик по "Подтверждаю" - подтверждение true
		for(int second = 0;; second++) {
			if (second >= 60) Assert.fail("timeout after click on button 'Подтверждаю'");
            try { if (selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"))
            		{selenium.click("css=span.phone_confirm_text.conf_text"); break;}
            	}catch(Exception e) {}
            Thread.sleep(1000);
			}
		
		//AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), false);

		//Подтверждение сработало, появилась кнопка "Подтверждено"
		selenium.waitForCondition("selenium.isTextPresent('Подтверждено')","30000");
		
		//Кнопка "Подтверждено" неактивна:
		selenium.click("id=confirm-link"); //Клик по "Подтверждено"
		AssertJUnit.assertEquals(selenium.isElementPresent("id=ui-dialog-title-mConfirmPhone"), false);  //Окно подтверждения не открылось
		   		
	//Проверка видимости кнопки "Дальше":
		
		//Чекбокс выбран, email НЕ корректный
			selenium.type("id=edit-mail", "test@test");
		if(!selenium.isChecked("edit-legal-agreement")){
			selenium.click("css=span.mycheckbox");
        }        
		AssertJUnit.assertTrue(selenium.getEval( "var win = selenium.browserbot.getCurrentWindow();" +
                "var element = win.document.getElementById('edit-next');" +
                "element.disabled;" ).toLowerCase().equals("true"));		
   		
		//Чекбокс НЕ выбран, email корректный
		selenium.type("id=edit-mail", mail); 
		if(selenium.isChecked("edit-legal-agreement")){
			selenium.click("css=span.mycheckbox.mycheckbox_checked");
        }
		AssertJUnit.assertTrue(selenium.getEval( "var win = selenium.browserbot.getCurrentWindow();" +
                "var element = win.document.getElementById('edit-next');" +
                "element.disabled;" ).toLowerCase().equals("true"));
			
		//Чекбокс выбран, email корректный
		selenium.click("css=span.mycheckbox");
		AssertJUnit.assertTrue(selenium.getEval( "var win = selenium.browserbot.getCurrentWindow();" +
                "var element = win.document.getElementById('edit-next');" +
                "element.disabled;" ).toLowerCase().equals("false"));
	
		
		
		//Дальше
		selenium.click("edit-next");
		
		for (int second = 0;; second++) {
			if (second >= 30) Assert.fail("timeout");
				try { if (selenium.isTextPresent("уже зарегистрирован")) 
				    {System.out.print("Email уже зарегистрирован"); break;}
				    	else { if (selenium.isTextPresent("Спасибо за регистрацию. Ваш логин и пароль высланы на указанный email"))
						{AssertJUnit.assertTrue(selenium.isTextPresent("Регистрация прошла успешно")); break;}
				    	}
					}	
				   catch (Exception e) {}	
				   Thread.sleep(1000);
				}
		
	}
}
