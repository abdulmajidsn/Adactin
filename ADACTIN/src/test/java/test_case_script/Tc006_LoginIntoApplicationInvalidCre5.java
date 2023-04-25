package test_case_script;
import Utilities.Base;
import pages.Login;

public class Tc006_LoginIntoApplicationInvalidCre5 extends Base {
	public static void main(String[] args) throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Leave username blenk
		 * 4.Enter valid Password 
		 * 5.Click on Login button		*/
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.EnterloginUSn("");
		Login.EnterloginPWn("Abdulmajid@1995");
		Login.ClickONloginBtn();
		System.out.println("Error massege should be showed");
		Base.staticWaitThread(5000);
		Base.closeApplication();
	}
}
