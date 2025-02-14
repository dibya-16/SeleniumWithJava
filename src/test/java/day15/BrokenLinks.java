package day15;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421");
		driver.manage().window().maximize();
		
		//capture all the link from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		int numberOfBrokenLinks=0;
		for(WebElement linkElement:links) {
			
			String hrefAttributeValue=linkElement.getAttribute("href");
			if(hrefAttributeValue==null || hrefAttributeValue.isEmpty()) {
				System.out.println("href attribute value is null or empty.So not posible to check");
				continue;//skip it and continue
			}
			
			//hit url to the server
			try {
				URL linkURL=new URL(hrefAttributeValue);//converted href value from string to URL formst
				HttpURLConnection connection=(HttpURLConnection) linkURL.openConnection();//open connection to the server
				connection.connect();//connect to the server and sent request to the server //hit to the server
				
				if(connection.getResponseCode()>=400) {    //response code means status code
					System.out.println(hrefAttributeValue+"======>Broken link");
					numberOfBrokenLinks++;
					
				}
				else {
					System.out.println(hrefAttributeValue+"======>Not a broken link");
				}
			}
			catch(Exception e) {
				
			}
			
			
		}
		System.out.println("Number of broken links:"+numberOfBrokenLinks);

	}

}
