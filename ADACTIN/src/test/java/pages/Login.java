package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Utilities.Base;
import Utilities.Log;

public class Login extends Base {

/*
	@FindBy(xpath ="//input[@id='username']")
	WebElement username;

	@FindBy(xpath ="//input[@id='password']")
	WebElement password;

	@FindBy(xpath ="//input[@id='login']")
	WebElement loginbtn;

	@FindBy(xpath ="//a[normalize-space()='Logout']")
	WebElement logoutbtn;

	@FindBy(xpath ="//a[normalize-space()='Forgot Password?']")
	WebElement forgetlink;
	@FindBy(xpath ="//input[@id='emailadd_recovery']")
	WebElement forgetlinkEmIn;

	@FindBy(xpath ="//input[@id='Submit']")
	WebElement emailpassbut;

	@FindBy(xpath ="//input[@id='Submit']")
	WebElement emailresetsbut;

	@FindBy(xpath ="//a[normalize-space()='Go back to Login page']")
	WebElement fgbckloginscn;

	@FindBy(xpath ="//p[normalize-space()='Adactin Launches The\r\n"
			+ "	Adactin Hotel App!']")
	WebElement welcometext;			*/

	 static By username = By.xpath("//input[@id='username']");
	 static By password = By.xpath("//input[@id='password']");
	 static By loginbtn = By.xpath("//input[@id='login']");
	 static By logoutbtn = By.xpath("//a[normalize-space()='Logout']");
	 static By forgetlink = By.xpath("//a[normalize-space()='Forgot Password?']");
	 static By forgetlinkEmIn = By.xpath("//input[@id='emailadd_recovery']");
	 static By emailpassbut = By.xpath("//input[@id='Submit']");
	 static By emailresetsbut = By.xpath("//input[@id='Submit']");
	 static By fgbckloginscn = By.xpath("//a[normalize-space()='Go back to Login page']");
	static By welcometext = By.xpath("//p[normalize-space()='Adactin Launches The Adactin Hotel App!']");
//-----------------------------------------

	public static void EnterloginUSn(String un) {
		driver.findElement(username).sendKeys(un);
		System.out.println("Unsername Enterd");
		Reporter.log("Unsername Enterd");
		Log.info("Enter Username");
	}

	public static void EnterloginPWn(String pw) {
		driver.findElement(password).sendKeys(pw);
		System.out.println("Password Entered");
		Reporter.log("password enterd");
		Log.info("Enter password");
	}

	public static void ClickONloginBtn() {
		driver.findElement(loginbtn).click();
		System.out.println("Clicke on login");
		Reporter.log("click on login");
		Log.info("click on Login");
	}

	public static void logout() {
		driver.findElement(logoutbtn).click();
		System.out.println("Logout success");
		Reporter.log("click on logout");
		Log.info("Click on logout");
	}

	public static void ClickgetforgetpasswLink() {
		driver.findElement(forgetlink).click();
		Reporter.log("click on forgot link");
		Log.info("Click on logout");
	}

	public static void EnterEmailforgetpw(String email) {
		driver.findElement(forgetlinkEmIn).sendKeys(email);
		Reporter.log("enter forgot email ");
		Log.info("Enter Forget Email");
	}

	public static void Clickonforgetbtn() {
		driver.findElement(emailpassbut).click();
		Reporter.log("click on forgot button");
		Log.info("Click On Forget Button");
	}

	public static void resetforgetpwBtn() {
		driver.findElement(emailresetsbut).click();
		Reporter.log("Email reset button click");
		Log.info("Reset Button Clicked");
	}

	public static void BackLoginScn() {
		driver.findElement(fgbckloginscn).click();
		Reporter.log("back to login screen");
		Log.info("Back to login Screen");
	}

	public static void welcometext(String expected) {
		String actualwelcomeText = driver.getTitle();
		Assert.assertEquals(actualwelcomeText, expected);
//    Assert.assertEquals(welcomeText.getText(), "Welcome to Adactin Group of Hotels");

		if (driver.getTitle().equals(expected)) {
			System.out.println("Matched");
		} else {
			System.out.println("not matched");
		}
		Reporter.log("Welcome Title matched");
		Log.info("Titile matched ");
	}

}
