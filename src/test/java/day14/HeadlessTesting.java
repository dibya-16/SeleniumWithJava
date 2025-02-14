package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
	/*
	//Headless
	Advantage:
	1.we can do multiple task(since execution happened backend)
	2.faster execution
	Disadvantage:
	1.user can not see the actions on the page.so he can not understand flow/functionality of the test.
	*/

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");//setting for headless mode of executions
		
		WebDriver driver=new ChromeDriver(options);
		//2.Open URL:https://www.opencart.com/
		driver.get("https://www.opencart.com/");
		// 3.validate title should be "OpenCart - Open Sou"rce Shopping Cart Solution"
		String act_title=driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		//4.Close browser
		
		  driver.quit();
		//driver.close();
	}

}
