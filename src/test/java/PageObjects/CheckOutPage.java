package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {

	/*
	 * @FindBy(css = ".search-keyword") WebElement searchLand;
	 */

	public WebDriver driver;

	public CheckOutPage(WebDriver driver) {

		this.driver = driver;

	}

	By cartBag = By.cssSelector(".cart-icon :first-child");

	By checkOutButton = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
	
	By promoButton = By.cssSelector(".promoBtn");
	
	By placeOrder = By.xpath("//button[contains(text(), 'Place Order')]");

	public void checkOutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoButton() {
		return driver.findElement(promoButton).isDisplayed();
		
	}
	
	public boolean placeOrderBtn() {
		return driver.findElement(placeOrder).isDisplayed();
		
	}

}