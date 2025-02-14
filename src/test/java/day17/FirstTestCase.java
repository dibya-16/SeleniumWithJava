package day17;

import org.testng.annotations.Test;

/*
 @Test Annotation
 1.open app
 2.login
 3.logout 
 */
//testNG ececute the test method in alphabetical order.that's why we have to use priority to control execution.

public class FirstTestCase {
	
	@Test(priority=2)
	void login() {
		System.out.println("Login to the application... ");	}
	@Test(priority=3)
	void logout() {
		System.out.println("Logout from the application...");	}
	@Test(priority=1)
	void openApp() {
		System.out.println("Open the application...");	}

}
