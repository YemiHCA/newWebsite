package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class DepartmentsPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public DepartmentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// departments link
	@FindBy(xpath = "//button[text()=\"Departments\"]")

	WebElement departmentsLink;

	// click departments link
	@SuppressWarnings("static-access")
	public void clickDepartmentsLink() {
		waitHelper.WaitForElementToBeClickable(driver, departmentsLink, 20);
		js.javaScriptClick(driver, departmentsLink);
	}

	// view all tab
	@FindBy(xpath = "//div[contains(@class,'AdvancedBlockHeader_ctas__0uZUA')]//a[normalize-space()='View all']")
	WebElement viewAllTab;

	// click view all tab
	@SuppressWarnings("static-access")
	public void clickviewAllTab() {
		waitHelper.WaitForElementToBeClickable(driver, viewAllTab, 20);
		js.javaScriptClick(driver, viewAllTab);
	}

	// is view all tab display
	public boolean IsViewAllTabDisplay() {
		return viewAllTab.isDisplayed();
	}

	// service lines list
	@FindBy(xpath = "//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul//a[contains(@href,\"/Services/Departments/\")]")

	WebElement serviceLinesList;

	// is service lines list display
	@SuppressWarnings("static-access")
	public int IsServiceLinesListDisplayed() {
//		waitHelper.WaitForElementToBeClickable(driver, serviceLinesList, 20);
		waitHelper.WaitForElementToBePresent(driver, serviceLinesList, 10);
		
		List<WebElement> serviceLinesList = driver.findElements(By.xpath("//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul[@data-navigation-type=\"navigationLinkClick\"]//a[contains(@href,\"/services/departments/\")]"));
		
		

		return serviceLinesList.size();
	}

	// service lines view all link
//	@FindBy(xpath = "//div[@class=\"TextButton_text-button__aoTVz undefined\"]//a[@href=\"/Services/Departments\"][contains(.,\"View all\")]")
	
	@FindBy(xpath = "//div[@class=\"TextButton_text-button__aoTVz undefined\"]//a[@href=\"/services/departments\"]")

	WebElement serviceLinesViewAllLink;

	@SuppressWarnings("static-access")
	public boolean IsServiceLinesViewAllDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, serviceLinesViewAllLink, 20);

		return serviceLinesViewAllLink.isDisplayed();
	}

	// departments View All Link
	@FindBy(xpath = "//a[@href=\"/Services/Departments\"][contains(.,\"View all\")]")

	WebElement departmentsViewAllLink;

	// is departments View All Link display
	@SuppressWarnings("static-access")
	public boolean IsDepartmentsViewAllLinkDisplay() {
		waitHelper.WaitForElementToBeClickable(driver, departmentsViewAllLink, 20);
		return departmentsViewAllLink.isDisplayed();
	}

	// GP Services & Urgent Care list
	@FindBy(xpath = "//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul//a[contains(@href,\"/Services/GP-and-Urgent-Care/\")]")

	WebElement gpServicesAndUrgentCareList;

	// is GP Services & Urgent Care list display
	@SuppressWarnings("static-access")
	public int IsGpServicesAndUrgentCareListDisplayed() {
		waitHelper.WaitForElementToBePresent(driver, gpServicesAndUrgentCareList, 10);
		List<WebElement> gpServicesAndUrgentCareList = driver.findElements(By.xpath("//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul[@data-navigation-type=\"navigationLinkClick\"]//a[contains(@href,\"/services/gp-and-urgent-care/\")]"));
		return gpServicesAndUrgentCareList.size();
	}

	// GP Services & Urgent Care View All Link
	@FindBy(xpath = "//div[@class=\"TextButton_text-button__aoTVz undefined\"]//a[@href=\"/services/gp-and-urgent-care\"]")
	WebElement gpServicesAndUrgentCareViewAllLink;

	// is GP Services & Urgent Care View All Link display
	@SuppressWarnings("static-access")
	public boolean IsGpServicesAndUrgentCareViewAllLinkDisplay() {
		waitHelper.WaitForElementToBePresent(driver, gpServicesAndUrgentCareViewAllLink, 20);
		return gpServicesAndUrgentCareViewAllLink.isDisplayed();
	}

	// Accessing private healthcare list
	@FindBy(xpath = "//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul//a[contains(@href,\"/Services/GP-and-Urgent-Care/\")]")

	WebElement accessingPrivateHealthcareList;

	// is Accessing private healthcare list display
	@SuppressWarnings("static-access")
	public int IsAccessingPrivateHealthcareListDisplayed() {
		waitHelper.WaitForElementToBePresent(driver, accessingPrivateHealthcareList, 20);
		List<WebElement> accessingPrivateHealthcareList = driver.findElements(By.xpath("//div[@class=\"NavigationDesktop_span-2__kqokK\"]//ul//li//a[contains(@href,\"/services/treatments\")]"));

		return accessingPrivateHealthcareList.size();
	}

	// More about HCA UK Link
	
	@FindBy(xpath = "//div[@class=\"TextButton_text-button__aoTVz undefined\"]//a[contains(@href,\"/about-us\")]")

	WebElement moreAboutHCAlink;

	// is Accessing private healthcare More about HCA UK Link display
	@SuppressWarnings("static-access")
	public boolean IsmoreAboutHCAlinkDisplay() {
		waitHelper.WaitForElementToBeClickable(driver, moreAboutHCAlink, 20);
		return moreAboutHCAlink.isDisplayed();
	}

}
