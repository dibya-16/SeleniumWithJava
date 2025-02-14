package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	//Actions-pre defined class provided in selenium.

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		WebElement company=driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Company']"));
		WebElement aboutUs=driver.findElement(By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 pb-2']//a[normalize-space()='About Us']"));
		Actions act=new Actions(driver);
		
		//mouse hover
		//build()-create an action, perform()-complete an action
		//act.moveToElement(company).moveToElement(aboutUs).click().build().perform();//it will hover then click
		
		//act.moveToElement(company).moveToElement(aboutUs).build().perform();//it will just hover
		act.moveToElement(company).moveToElement(aboutUs).perform();//it will just hover
		
	}

}
