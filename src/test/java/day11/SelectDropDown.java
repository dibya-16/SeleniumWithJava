package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry=new Select(dropCountryElement);
		//select option from the drop down
		//dropCountry.selectByVisibleText("France");//1st way
		//dropCountry.selectByValue("france");//second way
		//dropCountry.selectByIndex(4);//3rd way
		
		//capture the options from dropdown
		List<WebElement> options=dropCountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size());
		//printing the options
		/*
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		*/
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		

	}

}
