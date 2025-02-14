package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all the checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		//1st way
		/*
		for(int i=0;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		*/
		//second way
		/*
		for(WebElement checkBox:checkBoxes) {
			checkBox.click(); 
		}
		*/
		//last 3 checkboxes
		//(total number of check boxes-how many checkboxes want to select=Starting index )
		//7-3=4(Starting index)
		/*
		 for(int i=4;i<checkBoxes.size();i++) {
			checkBoxes.get(i).click();
		}
		*/
		
		//first 3 checkboxes
		/*
		for(int i=0;i<3;i++) {
			checkBoxes.get(i).click();
		}
		*/
		//unselect check boxes
		for(int i=0;i<3;i++) {
			checkBoxes.get(i).click();
		}
		
		Thread.sleep(5000);
		for(int i=0;i<checkBoxes.size();i++) {
			if(checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
			
		}
		
		

	}

}
