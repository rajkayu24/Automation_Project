package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//table where rows and cols are distributed
public class DynamicTable {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    driver.manage().window().maximize();
	
	//no of rows
	int rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr")).size();
	System.out.println("no of rows is :"+rows);
	//no of cols 
	int cols = driver.findElements(By.xpath("	//table[@class='tsc_table_s13']//tr[1]//td")).size();

	System.out.println("no of cols is:"+cols);
	//read the specific row and col
	 String dt = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr[1]//td[2]")).getText();
	System.out.println(dt);
	
	//read all data from 
	for(int r=1;r<rows;r++) {
	for(int c=1;c<cols;c++)
	{
	String tabledata = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+r+"]//td["+c+"]")).getText();
	
	System.out.print(tabledata+"  ");	
	}
	System.out.println();
	}
	}

}
