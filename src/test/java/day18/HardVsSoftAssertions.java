package day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	@Test
	void testHardAssertions(){
		
		System.out.println("Testing..");//it will execute
		Assert.assertEquals(1,2);//hard assertion..since it will be failed.next println will not be executed
		System.out.print("Testing");//it will not execute 
	}
	@Test
void testSoftAssertions(){
		
		System.out.println("Testing..");//it will execute
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,2);//soft assertion.Though it will fail but next println  execute
		System.out.print("Testing");//it will execute
		sa.assertAll();//mandatory for soft assert
	}

}
