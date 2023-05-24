package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;


public class Tc004_Login  {
	@Test
	void Login() throws Exception {
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@skjhas");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
