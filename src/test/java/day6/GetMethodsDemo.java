package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//get(url)-open the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//getTitle()-return title of the page
		System.out.println(driver.getTitle());
		//getCurrentUrl()-return url of the page
		System.out.println(driver.getCurrentUrl());
		//getPageSource()-return source code of the page
		System.out.println(driver.getPageSource());
		//getWindowHandle()-return ID of the single browser window
		String windowId=driver.getWindowHandle();
		System.out.println("Window Id:" + windowId);//it will generate at runtime
		//getWindowHandles()-returns ID's of the multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//open new browser window
		Set<String> windowsId=driver.getWindowHandles();//set newa hoise cz id unique value
		System.out.println(windowsId);
		
		
		
	}

}
