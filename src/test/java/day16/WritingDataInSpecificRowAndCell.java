package day16;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("dir.user")+"\\testData\\myFileRandom.xlxs");//FileOutputStream use for open to  write in file
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Data");
        XSSFRow currentRow=sheet.getRow(3);//3rd row
        XSSFCell cell=currentRow.getCell(4);//4th cell
        cell.setCellValue("Welcome");
        
        
        
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");

	}

}
