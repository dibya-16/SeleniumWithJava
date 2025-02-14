package day18;

import org.testng.annotations.*;


public class AllAnnotations {

	@BeforeSuite
	void bs() {
		System.out.println("This is BeforeSuite method");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This is AfterSuite method");
	}

@BeforeTest
void bt() {
	System.out.println("This is Beforetest method");
}

@AfterTest
void at() {
	System.out.println("This is Aftertest method");
}
@BeforeClass
void bc() {
	  System.out.println("This is before class method...");
}
@AfterClass
void ac() {
	  System.out.println("This is after class method...");
}
@BeforeMethod
void bm() {
	  System.out.println("This is Before method method...");
}
@AfterMethod
void am() {
	  System.out.println("This is After method method...");
}
@Test(priority=1)
void t1() {
	  System.out.println("This is t1 method..");
}
@Test(priority=2)
void t2() {
	  System.out.println("This is t2 method...");
}
}
