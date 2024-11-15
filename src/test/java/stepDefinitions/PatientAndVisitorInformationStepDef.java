package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.PatientAndVisitorInformationPage;

public class PatientAndVisitorInformationStepDef {
	
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	PatientAndVisitorInformationPage patientAndVisitorInformationPage = new PatientAndVisitorInformationPage(DriverFactory.getDriver());

	

	@When("user click patient and visitor information link")
	public void user_click_patient_and_visitor_information_link() {
		homePage.clickPatientAndVisitorInfoLink();
	}
	@When("there should be {int} patient and visitor information links")
	public void there_should_be_patient_and_visitor_information_links(Integer int1) throws InterruptedException {
		System.out.println(patientAndVisitorInformationPage.getPatientAndVisitorInfoLinkCount()); 
		Assert.assertTrue(patientAndVisitorInformationPage.getPatientAndVisitorInfoLinkCount()==int1);
	}
	@When("patient and visitor information view all tab")
	public void patient_and_visitor_information_view_all_tab() {
		Assert.assertTrue(patientAndVisitorInformationPage.isPatientAndVisitorInfoViewAllTabDisplay());

	}
	@When("patient and visitor information latest news tab")
	public void patient_and_visitor_information_latest_news_tab() {
		Assert.assertTrue(patientAndVisitorInformationPage.ispatientAndVisitorInfoLatestNewsTabDisplay());

	}
	@When("patient and visitor information learn more tab")
	public void patient_and_visitor_information_learn_more_tab() {
		Assert.assertTrue(patientAndVisitorInformationPage.isPatientAndVisitorInfoLearnMoreTabDisplay());

	}




}
