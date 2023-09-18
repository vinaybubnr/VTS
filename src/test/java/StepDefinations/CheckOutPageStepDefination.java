package StepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.CheckOutPage;
import PageObjects.LandingPage;
import Utilies.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutPageStepDefination {

	// public ChromeDriver driver;

	public String productName;
	public TestContextSetUp testcontestsetup;
	public CheckOutPage checkoutpage;

	public CheckOutPageStepDefination(TestContextSetUp testcontestsetup) {
		this.testcontestsetup = testcontestsetup;
		this.checkoutpage = testcontestsetup.pageobjectmanager.getCheckOutPage();

	}

	@Then("^User proceed to checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout_and_validate_the_tom_items_in_checkout_page(String name)
			throws InterruptedException {
		checkoutpage.checkOutItems();
		Thread.sleep(3000);

		// Assignment

	}

	@Then("Verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {

		boolean a = checkoutpage.verifyPromoButton();
		Assert.assertTrue(a);
		boolean b = checkoutpage.placeOrderBtn();
		Assert.assertTrue(b);
	}

}
