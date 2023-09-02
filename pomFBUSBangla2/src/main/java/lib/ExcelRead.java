package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	Sheet sh;
	public ExcelRead(String filename, String sheetname) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
		
	}

	public Object[][] excelToArray() {
		
		//Task 1: initialize the size of the array based on excel sheet.
		 
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] x;
		
		//[row][col]
		 x=new Object[totalRows-1][totalCols];
		 
		 //Base on excel
		 for(int row=1;row<totalRows;row++) {
			 
			 for (int col=0;col<totalCols;col++) {
				 
				 //read each cell from excel and store into array.
				 x[row-1][col] = getCellData(row,col);
			 }
		 }
	
	return x;
	}

	public String getCellData(int row,int col) {
		String value;
	Cell c = sh.getRow(row).getCell(col);
	
	if(c.getCellType() == Cell.CELL_TYPE_STRING) {
		 value = c.getStringCellValue();
		
	}
		
	else {
		//numeric part.
		if(c.getNumericCellValue()%1==0) {
	//int 
		value = ""+(int)c.getNumericCellValue();
		
	}
	
	else {
		//double 
		value = ""+ c.getNumericCellValue();
		
	}
	}
		
		return value;
	}
}
	

	

	
	
	
		
		
		
		