package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	//when sendKeys(),click() are not working properly.w call it javaScript intercepted Exception.then we use Javascript Executor.Javascript interface is a interface.if sendKeys(),click() are working then also we can use  JavaScript Executor as a alternative

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputBox=driver.findElement(By.xpath("//input[@id='name']"));                    
		//passing the text into inputbox- alternative of sendKeys()
		JavascriptExecutor js=(JavascriptExecutor)driver;//upcasting
		//JavascriptExecutor js=driver;//no need to upcasting
		js.executeScript("arguments[0].setAttribute('value','Dibbo')",inputBox);
		
		//clicking on element-alternative of click()
		WebElement radMale=driver.findElement(By.xpath("//input[@id='male']"));    
		js.executeScript("arguments[0].click()",radMale);

	}

}
