package stepDefinitions;


import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.NeurosciencesPage;

public class NeurosciencesStep {
	
	
	
	NeurosciencesPage neurosciencesPage = new NeurosciencesPage(DriverFactory.getDriver());


	@When("user click neurosciences tab")
	public void user_click_neurosciences_tab() {
		neurosciencesPage.clickNeurosciencesLink();

	}

	@When("the page title should be Clinical Neurosciences")
	public void the_page_title_should_be_clinical_neurosciences() {

		Assert.assertEquals(neurosciencesPage.pageTitle(), "Clinical Neurosciences");
	}

	@When("user click View our neurosurgeons tab")
	public void user_click_view_our_neurosurgeons_tab() {
		neurosciencesPage.clickViewOurNeurosurgeonsTab();
	}

	@Then("user is navigated to Consultant summary cards page")
	public void user_is_navigated_to_consultant_summary_cards_page() {
		Assert.assertEquals(neurosciencesPage.pageTitle(), "Clinical Neurosciences");

	}

	@When("user click View our neurologists tab")
	public void user_click_view_our_neurologists_tab() {
		neurosciencesPage.clickViewOurNeurologistsTab();
	}

	@When("user click View our neurophysiologists tab")
	public void user_click_view_our_neurophysiologists_tab() {
		neurosciencesPage.clickViewOurNeurophysiologistsTab();
	}

	@Then("user is navigated to HCA UK Consultant Finder page")
	public void user_is_navigated_to_hca_uk_consultant_finder_page() {
		Assert.assertEquals(neurosciencesPage.pageTitle(), "HCA UK Consultant Finder");

	}

	@When("user click View all neurology treatments tab")
	public void user_click_view_all_neurology_treatments_tab() {
		neurosciencesPage.clickViewAllNeurologyTreamentsTab();
	}

	@Then("user is navigated to Where you’re treated is your choice, a big one. page")
	public void user_is_navigated_to_where_you_re_treated_is_your_choice_a_big_one_page() {
		Assert.assertEquals(neurosciencesPage.pageTitle(), "Where you’re treated is your choice, a big one.");

	}

	@When("user click Find out more about the iMRI tab")
	public void user_click_find_out_more_about_the_i_mri_tab() {
		neurosciencesPage.clickViewFindOutMoreAboutTheIMRITab();
	}

	@Then("user is navigated to Intraoperative Magnetic Resonance Imaging \\(iMRI) page")
	public void user_is_navigated_to_intraoperative_magnetic_resonance_imaging_i_mri_page() {
		Assert.assertEquals(neurosciencesPage.pageTitle(), "Intraoperative Magnetic Resonance Imaging (iMRI)");

	}

	@When("user click Discover more about technology at HCA UK tab")
	public void user_click_discover_more_about_technology_at_hca_uk_tab() {

	}

	@Then("user is navigated to Robotic and medical technology at HCA UK page")
	public void user_is_navigated_to_robotic_and_medical_technology_at_hca_uk_page() {

	}

	@When("user click Find out more about rehabilitation tab")
	public void user_click_find_out_more_about_rehabilitation_tab() {

	}

	@When("there are {int} locations Clinical Neurosciences locations")
	public void there_are_locations_clinical_neurosciences_locations(Integer int1) {
		neurosciencesPage.getclinicalNeurosciencesLocationsList();
	}

}
