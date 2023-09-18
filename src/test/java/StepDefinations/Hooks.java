package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utilies.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetUp testcontestsetup;
	
	public Hooks(TestContextSetUp testcontestsetup) {
		
		this.testcontestsetup = testcontestsetup;
		
	}
	
	
	@After
	public void aftersenario() throws IOException {
		
		
		testcontestsetup.baseclass.WebDriverManager().quit();
		
		
	}
	
	@AfterStep
	
	public void captureScreenshot(Scenario scenario) throws IOException {
		
		WebDriver driver = testcontestsetup.baseclass.WebDriverManager();
		
		if(scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot ) driver;
			File source = screen.getScreenshotAs(OutputType.FILE);  // convert file to byte
			byte[] filecontent = FileUtils.readFileToByteArray(source);
			scenario.attach(filecontent, "image/png", "image");
			
			
		}
		
		
	}

}
