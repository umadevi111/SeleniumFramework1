package com.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}

	public static int getRowcount() {
		int rowcount=0;
		try {
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row count: "+rowcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return rowcount;
	}
	
	public static int getcelCount() {
		int celcount =0;
		try {
			celcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Cell count: "+celcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return celcount;
	}
	
	public static String getCellData(int rownum, int colnum) {
		String celldata=null;
		try {
			celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			//System.out.println("Cell Data: "+celldata);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return celldata;
	}


}
