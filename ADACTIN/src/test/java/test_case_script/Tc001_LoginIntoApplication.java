package test_case_script;
import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
@Test
public class Tc001_LoginIntoApplication  {
	 void tc001_LoginIntoApplication() throws Exception {
		Base.enterAdactinLink();
		Base.staticWaitThread(2000);
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		Base.staticWaitThread(5000);
		Login.logout();
		
	}	
}