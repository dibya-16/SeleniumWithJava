package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jdk.javadoc.internal.doclets.formats.html.taglets.snippet.Action;

public class ActionsVsAction {
	//Actions->class,will be used to perform mouse actions
	//Action->interface,will be used to store created actions

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		Action myAction=(Action) act.contextClick(button).build();//creating an action and storing into a variable
		myAction.perform(); //we performing or completing action
	}

}
