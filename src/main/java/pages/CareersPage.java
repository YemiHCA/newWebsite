package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class CareersPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public CareersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// careers link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-right__44FNf')]//a[normalize-space()='Careers']")

	WebElement careers;

	// click careers link
	public void clickCareersLink() {
		js.javaScriptClick(driver, careers);
	}

	// is careers link displayed
	public boolean IsCareersLinkDisplay() {

		return careers.isDisplayed();

	}
}
