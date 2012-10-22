package com.registration.tests;

import org.testng.annotations.*;
import com.test.fw.SeleniumHelper;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
 

public class TestBaseReg {

	protected LoggingDefaultSelenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*firefox";
		selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://umagicpro-pp.rnd.mtt/");
				
	}


	@AfterClass
	public void tearDown() throws Exception {
		SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
	}

	
}
