package com.utility;

public class ExcelDataProvider {
	public static String filepath=System.getProperty("user.dir")+"/excel/TestData.xlsx";
	public static String sheetname = "Sheet1";
	
public static void main(String[] args) {
	testData(filepath,sheetname);
}

	public static void testData(String filepath, String sheetname) {
		ExcelUtils utils = new ExcelUtils(filepath, sheetname);
		
		int rows = utils.getRowcount();
		int cols = utils.getcelCount();
		
		for(int i=1; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				String testdata = utils.getCellData(i, j);
				System.out.print(testdata + " | ");
			}
			System.out.println();
		}
	}
}
