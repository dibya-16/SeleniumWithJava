package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);//accepts SSL certificates  //by default false thakeh
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the page:"+driver.getTitle());//Privacy error (we will get it when chromeOptions will no be used)
		                                                            //expired.badssl.com(we will get it when chromeOptions use)
	}

}
