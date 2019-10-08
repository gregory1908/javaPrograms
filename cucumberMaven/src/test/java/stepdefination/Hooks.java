package stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void setup() {
		String os = System.getProperty("os.name");
		System.out.println(os);
		if (os.contains("Mac")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/rock/git/javaPrograms/cucumberMaven/driver/chromedriver");

		}
	}

	@After
	public void closeAll() {
		driver.close();
	}
}
