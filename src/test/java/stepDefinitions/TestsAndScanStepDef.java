package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.TestsAndScanPage;

public class TestsAndScanStepDef {

	HomePage homePage = new HomePage(DriverFactory.getDriver());
	TestsAndScanPage testsAndScanPage = new TestsAndScanPage(DriverFactory.getDriver());

	@When("user click tests and scan link")
	public void user_click_tests_and_scan_link() {
		homePage.clickTestsAndScansLink();
	}

	@When("there should be {int} Tests and scans list")
	public void there_should_be_tests_and_scans_list(Integer testsAndScansListCount) throws InterruptedException {
		Assert.assertTrue(testsAndScanPage.IsTestsAndScansListDisplay() == testsAndScansListCount);
	}

	@When("learn more tab")
	public void learn_more_tab() {
		Assert.assertTrue(testsAndScanPage.isTestsAndScansLearnMoreDisplay());

	}

	@When("tests and scans view all tab is display")
	public void tests_and_scans_view_all_tab_is_display() {
		Assert.assertTrue(testsAndScanPage.isTestsAndScansViewAllDisplay());
	}

}
