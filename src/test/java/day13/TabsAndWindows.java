package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//selenium4.x
		driver.switchTo().newWindow(WindowType.TAB);//open new tap
		//driver.switchTo().newWindow(WindowType.WINDOW);//open two window
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		

	}

}
