package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.ForBusninessPage;
import pages.HomePage;

public class ForBusinessStepDef {
	ForBusninessPage forBusninessPage = new ForBusninessPage(DriverFactory.getDriver());
	HomePage homePage = new HomePage(DriverFactory.getDriver());

	

	@Given("user click for business link")
	public void user_click_for_business_link() {
		homePage.clickForBusinessLink();
	}
	@Given("there should be contact us tab")
	public void there_should_be_contact_us_tab() {
		forBusninessPage.IsContactUsDisplayed(); 
	}
	@Given("find out more tab")
	public void find_out_more_tab() {
		forBusninessPage.IsFindOutMoreDisplayed();
	}
	@Given("call us today tab")
	public void call_us_today_tab() {
		forBusninessPage.IscallUsTodayTabDisplayed();
	}
	@Given("Book an appointment cta")
	public void book_an_appointment_cta() {
		forBusninessPage.IsBookAnAppointmentTabDisplayed();
		
	}




}
