package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//page object model pattern
//without using PageFactory

public class LoginPage {
	WebDriver driver;
	//contructor
	LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	//locators(type of variable is By)
	By userName=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By loginButton=By.xpath("//button[normalize-space()='Login']");
	
	//Actions methods
	public void setUserName(String user) {
		driver.findElement(userName).sendKeys(user);
	}
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

}
