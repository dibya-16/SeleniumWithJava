package day13;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement registerLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		//ctrl+registerLink
		act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();
		
		//switching to registration page
		List<String>ids=new ArrayList<String>(driver.getWindowHandles());
		//Registration page
		driver.switchTo().window(ids.get(1));//switch to registration page
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Dibbo");
		
		
		//Home page
		driver.switchTo().window(ids.get(0));//switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("t-shirts");
		
		

	}

}
