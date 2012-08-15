package com.test.fw;

import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.selenium.HttpCommandProcessor;
import com.thoughtworks.selenium.Selenium;
import com.unitedinternet.portal.selenium.utils.logging.HtmlResultFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingCommandProcessor;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;
import com.unitedinternet.portal.selenium.utils.logging.LoggingResultsFormatter;
import com.unitedinternet.portal.selenium.utils.logging.LoggingUtils;

public class SeleniumHelper {
	
	private static Map<String, Selenium> seleniumPool = new HashMap<String, Selenium>();
	private static Map<String, BufferedWriter> writerPool = new HashMap<String, BufferedWriter>();
	private static Map<String, Integer> counterPool = new HashMap<String, Integer>();


	public static Selenium getSelenium(String key, String serverHost, int serverPool, String browserStartCommand, String browserURL) throws Exception {   
		if (! seleniumPool.containsKey(key)) {
			createNewLoggingSelenium(key, serverHost, serverPool, browserStartCommand, browserURL);
			counterPool.put(key, 0);
		}
		Selenium selenium = seleniumPool.get(key);
		counterPool.put(key, counterPool.get(key)+1);
		if (counterPool.get(key) > 100) {
			dismissSelenium(key);
			createNewLoggingSelenium(key, serverHost, serverPool, browserStartCommand, browserURL);
		}
		try {
			selenium.getLocation();
		}	catch (Throwable t) {
			t.printStackTrace();
			createNewLoggingSelenium(key, serverHost, serverPool, browserStartCommand, browserURL);
		}
		return seleniumPool.get(key);
	}
	
		
	/*private static void createNewSelenium(String key, String serverHost, int serverPool, String browserStartCommand, String browserURL) throws Exception {		
		Selenium selenium;
		if (browserStartCommand.equals("htmlUnit")) {
	    	selenium = new WebDriverBackedSelenium(new HtmlUnitDriver(true), browserURL);
	    } else {
	    	selenium = new DefaultSelenium(serverHost, serverPool, browserStartCommand, browserURL);
			selenium.start();
			selenium.windowFocus();
			selenium.windowMaximize();	
	    }
		seleniumPool.put(key,selenium);
	} */
	
	private static int counter = 0;
	
	private static void createNewLoggingSelenium(String key, String serverHost, int serverPool, String browserStartCommand, String browserURL) throws Exception {		
		final String resultEncoding = "UTF-8";
		//java.util.Date date = new java.util.Date(System.currentTimeMillis()); //получаем текущую дату для имени файла
        BufferedWriter writer = LoggingUtils.createWriter("./log/result."+key+(counter++)+".html", resultEncoding, true);
	    LoggingResultsFormatter htmlFormatter = 
		        new HtmlResultFormatter(writer, resultEncoding);
	    htmlFormatter.setScreenShotBaseUri(""); // this is for linking to the screenshots
	    htmlFormatter.setAutomaticScreenshotPath("./log");
	    // wrap HttpCommandProcessor from remote-control
	    
	    LoggingCommandProcessor processor = 
	    	    new LoggingCommandProcessor(new HttpCommandProcessor(serverHost, serverPool, browserStartCommand, browserURL), htmlFormatter);
	    		Selenium selenium = new LoggingDefaultSelenium(processor);
	    		selenium.start();
	    		selenium.windowFocus();
	    		selenium.windowMaximize();
	    		writerPool.put(key, writer);
	    		seleniumPool.put(key,selenium);
	}  
		
	
	public static void dismissSelenium(String key) throws Exception {		
		Selenium se = seleniumPool.remove(key);
        if (se != null) {
            se.close();
            se.stop();

        }
        BufferedWriter writer = writerPool.remove(key);
        if (writer != null) {
        	writer.close();
        // do nothing
    }
		}
}
