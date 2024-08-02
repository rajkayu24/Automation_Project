package seleniumPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	driver.manage().window().maximize();
	
	//no of rows
	int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	System.out.println("total no. of rows are:"+rows);
	
	//no of cols
	//int cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td")).size();
	int cols = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	System.out.println("total no. of cols are:"+cols);
	
	//read specific row and cols
	 String data = driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[1]")).getText();
	 System.out.println(data);
	
     //read all the data from row and cols
	  for(int r=2;r<=rows;r++) 
	  {
	   for(int c=1;c<=cols;c++) 
	  {
   	  String tabledata = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
      System.out.print(tabledata +" \t ");
	   }
	  System.out.println();
	  }  
	   
	}}
