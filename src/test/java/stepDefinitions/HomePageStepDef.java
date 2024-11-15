package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;

public class HomePageStepDef {

	HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user navigates to home page of the new site")
	public void user_navigates_to_home_page_of_the_new_site() {
		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/");
	}

	@Then("user should see HCA logo")
	public void user_should_see_hca_logo() {

		Assert.assertTrue(homePage.homePageLogo());
	}

	@Then("For business link")
	public void for_business_link() {

		Assert.assertTrue(homePage.IsForBusinessLinkDisplay());

	}

	@Then("For healthcare professionals link")
	public void for_healthcare_professionals_link() {
		Assert.assertTrue(homePage.IsForHealthcareProfessionalsLinkDisplay());

	}

	@Then("Pay my bill link")
	public void pay_my_bill_link() {
		Assert.assertTrue(homePage.IsPayMyBillDisplay());

	}

	@Then("About HCA UK link")
	public void about_hca_uk_link() {
		Assert.assertTrue(homePage.IsAboutHcaUKLinkDisplay());

	}

	@Then("Careers link")
	public void careers_link() {
		Assert.assertTrue(homePage.IsCareersLinkDisplay());

	}

	@Then("Departments link")
	public void departments_link() {
		Assert.assertTrue(homePage.IsDepartmentsLinkDisplay());

	}

	@Then("Tests and scans link")
	public void tests_and_scans_link() {
		Assert.assertTrue(homePage.IsTestsAndScansLinkDisplay());

	}

	@Then("Find a consultant link")
	public void find_a_consultant_link() {
		Assert.assertTrue(homePage.IsFindAconsultantLinkDisplay());

	}

	@Then("Find a location link")
	public void find_a_location_link() {
		Assert.assertTrue(homePage.IsFindAlocationLinkDisplay());

	}

	@Then("Patient and visitor information link")
	public void patient_and_visitor_information_link() {
		Assert.assertTrue(homePage.IsPatientAndVisitorInfoLinkDisplay());

	}

	@Then("search icon")
	public void search_icon() {
		Assert.assertTrue(homePage.IsSearchIconDisplay());

	}

	@Then("How can we help you search field")
	public void how_can_we_help_you_search_field() {
		Assert.assertTrue(homePage.IsHomePageSearchFieldDisplay());

	}

	@Then("Book an appointment tab")
	public void book_an_appointment_tab() {
		Assert.assertTrue(homePage.IsBookAnAppointmentTabDisplay());

	}

	@Then("Call us today tab")
	public void call_us_today_tab() {
		Assert.assertTrue(homePage.IsCallUsTodayTabDisplay());

	}

	@Then("App download tab")
	public void app_download_tab() {
		Assert.assertTrue(homePage.IsDownloadAppTabDisplay());

	}

	@Then("Get a second opinion tab")
	public void get_a_second_opinion_tab() {

	}

	@Then("Find a doctor tab")
	public void find_a_doctor_tab() {
		Assert.assertTrue(homePage.IsFindAdoctorTabDisplay());

	}

	@Then("Pay my bill tab")
	public void pay_my_bill_tab() {
		Assert.assertTrue(homePage.IsPayMyBillTabDisplay());

	}

	@Then("there should be {int} footer links")
	public void there_should_be_footer_links(Integer footerList) {
		Assert.assertTrue(homePage.footerList() == footerList);

	}

	@Then("CQC logo")
	public void cqc_logo() {
		Assert.assertTrue(homePage.IsCareQualityCommissionIconDisplay());

	}

	@Then("{int} social media items")
	public void social_media_items(Integer socialMediaItems) {
		Assert.assertTrue(homePage.socialMediaList() == socialMediaItems);

	}

}
