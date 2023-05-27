package Utilities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	
	public static void openApplication() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(chromeOption);
		System.out.println("Browser Opened");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Maximized and gave implicit wait");
		Reporter.log("Browser open with implicite wait");
		Log.info("Open browser");
	}
	
	@SuppressWarnings("deprecation")
	public static void maximixeAndWaitImp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Maximized and gave implicit wait");
		Log.info("Enter Implicit Wait");
	}

	public static void staticWaitThread(int ms) throws Exception {
		Thread.sleep(ms);
		Reporter.log("static wait for");
		Log.info("Thread wait static wait ");
	}

	public static void enterAdactinLink() {
		ReadPropertiesFile config=new ReadPropertiesFile();
		driver.get(config.getUrl());
		System.out.println("URL Entered");
		Reporter.log("enter url");
		Log.info("Enter URL");
	}
	
	public static void closeApplication() {
		driver.quit();
		System.out.println("Browser Closed");
		Reporter.log("browser close");
		Log.info("Close browser");
	}

}
