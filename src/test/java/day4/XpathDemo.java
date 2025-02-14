package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("t-shirts");
		
		//xpath with multiple attribute
	    //driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("t-shirts");
        
		//xpath with "and" "or" operator
	    //driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("t-shirts");
		 //driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Searchtext']")).sendKeys("t-shirts");
         
		//xpath with text()-inner text..example:<h2>Macbook</h2>
		//driver.findElement(By.xpath("//*[text()='Macbook']")).click();
		/*
		boolean displayStatus= driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(displayStatus);
		String value= driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		System.out.println(value);
		*/
		
		//xpath with contains()..contains(@attribute,'value')
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("t-shirts");
		
		//xpath with starts-with()...starts-with(@attribute,'value')
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("t-shirts");
		
		//chained xpath..it's aabsolute xpath
		//boolean displayStatus=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
		//System.out.println(displayStatus);
		
		
		
		
	}

}
