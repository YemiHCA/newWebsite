package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class PatientAndVisitorInformationPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public PatientAndVisitorInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// patient & visitor information link count
	@FindBy(xpath = "//li[@class=\"NavigationDesktop_drawer__ksDQt NavigationDesktop_active__NvJ_M\"]//div//ul//li")

	WebElement patientAndVisitorInfoLinkCount;

	public int getPatientAndVisitorInfoLinkCount() throws InterruptedException {
		List<WebElement> patientAndVisitorInfoLinkCount = driver.findElements(By.xpath(
				"//li[@class=\"NavigationDesktop_drawer__ksDQt NavigationDesktop_active__NvJ_M\"]//div//ul//li"));
		return patientAndVisitorInfoLinkCount.size();
	}

	// is Patient And Visitor Info View All Tab Display
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_full__5nt_j  \"]//a[@href=\"/patient-and-visitor-information\"]")

	WebElement patientAndVisitorInfoViewAllTab;

	public boolean isPatientAndVisitorInfoViewAllTabDisplay() {
		return patientAndVisitorInfoViewAllTab.isDisplayed();
	}

	// is Patient And Visitor Info learn more Tab Display
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_small__EAW1C Button_full__5nt_j  \"]//a[contains(@href,\"/about-us/news\")]")

	WebElement patientAndVisitorInfoLearnMoreTab;

	public boolean isPatientAndVisitorInfoLearnMoreTabDisplay() {
		return patientAndVisitorInfoLearnMoreTab.isDisplayed();
	}

	// is Patient And Visitor Info latest new Tab Display
	@FindBy(xpath = "//a[normalize-space()='Latest news']")

	WebElement patientAndVisitorInfoLatestNewsTab;

	public boolean ispatientAndVisitorInfoLatestNewsTabDisplay() {
		return patientAndVisitorInfoLatestNewsTab.isDisplayed();
	}

}
