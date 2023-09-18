package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	/*
	 * @FindBy(css = ".search-keyword") WebElement searchLand;
	 */

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;

	}

	By searchLand = By.cssSelector(".search-keyword");

	By productNameLand = By.xpath("//div[@class='products']/div/h4");

	By topDeals = By.linkText("Top Deals");
	
	By increment = By.cssSelector(".increment");
	
	By addToCart = By.cssSelector(".product-action :first-child");

	public void searchland(String PName) {
		driver.findElement(searchLand).sendKeys(PName);

	}

	public String getProductName() {

		String pname = driver.findElement(productNameLand).getText();
		return pname;

	}

	public void selectTopDeals() {
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void incrementButton(int quantity) {
		int i = quantity - 1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
			
		}
		
		
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}