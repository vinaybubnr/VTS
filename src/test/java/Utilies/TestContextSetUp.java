package Utilies;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageobjectmanager;
	public BaseClass baseclass;
	public GenericUtilis generic;
	
	
	public TestContextSetUp() throws IOException {
		baseclass = new BaseClass();
		pageobjectmanager = new PageObjectManager(baseclass.WebDriverManager());
		generic = new GenericUtilis(baseclass.WebDriverManager());
		
		
	}
	

}
