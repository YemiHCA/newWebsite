package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.PayMyBillPage;

public class PayMyBillSteoDef {
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	PayMyBillPage payMyBillPage = new PayMyBillPage(DriverFactory.getDriver());

	@Given("user click pay my bill")
	public void user_click_pay_my_bill() {
		homePage.clickPayMyBillLink();
	}

	@Given("the page title is Payment Form")
	public void the_page_title_is_payment_form() throws InterruptedException {
		System.out.println(payMyBillPage.getPageTitle());
		Assert.assertEquals(payMyBillPage.getPageTitle(), "Payment Form");
	}

}
