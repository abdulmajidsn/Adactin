package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Base;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel extends Base {
	static By location = By.xpath("//select[@id='location']");
	static By hotel = By.xpath("//select[@id='hotels']");
	static By roomtype = By.xpath("//select[@id='room_type']");
	static By numberofroom = By.xpath("//select[@id='room_nos']");
	static By checkindate = By.xpath("//input[@id='datepick_in']");
	static By checkoutdate = By.xpath("//input[@id='datepick_out']");
	static By adultsperRoom = By.xpath("//select[@id='adult_room']");
	static By KidPerRoom = By.xpath("//select[@id='child_room']");
	static By SrcBtn = By.xpath("//input[@id='Submit']");
	static By RstBtn = By.xpath("//input[@id='Reset']");
	static By showUn = By.xpath("//input[@id='username_show']");

	public static void fillhoteldetail(String loc,String hotl,String rmtyp, String numofrm,
			String month,String year,String adults,String Chieldren) {
		// Dropdown select on location
		WebElement lctn = driver.findElement(location);
		Select location = new Select(lctn);
		location.selectByVisibleText(loc);

		// Dropdown select on hotel
		WebElement htl = driver.findElement(hotel);
		Select hotel = new Select(htl);
		hotel.selectByVisibleText(hotl);
		// Dropdown select on RoomType
		WebElement rmtype = driver.findElement(roomtype);
		Select roomtype = new Select(rmtype);
		roomtype.selectByVisibleText(rmtyp);
		// Dropdown select on NumberOf Room
		WebElement nRoom = driver.findElement(numberofroom);
		Select numberofroom = new Select(nRoom);
		numberofroom.selectByVisibleText(numofrm);

		// Driver select on NumberOf Room
		driver.findElement(checkindate).clear();
		driver.findElement(checkindate).sendKeys(month);
		driver.findElement(checkoutdate).clear();
		driver.findElement(checkoutdate).sendKeys(year);
		
		WebElement adult = driver.findElement(adultsperRoom);
		Select adultsperRoom = new Select(adult);
		adultsperRoom.selectByVisibleText(adults);
	
		WebElement chield = driver.findElement(KidPerRoom);
		Select KidPerRoom = new Select(chield);
		KidPerRoom.selectByVisibleText(Chieldren);
	
	}
	public static void usernameShow() {
		WebElement username=driver.findElement(showUn);
		//String actual=username.getText();
		System.out.println(username.getText());
		//String expected="Hello abdulmaj123!";
		//Assert.assertEquals(actual, expected);
		
	}
	public static void clickonSrcBtn() {
		driver.findElement(SrcBtn).click();
		
	}

	public static void clickonRStBtn() {
		driver.findElement(RstBtn).click();
	}

}
