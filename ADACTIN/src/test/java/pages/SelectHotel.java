package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Base;

public class SelectHotel extends Base {

	static By radiobtm = By.name("radiobutton_0");
	static By continueBt = By.name("continue");

	public static void radioSelect() {
		WebElement rdbtn = driver.findElement(radiobtm);
		rdbtn.click();
		driver.findElement(continueBt).click();
	}

}
