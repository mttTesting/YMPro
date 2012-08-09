	package com.test.fw;
	
	
	import static org.openqa.selenium.lift.match.NumericalMatchers.exactly;
	import static org.openqa.selenium.lift.match.SelectionMatcher.selection;
	
	import org.hamcrest.Matcher;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.lift.TestContext;
	import org.openqa.selenium.lift.WebDriverTestContext;
	import org.openqa.selenium.lift.find.Finder;
			
	public abstract class BrowserBasedHelper {
	
		private static final long DEFAULT_TIMEOUT = 5000;

	        private WebDriver driver = createDriver();
	        private TestContext context = new WebDriverTestContext(driver);

		protected abstract WebDriver createDriver();

	        protected WebDriver getWebDriver() {
	          return driver;
	        }

	        protected void clickOn(Finder<WebElement, WebDriver> finder) {
			context.clickOn(finder);
		}

		protected void assertPresenceOf(Finder<WebElement, WebDriver> finder) {
			context.assertPresenceOf(finder);
		}
		
		protected void assertPresenceOf(Matcher<Integer> cardinalityConstraint, Finder<WebElement, WebDriver> finder) {
			context.assertPresenceOf(cardinalityConstraint, finder);
		}
		
		protected void waitFor(Finder<WebElement, WebDriver> finder) {
			waitFor(finder, DEFAULT_TIMEOUT);
		}
		
		protected void waitFor(Finder<WebElement, WebDriver> finder, long timeout) {
			context.waitFor(finder, timeout);
		}

		/**
		 * Cause the browser to navigate to the given URL
		 * @param url
		 */
		protected void goTo(String url) {
			  context.goTo(url);
		}
		
		/**
		 * Type characters into an element of the page, typically an input field
		 * @param text - characters to type
		 * @param inputFinder - specification for the page element
		 */
		protected void type(String text, Finder<WebElement, WebDriver> inputFinder) {
			context.type(text, inputFinder);
		}

		/**
		 * Syntactic sugar to use with {@link HamcrestWebDriverTestCase#type(String, Finder<WebElement, WebDriver>)},
		 * e.g. type("cheese", into(textbox()));
		 * The into() method simply returns its argument.
		 */
		protected Finder<WebElement, WebDriver> into(Finder<WebElement, WebDriver> input) {
			return input;
		}
		
		/**
		 * replace the default {@link TestContext}
		 */
		void setContext(TestContext context) {
			this.context = context;
		}

	      /**
	       * Returns the current page source
	       */
	      public String getPageSource() {
	        return getWebDriver().getPageSource();
	      }

	      /**
	       * Returns the current page title
	       */
	      public String getTitle() {
	        return getWebDriver().getTitle();
	      }

	      /**
	       * Returns the current URL
	       */
	      public String getCurrentUrl() {
	        return getWebDriver().getCurrentUrl();
	      }

	      protected void assertSelected(Finder<WebElement, WebDriver> finder) {
			assertPresenceOf(finder.with(selection()));
		}
		
		protected void assertNotSelected(Finder<WebElement, WebDriver> finder) {
			assertPresenceOf(exactly(0), finder.with(selection()));
		}
		
	}
