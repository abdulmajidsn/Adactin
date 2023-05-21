package test_case_script;

import Utilities.Base;
import pages.Login;
import pages.SearchHotel;

public class TC032_SearchHotel_blenk_credentials extends Base {

	public void TC032_SearchHotel_blenk_credentials() throws Exception {
		try {
			Base.enterAdactinLink();
			Login.EnterloginUSn("abdulmaj123");
			Login.EnterloginPWn("Abdul@1995");
			Login.ClickONloginBtn();
		} catch (Exception e) {

			SearchHotel.fillhoteldetail("", "", "", "", "", "", "", "");
			Base.staticWaitThread(2000);
			SearchHotel.clickonSrcBtn();
			Base.staticWaitThread(2000);
//SelectHotel.radioSelect();
		}

		System.out.println("Hotel page should not displayed on screen");


	}

}
