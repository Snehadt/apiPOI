package com.qa.apache.poi;

public class seleniumApacheClass {

	public static void main(String[] args) {
		
		
		Xls_Reader xlsReader=new Xls_Reader("D:\\demoMavenWorkspace\\apachePOI\\src\\com\\qa\\data\\excelData.xlsx");
		// TODO Auto-generated method stub
		
		String readData=xlsReader.getData(0, 1, 1);
		System.out.println(readData);
		
		int num=xlsReader.getLastRowNum(0);
		System.out.println(num);
	}

}
