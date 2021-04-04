package com.sgtesting.reflection3;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestSuite {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		String fileName=path+"\\DataFiles\\TestData.xlsx";
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell1=null;
		Cell cell2=null;
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(fileName);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell1=row.getCell(0);
				cell2=row.getCell(1);
				String methodname=cell1.getStringCellValue();
				String pkgclassname=cell2.getStringCellValue();
				System.out.println(methodname+" --------->"+pkgclassname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.newInstance();
				
				Method m=obj.getClass().getMethod(methodname,null);
				m.invoke(obj, null);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
