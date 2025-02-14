package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//Min slider
		WebElement minSlider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Default location of Min Slider:"+minSlider.getLocation());//(59,294)=(x,y)
		act.dragAndDropBy(minSlider,100,249).perform();//here x=100,y=249,Element=minSlider..(Element,x,y)
		System.out.println("Location of Min Slider after moving:"+minSlider.getLocation());//(161,294)=(x,y)
	    
		//Max slider
		WebElement maxSlider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Default location of Max Slider:"+maxSlider.getLocation());//(876,294)=(x,y)
		act.dragAndDropBy(maxSlider,-100,249).perform();//here x=100,y=249,Element=maxSlider..(Element,x,y)
		System.out.println("Location of Max Slider after moving:"+maxSlider.getLocation());//(776,294)=(x,y)
		
	}

}
