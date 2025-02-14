package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//all testcase will have just one listener class

@Listeners(day21.MyListener.class)//we can integrate listener class through xm file or direct from here like that
public class OrangeHRM {
	 WebDriver driver;
	  @BeforeClass
	   void openApp() {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }
	  @Test(priority=1)
	  void logoTest() throws InterruptedException {
		  Thread.sleep(3000);
		  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status,true);
	 }
	  @Test(priority=2)
	  void appURL() {
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth");
	 }
	  @Test(priority=3,dependsOnMethods="appURL")
	  void homePageTitle() {
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		  
	  }
	 
	  @AfterClass
	  void tearDown() {
		  driver.quit();
	 }

}
