package com.sgtesting.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteContent {

	public static void main(String[] args) {
		
	}
	static void writecontent() {
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			//FirstRow
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue(1);
			//Secondrow
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
