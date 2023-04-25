package test_case_script;

import Utilities.Base;
import pages.Login;

public class Tc008_CheckWelcomeTest extends Base {
	public static void main(String[] args) throws Exception {
		/* TestSteps- 
		 * 1.Launch browser 
		 * 2.Enter URL 
		 * 3.Matched Title   */
		 
		Base.openApplication();
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.welcometext("Welcome to Adactin Group of Hotels");
		
		Base.staticWaitThread(5000);
		Base.closeApplication();
	}
}
