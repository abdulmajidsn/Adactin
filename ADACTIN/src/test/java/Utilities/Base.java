package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void openApplication() {
		driver = new FirefoxDriver();
		System.out.println("Browser Opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Maximized and gave implicit wait");
	}
	
	@SuppressWarnings("deprecation")
	public static void maximixeAndWaitImp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Maximized and gave implicit wait");
	}

	public static void staticWaitThread(int ms) throws Exception {
		Thread.sleep(ms);
	}

	public static void enterAdactinLink() {
		ReadPropertiesFile config=new ReadPropertiesFile();
		driver.get(config.getUrl());
		System.out.println("URL Entered");
	}

	public static void closeApplication() {
		driver.quit();
		System.out.println("Browser Closed");
	}

}
