package com.ExcelPOI;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Worksheet {
	public static void main(String[] args) {
		writeContent();

	}
	
	static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("Password");
			//Second Row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("demoUser1");
			cell=row.createCell(1);
			cell.setCellValue("Welcome1");
			
			fout=new FileOutputStream("E:/Excel/Welcome.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}


