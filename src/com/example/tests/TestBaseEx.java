package com.example.tests;

import org.testng.annotations.*;
import com.example.tests.SeleniumHelperEx;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
 

public class TestBaseEx {

	protected LoggingDefaultSelenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*googlechrome";
		selenium = (LoggingDefaultSelenium) SeleniumHelperEx.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://umagicpro-pp/");
				
	}


	@AfterClass
	public void tearDown() throws Exception {
		SeleniumHelperEx.dismissSelenium(this.getClass().getSimpleName());
	}

}
