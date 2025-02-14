package day9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAutenticatedPopup {
	

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Systax:
		//https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

		
	}

}
