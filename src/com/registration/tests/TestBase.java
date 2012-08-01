package com.registration.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.HttpCommandProcessor;
import com.unitedinternet.portal.selenium.utils.logging.HtmlResultFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingCommandProcessor;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingResultsFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;

public class TestBase {

	protected static DefaultSelenium selenium;
	private BufferedWriter loggingWriter;

	@SuppressWarnings("deprecation")
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional String browser) throws Exception {
		
	if (browser == null) browser = "*chrome";
		selenium = new DefaultSelenium("localhost", 4444, browser, "http://umagicpro-pp/");
		final String resultPath = "/Users/su/Selenium2/Results";
		java.util.Date date = new java.util.Date(System.currentTimeMillis()); //получаем текущую дату для имени файла
	    final String resultHtmlFileName = resultPath + File.separator + "Result_" + date;
	    final String resultEncoding = "UTF-8";
	    loggingWriter = LoggingUtils.createWriter(resultHtmlFileName, resultEncoding);
	
	    LoggingResultsFormatter htmlFormatter = 
	        new HtmlResultFormatter(loggingWriter, resultEncoding);
	    htmlFormatter.setScreenShotBaseUri("/Users/su/Selenium2/ScreenShot"); // this is for linking to the screenshots
	    htmlFormatter.setAutomaticScreenshotPath(resultPath);
	    // wrap HttpCommandProcessor from remote-control
	    LoggingCommandProcessor myProcessor = 
        new LoggingCommandProcessor(new HttpCommandProcessor("localhost", 4444, browser, "http://umagicpro-pp/"), htmlFormatter);
    	selenium = new LoggingDefaultSelenium(myProcessor);
    	selenium.start();
		selenium.windowFocus();
		selenium.windowMaximize();
	}


	@AfterMethod
	public void tearDown() throws Exception {
		selenium.stop();
		try {
	        if (null != loggingWriter) {
	            loggingWriter.close();
	        }
	    } catch (IOException e) {
	        // do nothing
	    }
		}
	

}
