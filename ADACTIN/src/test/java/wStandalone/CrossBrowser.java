package wStandalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CrossBrowser {
	WebDriver driver;
@BeforeTest
	public void openApplication() {
	
		driver = new FirefoxDriver();
	}

	@Test
	public void enterAdactinLink(String url) {
		driver.get("https://adactinhotelapp.com/");
		System.out.println("URL Entered");
	}
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
		System.out.println("Browser Closed");

	}
}