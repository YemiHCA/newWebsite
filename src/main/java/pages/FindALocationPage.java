package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class FindALocationPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public FindALocationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// our location count
	@FindBy(xpath = "//*[@id=\"navigation-tab-3\"]/div[1]/ul//a")

	WebElement ourLocationCount;

	public int ourLocationCount() throws InterruptedException {
		List<WebElement> ourLocationCount = driver.findElements(By.xpath("//*[@id=\"navigation-tab-3\"]/div[1]/ul//a"));
		
		
		return ourLocationCount.size();
	}

	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_full__5nt_j  \"]//a[@href=\"/locations/find-a-hospital-or-clinic\"]")

	WebElement viewAllLocationsTab;

	public boolean isViewAllLocationsTab() {
		return viewAllLocationsTab.isDisplayed();
	}
}
