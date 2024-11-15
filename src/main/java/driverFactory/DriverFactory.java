package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\yolukoya\\Downloads\\chrome-win32 (1)\\chrome-win32\\chrome.exe");
//			ChromeOptions options = new ChromeOptions();
			System.setProperty("javax.net.ssl.trustStore", "NUL");
			System.setProperty("javax.net.ssl.trustStoreType", "Windows-ROOT");
			
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\yolukoya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//			options.setBinary("C:\\Users\\yolukoya\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");

			ChromeOptions options = new ChromeOptions();
			options.setBrowserVersion("127");

			options.addArguments("--remote-allow-origins=*");


			tlDriver.set(new ChromeDriver(options));

		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			
			tlDriver.set(new FirefoxDriver());
		}

		else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}
