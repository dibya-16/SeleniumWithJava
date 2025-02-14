package day19;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test(priority=1,groups={"sanity","regression","functional"}) 
	void paymentInTk() {
		System.out.println("payment in tk");
	}
	@Test(priority=2,groups={"sanity","regression","functional"})
	void paymentInDollar() {
		System.out.println("payment in dollar");
	}

}
