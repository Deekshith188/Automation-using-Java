package com.ExcelPOI;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment8 {

	public static void main(String[] args) {
		ReadAllWritenew();
	}
	static void ReadAllWritenew()
	{
		FileInputStream FIN=null;
		FileOutputStream FOUT=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Row rowNew=null;
		Cell cell=null;
		Cell cellNew=null;
		

		try
		{
			FIN=new FileInputStream("E:\\Excel\\Assignment8.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			{
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=0;r<rc;r++)
				{
					row=sh.getRow(0);
					int cc=row.getPhysicalNumberOfCells();
					for(int c=0;c<cc;c++)
					{
						cell=row.getCell(c);
						String data=cell.getStringCellValue();
					}
				}
				FOUT=new FileOutputStream("E:\\Excel\\Assignment8.xlsx");
				wb=new XSSFWorkbook();
				sh=wb.createSheet("Wiritng from Ass8");
				for(int f=0;f<10;f++)
				{
					row=sh.createRow(f);
					cell=row.createCell(0);
					cell.setCellValue("[f]");
				}


			}
			FOUT=new FileOutputStream("E:\\Excel\\Assignment8.xlsx");
			wb.write(FOUT);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				FIN.close();
				FOUT.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}