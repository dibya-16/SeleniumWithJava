package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIncognitoMode {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");//make run as a private browser.no history will be saved in that browser
		
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
