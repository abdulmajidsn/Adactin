package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
import pages.SearchHotel;


public class TC031_SearchHotel_Ad extends Base {
	@Test
	public void TC031_SearchHotel() throws Exception {
		Base.openApplication();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
	
		SearchHotel.fillhoteldetail("Brisbane", "Hotel Hervey", "Double", "5 - Five", "24/04/2023", "28/04/2023",
				"2 - Two", "2 - Two");
		Base.staticWaitThread(2000);
		SearchHotel.clickonSrcBtn();
		Base.staticWaitThread(2000);
//SelectHotel.radioSelect();

		System.out.println("Hotel page is displayed on screen");

		Base.closeApplication();
	}

}
