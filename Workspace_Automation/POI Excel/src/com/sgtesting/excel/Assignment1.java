package com.sgtesting.excel;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			sh=wb.createSheet("flowers");

			for(int i=0;i<=25;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("flowers"+(i+1));
			}
			fout=new FileOutputStream("E://Excel//Assignment1.xlsx");
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
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


}

