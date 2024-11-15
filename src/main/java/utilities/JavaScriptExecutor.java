package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
	private WebDriver driver;
	JavascriptExecutor js;
	JavascriptExecutor jScroll;

	public void javaScriptClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}
	
	public void JavascriptScroll(WebElement element){
		JavascriptExecutor jScroll = (JavascriptExecutor) driver;
		jScroll.executeScript("arguments[0].scrollIntoView();", driver);
	}
}