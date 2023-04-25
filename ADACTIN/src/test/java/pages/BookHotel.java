package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
public class BookHotel extends Base{
 //Elements of page
	static By fname=By.name("first_name");
	static By lname=By.xpath("//input[@id='last_name']");
	static By billingAdd=By.xpath("//textarea[@id='address']");
	static By CCnum16=By.xpath("//input[@id='cc_num']");
	static By cctype=By.xpath("//select[@id='cc_type']");
	static By expm=By.xpath("//select[@id='cc_exp_month']");
	static By expy=By.xpath("//select[@id='cc_exp_year']");
	static By cvvn4=By.xpath("//input[@id='cc_cvv']");
	static By booknowBtn=By.xpath("//input[@id='book_now']");
	
 public static void filldetail(String fn,String ln,String add,String ccn16,String cct,
		 int exm,String exy,String cvn4) {
	 driver.findElement(fname).sendKeys(fn);
	 driver.findElement(lname).sendKeys(ln);
	 driver.findElement(billingAdd).sendKeys(add);
	 driver.findElement(CCnum16).sendKeys(ccn16);
	 
	 WebElement Cctype=driver.findElement(cctype);
	 Select cctype=new Select(Cctype);
	 cctype.selectByValue(cct);
	 
	 WebElement Expmon=driver.findElement(expm);
	 Select expm=new Select(Expmon);
	 expm.selectByIndex(exm);
	 
	 WebElement ExpY=driver.findElement(expy);
	 Select expy=new Select(ExpY);
	 expy.selectByValue(exy);
	 
	 driver.findElement(cvvn4).sendKeys(cvn4);
 }
	public static void bookNow() {
		driver.findElement(booknowBtn).click();
	}
	
}
