package day16;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		String filePath=System.getProperty("dir.user")+"\\testData\\calculateData.xlxs";
		
		int rows=ExcelUtils.getRowCount(filePath,"Sheet1");
		
		for(int i=0;i<=rows;i++){
			//read data from excel
        	String principal=ExcelUtils.getCellData((filePath,"Sheet1",i,0);
        	String rateOfInterest=ExcelUtils.getCellData((filePath,"Sheet1",i,1);
        	String period1=ExcelUtils.getCellData((filePath,"Sheet1",i,2);
        	String period2=ExcelUtils.getCellData((filePath,"Sheet1",i,3);
        	String frequency=ExcelUtils.getCellData((filePath,"Sheet1",i,4);
        	String expectedMaturityValue=ExcelUtils.getCellData((filePath,"Sheet1",i,5);
        	
        	//pass above data into applications		
        	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principal);
        	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
        	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(principal);
        	Select periodDropdown=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
        	periodDropDown.selectByVisibleText(period2);
        	Select frequencyDropdown=driver.findElement(By.xpath("//select[@id='frequency']"));
        	frequencyDropdown.selectByVisibleText(frequency);
        	driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();//clicked on calculate
        	//validation
        	String actualMaturityValue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong").getText();
        	if(Double.parseDouble(expectedMaturityValue)==Double.parseDouble(actualMaturityValue)) {
        		System.out.println("Test Passed");
        		ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Passed");
        		ExcelUtils.fillGreenColor(filePath,"Sheet1",i,7);
        	}
        	else {
        		System.out.println("Test Failed");
        		ExcelUtils.setCellData(filePath,"Sheet1",i,7,"Failed");
        		ExcelUtils.fillRedColor(filePath,"Sheet1",i,7);
        		
        	}
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//img[@class='PL5']")).click();//clicked on clear button
        	
        }//end of for loop
		driver.quit();

	}

}
