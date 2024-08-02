package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell c;
	
	public static void main(String[] args) throws IOException {
	File file=new File(System.getProperty("user.dir")+"\\Testdata\\ReadData.xlsx");
	fi=new FileInputStream(file);
	wb=new XSSFWorkbook(fi);
	sheet=wb.getSheet("Sheet0");
	//no.of rows  
	int rows=sheet.getLastRowNum();
	System.out.println("no. of rows  are :"+rows);
	//no. of cols 
	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println("no. of cols are:"+cols);
	
	
	for(int r=0;r<=rows;r++)
	{
		XSSFRow currentrow = sheet.getRow(r);
		for(int c=0;c<cols;c++) {
		String data = currentrow.getCell(c).toString();
	    System.out.print(data+"  ");
	 }
	 System.out.println();
     }

	wb.close();
	fi.close();
	}


}
