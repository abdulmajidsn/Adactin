package test_case_script;

import Utilities.Base;
import pages.Login;

public class Tc001_LoginIntoApplication extends Base {
	public static void main(String[] args) throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Enter valid UserName 
		 * 4.Enter Valid Password 
		 * 5.Click on Login button		*/
		Base.openApplication();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		Base.staticWaitThread(5000);
		Login.logout();
		Base.closeApplication();
	}
}
