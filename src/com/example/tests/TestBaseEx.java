package com.example.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

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