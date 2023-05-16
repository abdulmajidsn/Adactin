package wStandalone;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Expliciatwait {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");
		// inisialize chrome
		WebDriver driver = new ChromeDriver(chromeOption);

		//mazimize browser
		driver.manage().window().maximize();

		//Give implicittly wait for all element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		 open url
//		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
//
//		// refresh browser
//		driver.navigate().refresh();
//		System.out.println("refresh");
//
//		// give Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("alert"))));
//
//		System.out.println("element loded");
//		//Strore clickeble in WebElement
//		WebElement img = driver.findElement(By.id("alert"));
//		img.click();
//
//		//Alert Aceepted
//		Alert a = wait.until(ExpectedConditions.alertIsPresent());
//		String text = a.getText();
//		a.accept();
//		System.out.println(text);

		 //enter into frame 
		 driver.get("https://jqueryui.com/selectmenu/");
		 ///WebElement iframe2 =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 driver.switchTo().frame(0); System.out.println("Enterd frame");
		 
		 WebElement testDropDown =driver.findElement(By.id("speed-button"));
		 WebElement ListBox = driver.findElement(By.xpath("//span[@id='speed-button']"));   
		 
		 System.out.println(testDropDown.getText());
		 System.out.println(ListBox.getText());
		 Select drp=new Select(ListBox);
		 drp.selectByVisibleText("Slow"); 
		 System.out.println("sjakjska");
		 
		
			Thread.sleep(5000);
			driver.close();
			System.out.println("Closed");
	}
}