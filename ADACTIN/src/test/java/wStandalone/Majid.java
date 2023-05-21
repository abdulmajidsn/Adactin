package wStandalone;

import org.testng.annotations.Test;

public class Majid {
	
	@Test (priority=2)
void method1() {
		System.out.println("Method one is excuted");
}
	@Test (priority=0)
	void method2() {
		System.out.println("Method two is excuted");
	}
	@Test (priority=1)
	void method3() {
		System.out.println("Method three is excuted");
	}
	
}
