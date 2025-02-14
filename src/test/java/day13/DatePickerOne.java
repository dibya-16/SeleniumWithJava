package day13;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerOne {
	//user defined function for converting month from String to Month object(because we can compare only through object.not with string format)
	static Month convertMonth(String month) {
		HashMap<String,Month> monthMap=new HashMap<String,Month>();
		monthMap.put("January",Month.JANUARY);
		monthMap.put("February",Month.FEBRUARY);
		monthMap.put("March",Month.MARCH);
		monthMap.put("April",Month.APRIL);
		monthMap.put("may",Month.MAY);
		monthMap.put("June",Month.JUNE);
		monthMap.put("July",Month.JULY);
		monthMap.put("August",Month.AUGUST);
		monthMap.put("September",Month.SEPTEMBER);
		monthMap.put("October",Month.OCTOBER);
		monthMap.put("November",Month.NOVEMBER);
		monthMap.put("December",Month.DECEMBER);
		Month vmonth=monthMap.get(month);
		if(vmonth==null) {
			System.out.println("Invalid Month");
		}
		return vmonth;
		
	}
	
	static void selectDate(WebDriver driver,String requiredYear,String requiredMonth,String requiredDate) {
		//select year(dropdown)
		WebElement yearDropdown=driver.findElement(By.xpath("......"));
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear);
		
       //select month
		while(true) {
			
			
			String displayMonth=driver.findElement(By.xpath("....")).getText();
			//convert displayMonth and requiredMonth into month object
			Month expectedMonth=convertMonth(requiredMonth);
			Month currentMonth=convertMonth(displayMonth);
			
			//compare
			int result=expectedMonth.compareTo(currentMonth);
			// 0//when moth are same
			// >0 future month
			// <0 past month
			if(result<0) {
				//past month
				driver.findElement(By.xpath(".....")).click();//previous button
				
			}
			if(result>0) {
				//future month
				driver.findElement(By.xpath(".....")).click();//next button
				
			}
			else {
				break;
				
			}
			
		}
		//select the date
				List<WebElement> allDates=driver.findElements(By.xpath("........."));
				for(WebElement dt:allDates) {
					if(dt.getText().equals(requiredDate)) {
						dt.click();
						break;
					}
				}	
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input data
		String requiredYear="2000";
		String requiredMonth="November";
		String requiredDate="16";
		driver.switchTo().frame("....");//dont know
		driver.findElement(By.xpath("//input[@id='start-date']")).click();
		selectDate(driver,requiredYear,requiredMonth,requiredYear);
		
		
		
		
		/*
		 //select year(dropdown)
		WebElement yearDropdown=driver.findElement(By.xpath("......"));
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText(requiredYear);
		
		 //select month
		while(true) {
			
			String displayMonth=driver.findElement(By.xpath("....")).getText();
			//convert displayMonth and requiredMonth into month object
			Month expectedMonth=convertMonth(requiredMonth);
			Month currentMonth=convertMonth(displayMonth);
			
			//compare
			int result=expectedMonth.compareTo(currentMonth);
			// 0//when moth are same
			// >0 future month
			// <0 past month
			if(result<0) {
				//past month
				driver.findElement(By.xpath(".....")).click();//previous button
				
			}
			if(result>0) {
				//future month
				driver.findElement(By.xpath(".....")).click();//next button
				
			}
			else {
				break;
				
			}
			
		}
		//select the date
				List<WebElement> allDates=driver.findElements(By.xpath("........."));
				for(WebElement dt:allDates) {
					if(dt.getText().equals(requiredDate)) {
						dt.click();
						break;
					}
				}	
		  
		*/
		
		
		
		
		
		
	}

}
