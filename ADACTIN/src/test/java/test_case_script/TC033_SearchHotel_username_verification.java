package test_case_script;
import Utilities.Base;
import pages.Login;
import pages.SearchHotel;
public class TC033_SearchHotel_username_verification extends Base {

	public static void main(String[] args) throws Exception {
Base.openApplication();
Base.enterAdactinLink();
Login.EnterloginUSn("abdulmaj123");
Login.EnterloginPWn("Abdul@1995");
Login.ClickONloginBtn();

SearchHotel.usernameShow();
Base.closeApplication();





		
		
		
		
	}

}
