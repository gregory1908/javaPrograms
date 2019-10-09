package stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
	}

	@After
	public void closeAll() {
		driver.close();
	}
}
