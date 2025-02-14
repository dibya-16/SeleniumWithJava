package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		
		
		//doubleClick action on the button
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//inner text hole like <a>Hello</a> amra getText() use kori
		//inner text nahole jodi kono attribute ah text thakeh.like <a value="Hello"></a>..tokhon amra getAttribute() use kori( getAttribute("value")) or( grtAttribute("Id"))

	}

}
