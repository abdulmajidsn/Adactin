package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

@Test
public class Tc003_LoginIntoApplicationInvalidCre2 extends Base {
	public void LoginIntoApplicationInvalidCre2() throws Exception {
		/*
		 * TestSteps- 1.Launch browser 2.Enter URL 3.Enter valid UserName 4.Enter
		 * InValid Password 5.Click on Login button
		 */

		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("Abdul@skjhas");
		Login.ClickONloginBtn();
		
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
