package com.exit.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.test.fw.SeleniumHelper;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;

 

public abstract class TestBaseExit {

	protected LoggingDefaultSelenium selenium;

	@BeforeMethod
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*chrome";
		selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://umagicpro-pp/");
				
	}


	@AfterMethod
	@AfterClass
	public void tearDown() throws Exception {
		SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
	}
	
	
	}
	
