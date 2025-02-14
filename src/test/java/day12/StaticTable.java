package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple tables in a webpage //7
		//int rows=driver.findElements(By.tagName("tr")).size();//single table in a webpage //14
		
		System.out.println("Number of rows:"+rows);
		
		//find total number of columns in a table
		
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();//multiple tables in a webpage 
		//int columns=driver.findElements(By.tagName("th")).size();//single table in a webpage 
		
		System.out.println("Number of rows:"+columns);
		
		//read data from specific row and column(example:5th row and 1st column)
		String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookName);
		//read data from all the rows and columns
		/*
		System.out.println("Bookname"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=columns;c++) {
				String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(values+"\t");//\t represent tab or make space
			}
			System.out.println();//print it in table format
		}
		*/
		//print books whose author is Mukhesh
		/*
		for(int r=2;r<rows;r++) {
			String authorNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	
			if(authorNames.equals("Mukesh")) {
				String bookNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookNames+"\t"+authorNames);
			}
		}
		
		*/
		//find total price of all the books
		int total=0;
		for(int r=2;r<=rows;r++) {
			String prices=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
	        total=total+Integer.parseInt(prices);
	        
			
		}
		System.out.println("Total price:"+total);
		
		
		
		

	}

}
