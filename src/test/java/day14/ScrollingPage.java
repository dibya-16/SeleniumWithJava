package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");//how it will move in y axis.here 1500 pixel 
		//System.out.println(js.executeScript("return window.pageYOffset;"));//1500  //it will be pageYOffset.when we will go to x axis. scroll left to right not up down
		
		
		//scroll the page till element is visible.here Community poll
		/*
		WebElement element=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		//scroll page till end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//it will be scrollWidth.when we will go to x axis. scroll left to right not up down
		System.out.println(js.executeScript("return window.pageYOffset;"));//2037
		
		Thread.sleep(5000);
		
		//scrolling upto initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));//0
		
		

	}

}
