package com.sgtesting.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	
	public ExcelDataProvider() throws IOException
	{
		File src=new File("./TestData/TestData1.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		wb=new XSSFWorkbook(fis);
		
		
		
		
	}
	public String getStringData(int sheetIndex,int row,int column)
	{
		return wb.getSheet("sheetIndex").getRow(row).getCell(column).getStringCellValue();
		
	}
	public String getStringData(String sheetName,int col,int row)
	{

		return wb.getSheet("sheetName").getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public double getNumericData(int row,String sheetName,int col)
	{

		return wb.getSheet("sheetname").getRow(row).getCell(col).getNumericCellValue();
		
	}
}
