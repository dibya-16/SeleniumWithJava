package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//close window if it is available after login
				if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
					driver.findElement(By.xpath("//button[@class='btn-close']")).click();
				}
				
				driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();//customer main menu
				driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();//customer sub menu
				
				//Showing 1 to 10 of 16111 (1612 Pages)
				String text=driver.findElement(By.xpath("//div[contains(text(),'Pages']")).getText();
				int totalPages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
				
				//repeating pages
				for(int p=1;p<=totalPages;p++) {
					if(p>1) {
						WebElement activePages=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
						activePages.click();
					}
					
				//reading data from the page
					
				int numOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
				for(int r=1;r<=numOfRows;r++) {
					String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
					String email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
					String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
					System.out.println(customerName+"\t"+email+"\t"+status);
				}
					
				}
				

	}

}
