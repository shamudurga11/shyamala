package com.Actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String val=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return val;
	
	}
	public void setCellData(String path,String sheet,int row,int cell,String data) throws Throwable, IOException
	{

		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
	} 
	public int getRowCount(String path,String sheet) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int rc=wb.getSheet(sheet).getLastRowNum();
		return rc;
		
	}
	public String getPropKeyValue(String path,String key) throws Throwable
	{   FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key, "Incorrect Key");
		return propValue;
	}


}
