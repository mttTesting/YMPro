package com.exit.tests;

import org.testng.annotations.DataProvider;

public class DataProviderExit {

	@DataProvider(name = "warning1", parallel = true)
	  public static Object[][] createDataLoging1() {
		  return new Object[][] { { new String (""), ("")}, // первый массив данных
				 { new String ("100102"), ("")}, // второй массив данных
				{ new String (""), ("1234")} // третий массив данных
		  };	  

	  	};
	  	
		@DataProvider(name = "warning2", parallel = true)
		  public static Object[][] createDataLoging2() {
			  return new Object[][] { { new String ("100"), ("1234")}, // первый массив данных
					 { new String ("100102"), ("4321")},  // второй массив данных
			  };	  

		  	};
		  	
		  	@DataProvider(name = "restorPassFalse", parallel = true)
			  public static Object[][] createDataMailFalse() {
				  return new Object[][] { { new String ("123456789")}, // первый массив данных
						 { new String ("qqq@qq.qu")}, // второй массив данных
				  };	  

			  	};
			  	
			  	@DataProvider(name = "restorPassTrue", parallel = true)
				  public static Object[][] createDataMailTrue() {
					  return new Object[][] { { new String ("100102")}, // первый массив данных
							 { new String ("SqaTest@yandex.ru")}, // второй массив данных
					  };	  

				  	};
		
}
