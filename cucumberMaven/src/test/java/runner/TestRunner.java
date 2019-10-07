package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue= {"stepdefination"}, format = { "pretty","html:target/cucumber-reports" },monochrome=true)
public class TestRunner {

}
