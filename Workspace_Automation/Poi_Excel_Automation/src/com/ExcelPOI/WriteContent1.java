package com.ExcelPOI;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteContent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writecontent();

	}
	static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("EMP ");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Ename");
			cell=row.createCell(1);
			cell.setCellValue("Empno");
			
			//Second Row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("demoUser1");
			cell=row.createCell(1);
			cell.setCellValue("Welcome1");
			
			
			
			fout=new FileOutputStream("E:\\Excel\\Book1.xlsx");
			wb.write(fout);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
