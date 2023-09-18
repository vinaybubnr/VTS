package PageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {
	
	public LandingPage landingpage;
	public WebDriver driver;
	public OffersPage offerspage;
	public CheckOutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public LandingPage getLandingPage() {
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OffersPage getOffersPage() {
		offerspage = new OffersPage(driver);
		return offerspage;
	}
	
	public CheckOutPage getCheckOutPage() {
		checkoutpage = new CheckOutPage(driver);
		return checkoutpage;
		
	}
}
