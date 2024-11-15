package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class ForHealthcareProfessionalsPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public ForHealthcareProfessionalsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}
	
	@FindBy(xpath = "//div[contains(@class,\\\"Button_card__77pwZ\\\")]")
	WebElement findOutMoreCount;
	
		@SuppressWarnings("static-access")
		public int getFindOutMoreCount() throws InterruptedException {
			
			waitHelper.WaitForElementToBePresent(driver, findOutMoreCount, 10);

		List<WebElement> findOutMoreCount = driver.findElements(By.xpath("//div[contains(@class,\"Button_card__77pwZ\")]"));
		
		System.out.println(findOutMoreCount.size());
		return findOutMoreCount.size();
		}
		
		// contact us tab
		@FindBy(xpath = "//span[text()=\"Find out more about our events\"]")
		WebElement findOutMoreAboutOurEvents;

		@SuppressWarnings("static-access")
		public boolean IsFindOutMoreAboutOurEventsDisplayed() {
			waitHelper.WaitForElementToBeClickable(driver, findOutMoreAboutOurEvents, 20);
			return findOutMoreAboutOurEvents.isDisplayed();
		}
}
