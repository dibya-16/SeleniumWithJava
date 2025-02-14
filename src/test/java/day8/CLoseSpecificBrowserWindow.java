package day8;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLoseSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowsId=driver.getWindowHandles();
		
		for(String windId:windowsId) {
        	String title=driver.switchTo().window(windId).getTitle();
        	//String url=driver.switchTo().window(windId).getCurrentUrl();
  
        	if(title.equals("Human Resources Management Software | OrangeHRM")||title.equals("some other title")) {
        		driver.close();
        	}  	
        	
        	
        }
        

	}

}
