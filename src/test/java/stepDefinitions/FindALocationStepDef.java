package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.FindALocationPage;
import pages.HomePage;

public class FindALocationStepDef {

	HomePage homePage = new HomePage(DriverFactory.getDriver());
	FindALocationPage findALocationPage = new FindALocationPage(DriverFactory.getDriver());

	@When("user click find a location link")
	public void user_click_find_a_location_link() {
		homePage.clickfindAlocationLink();
	}

	@When("there should be {int} location links")
	public void there_should_be_location_links(Integer locationLinks) throws InterruptedException {
//		System.out.println(findALocationPage.ourLocationCount());
		Assert.assertTrue(findALocationPage.ourLocationCount() == locationLinks);
	}

	@When("there should be find a location view all location tab")
	public void there_should_be_find_a_location_view_all_location_tab() {
		Assert.assertTrue(findALocationPage.isViewAllLocationsTab());

	}

}
