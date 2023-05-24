package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

public class TC002_Login2 {
	@Test
	void tc001() throws Exception {
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("anjskddjl");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
