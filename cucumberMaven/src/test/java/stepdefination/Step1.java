package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1 extends BaseClass {

	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("^Open the test demo site$")
	public void Open_the_test_demo_site() throws Throwable {
		driver.get("http://www.store.demoqa.com");
	}

	@When("^user clicks on My Acoount button$")
	public void user_clicks_on_my_acoount_button() throws Throwable {
		driver.findElement(By.linkText("Dismiss")).click();
		driver.findElement(By.linkText("My Account")).click();
	}

	@Then("^My account section is displayed$")
	public void my_account_section_is_displayed() throws Throwable {
		System.out.println(driver.getTitle());

	}

}
