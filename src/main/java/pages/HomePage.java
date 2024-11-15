package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class HomePage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	
	@FindBy(xpath = "//button[text()=\"Accept All Cookies\"]")
	private WebElement acceptAllCookies;

	public void clickAcceptAllCookies() {
		js.javaScriptClick(driver, acceptAllCookies);
	}

	// for Business link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='For business']")

	WebElement forBusinessLink;

	public void clickForBusinessLink() {
		WaitHelper.WaitForElementToBeClickable(driver, forBusinessLink, 30);
		js.javaScriptClick(driver, forBusinessLink);
	}

	// is for business link displyaed
	public boolean IsForBusinessLinkDisplay() {
		WaitHelper.WaitForElementToBeVisible(driver, forBusinessLink, 20);

		return forBusinessLink.isDisplayed();
	}

	// for Healthcare Professionals link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='For healthcare professionals']")

	WebElement forHealthcareProfessionalsLink;

	public void clickForHealthcareProfessionalsLink() {
		WaitHelper.WaitForElementToBeClickable(driver, forHealthcareProfessionalsLink, 20);
		js.javaScriptClick(driver, forHealthcareProfessionalsLink);
	}

	// is for Healthcare Professionals Link Displayed
	public boolean IsForHealthcareProfessionalsLinkDisplay() {
		return forHealthcareProfessionalsLink.isDisplayed();
	}

	// pay my bill link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='Pay my bill']")

	WebElement payMyBillLink;

	public void clickPayMyBillLink() {
		WaitHelper.WaitForElementToBeClickable(driver, payMyBillLink, 30);
		js.javaScriptClick(driver, payMyBillLink);
	}

	// Is pay my bill link displayed

	public boolean IsPayMyBillDisplay() {

		return payMyBillLink.isDisplayed();
	}

	// is secure online payments displayed
	@FindBy(xpath = "//h1[normalize-space()='Secure Online Payments']")

	WebElement secureOnlinePayments;

	public boolean IsSecureOnlinePaymentsTextDisplay() {
		return secureOnlinePayments.isDisplayed();
	}

	// about hca uk link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-right__44FNf')]//a[normalize-space()='About HCA UK']")

	WebElement aboutHcaUKLink;

	public void clickAboutHcaUKLink() {
		WaitHelper.WaitForElementToBeClickable(driver, aboutHcaUKLink, 20);
		js.javaScriptClick(driver, aboutHcaUKLink);
	}

	// is about hca uk link displayed
	public boolean IsAboutHcaUKLinkDisplay() {
		return aboutHcaUKLink.isDisplayed();
	}

	// careers link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-right__44FNf')]//a[normalize-space()='Careers']")

	WebElement careersLink;

	public void clickCareersLink() {
		WaitHelper.WaitForElementToBeClickable(driver, careersLink, 20);
		js.javaScriptClick(driver, careersLink);
	}

	// is careers link displayed
	public boolean IsCareersLinkDisplay() {
		return careersLink.isDisplayed();

	}

	// departments link
	@FindBy(xpath = "//button[text()=\"Departments\"]")

	WebElement departmentLink;

	public void clickDepartmentLink() {
		WaitHelper.WaitForElementToBeClickable(driver, departmentLink, 20);
		js.javaScriptClick(driver, departmentLink);
	}

	public boolean IsDepartmentsLinkDisplay() {
		return departmentLink.isDisplayed();
	}

	// tests & scans link
	@FindBy(xpath = "//button[text()=\"Tests & scans\"]")

	WebElement testsAndScansLink;

	public void clickTestsAndScansLink() {
		WaitHelper.WaitForElementToBeClickable(driver, testsAndScansLink, 20);
		js.javaScriptClick(driver, testsAndScansLink);
	}

	public boolean IsTestsAndScansLinkDisplay() {
		return testsAndScansLink.isDisplayed();
	}

	// find a consultant link
	@FindBy(xpath = "//a[text()=\"Find a consultant\"]")

	WebElement findAconsultantLink;

	public void clickfindAconsultantLink() {
		WaitHelper.WaitForElementToBeClickable(driver, findAconsultantLink, 20);
		js.javaScriptClick(driver, findAconsultantLink);
	}

	public boolean IsFindAconsultantLinkDisplay() {
		return findAconsultantLink.isDisplayed();
	}

	// find a location link
	@FindBy(xpath = "//button[text()=\"Find a location\"]")

	WebElement findAlocationLink;

	public void clickfindAlocationLink() {
		WaitHelper.WaitForElementToBeClickable(driver, findAlocationLink, 20);
		js.javaScriptClick(driver, findAlocationLink);
	}

	public boolean IsFindAlocationLinkDisplay() {
		return findAlocationLink.isDisplayed();
	}

	// patient and visitor information link
	@FindBy(xpath = "//button[text()=\"Patient & Visitor Information\"]")

	WebElement patientAndVisitorInfoLink;

	public void clickPatientAndVisitorInfoLink() {
		WaitHelper.WaitForElementToBeClickable(driver, patientAndVisitorInfoLink, 20);
		js.javaScriptClick(driver, patientAndVisitorInfoLink);
	}

	public boolean IsPatientAndVisitorInfoLinkDisplay() {
		return patientAndVisitorInfoLink.isDisplayed();
	}

	// search icon
	@FindBy(xpath = "//li[contains(@class,'NavigationDesktop_control__uf0gK')]//div[contains(@class,'TextLink_body-medium-large__Bedet')]//button")

	WebElement searchIcon;

	public void clickSearchIcon() {
		WaitHelper.WaitForElementToBeClickable(driver, searchIcon, 20);
		js.javaScriptClick(driver, searchIcon);
	}

	public boolean IsSearchIconDisplay() {
		return searchIcon.isDisplayed();
	}

	// search field
	@FindBy(xpath = "//button[normalize-space()='How can we help you?']")

	WebElement homePageSearchField;

	public void sendKeyToSearchField() {
		WaitHelper.WaitForElementToBeClickable(driver, homePageSearchField, 20);
		js.javaScriptClick(driver, homePageSearchField);
	}

	public boolean IsHomePageSearchFieldDisplay() {
		return homePageSearchField.isDisplayed();
	}

	// book an appointment tab
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_full__5nt_j  \"]//button")

	WebElement bookAnAppointmentTab;

	public void clickBookAnAppointmentTab() {
		WaitHelper.WaitForElementToBeClickable(driver, bookAnAppointmentTab, 20);
		js.javaScriptClick(driver, bookAnAppointmentTab);
	}

	public boolean IsBookAnAppointmentTabDisplay() {
		return bookAnAppointmentTab.isDisplayed();
	}

	// call us today tab
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_outline__GaSB_  \"]//div[text()=\"Call us  today \"]")

	WebElement callUsTodayTab;

	public void clickCallUsTodayTab() {
		WaitHelper.WaitForElementToBeClickable(driver, callUsTodayTab, 20);
		js.javaScriptClick(driver, callUsTodayTab);
	}

	public boolean IsCallUsTodayTabDisplay() {
		return callUsTodayTab.isDisplayed();
	}

	// home page logo
	@FindBy(xpath = "//a[@class=\"NavigationDesktop_logo__DcWBX\"]")

	WebElement homePageLogo;

	public boolean homePageLogo() {

		return homePageLogo.isDisplayed();

	}

	// download app tab
	@FindBy(xpath = "//span[normalize-space()='App Download']")

	WebElement downloadAppTab;

	public void clickDownloadAppTabTab() {
		WaitHelper.WaitForElementToBeClickable(driver, downloadAppTab, 20);
		js.javaScriptClick(driver, downloadAppTab);
	}

	public boolean IsDownloadAppTabDisplay() {
		return downloadAppTab.isDisplayed();
	}

	// get a scecond app tab
	@FindBy(xpath = "//span[normalize-space()='Get a second opinion']")

	WebElement getAsecondOpinionTab;

	public void clickGetAsecondOpinionTab() {
		WaitHelper.WaitForElementToBeClickable(driver, getAsecondOpinionTab, 20);
		js.javaScriptClick(driver, getAsecondOpinionTab);
	}

	public boolean IsGetAsecondOpinionTabDisplay() {
		return getAsecondOpinionTab.isDisplayed();
	}

	// find a doctor tab
	@FindBy(xpath = "//span[normalize-space()='Find a doctor']")

	WebElement findAdoctorTab;

	public void clickFindAdoctorTab() {
		WaitHelper.WaitForElementToBeClickable(driver, findAdoctorTab, 20);
		js.javaScriptClick(driver, findAdoctorTab);
	}

	public boolean IsFindAdoctorTabDisplay() {
		return findAdoctorTab.isDisplayed();
	}

	// pay my bill tab
	@FindBy(xpath = "//span[normalize-space()='Pay my bill']")

	WebElement payMyBillTab;

	public void clickpayMyBillTab() {
		WaitHelper.WaitForElementToBeClickable(driver, payMyBillTab, 20);
		js.javaScriptClick(driver, payMyBillTab);
	}

	public boolean IsPayMyBillTabDisplay() {
		return payMyBillTab.isDisplayed();
	}

	// footer list
	@FindBy(xpath = "//div[@class=\"Footer_columns__p_GHs\"]//ul[@class=\"Footer_links__Vzvxm\"]//a")

	WebElement footerList;

	public int footerList() {

		WaitHelper.WaitForElementToBeClickable(driver, footerList, 10);
		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class=\"Footer_columns__p_GHs\"]//ul[@class=\"Footer_links__Vzvxm\"]//a"));
			
	for(WebElement element : footerList){
		System.out.println(element.getText());
	}
//		System.out.println(footerList.size());
		


		return footerList.size();
		//

		// List<String> exp = Arrays.asList("Our HCA Story", "Our quality
		// commitment", "Management team",
		// "Our Mission Statement", "How we work with doctors", "Environmental
		// sustainability", "Contact HCA UK",
		// "Blogs and articles", "News & Press", "Patient stories", "Careers",
		// "Cancer care", "Cardiac care",
		// "Neurosciences", "Gynaecology & Obstetrics", "Orthopaedics");
		//
		// for (int i = 0; i < footerList.size(); i++) {
		// if (footerList.get(i).getText().equalsIgnoreCase(exp.get(i)))
		// System.out.println("Matched");
		// else
		// System.out.println("Didn't match");

	}

	// facebook icon
	@FindBy(xpath = "//span[text()=\"Facebook\"]")

	WebElement facebook;

	public boolean IsFacebookDisplay() {
		return facebook.isDisplayed();
	}

	// instagram icon
	@FindBy(xpath = "//span[text()=\"Instagram\"]")

	WebElement instagram;

	public boolean IsInstagramDisplay() {
		return instagram.isDisplayed();
	}

	// linkedin icon
	@FindBy(xpath = "//span[text()=\"Linkedin\"]")

	WebElement linkedin;

	public boolean IsLinkedinDisplay() {
		return linkedin.isDisplayed();
	}

	// footer bottom
	@FindBy(xpath = "//ul[@class=\"Footer_legals__A1xRj\"]/li//a")

	WebElement footerBottom;

	public boolean IsFooterBottomDisplay() {
		return footerBottom.isDisplayed();
	}

	// CQC
	@FindBy(xpath = "//div[@class=\"Footer_reviews__D1rdQ\"]//div[@class=\"CQCBlock_link__dSzJG\"]")

	WebElement careQualityCommissionIcon;

	public boolean IsCareQualityCommissionIconDisplay() {
		return careQualityCommissionIcon.isDisplayed();
	}

	// copy right
	@FindBy(xpath = "class=\"Text_body-small__qH5cg\"")

	WebElement hcaCopyRight;

	public boolean IshcaCopyRightDisplay() {
		return hcaCopyRight.isDisplayed();
	}

	// social media link
	@FindBy(xpath = "//ul[@class=\"Footer_socials__ffAsr\"]/li")

	WebElement socialMedia;

	public int socialMediaList() {

		List<WebElement> socialMediaList = driver.findElements(By.xpath("//ul[@class=\"Footer_socials__ffAsr\"]/li"));

		return socialMediaList.size();
	}
	
	// get get title
		public String getPageTitle() throws InterruptedException {
			Thread.sleep(500);
			return driver.getTitle();
		}
		
		@FindBy(xpath = "//span[text()=\"A different kind of healthcare company\"]")

		WebElement healthcareCompany;
		
		public void clickHealthcareCompany(){
			js.javaScriptClick(driver, healthcareCompany);
		}
		

		
		
		// book an appointment tab
		@FindBy(xpath = "//strong[normalize-space()='appointment']")

		WebElement bookAnApptTab;

		public boolean IsbookAnApptTabDisplay() {
			js.JavascriptScroll(bookAnApptTab);
			return bookAnApptTab.isDisplayed();
		}

}
