package com.genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

public static int getrowcount(String excelpath,String Sheetname)
{
	try
	{
		FileInputStream fis= new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(Sheetname);
		int count = s.getLastRowNum();
		 return count;
		 
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return -1;
	}

}

public static String getcelvalue(String excelpath,String Sheetname,int row, int cell)
{
	try
	{
		FileInputStream fis= new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(Sheetname);
		String value = s.getRow(row).getCell(cell).getStringCellValue();
		
		
		 return value;
		 
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return "";
	}

}

}