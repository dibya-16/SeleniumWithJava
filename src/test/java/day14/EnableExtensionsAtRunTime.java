package day14;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {

	public static void main(String[] args) {
		
		//first crx extractor file download to chrome browser
		//then go to selectorshub browser and right click on SelectorsHub and clicked on download for this crx extension 
		//then
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Automation\\automationFiles\\crx files\\SelectorsHub.crx");
		options.addExtensions(file);//now we can see and do work in SelectorsHub after runtime in that browser.
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
	}

}
