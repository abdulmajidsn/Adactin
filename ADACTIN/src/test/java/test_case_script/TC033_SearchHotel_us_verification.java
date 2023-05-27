package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
import pages.SearchHotel;

@Test
public class TC033_SearchHotel_us_verification {

	public void TC033_SearchHotel_username() throws Exception {
		Base.openApplication();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();

		SearchHotel.usernameShow();
		Base.closeApplication();
	}

}
