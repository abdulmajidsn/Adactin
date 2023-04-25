package test_case_script;
import Utilities.Base;
import pages.Login;

public class Tc005_LoginIntoApplicationInvalidCre4 extends Base {
	public static void main(String[] args) throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Enter INvalid UserName 
		 * 4.Leave Password blenk
		 * 5.Click on Login button		*/
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("gyjhkhkmaj123");
		Login.EnterloginPWn("");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
		Base.closeApplication();
	}
}
