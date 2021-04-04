package com.sgtesting.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment7 {

	public static void main(String[] args) {
		ReadWrite();

	}
	static void ReadWrite()
	{
		FileInputStream Fis=null;
		FileOutputStream Fos=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		Sheet sh2=null;
		Row rowsh2=null;
		Cell cellsh2=null;
		try {
			Fis=new FileInputStream("E:\\Excel\\Assignment7.xlsx");
			wb=new XSSFWorkbook();
			sh=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rw=sh.getRow(r);
				rowsh2=sh.createRow(r);
				int cc=rw.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cl=rw.getCell(c);
					String data=cl.getStringCellValue();
					cellsh2=rowsh2.createCell(c);
					cellsh2.setCellValue(data);
				}
			}
			Fos=new FileOutputStream("E:\\Excel\\Assignment7.xlsx");
			wb.write(Fos);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				Fis.close();
				Fos.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

