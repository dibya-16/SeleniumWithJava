package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//page object model pattern
// using PageFactory

public class LoginPage1 {
	WebDriver driver;
	//contructor
	LoginPage1(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//locators
	
	
	@FindBy(xpath="//input[@placeholder='Username']") ////single WebElement
	WebElement userName;
	//@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")//different approach
		//WebElement useName;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginButton;
	/*
	@FindBy(tagName="a") ////group of WebElement
	List<WebElement> links;
	*/
	
	//Actions methods
	
	public void setUserName(String user) {
		userName.sendKeys(user);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		loginButton.click();
	}

}
