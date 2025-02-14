package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//frame1
		WebElement frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));//it's a frame xpath which i take from selectorsHub
		driver.switchTo().frame(frame1);//passed frmae as a web element //switch to frame1.we have switch it by web elemet.we can switch it by id,name,index number also
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();//go back to the page
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();//go back to the page
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		//inner iframe- part of frame 3
		driver.switchTo().frame(0);
		//1st way
		//driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();//we find this xpath(from frame3 inspact then copy url of inner frame or webpage.then go to the new webpage then selectorshub then relative xpath copy
		//2nd way
		WebElement radioButton= driver.findElement(By.xpath("//span[normalize-space()='I am a human']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",radioButton);
		
		driver.switchTo().defaultContent();//go back to the page
		
		
		
		

 }

}
