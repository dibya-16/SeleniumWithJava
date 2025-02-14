package day14;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockingAds {

	public static void main(String[] args) {
		//first crx extractor file download to chrome browser
		//then go to uBlock Origin browser download to chrome if not and right click on uBlock Origin and clicked on download for this crx extension 
		//then
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Automation\\automationFiles\\crx files\\u-Block-origin.crx");
		options.addExtensions(file);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
	}

}
