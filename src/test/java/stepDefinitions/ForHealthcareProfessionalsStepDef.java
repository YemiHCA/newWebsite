package stepDefinitions;
import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.ForHealthcareProfessionalsPage;
import pages.HomePage;

public class ForHealthcareProfessionalsStepDef {
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	ForHealthcareProfessionalsPage forHealthcareProfessionalsPage = new ForHealthcareProfessionalsPage(DriverFactory.getDriver());

	

	@Given("user click for healthcare professionals link")
	public void user_click_for_healthcare_professionals_link() {
		homePage.clickForHealthcareProfessionalsLink();
	}
	@Given("there should be {int} helpful information tabs")
	public void there_should_be_helpful_information_tabs(Integer infoTabs) throws InterruptedException {
		
		Assert.assertTrue(forHealthcareProfessionalsPage.getFindOutMoreCount()== infoTabs);
	}
	@Given("find out more about our events tab")
	public void find_out_more_about_our_events_tab() {
	   
		forHealthcareProfessionalsPage.IsFindOutMoreAboutOurEventsDisplayed();
	}




}
