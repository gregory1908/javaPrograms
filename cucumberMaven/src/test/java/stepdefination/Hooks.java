package stepdefination;

import java.sql.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P7112037\\Desktop\\chromedriver.exe");
	}
	
	@After
	public void closeAll() {
		driver.close();
	}
}
