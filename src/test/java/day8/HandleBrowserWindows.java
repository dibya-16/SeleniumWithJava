package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowsId=driver.getWindowHandles();
		
		//Approach1
		/*
	    List<String> windowList=new ArrayList(windowsId);		
        String parentId=windowList.get(0);
        String childId=windowList.get(1);
        System.out.println(driver.getTitle());
        
        //switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());
        
        //switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
        */
        //Approach2
        for(String windId:windowsId) {
        	String title=driver.switchTo().window(windId).getTitle();
        	if(title.equals("OrangeHRM")) {
        		System.out.println(driver.getCurrentUrl());
        		//some validation on the parent window
        	}
        }
        
	}

}
