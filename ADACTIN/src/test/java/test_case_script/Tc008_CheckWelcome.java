package test_case_script;

import org.testng.annotations.Test;

import Utilities.Base;
import pages.Login;

public class Tc008_CheckWelcome {
	@Test
	void Tc008_CheckWelcomeTest() throws Exception {
		/*
		 * TestSteps- 1.Launch browser 2.Enter URL 3.Matched Title
		 */
		Base.maximixeAndWaitImp();
		Base.enterAdactinLink();
		Login.welcometext("Adactin.com - Hotel Reservation System");

		Base.staticWaitThread(5000);
	}
}
