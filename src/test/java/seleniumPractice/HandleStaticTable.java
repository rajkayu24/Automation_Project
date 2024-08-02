package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleStaticTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//total no of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	System.out.println("total no. of rows are:"+rows);	
	
	//total no. of cols 
	int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	System.out.println("total no of cols are:"+cols);
	
	//read the specific data
	String specificdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]")).getText();
	System.out.println(specificdata);
	
	//read all the data from the table
/*	
 * 
System.out.print("BookName"+ "\t"+"Auther"+"\t"+"Subjectr"+"\t"+"Price");
	for(int r=2;r<=rows;r++) {
		for(int c=1;c<cols;c++) {
			String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		
			System.out.print(data+ " \t ");
		}
		System.out.println();
	}
}*/
	
	/*
	//print BookName whose auther is mukesh
	for(int r=2;r<=rows;r++) {//we exclude header row that why we start from 2 
		
			String AutherName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
			System.out.println(AutherName);
			
			if(AutherName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println("bookname"+":"+AutherName);
			
			}
		}
		*/
	
	//find total price of all the books 
	int sum=0;
	for(int r=2;r<=rows;r++) {
		
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		
		sum=sum+Integer.parseInt(price);
		
	}
	System.out.println("total price of all the books is:"+sum);
	}}

 