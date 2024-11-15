package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.DepartmentsPage;
import pages.HomePage;

public class DepartmentsStepDef {
	
	DepartmentsPage departmentsPage = new DepartmentsPage(DriverFactory.getDriver());
	HomePage homePage = new HomePage(DriverFactory.getDriver());



	@When("user click departments link")
	public void user_click_departments_link() {
		homePage.clickDepartmentLink();
	}
	@Then("there should be {int} service line links")
	public void there_should_be_service_line_links(Integer servicelinelist) {
		System.out.println(departmentsPage.IsServiceLinesListDisplayed());
		Assert.assertTrue(departmentsPage.IsServiceLinesListDisplayed()== servicelinelist);
	}
	@Then("service line view all link")
	public void service_line_view_all_link() {
	    Assert.assertTrue(departmentsPage.IsServiceLinesViewAllDisplayed());

	}
	@Then("{int} GP Services & Urgent Care links")
	public void gp_services_urgent_care_links(Integer gpservicesList) {
		System.out.println(departmentsPage.IsGpServicesAndUrgentCareListDisplayed());

		Assert.assertTrue(departmentsPage.IsGpServicesAndUrgentCareListDisplayed()== gpservicesList);

	}
	@Then("GP Services & Urgent Care view all link")
	public void gp_services_urgent_care_view_all_link() {
	    Assert.assertTrue(departmentsPage.IsGpServicesAndUrgentCareViewAllLinkDisplay());

	}
	@Then("{int} Accessing private healthcare links")
	public void accessing_private_healthcare_links(Integer privatehealthcareList) {
		Assert.assertTrue(departmentsPage.IsAccessingPrivateHealthcareListDisplayed()== privatehealthcareList);

	}
	@Then("More about HCA UK link")
	public void more_about_hca_uk_link() {
	    Assert.assertTrue(departmentsPage.IsmoreAboutHCAlinkDisplay());

	}
	@Then("view all tab")
	public void view_all_tab() {
		
	    Assert.assertTrue(departmentsPage.IsViewAllTabDisplay());

	}




}
