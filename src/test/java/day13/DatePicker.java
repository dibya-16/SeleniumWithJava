package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	static void selectFutureDate(WebDriver driver,String month,String year,String date) {
		//select month and year
				while(true) {
					String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					if(currentMonth.equals(month)&& currentYear.equals(year)) {
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next date
					//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous date(aager month or year select korte chaile.specially for date of birth)
					
				}

		    //select the date
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			for(WebElement dt:allDates) {
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}
		
	}
	
	static void selectPastDate(WebDriver driver,String month,String year,String date) {
		//select month and year
		while(true) {
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month)&& currentYear.equals(year)) {
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous date(aager month or year select korte chaile.specially for date of birth)
			
		}

		//select the date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);//(take one index cz date picker is under one frame.so have to convert to frame.)
		
		//method1:using sendkeys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");// m/d/y
		//method2:using a date picker
		
		//expected data
		String month="March";
		String year="2024";
		String date="17";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectFutureDate(driver,month,year,date);
		//selectPastDate(driver,month,year,date);
		
		/*
		//select month and year
		while(true) {
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month)&& currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next date
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous date(aager month or year select korte chaile.specially for date of birth)
			
		}
		
		//select the date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));//had to take the xpath of whole date
		for(WebElement dt:allDates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		*/
		
		

	}

}
