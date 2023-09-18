package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;

	public OffersPage(WebDriver driver) {

		this.driver = driver;

	}

	By searchoffer = By.id("search-field");

	By Pname = By.xpath("//tbody/tr/td[1]");

	public void searchland(String PName) {
		driver.findElement(searchoffer).sendKeys(PName);

	}

	public String getProductName() {

		String pname = driver.findElement(Pname).getText();
		return pname;

	}

}
