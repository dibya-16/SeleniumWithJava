package day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.opencart.com/");
		driver.manage().window().maximize();//maximize the browser window
		//name(use for single and specific web element)
		driver.findElement(By.name("search")).sendKeys("MacBook");
		//id(use for single and specific web element)
		boolean logoDisplaedStatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplaedStatus);
		//linkText or partialLinkText(use for single and specific web element)
		
		driver.findElement(By.linkText("Tablets")).click();//<a href="....">Tablets</a>
		driver.findElement(By.partialLinkText("Tabl")).click();//no need to give full name of tablets if tablets name is unique
		
        //className(use for capture group of web element)
		List<WebElement> headerLinks =driver.findElements(By.className("list-inline-item")); //find elemnts(who can carry multiple link) return type is list<webelement>
        System.out.println("Total number of header links:"+ headerLinks.size());//get how many links they have
        
        //tagName(use for capture group of web element)
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links:"+links.size());
        
        List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println("Total number of images:"+images.size());
        
        
	}

}
