package com.qa.apache.poi;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	FileInputStream fileinputStream;
	XSSFWorkbook xssfworkBook;
	XSSFSheet xssfsheet;

	public Xls_Reader(String excelpath){

		File file=new File(excelpath);
		try {
			fileinputStream= new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			xssfworkBook=new XSSFWorkbook(fileinputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public String getData(int sheetnumber, int rownum, int colnum){

		xssfsheet=xssfworkBook.getSheetAt(sheetnumber);
		String data=xssfsheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return data;

	}
	
	public int getLastRowNum(int sheetnumber)
	{
		int lastRow=xssfsheet.getLastRowNum();
		return lastRow;
	}


}


