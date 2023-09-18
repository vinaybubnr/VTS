package StepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import Utilies.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefination {

	// public ChromeDriver driver;

	public String productName;
	public TestContextSetUp testcontestsetup;
	public LandingPage landingpage;

	public LandingPageStepDefination(TestContextSetUp testcontestsetup) {
		this.testcontestsetup = testcontestsetup;
		this.landingpage = testcontestsetup.pageobjectmanager.getLandingPage();

	}

	@Given("user is on GreenKart Landing Page")
	public void user_is_on_green_kart_landing_page() {
		
		String c = landingpage.getTitleLandingPage();

		Assert.assertTrue(c.contains("GreenKart"));
		
	}

	@When("^user search with short name (.+) and extracted the actual name of the product$")
	public void user_search_with_short_name_and_extracted_the_actual_name_of_the_product(String shortName)
			throws InterruptedException {
		landingpage = testcontestsetup.pageobjectmanager.getLandingPage();
		landingpage.searchland(shortName);

		Thread.sleep(2000);
		testcontestsetup.productName = landingpage.getProductName().split("-")[0].trim();
		System.out.println(testcontestsetup.productName);

	}

	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {

		landingpage.incrementButton(Integer.parseInt(quantity));

		landingpage.addToCart();

	}

}
