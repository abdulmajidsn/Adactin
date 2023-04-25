package pages;
import org.openqa.selenium.By;
import Utilities.Base;

public class RegistationPage extends Base{
		static By rgtlink=By.xpath("//a[normalize-space()='New User Register Here']");
		static By username=By.xpath("//input[@id='username']");
		static By password=By.xpath("//input[@id='password']");
		static By cnpassword=By.xpath("//input[@id='re_password']");
		static By fullname=By.xpath("//input[@id='full_name']");
		static By emailadd=By.xpath("//input[@id='email_add']");
		static By captcha=By.xpath("//input[@id='captcha-form']");
		static By checkbox=By.xpath("//input[@id='tnc_box']");
		static By Rgbutun=By.xpath("//input[@id='Submit']");
		static By resetbut=By.xpath("//input[@id='Reset']");
		static By termcon=By.xpath("//a[normalize-space()='Terms & Conditions']");
		static By backbtton=By.xpath("//a[normalize-space()='Go back to Login page']");
		
		
		
		public static void registationlink() {
		driver.findElement(rgtlink).click();
	}
		public static void regEnterDetail(String un,String pw,String fn,String em) throws Exception {
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(pw);
			driver.findElement(cnpassword).sendKeys(pw);
			driver.findElement(fullname).sendKeys(fn);
			driver.findElement(emailadd).sendKeys(em);
			driver.findElement(captcha).click();
			Thread.sleep(15000);
			driver.findElement(checkbox).click();
			Thread.sleep(5000);
			driver.findElement(Rgbutun).click();
		}
}
