package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		//Login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		//click on dropdown
		
		driver.findElement(By.xpath("....")).click();//for hidden dropdown we have to select xpath in different way.go to selectorshub.then debugger start then within 5 select click dropdwn for debugger fizzed.then click element find html and select it.then find  the xpath from selectorshub. 
		Thread.sleep(5000);
		//select single dropdown
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of options:"+options.size());//29
		//print all the options
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
	}

}
