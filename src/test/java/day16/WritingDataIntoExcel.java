package day16;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException{
		FileOutputStream file=new FileOutputStream(System.getProperty("dir.user")+"\\testData\\myFile.xlxs");//FileOutputStream use for open to  write in file
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Data");
        XSSFRow row1=sheet.createRow(0);
        row1.createCell(0).setCellValue("Java");
        row1.createCell(1).setCellValue(13);
        row1.createCell(2).setCellValue("Automation");
        
        XSSFRow row2=sheet.createRow(1);
        row1.createCell(0).setCellValue("Python");
        row1.createCell(1).setCellValue(4);
        row1.createCell(2).setCellValue("Automation");
        
        XSSFRow row3=sheet.createRow(25);
        row1.createCell(0).setCellValue("C#");
        row1.createCell(1).setCellValue(1234);
        row1.createCell(2).setCellValue("Automation");
        
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");
        
        
	}

}
