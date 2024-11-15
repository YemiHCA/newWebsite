package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.CareersPage;
import pages.HomePage;

public class CareersStepDef {
	CareersPage careersPage = new CareersPage(DriverFactory.getDriver());
	HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("user click Careers link")
	public void user_click_careers_link() {
		homePage.clickCareersLink();
	}

	@Then("page title should be HCA Healthcare UK Careers | Across London and the UK")
	public void page_title_should_be_hca_healthcare_uk_careers_across_london_and_the_uk() throws InterruptedException {
		Assert.assertEquals(homePage.getPageTitle(), "HCA Healthcare UK Careers | Across London and the UK");
	}

	

}
