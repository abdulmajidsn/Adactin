package pages;

import org.openqa.selenium.By;
import Utilities.Base;

public class Login extends Base {
	// Xpaths of Login Page
	static By username = By.xpath("//input[@id='username']");
	static By password = By.xpath("//input[@id='password']");
	static By loginbtn = By.xpath("//input[@id='login']");
	static By logoutbtn = By.xpath("//a[normalize-space()='Logout']");
	static By forgetlink = By.xpath("//a[normalize-space()='Forgot Password?']");
	static By forgetlinkEmIn = By.xpath("//input[@id='emailadd_recovery']");
	static By emailpassbut = By.xpath("//input[@id='Submit']");
	static By emailresetsbut = By.xpath("//input[@id='Submit']");
	static By fgbckloginscn = By.xpath("//a[normalize-space()='Go back to Login page']");
	static By welcometext=	By.xpath("//p[normalize-space()='Adactin Launches The Adactin Hotel App!']");
//-----------------------------------------

	public static void EnterloginUSn(String un) {
		driver.findElement(username).sendKeys(un);
		System.out.println("Unsername Enterd");
	}

	public static void EnterloginPWn(String pw) {
		driver.findElement(password).sendKeys(pw);
		System.out.println("Password Entered");
	}

	public static void ClickONloginBtn() {
		driver.findElement(loginbtn).click();
		System.out.println("Clicke on login");
	}

	public static void logout() {
		driver.findElement(logoutbtn).click();
		System.out.println("Logout success");
	}

	public static void ClickgetforgetpasswLink() {
		driver.findElement(forgetlink).click();
	}

	public static void EnterEmailforgetpw(String email) {
		driver.findElement(forgetlinkEmIn).sendKeys(email);
	}

	public static void Clickonforgetbtn() {
		driver.findElement(emailpassbut).click();
	}

	public static void resetforgetpwBtn() {
		driver.findElement(emailresetsbut).click();
	}

	public static void BackLoginScn() {
		driver.findElement(fgbckloginscn).click();
	}
public static void welcometext(String title) {
//	 WebElement welcomeText = driver.findElement(welcometext);
//     Assert.assertTrue(welcomeText.isDisplayed());
//     Assert.assertEquals(welcomeText.getText(), "Welcome to Adactin Group of Hotels");
	if  (driver.getTitle().equals(title)){
   	 System.out.println("Matched");
    }
    else {System.out.println("not matched");
    }

	
	
}

}

