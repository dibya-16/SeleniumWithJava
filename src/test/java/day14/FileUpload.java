package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload-t1.txt
		/*
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("F:\\SQA\\t1.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("t1.txt")) {
			System.out.println("File uploaded successfully");
		}
		else {
			System.out.println("Upload failed");
		}
		*/
		
		String f1="F:\\SQA\\t1.txt";
		String f2="F:\\SQA\\t2.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(f1+"\n"+f2);
		int numOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		//validation number of files
		if(numOfFilesUploaded==2) {
			System.out.println("All files are uploaded");
		}
		else {
			System.out.println("Files are uploaded or Incorrect files are uploaded");
		}
		
		//validation file names
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText().equals("t1.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText().equals("t2.txt")) {
			System.out.println("File names are matching");
		}
		else {
			System.out.println("File names are not matching");
		}
	}

}
