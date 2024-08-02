package seleniumPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow r;
	public static XSSFCell c;
	
	public static void main(String[] args) throws IOException {
	File file=new File(System.getProperty("user.dir")+"\\Testdata\\writedata.xlsx");
	
	fo=new FileOutputStream(file);
	wb=new XSSFWorkbook();
	sheet=wb.createSheet();
	
	/*
	XSSFRow row1 = sheet.createRow(0);
	row1.createCell(0).setCellValue("welcome");
	
	
	row1.createCell(1).setCellValue("well");
	
	
	XSSFRow row2 = sheet.createRow(1);
	row2.createCell(0).setCellValue("weldone");

	row2.createCell(1).setCellValue("welfound");
	
	*/
	
	Scanner sc=new Scanner(System.in);
	for(int r=0;r<=2;r++) {
		XSSFRow currentrow = sheet.createRow(r);
		for(int c=0;c<2;c++) {
			
			System.out.println("Enter the values");
           String value = sc.next();
			currentrow.createCell(c).setCellValue(value);
			
			
		}
		
	}
	
wb.write(fo);
fo.close();
wb.close();
	
	
	}

}
