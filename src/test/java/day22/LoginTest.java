package day22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	 WebDriver driver;
	@BeforeClass
	void setup() {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		
	}
	@Test
	void logintest() {
		LoginPage lp=new LoginPage(driver);
		//LoginPage1 lp=new LoginPage1(driver);//this is for loginpage1
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM"); driver=new ChromeDriver();
		 
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
		
	}

}
