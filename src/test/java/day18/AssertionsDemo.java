package day18;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionsDemo {
	//use for validation
	@Test
	void testTitle() {
		String expectedTitle="OpenCart";
		String actualTitle="OpenShop";
		/*
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		*/
		//1st way
		Assert.assertEquals(expectedTitle,actualTitle);
		//another way
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test Failed");
			Assert.assertTrue(false);
			
		}
		
	}

}
