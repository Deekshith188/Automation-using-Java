package com.sgtesting.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteContent {

	public static void main(String[] args) {
		readwritecontent();

	}
	static void readwritecontent()
	{
		FileOutputStream Fout=null;
		FileInputStream Fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		Sheet sh2=null;
		Row rowsh2=null;
		Cell cellsh2=null;
		try
		{
			Fin=new FileInputStream("E:/Excel/Test1.xlsx");
			wb=new XSSFWorkbook(Fin);
			sh=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null) {
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh.getPhysicalNumberOfRows();
			for (int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				rowsh2=sh2.createRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();

					cellsh2=rowsh2.createCell(c);
					cellsh2.setCellValue(data);
				}
			}
			Fout=new FileOutputStream("E:/Excel/Test.xlsx");
			wb.write(Fout);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				Fin.close();
				Fout.close();
				wb.close();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}

