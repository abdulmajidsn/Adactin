package test_case_script;
import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
@Test
public class Tc006_LoginI  {
	 void Tc006_Login() throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Leave username blenk
		 * 4.Enter valid Password 
		 * 5.Click on Login button		*/
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("");
		Login.EnterloginPWn("Abdul@1995");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
