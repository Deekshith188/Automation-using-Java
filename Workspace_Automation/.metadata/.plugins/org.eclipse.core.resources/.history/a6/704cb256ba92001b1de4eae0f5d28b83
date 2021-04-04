package com.ExcelPOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assignment5{

	public static void main(String[] args) {
		
		
		WriteExcelLogs("Deekshith","Kumar","Bangalore","India");
		WriteExcelLogs("Abhi","Kumar","Tumkur","India");
		WriteExcelLogs("Ab","Devillers","CapeTown","SouthAfrica");
		WriteExcelLogs("Warner","David","Sydney","Australia");
	}
	static void WriteExcelLogs(String fn,String ln,String City,String Country)
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\Excel\\Assignment5.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			row=sh.getRow(rc);
			if(row==null)
			{
				row=sh.createRow(rc);
			}
			cell=row.createCell(0);
			cell.setCellValue(fn);
			cell=row.createCell(1);
			cell.setCellValue(ln);
			cell=row.createCell(2);
			cell.setCellValue(City);
			cell=row.createCell(3);
			cell.setCellValue(Country);
			fout=new FileOutputStream("E:\\Excel\\Assignment5.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

