package CucumberOptions;

import org.testng.annotations.DataProvider;

// Reports
// HTML XML JSON and Extent Reports

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", monochrome = true, glue = "StepDefinations", tags = "@PlaceOrder or  @OfferPage", plugin = {
		"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt" })
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}