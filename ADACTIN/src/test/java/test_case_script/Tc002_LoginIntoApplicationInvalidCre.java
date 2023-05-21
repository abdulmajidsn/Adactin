package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

@Test
public class Tc002_LoginIntoApplicationInvalidCre extends Base {
	public void Tc002_LoginIntoApplicationInvalidCre() throws Exception {
		/*
		 * TestSteps- 1.Launch browser 2.Enter URL 3.Enter Invalid UserName 4.Enter
		 * Valid Password 5.Click on Login button
		 */
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("anjskddjl");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
