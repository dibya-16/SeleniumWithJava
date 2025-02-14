package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	
	//bootstrap drop down(from dropdown we can select multiple values/options)

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo/php?ex=63.0_2");
		
		//select single option
		driver.findElement(By.xpath("//input[@value='java']")).click();
		//capture all the options and find out the size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));//create xpath
		System.out.println("Number of options:"+options.size());
		//printing the options from dropdown
		/*
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		*/
		
		//select multiple options
		for(WebElement op:options) {
			String option=op.getText();
			if(option.equals("Java")||option.equals("Python")||option.equals("MySQL")) {
				op.click();
			}
		}
	
		
	}

}
