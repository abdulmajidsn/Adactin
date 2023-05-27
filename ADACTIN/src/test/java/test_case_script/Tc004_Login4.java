package test_case_script;
import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

public class Tc004_Login4  {
	@Test	
	 void Login4() throws Exception {
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("abdulmdsdsdaj123");
		Login.EnterloginPWn("Abdul@skjhsdasdaas");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
		Base.closeApplication();}
}
