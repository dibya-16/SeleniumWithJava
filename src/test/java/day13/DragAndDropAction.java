package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		
		WebElement romeDrag=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italyDrop=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		//dragAndDrop(source,target)
		act.dragAndDrop(romeDrag,italyDrop).perform();

	}

}
