package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;


public class Tc007_Login {
	@Test
	 void Login() throws Exception {
		/*
		 * TestSteps- 1.Launch browser 2.Enter URL 3.Leave username blenk 4.Leave
		 * password blenk 5.Click on Login button
		 */
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("");
		Login.EnterloginPWn("");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
		Base.closeApplication();}
}
