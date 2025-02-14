package day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("dir.user")+"\\testData\\myFile.xlxs");//FileOutputStream use for open to  write in file
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Data");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows?");
        int numberOfRows=sc.nextInt();
        System.out.println("Enter how many cells?");
        int numberOfCells=sc.nextInt();
        
        for(int r=0;r<=numberOfRows;r++){
        	
        	XSSFRow currentRow=sheet.getRow(r);
        	for(int c=0;c<numberOfCells;c++) {
        		XSSFCell cell=currentRow.getCell(c);
        		cell.setCellValue(sc.next());//next()=user can enter any type of value
        		
        	}
        	
        }
        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");
	}

}
