package test_case_script;
import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;
@Test
public class Tc005_LoginIntoApplicationInvalidCre4 extends Base {
	public  void Tc005_LoginIntoApplicationInvalidCre4() throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Enter INvalid UserName 
		 * 4.Leave Password blenk
		 * 5.Click on Login button		*/
		
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmaj123");
		Login.EnterloginPWn("");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
	}
}
