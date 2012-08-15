package com.exit.tests;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.lift.TestContext;
import org.openqa.selenium.lift.WebDriverTestContext;
import org.openqa.selenium.lift.find.Finder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.test.fw.SeleniumHelper;
import com.unitedinternet.portal.selenium.utils.logging.LoggingDefaultSelenium;


public class TestBaseExit {
	protected LoggingDefaultSelenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*chrome";
		selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
				"localhost", 4444, browser, "http://umagicpro-pp/");
				
	}


	@AfterClass
	public void tearDown() throws Exception {
		SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
	}
	
	
	private WebDriver driver = createDriver();
    private TestContext context = new WebDriverTestContext(driver);

    protected WebDriver createDriver() {
		return null;
	}

    protected WebDriver getWebDriver() {
      return driver;
    }

	
	protected void clickOn(Finder<WebElement, WebDriver> finder) {
		context.clickOn(finder);
	}
	
	protected void goTo(String url) {
		       context.goTo(url);
		     }
	
	protected Finder<WebElement, WebDriver> into(Finder<WebElement, WebDriver> input) {
		return input;
	}
	
	public static org.openqa.selenium.lift.find.XPathFinder xpath(String xpath) {
		return new org.openqa.selenium.lift.find.XPathFinder(xpath);
	}
	
}
	
