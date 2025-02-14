package day21;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {//ctrl+click ITestListerer to get all methods
	public void onStart(ITestContext context) { //onStart method executes only once
	    System.out.println("Test execution is started...");
	  }
	public void onTestStart(ITestResult result) {
		 System.out.println("Test started...");
	  }
	public void onTestSuccess(ITestResult result) {
		 System.out.println("Test passed...");
	  }
	public void onTestFailure(ITestResult result) {
		 System.out.println("Test failed...");
	  }
	public void onTestSkipped(ITestResult result) {
		 System.out.println("Test skipped...");
	  }
	public void onFinish(ITestContext context) { //onFinish method executes only once
		 System.out.println("Test execution is completed...");
		  }
	

}
