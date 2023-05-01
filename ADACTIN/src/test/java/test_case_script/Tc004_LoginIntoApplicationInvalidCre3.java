package test_case_script;
import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
@Test
public class Tc004_LoginIntoApplicationInvalidCre3 extends Base {
	public  void Tc004_LoginIntoApplicationInvalidCre3() throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Enter INvalid UserName 
		 * 4.Enter InValid Password 
		 * 5.Click on Login button		*/
		
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmdsdsdaj123");
		Login.EnterloginPWn("Abdul@skjhsdasdaas");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
		Base.closeApplication();
	}
}
