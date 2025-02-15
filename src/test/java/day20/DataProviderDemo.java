package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	@Test(dataProvider="dp")
	void testLogin(String email,String password) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
			
		}
		
	}
	@AfterClass
	void tearDown() {
		driver.close();
		
	}
	@DataProvider(name="dp",indices= {0,2})//dataProvider method always return two dimentional array only  //indices={0,1} means 1st two array value will be provided just
	                                                                                                       //indices={0,2} means 0 and 2 index value will be provided just
	                                                                                                       //if i don't use indices all value will be provided
	Object[][] loginData() {
		Object data[][]= {
				{"abc@gmail.com","test123"},
				{"def@gmail.com","test312"},
				{"dibyajyotihore.djh61@gmail.com","test@123"},
				{"ghi@gmail.com","test873"}
				
		};
		return data;
		
		
	}
	

}
