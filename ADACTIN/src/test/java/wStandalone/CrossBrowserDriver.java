package wStandalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDriver {
	WebDriver driver;
@Test
@Parameters("browser")
	 void openApplication(String browser) {

		switch (browser.toLowerCase()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			System.out.println("driver not selected");
		}
		driver.get("www.google.com");
	}
}