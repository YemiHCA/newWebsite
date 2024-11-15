package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class TestsAndScanPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public TestsAndScanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	@FindBy(xpath = "//*[@id=\"navigation-tab-1\"]/div[1]/ul//a")

	WebElement testsAndScansList;

	@SuppressWarnings("static-access")
	public int IsTestsAndScansListDisplay() throws InterruptedException {
		waitHelper.WaitForElementToBePresent(driver, testsAndScansList, 10);
		List<WebElement> testsAndScansList = driver
				.findElements(By.xpath("//*[@id=\"navigation-tab-1\"]/div[1]/ul//a"));

		return testsAndScansList.size();
	}

	// tests And Scans View All display
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_full__5nt_j  \"]//a[@href=\"/tests-and-scans\"]")

	WebElement testsAndScansViewAll;

	@SuppressWarnings("static-access")
	public boolean isTestsAndScansViewAllDisplay() {
		waitHelper.WaitForElementToBePresent(driver, testsAndScansViewAll, 10);

		return testsAndScansViewAll.isDisplayed();
	}

	// is tests And Scans Learn More display
	@FindBy(xpath = "//a[@href=\"/about-us/pioneering-treatments-and-technology/our-robotics-and-technology/cari-heart\"]")

	WebElement testsAndScansLearnMore;

	@SuppressWarnings("static-access")
	public boolean isTestsAndScansLearnMoreDisplay() {
		waitHelper.WaitForElementToBePresent(driver, testsAndScansLearnMore, 10);

		return testsAndScansLearnMore.isDisplayed();
	}
}
