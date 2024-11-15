package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class ForBusninessPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public ForBusninessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// contact us tab
	@FindBy(xpath = "//span[normalize-space()='Contact us']")
	WebElement contactUs;

	public boolean IsContactUsDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, contactUs, 20);
		return contactUs.isDisplayed();
	}
	// find out more
	@FindBy(xpath = "//span[normalize-space()='Find out more']")
	WebElement findOutMore;

	public boolean IsFindOutMoreDisplayed() {
		waitHelper.WaitForElementToBeVisible(driver, findOutMore, 20);
		return findOutMore.isDisplayed();
	}
	// book an appointment tab
	@FindBy(xpath = "//div[contains(@class,'StickyCTA_cta__bI9Pt')]//button")
	WebElement bookAnAppointmentTab;

	public boolean IsBookAnAppointmentTabDisplayed() {
		return bookAnAppointmentTab.isDisplayed();
	}
	
	// call us today tab
	@FindBy(xpath = "//div[text()=\"Call us  today \"]")
	WebElement callUsTodayTab;

	public boolean IscallUsTodayTabDisplayed() {
		return callUsTodayTab.isDisplayed();
	}
}
