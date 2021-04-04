package com.sgtesting.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment3 {

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
			sh=wb.createSheet("fruits");
            row=sh.createRow(9);
            
			for(int i=0;i<=19;i++)
			{
			
				cell=row.createCell(i);
				cell.setCellValue("fruits"+(i+1));
			}

			fout=new FileOutputStream("E:\\Excel\\Assignment3.xlsx");
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

