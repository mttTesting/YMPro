package com.registration.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.test.fw.SeleniumHelper;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
 

public class TestBaseReg {

	protected LoggingDefaultSelenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*googlechrome";
		selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://umagicpro-pp/");
				
	}


	@AfterClass
	public void tearDown() throws Exception {
		SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
	}

	
}
