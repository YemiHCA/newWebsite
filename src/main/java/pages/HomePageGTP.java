package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class HomePageGTP {
	

    WebDriver driver;
	WaitHelper waitHelper = new WaitHelper(driver);

	    // Constructor
	    public HomePageGTP(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
			waitHelper = new WaitHelper(driver);

	    }

	    // WebElements
	    @FindBy(xpath = "//a[@class=\"NavigationDesktop_logo__DcWBX\"]")
	    WebElement headerLogo;

	    @FindBy(xpath = "//a[text()='Find a Consultant']")
	    WebElement findConsultantLink;
	    
	    @FindBy(xpath = "//a[text()='For business']")
	    WebElement forBusinessLink;
	    
	    @FindBy(xpath = "//a[text()='For healthcare professionals']")
	    WebElement forHealthcareProfessionalsLink;
	    
	    @FindBy(xpath = "//a[text()='Pay my bill']")
	    WebElement payMyBillLink;
	    
	    @FindBy(xpath = "//a[text()='About HCA UK']")
	    WebElement aboutHCAUKLink;
	    
	    @FindBy(xpath = "//a[text()='Careers']")
	    WebElement careersLink;
	    
	    @FindBy(xpath = "//button[text()=\"Departments\"]")
	    WebElement departmentsLink;
	    
	    @FindBy(xpath = "//button[text()='Tests & scans']")
	    WebElement testsAndScansLink;
	    
	    @FindBy(xpath = "//button[text()='Find a location']")
	    WebElement findAlocationLink;
	    
	    @FindBy(xpath = "//button[text()='Patient & Visitor Information']")
	    WebElement patientAndVisitorInformationLink;
	    
	   

	    @FindBy(xpath = "//a[text()='Our Hospitals']")
	    WebElement ourHospitalsLink;

	    @FindBy(xpath = "//a[text()='Contact Us']")
	    WebElement contactUsLink;

	    @FindBy(xpath = "//button[text()='How can we help you?']")
	    WebElement searchBox;

	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement searchButton;

	    // Actions
	    public boolean isHeaderLogoDisplayed() {
	        return headerLogo.isDisplayed();
	    }
	    
	    public boolean isFindConsultantLinkDisplayed() {
	        return findConsultantLink.isDisplayed();
	    }
	    
	    public boolean isForBusinessLinkDisplayed() {
	        return forBusinessLink.isDisplayed();
	    }
	    
	    public boolean isForHealthcareProfessionalsLinkDisplayed() {
	        return forHealthcareProfessionalsLink.isDisplayed();
	    }
	    
	    public boolean isPayMyBillLinkDisplayed() {
	        return payMyBillLink.isDisplayed();
	    }
	    
	    public boolean isAboutHCAUKLinkDisplayed() {
	        return aboutHCAUKLink.isDisplayed();
	    }
	    
	    public boolean isCareersLinkDisplayed() {
	        return careersLink.isDisplayed();
	    }
	    
	    
	    public boolean isDepartmentsLinkDisplayed() {
	        return departmentsLink.isDisplayed();
	    }
	    
	    public boolean isFindAlocationLinkDisplayed() {
	        return findAlocationLink.isDisplayed();
	    }
	    
	    public boolean isTestsAndScansLinkDisplayed() {
	        return testsAndScansLink.isDisplayed();
	    }
	    
	    public boolean isPatientAndVisitorInformationLinkDisplayed() {
	        return patientAndVisitorInformationLink.isDisplayed();
	    }
	    
	    public boolean isSearchBoxDisplayed() {
	        return searchBox.isDisplayed();
	    }

	    public void clickFindConsultant() {
	        findConsultantLink.click();
	    }
	    
	    public void clickForBusinessLink() {
	    	forBusinessLink.click();
	    }
	    
	    public void clickForHealthcareProfessionalsLink() {
	    	forHealthcareProfessionalsLink.click();
	    }
	    
	    public void clickPayMyBillLink() {
	    	payMyBillLink.click();
	    }
	    
	    public void clickAboutHCAUKLink() {
	    	aboutHCAUKLink.click();
	    }
	    
	    public void clickCareersLink() {
	    	careersLink.click();
	    }
	    
	    public void clickDepartmentsLink() {
	    	departmentsLink.click();
	    }
	    
	    public void clickTestsAndScansLink() {
	    	testsAndScansLink.click();
	    }
	    
	    public void clickFindAlocationLink() {
	    	findAlocationLink.click();
	    }
	    
	    public void clickPatientAndVisitorInformationLink() {
	    	patientAndVisitorInformationLink.click();
	    }
	    
	  
	    
	    

	    public void clickOurHospitals() {
	        ourHospitalsLink.click();
	    }

	    public void clickContactUs() {
	        contactUsLink.click();
	    }

	    public void enterSearchText(String searchText) {
	        searchBox.sendKeys(searchText);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }
	}



