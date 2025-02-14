package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed()-check display status of the element 
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(logo.isDisplayed());
		//boolean newLogo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(newLogo);
		
		//isEnabled()-check enable/disable status of the element 
		//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println(status);
		
		//isSelected()-use to check the element is selected or not
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selected:");
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		System.out.println("After male selected:");
		maleRadioButton.click();		
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		System.out.println("After female selected:");
		femaleRadioButton.click();	
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		
		
		
		
		
	}

}
