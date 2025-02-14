package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 Test Cases
 1.Launch(open) browser (chrome)
 2.Open URL:https://www.opencart.com/
 3.validate title should be "Your store"
 4.Close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
	//1.Launch(open) browser (chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
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
