package day19;

import org.testng.annotations.Test;

public class LoginTests {
	@Test(priority=1,groups={"sanity"})////groups name can be anything
	void loginByEmail() {
		System.out.println("This is login by email");
		
	}
	@Test(priority=2,groups={"sanity"})
	void loginByFacebook() {
		System.out.println("This is login by facebook");
		
	}
	@Test(priority=3,groups={"sanity"})
	void loginByTwitter() {
		System.out.println("This is login by twitter");
		
	}

}
