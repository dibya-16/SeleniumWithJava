package day18.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	//we can execute multiple classes together through xml file
	@Test
	void abc() {
		System.out.println("This is abc from c1..");	}

@BeforeTest
void bt() {
	System.out.println("This is Beforetest method");
}
}
