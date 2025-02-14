package day16;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {
	//Excel File->Workbook->Sheets->Rows->Cells

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("dir.user")+"\\testData\\data.xlxs");//FileInputStream use for open to  read file
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet= workbook.getSheet("Sheet1");//name of the sheet is Sheet1
        //XSSFSheet sheet= workbook.getSheetAt(0);//name of the sheet is Sheet1
        int totalRows=sheet.getLastRowNum();//it will return the last row number which will be actually the total row number
        int totalCells=sheet.getRow(0).getLastCellNum();	
        //rows are counting from zero and cells are counting from one always
        System.out.println("Number of rows:"+totalRows);
        System.out.println("Number of cells:"+totalCells);
        
        for(int r=0;r<=totalRows;r++){
        	// //rows are counting from zero and cells are counting from zero according to java also
        	XSSFRow currentRow=sheet.getRow(r);
        	for(int c=0;c<totalCells;c++) {
        		XSSFCell cell=currentRow.getCell(c);
        		System.out.print(cell.toString()+"\t"); //toString()=extract data from object
        		
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
        
	}

}
