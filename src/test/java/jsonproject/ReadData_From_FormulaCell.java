package jsonproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class ReadData_From_FormulaCell {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream(".\\Files\\EmployeeSalary.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows= sheet.getLastRowNum();
		int cols= sheet.getRow(0).getLastCellNum();
		
		System.out.println("total rows are "+rows+" and colums are "+cols);
		DataFormatter dataFormatter =new DataFormatter();
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType()) {
				case STRING: 
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					
					String value=dataFormatter.formatCellValue(cell);
					System.out.print(value);
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case FORMULA:
					
					System.out.print(cell.getNumericCellValue());
					break;
				}
				System.out.print("|");
			}
			System.out.println();		
			}

		file.close();
	}

}
