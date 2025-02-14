package day14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsCapture {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\fullPage.png");//C:\Automation\MyWorkSpaces\SeleniumWebDriver\seleniumwebdriver\screenshots
		sourceFile.renameTo(targetFile);//copy sourceFile to targetFile
		*/
		//capture the screenshot of specific section
		/*
		WebElement freaturedProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile=freaturedProducts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"
		sourceFile.renameTo(targetFile);//copy sourceFile to targetFile
		*/
		
		//capture the screenshot of webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile=logo.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourceFile.renameTo(targetFile);//copy sourceFile to targetFile
        
		
		
		driver.quit();
		
		
		
		

	}

}
