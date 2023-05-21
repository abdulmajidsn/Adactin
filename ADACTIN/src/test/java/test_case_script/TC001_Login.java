package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

public class TC001_Login {
	@Test
	void tc001() throws Exception {
		Base.enterAdactinLink();
		Base.staticWaitThread(2000);
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		Base.staticWaitThread(5000);
		Login.logout();
		 
	}
		
	}

