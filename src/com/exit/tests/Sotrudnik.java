package com.exit.tests;

import org.testng.annotations.Test;

public class Sotrudnik extends TestBaseExit {
	
	@Test (dataProvider = "Sotrudnik", dataProviderClass = DataProviderExit.class)
	public void testSotrudnik(String town, String tname, String pref, String num) throws Exception {


	}
}