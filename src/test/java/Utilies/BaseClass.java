package Utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.OffersPage;

public class BaseClass {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream input = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resource//Global.properties");
		Properties prop = new Properties();
		prop.load(input);
		String browserName = prop.getProperty("browser");
		String URL = prop.getProperty("QAURL");

		if (driver == null) {
			
			if(browserName.equalsIgnoreCase("Chrome"))
			{
			driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();

			}

			else if ((browserName.equalsIgnoreCase("edge"))) {
				driver = new EdgeDriver();

			}
			
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

		}
		return driver;

	}

}
