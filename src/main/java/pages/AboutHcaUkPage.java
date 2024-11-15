package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class AboutHcaUkPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	JavascriptExecutor jScroll = (JavascriptExecutor) driver;

	WaitHelper waitHelper = new WaitHelper(driver);

	public AboutHcaUkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// View our treatments and services tab
	@FindBy(xpath = "//span[text()=\"View our treatments and services\"]")
	WebElement viewOurTreatmentsAndServicesTab;

	@SuppressWarnings("static-access")
	public boolean IsViewOurTreatmentsAndServicesTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, viewOurTreatmentsAndServicesTab, 20);
		return viewOurTreatmentsAndServicesTab.isDisplayed();
	}
	// click View our treatments and services tab

	@SuppressWarnings("static-access")
	public void clickViewOurTreatmentsAndServicesTab() {
		waitHelper.WaitForElementToBeClickable(driver, viewOurTreatmentsAndServicesTab, 20);
		js.javaScriptClick(driver, viewOurTreatmentsAndServicesTab);

	}

	// Find a consultant
//	@FindBy(xpath = "//a[contains(@href,\"Finder/Step-Consultant-Cards?\")]")
	@FindBy(xpath = "//b[normalize-space()='consultant']")
	WebElement findAconsultantTab;

	@SuppressWarnings("static-access")
	public boolean IsFindAconsultantTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, findAconsultantTab, 20);
		return findAconsultantTab.isDisplayed();
	}
	// click Find a consultant

	@SuppressWarnings("static-access")
	public void clickFindAconsultantTab() {
		waitHelper.WaitForElementToBeClickable(driver, findAconsultantTab, 20);
		js.javaScriptClick(driver, findAconsultantTab);

	}

	// Find out more about our ethos tab
	@FindBy(xpath = "//span[text()= \"Find out more about our ethos\"]")
	WebElement FindOutMoreAboutOurEthosTab;

	@SuppressWarnings("static-access")
	public boolean IsFindOutMoreAboutOurEthosTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, FindOutMoreAboutOurEthosTab, 20);
		return FindOutMoreAboutOurEthosTab.isDisplayed();
	}
	// click Find out more about our ethos tab

	@SuppressWarnings("static-access")
	public void clickFindOutMoreAboutOurEthosTab() {
		waitHelper.WaitForElementToBeClickable(driver, FindOutMoreAboutOurEthosTab, 20);
		js.javaScriptClick(driver, FindOutMoreAboutOurEthosTab);

	}


	// Our staff share their experiences and stories of working at HCA UK tab
	@FindBy(xpath = "//span[text()= \"Our staff share their experiences and stories of working at HCA UK\"]")
	WebElement OurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab;

	@SuppressWarnings("static-access")
	public boolean IsOurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, OurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab, 20);
		return OurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab.isDisplayed();
	}
	// click Our staff share their experiences and stories of working at HCA UK tab

	@SuppressWarnings("static-access")
	public void clickOurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab() {
		waitHelper.WaitForElementToBeClickable(driver, OurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab, 20);
		js.javaScriptClick(driver, OurStaffShareTheirExperiencesAndStoriesOfWorkingAtHCAUKTab);

	}

	// More about our range of advanced medical technology tab
	@FindBy(xpath = "//span[text()=\"More about our range of advanced medical technology\"]")
	WebElement MoreAboutOurRangeOfAdvancedMedicalTechnologyTab;

	@SuppressWarnings("static-access")
	public boolean IsMoreAboutOurRangeOfAdvancedMedicalTechnologyTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, MoreAboutOurRangeOfAdvancedMedicalTechnologyTab, 20);
		return MoreAboutOurRangeOfAdvancedMedicalTechnologyTab.isDisplayed();
	}
	// click More about our range of advanced medical technology tab

	@SuppressWarnings("static-access")
	public void clickMoreAboutOurRangeOfAdvancedMedicalTechnologyTab() {
		waitHelper.WaitForElementToBeClickable(driver, MoreAboutOurRangeOfAdvancedMedicalTechnologyTab, 20);
		js.javaScriptClick(driver, MoreAboutOurRangeOfAdvancedMedicalTechnologyTab);

	}

	// More about our HCA Story tab
	@FindBy(xpath = "//div[text()=\"More about our HCA Story\"]")
	WebElement MoreAboutOurHCAStoryTab;

	@SuppressWarnings("static-access")
	public boolean IsMoreAboutOurHCAStoryTabDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, MoreAboutOurHCAStoryTab, 20);
		return MoreAboutOurHCAStoryTab.isDisplayed();
	}
	// click More about our HCA Story tab

	@SuppressWarnings("static-access")
	public void clickMoreAboutOurHCAStoryTab() {
		waitHelper.WaitForElementToBeClickable(driver, MoreAboutOurHCAStoryTab, 20);
		js.javaScriptClick(driver, MoreAboutOurHCAStoryTab);

	}
	
	@FindBy(xpath = "//div[@class=\"CardContent_card-info__ra1sN\"]//a")
	WebElement healthcareCompanyList;
	
	public int IsHealthcareCompanyListDisplay(){
		List<WebElement> healthcareCompany = driver.findElements(By.xpath("//div[@class=\"CardContent_card-info__ra1sN\"]//a"));
return healthcareCompany.size();

		
	}
}
