package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class NeurosciencesPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	JavascriptExecutor jScroll = (JavascriptExecutor) driver;

	WaitHelper waitHelper = new WaitHelper(driver);

	public NeurosciencesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// click View our neurosurgeons tab
	@FindBy(xpath = "//span[normalize-space()='View our neurosurgeons']")
	WebElement viewOurNeurosurgeonsTab;

	@SuppressWarnings("static-access")
	public void clickViewOurNeurosurgeonsTab() {
		waitHelper.WaitForElementToBeClickable(driver, viewOurNeurosurgeonsTab, 10);

		js.javaScriptClick(driver, viewOurNeurosurgeonsTab);
	}

	// click View our neurologists tab
	@FindBy(xpath = "//span[normalize-space()='View our neurologists']")
	WebElement viewOurNeurologistsTab;

	@SuppressWarnings("static-access")
	public void clickViewOurNeurologistsTab() {
		waitHelper.WaitForElementToBeClickable(driver, viewOurNeurologistsTab, 10);

		js.javaScriptClick(driver, viewOurNeurologistsTab);
	}

	// click View our neurophysiologists tab
	@FindBy(xpath = "//span[normalize-space()='View our neurophysiologists']")
	WebElement viewOurNeurophysiologistsTab;

	@SuppressWarnings("static-access")
	public void clickViewOurNeurophysiologistsTab() {
//		waitHelper.WaitForElementToBeClickable(driver, viewOurNeurophysiologistsTab, 10);
		waitHelper.WaitForElementToBePresent(driver, viewOurNeurophysiologistsTab, 10);
		js.javaScriptClick(driver, viewOurNeurophysiologistsTab);
	}

	// click View all neurology treatments tab
	@FindBy(xpath = "//span[text()=\"View all neurology treatments\"]")
	WebElement viewAllNeurologyTreamentsTab;

	@SuppressWarnings("static-access")
	public void clickViewAllNeurologyTreamentsTab() {
		waitHelper.WaitForElementToBeClickable(driver, viewAllNeurologyTreamentsTab, 10);

		js.javaScriptClick(driver, viewAllNeurologyTreamentsTab);
	}

	// click Find out more about the iMRI tab
	@FindBy(xpath = "//span[text()=\"Find out more about the iMRI\"]")
	WebElement viewFindOutMoreAboutTheIMRITab;

	@SuppressWarnings("static-access")
	public void clickViewFindOutMoreAboutTheIMRITab() {
		waitHelper.WaitForElementToBeClickable(driver, viewFindOutMoreAboutTheIMRITab, 10);

		js.javaScriptClick(driver, viewFindOutMoreAboutTheIMRITab);
	}

	// click Find out more about rehabilitation tab
	@FindBy(xpath = "//span[text()=\"Find out more about rehabilitation\"]")
	WebElement findOutMoreAboutRehabilitationTab;

	@SuppressWarnings("static-access")
	public void clickFindOutMoreAboutRehabilitationTab() {
		waitHelper.WaitForElementToBeClickable(driver, findOutMoreAboutRehabilitationTab, 10);

		js.javaScriptClick(driver, findOutMoreAboutRehabilitationTab);
	}
	
	// Clinical Neurosciences locations list
		@FindBy(xpath = "//span[@class=\"Text_body-large__Sf9uv\"]")
		WebElement clinicalNeurosciencesLocationsList;

		@SuppressWarnings("static-access")
		public WebElement getclinicalNeurosciencesLocationsList() {
			waitHelper.WaitForElementToBeClickable(driver, clinicalNeurosciencesLocationsList, 10);
			
			return clinicalNeurosciencesLocationsList;

		}
		
		// click Neurosciences link
		@FindBy(xpath = "//ul[@data-navigation-type=\"navigationLinkClick\"]//a[normalize-space()='Neurosciences']")
		WebElement neurosciencesLink;

		@SuppressWarnings("static-access")
		public void clickNeurosciencesLink() {
			waitHelper.WaitForElementToBeClickable(driver, neurosciencesLink, 10);

			js.javaScriptClick(driver, neurosciencesLink);
		}
		
		public String pageTitle(){
			
			return driver.getTitle();
		}
		
}
