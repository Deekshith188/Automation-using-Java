package com.sgtesting.actitime.datatable;

import java.io.FileInputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable {
	
	public static Workbook wb=null;
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public int rowCount(String FileName,String SheetName)
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		int rc=0;
		try
		{
			fin=new FileInputStream(FileName);
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet(SheetName);
			if (sh==null) return -1;
			rc=sh.getPhysicalNumberOfRows();
			
		}catch(Exception e)
		{
			return -1;
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				return -1;
			}
		}
		return rc-1;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public boolean importExcelFile(String File)
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream(File);
			wb=new XSSFWorkbook(fin);
			if (wb != null) return true;
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public int rowCount(String SheetName)
	{
		Sheet sh=null;
		int rc=0;
		try
		{
			sh=wb.getSheet(SheetName);
			if (sh==null) return -1;
			rc=sh.getPhysicalNumberOfRows();
			
		}catch(Exception e)
		{
			return -1;
		}
		
		return rc-1;
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public String getCellData(String FileName,String SheetName,String colName,int rownum)
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		String strCellData=null;
		int colNum=0;
		try
		{
			fin=new FileInputStream(FileName);
			wb=new XSSFWorkbook(fin);
			if (wb ==null)  return null;
			sh=wb.getSheet(SheetName);
			if (sh==null)  return null;
			row=sh.getRow(0);
			for (int c=0;c<row.getPhysicalNumberOfCells();c++)
			{
				cell=row.getCell(c);
				String ColumnValue=cell.getStringCellValue();
				if (ColumnValue.trim().equalsIgnoreCase(colName.trim()))
				{
					colNum=c;
					break;
				}
			}
			row=sh.getRow(rownum-1);
			cell=row.getCell(colNum);
			if (cell==null || cell.getCellTypeEnum()==cell.getCellTypeEnum().BLANK)
			{
				strCellData="";
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().STRING)
			{
				strCellData=cell.getStringCellValue();
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().BOOLEAN)
			{
				strCellData=String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().NUMERIC)
			{
				if (HSSFDateUtil.isCellDateFormatted(cell))
				{
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					int month=cal.get(Calendar.MONTH)+1;
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int year=cal.get(Calendar.YEAR);
					String sDate=month+"/"+day+"/"+year;
					strCellData=sDate;
				}
				else
				{
					strCellData=String.valueOf(cell.getNumericCellValue());
				}
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
		return strCellData;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public String getCellData(String SheetName,int rownum,String colName)
	{
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		String strCellData=null;
		int colNum=0;
		try
		{
			if (wb ==null)  return null;
			sh=wb.getSheet(SheetName);
			if (sh==null)  return null;
			row=sh.getRow(0);
			for (int c=0;c<row.getPhysicalNumberOfCells();c++)
			{
				cell=row.getCell(c);
				String ColumnValue=cell.getStringCellValue();
				if (ColumnValue.trim().equalsIgnoreCase(colName.trim()))
				{
					colNum=c;
					break;
				}
			}
			row=sh.getRow(rownum-1);
			cell=row.getCell(colNum);
			if (cell==null || cell.getCellTypeEnum()==cell.getCellTypeEnum().BLANK)
			{
				strCellData="";
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().STRING)
			{
				strCellData=cell.getStringCellValue();
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().BOOLEAN)
			{
				strCellData=String.valueOf(cell.getBooleanCellValue());
			}
			else if(cell.getCellTypeEnum()==cell.getCellTypeEnum().NUMERIC)
			{
				if (HSSFDateUtil.isCellDateFormatted(cell))
				{
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					int month=cal.get(Calendar.MONTH)+1;
					int day=cal.get(Calendar.DAY_OF_MONTH);
					int year=cal.get(Calendar.YEAR);
					String sDate=month+"/"+day+"/"+year;
					strCellData=sDate;
				}
				else
				{
					strCellData=String.valueOf(cell.getNumericCellValue());
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return strCellData;
	}
}
