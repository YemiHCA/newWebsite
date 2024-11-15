package stepDefinitions;

import org.junit.Assert;
import driverFactory.DriverFactory;
import io.cucumber.java.en.When;
import pages.AboutHcaUkPage;
import pages.HomePage;

public class AboutHcaUkStepDef {

	HomePage homePage = new HomePage(DriverFactory.getDriver());
	AboutHcaUkPage aboutHcaUkPage = new AboutHcaUkPage(DriverFactory.getDriver());

	@When("user click About HCA UK")
	public void user_click_about_hca_uk() {
		homePage.clickAboutHcaUKLink();
	}

	@When("page title should be About HCA UK")
	public void page_title_should_be_about_hca_uk() throws InterruptedException {

		Assert.assertEquals(homePage.getPageTitle(), "About HCA UK");

	}

	@When("there is view our treatments and services tab")
	public void there_is_view_our_treatments_and_services_tab() {

		Assert.assertTrue(aboutHcaUkPage.IsViewOurTreatmentsAndServicesTabDisplayed());
	}

	@When("find a consultant tab")
	public void find_a_consultant_tab() {
		Assert.assertTrue(aboutHcaUkPage.IsFindAconsultantTabDisplayed());

	}
	

	@When("Find out more about our ethos tab")
	public void find_out_more_about_our_ethos_tab() {
		Assert.assertTrue(aboutHcaUkPage.IsFindOutMoreAboutOurEthosTabDisplayed());

	}

	@When("Our staff share their experiences and stories of working at HCA UK tab")
	public void our_staff_share_their_experiences_and_stories_of_working_at_hca_uk_tab() {
		Assert.assertTrue(aboutHcaUkPage.IsOurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTabDisplayed());

	}

	@When("More about our range of advanced medical technology tab")
	public void more_about_our_range_of_advanced_medical_technology_tab() {
		Assert.assertTrue(aboutHcaUkPage.IsMoreAboutOurRangeOfAdvancedMedicalTechnologyTabDisplayed());

	}

	@When("More about our HCA Story tab")
	public void more_about_our_hca_story_tab() {
		Assert.assertTrue(aboutHcaUkPage.IsMoreAboutOurHCAStoryTabDisplayed());

	}
	

	@When("there are {int} different kind of healthcare company tabs")
	public void there_are_different_kind_of_healthcare_company_tabs(Integer compantTab) {
		System.out.println(aboutHcaUkPage.IsHealthcareCompanyListDisplay());
	   Assert.assertTrue(aboutHcaUkPage.IsHealthcareCompanyListDisplay()==compantTab); 
	}




	@When("book an appointment tab")
	public void book_an_appointment_tab() {
		
//		Assert.assertTrue(homePage.IsbookAnApptTabDisplay());

	}
	

}
