package StepDefinations;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utilies.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersPageStepDefinations {

	public String FinalProductName;

	public TestContextSetUp testcontestsetup;

	public OffersPageStepDefinations(TestContextSetUp testcontestsetup) {
		this.testcontestsetup = testcontestsetup;

	}

	@Then("^user go and search (.+)  short name in offer page to check if product exists$")
	public void user_go_and_search_short_name_in_offer_page_to_check_if_product_exists(String ShortName)
			throws InterruptedException {
		OffersPage offerpage = testcontestsetup.pageobjectmanager.getOffersPage();
	//	OffersPage offerpage = new OffersPage(testcontestsetup.driver);
		switchToOffersPage();
		offerpage.searchland(ShortName);
		Thread.sleep(2000);
		FinalProductName = offerpage.getProductName();
		System.out.println(FinalProductName);
	}
	
	public void switchToOffersPage() {
		LandingPage landingpage = testcontestsetup.pageobjectmanager.getLandingPage();
		
	//	LandingPage landingpage = new LandingPage(testcontestsetup.driver);
		landingpage.selectTopDeals();
		testcontestsetup.generic.WindowToChild();
		
		
	}

	@Then("Validate product name in home page matching with offers page")
	public void Validate_product_name_in_home_page_matching_with_offers_page() throws IOException {
		Assert.assertEquals(FinalProductName, testcontestsetup.productName);
		

	}

}
