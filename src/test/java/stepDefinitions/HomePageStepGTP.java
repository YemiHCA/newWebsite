package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePageGTP;

public class HomePageStepGTP {

	HomePageGTP homePageGTP = new HomePageGTP(DriverFactory.getDriver());

	@Given("I open the HCA Healthcare UK homepage")
	public void i_open_the_hca_healthcare_uk_homepage() {
		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/");

	}

	@Then("I should see the header logo")
	public void i_should_see_the_header_logo() {
		Assert.assertTrue(homePageGTP.isHeaderLogoDisplayed());
	}

	@Then("I should see the {string} link")
	public void i_should_see_the_link(String linkText) {

		switch (linkText) {

		case "Find a consultant":

			Assert.assertTrue(homePageGTP.isFindConsultantLinkDisplayed());

			break;

		case "For business":

			Assert.assertTrue(homePageGTP.isForBusinessLinkDisplayed());

			break;

		case "For healthcare professionals":

			Assert.assertTrue(homePageGTP.isForHealthcareProfessionalsLinkDisplayed());

			break;

		case "Pay my bill":

			Assert.assertTrue(homePageGTP.isPayMyBillLinkDisplayed());

			break;

		case "About HCA UK":

			Assert.assertTrue(homePageGTP.isAboutHCAUKLinkDisplayed());

			break;

		case "Careers":

			Assert.assertTrue(homePageGTP.isCareersLinkDisplayed());

			break;

		case "Departments":

			Assert.assertTrue(homePageGTP.isDepartmentsLinkDisplayed());

			break;

		case "Tests & scans":

			Assert.assertTrue(homePageGTP.isTestsAndScansLinkDisplayed());

			break;

		case "Find a location":

			Assert.assertTrue(homePageGTP.isFindAlocationLinkDisplayed());

			break;

		case "Patient & Visitor Information":

			Assert.assertTrue(homePageGTP.isPatientAndVisitorInformationLinkDisplayed());

			break;

		}

	}

	@Then("I should see the search box")
	public void i_should_see_the_search_box() {

        Assert.assertTrue(homePageGTP.isSearchBoxDisplayed());

	}

	@When("I enter {string} in the search box")
	public void i_enter_in_the_search_box(String string) {

	}

	@When("I click the search button")
	public void i_click_the_search_button() {

	}

	@Then("I should see search results related to {string}")
	public void i_should_see_search_results_related_to(String string) {

	}

}
